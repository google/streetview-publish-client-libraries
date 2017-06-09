/*
 * Copyright 2017, Google Inc. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.streetview.publish.v1;

import static com.google.streetview.publish.v1.PagedResponseWrappers.ListPhotosPagedResponse;

import com.google.api.core.BetaApi;
import com.google.api.gax.grpc.ClientContext;
import com.google.api.gax.grpc.UnaryCallable;
import com.google.geo.ugc.streetview.publish.v1.StreetViewPublishResources.Photo;
import com.google.geo.ugc.streetview.publish.v1.StreetViewPublishResources.UploadRef;
import com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.BatchDeletePhotosRequest;
import com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.BatchDeletePhotosResponse;
import com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.BatchGetPhotosRequest;
import com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.BatchGetPhotosResponse;
import com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.BatchUpdatePhotosRequest;
import com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.BatchUpdatePhotosResponse;
import com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.CreatePhotoRequest;
import com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.DeletePhotoRequest;
import com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.GetPhotoRequest;
import com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.ListPhotosRequest;
import com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.ListPhotosResponse;
import com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.PhotoView;
import com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.UpdatePhotoRequest;
import com.google.protobuf.Empty;
import com.google.protobuf.FieldMask;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND SERVICE
/**
 * Service Description: Publishes and connects user-contributed photos on Street View.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>
 * <code>
 * try (StreetViewPublishServiceClient streetViewPublishServiceClient = StreetViewPublishServiceClient.create()) {
 *   Photo photo = Photo.newBuilder().build();
 *   Photo response = streetViewPublishServiceClient.createPhoto(photo);
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the streetViewPublishServiceClient object to clean up
 * resources such as threads. In the example above, try-with-resources is used, which automatically
 * calls close().
 *
 * <p>The surface of this class includes several types of Java methods for each of the API's
 * methods:
 *
 * <ol>
 *   <li> A "flattened" method. With this type of method, the fields of the request type have been
 *       converted into function parameters. It may be the case that not all fields are available as
 *       parameters, and not every API method will have a flattened method entry point.
 *   <li> A "request object" method. This type of method only takes one parameter, a request object,
 *       which must be constructed before the call. Not every API method will have a request object
 *       method.
 *   <li> A "callable" method. This type of method takes no parameters and returns an immutable API
 *       callable object, which can be used to initiate calls to the service.
 * </ol>
 *
 * <p>See the individual methods for example code.
 *
 * <p>Many parameters require resource names to be formatted in a particular way. To assist with
 * these names, this class includes a format method for each type of name, and additionally a parse
 * method to extract the individual identifiers contained within names that are returned.
 *
 * <p>This class can be customized by passing in a custom instance of
 * StreetViewPublishServiceSettings to create(). For example:
 *
 * <pre>
 * <code>
 * StreetViewPublishServiceSettings streetViewPublishServiceSettings =
 *     StreetViewPublishServiceSettings.defaultBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * StreetViewPublishServiceClient streetViewPublishServiceClient =
 *     StreetViewPublishServiceClient.create(streetViewPublishServiceSettings);
 * </code>
 * </pre>
 */
@Generated("by GAPIC")
@BetaApi
public class StreetViewPublishServiceClient implements AutoCloseable {
  private final StreetViewPublishServiceSettings settings;
  private final List<AutoCloseable> closeables = new ArrayList<>();

  private final UnaryCallable<Empty, UploadRef> startUploadCallable;
  private final UnaryCallable<CreatePhotoRequest, Photo> createPhotoCallable;
  private final UnaryCallable<GetPhotoRequest, Photo> getPhotoCallable;
  private final UnaryCallable<BatchGetPhotosRequest, BatchGetPhotosResponse> batchGetPhotosCallable;
  private final UnaryCallable<ListPhotosRequest, ListPhotosResponse> listPhotosCallable;
  private final UnaryCallable<ListPhotosRequest, ListPhotosPagedResponse> listPhotosPagedCallable;
  private final UnaryCallable<UpdatePhotoRequest, Photo> updatePhotoCallable;
  private final UnaryCallable<BatchUpdatePhotosRequest, BatchUpdatePhotosResponse>
      batchUpdatePhotosCallable;
  private final UnaryCallable<DeletePhotoRequest, Empty> deletePhotoCallable;
  private final UnaryCallable<BatchDeletePhotosRequest, BatchDeletePhotosResponse>
      batchDeletePhotosCallable;

  /** Constructs an instance of StreetViewPublishServiceClient with default settings. */
  public static final StreetViewPublishServiceClient create() throws IOException {
    return create(StreetViewPublishServiceSettings.defaultBuilder().build());
  }

  /**
   * Constructs an instance of StreetViewPublishServiceClient, using the given settings. The
   * channels are created based on the settings passed in, or defaults for any settings that are not
   * set.
   */
  public static final StreetViewPublishServiceClient create(
      StreetViewPublishServiceSettings settings) throws IOException {
    return new StreetViewPublishServiceClient(settings);
  }

  /**
   * Constructs an instance of StreetViewPublishServiceClient, using the given settings. This is
   * protected so that it easy to make a subclass, but otherwise, the static factory methods should
   * be preferred.
   */
  protected StreetViewPublishServiceClient(StreetViewPublishServiceSettings settings)
      throws IOException {
    this.settings = settings;

    ClientContext clientContext = ClientContext.create(settings);

    this.startUploadCallable = UnaryCallable.create(settings.startUploadSettings(), clientContext);
    this.createPhotoCallable = UnaryCallable.create(settings.createPhotoSettings(), clientContext);
    this.getPhotoCallable = UnaryCallable.create(settings.getPhotoSettings(), clientContext);
    this.batchGetPhotosCallable =
        UnaryCallable.create(settings.batchGetPhotosSettings(), clientContext);
    this.listPhotosCallable = UnaryCallable.create(settings.listPhotosSettings(), clientContext);
    this.listPhotosPagedCallable =
        UnaryCallable.createPagedVariant(settings.listPhotosSettings(), clientContext);
    this.updatePhotoCallable = UnaryCallable.create(settings.updatePhotoSettings(), clientContext);
    this.batchUpdatePhotosCallable =
        UnaryCallable.create(settings.batchUpdatePhotosSettings(), clientContext);
    this.deletePhotoCallable = UnaryCallable.create(settings.deletePhotoSettings(), clientContext);
    this.batchDeletePhotosCallable =
        UnaryCallable.create(settings.batchDeletePhotosSettings(), clientContext);

    closeables.addAll(clientContext.getCloseables());
  }

  public final StreetViewPublishServiceSettings getSettings() {
    return settings;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates an upload session to start uploading photo data. The upload URL of the returned
   * `UploadRef` is used to upload the data for the photo.
   *
   * <p>After the upload is complete, the `UploadRef` is used with
   * `StreetViewPublishService:CreatePhoto()` to create the `Photo` object entry.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (StreetViewPublishServiceClient streetViewPublishServiceClient = StreetViewPublishServiceClient.create()) {
   *   Empty request = Empty.newBuilder().build();
   *   UploadRef response = streetViewPublishServiceClient.startUpload(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.grpc.ApiException if the remote call fails
   */
  private final UploadRef startUpload(Empty request) {
    return startUploadCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates an upload session to start uploading photo data. The upload URL of the returned
   * `UploadRef` is used to upload the data for the photo.
   *
   * <p>After the upload is complete, the `UploadRef` is used with
   * `StreetViewPublishService:CreatePhoto()` to create the `Photo` object entry.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (StreetViewPublishServiceClient streetViewPublishServiceClient = StreetViewPublishServiceClient.create()) {
   *   Empty request = Empty.newBuilder().build();
   *   ApiFuture&lt;UploadRef&gt; future = streetViewPublishServiceClient.startUploadCallable().futureCall(request);
   *   // Do something
   *   UploadRef response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<Empty, UploadRef> startUploadCallable() {
    return startUploadCallable;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * After the client finishes uploading the photo with the returned `UploadRef`, `photo.create`
   * publishes the uploaded photo to Street View on Google Maps.
   *
   * <p>This method returns the following error codes:
   *
   * <p>&#42; `INVALID_ARGUMENT` if the request is malformed. &#42; `NOT_FOUND` if the upload
   * reference does not exist.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (StreetViewPublishServiceClient streetViewPublishServiceClient = StreetViewPublishServiceClient.create()) {
   *   Photo photo = Photo.newBuilder().build();
   *   Photo response = streetViewPublishServiceClient.createPhoto(photo);
   * }
   * </code></pre>
   *
   * @param photo Required. Photo to create.
   * @throws com.google.api.gax.grpc.ApiException if the remote call fails
   */
  public final Photo createPhoto(Photo photo) {

    CreatePhotoRequest request = CreatePhotoRequest.newBuilder().setPhoto(photo).build();
    return createPhoto(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * After the client finishes uploading the photo with the returned `UploadRef`, `photo.create`
   * publishes the uploaded photo to Street View on Google Maps.
   *
   * <p>This method returns the following error codes:
   *
   * <p>&#42; `INVALID_ARGUMENT` if the request is malformed. &#42; `NOT_FOUND` if the upload
   * reference does not exist.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (StreetViewPublishServiceClient streetViewPublishServiceClient = StreetViewPublishServiceClient.create()) {
   *   Photo photo = Photo.newBuilder().build();
   *   CreatePhotoRequest request = CreatePhotoRequest.newBuilder()
   *     .setPhoto(photo)
   *     .build();
   *   Photo response = streetViewPublishServiceClient.createPhoto(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.grpc.ApiException if the remote call fails
   */
  private final Photo createPhoto(CreatePhotoRequest request) {
    return createPhotoCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * After the client finishes uploading the photo with the returned `UploadRef`, `photo.create`
   * publishes the uploaded photo to Street View on Google Maps.
   *
   * <p>This method returns the following error codes:
   *
   * <p>&#42; `INVALID_ARGUMENT` if the request is malformed. &#42; `NOT_FOUND` if the upload
   * reference does not exist.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (StreetViewPublishServiceClient streetViewPublishServiceClient = StreetViewPublishServiceClient.create()) {
   *   Photo photo = Photo.newBuilder().build();
   *   CreatePhotoRequest request = CreatePhotoRequest.newBuilder()
   *     .setPhoto(photo)
   *     .build();
   *   ApiFuture&lt;Photo&gt; future = streetViewPublishServiceClient.createPhotoCallable().futureCall(request);
   *   // Do something
   *   Photo response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<CreatePhotoRequest, Photo> createPhotoCallable() {
    return createPhotoCallable;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Gets the metadata of the specified `Photo`.
   *
   * <p>This method returns the following error codes:
   *
   * <p>&#42; `PERMISSION_DENIED` if the requesting user did not create the requested photo. &#42;
   * `NOT_FOUND` if the requested photo does not exist.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (StreetViewPublishServiceClient streetViewPublishServiceClient = StreetViewPublishServiceClient.create()) {
   *   String photoId = "";
   *   PhotoView view = PhotoView.BASIC;
   *   Photo response = streetViewPublishServiceClient.getPhoto(photoId, view);
   * }
   * </code></pre>
   *
   * @param photoId Required. ID of the photo.
   * @param view Specifies if a download URL for the photo bytes should be returned in the Photo
   *     response.
   * @throws com.google.api.gax.grpc.ApiException if the remote call fails
   */
  public final Photo getPhoto(String photoId, PhotoView view) {

    GetPhotoRequest request =
        GetPhotoRequest.newBuilder().setPhotoId(photoId).setView(view).build();
    return getPhoto(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Gets the metadata of the specified `Photo`.
   *
   * <p>This method returns the following error codes:
   *
   * <p>&#42; `PERMISSION_DENIED` if the requesting user did not create the requested photo. &#42;
   * `NOT_FOUND` if the requested photo does not exist.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (StreetViewPublishServiceClient streetViewPublishServiceClient = StreetViewPublishServiceClient.create()) {
   *   String photoId = "";
   *   PhotoView view = PhotoView.BASIC;
   *   GetPhotoRequest request = GetPhotoRequest.newBuilder()
   *     .setPhotoId(photoId)
   *     .setView(view)
   *     .build();
   *   Photo response = streetViewPublishServiceClient.getPhoto(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.grpc.ApiException if the remote call fails
   */
  public final Photo getPhoto(GetPhotoRequest request) {
    return getPhotoCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Gets the metadata of the specified `Photo`.
   *
   * <p>This method returns the following error codes:
   *
   * <p>&#42; `PERMISSION_DENIED` if the requesting user did not create the requested photo. &#42;
   * `NOT_FOUND` if the requested photo does not exist.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (StreetViewPublishServiceClient streetViewPublishServiceClient = StreetViewPublishServiceClient.create()) {
   *   String photoId = "";
   *   PhotoView view = PhotoView.BASIC;
   *   GetPhotoRequest request = GetPhotoRequest.newBuilder()
   *     .setPhotoId(photoId)
   *     .setView(view)
   *     .build();
   *   ApiFuture&lt;Photo&gt; future = streetViewPublishServiceClient.getPhotoCallable().futureCall(request);
   *   // Do something
   *   Photo response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<GetPhotoRequest, Photo> getPhotoCallable() {
    return getPhotoCallable;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Gets the metadata of the specified `Photo` batch.
   *
   * <p>Note that if `photos.batchGet` fails, either critical fields are missing or there was an
   * authentication error. Even if `photos.batchGet` succeeds, there may have been failures for
   * single photos in the batch. These failures will be specified in
   * `BatchGetPhotosResponse.results.status`. See `photo.get` for specific failures that will occur
   * per photo.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (StreetViewPublishServiceClient streetViewPublishServiceClient = StreetViewPublishServiceClient.create()) {
   *   List&lt;String&gt; photoIds = new ArrayList&lt;&gt;();
   *   PhotoView view = PhotoView.BASIC;
   *   BatchGetPhotosResponse response = streetViewPublishServiceClient.batchGetPhotos(photoIds, view);
   * }
   * </code></pre>
   *
   * @param photoIds Required. IDs of the photos.
   * @param view Specifies if a download URL for the photo bytes should be returned in the Photo
   *     response.
   * @throws com.google.api.gax.grpc.ApiException if the remote call fails
   */
  public final BatchGetPhotosResponse batchGetPhotos(List<String> photoIds, PhotoView view) {

    BatchGetPhotosRequest request =
        BatchGetPhotosRequest.newBuilder().addAllPhotoIds(photoIds).setView(view).build();
    return batchGetPhotos(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Gets the metadata of the specified `Photo` batch.
   *
   * <p>Note that if `photos.batchGet` fails, either critical fields are missing or there was an
   * authentication error. Even if `photos.batchGet` succeeds, there may have been failures for
   * single photos in the batch. These failures will be specified in
   * `BatchGetPhotosResponse.results.status`. See `photo.get` for specific failures that will occur
   * per photo.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (StreetViewPublishServiceClient streetViewPublishServiceClient = StreetViewPublishServiceClient.create()) {
   *   List&lt;String&gt; photoIds = new ArrayList&lt;&gt;();
   *   PhotoView view = PhotoView.BASIC;
   *   BatchGetPhotosRequest request = BatchGetPhotosRequest.newBuilder()
   *     .addAllPhotoIds(photoIds)
   *     .setView(view)
   *     .build();
   *   BatchGetPhotosResponse response = streetViewPublishServiceClient.batchGetPhotos(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.grpc.ApiException if the remote call fails
   */
  public final BatchGetPhotosResponse batchGetPhotos(BatchGetPhotosRequest request) {
    return batchGetPhotosCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Gets the metadata of the specified `Photo` batch.
   *
   * <p>Note that if `photos.batchGet` fails, either critical fields are missing or there was an
   * authentication error. Even if `photos.batchGet` succeeds, there may have been failures for
   * single photos in the batch. These failures will be specified in
   * `BatchGetPhotosResponse.results.status`. See `photo.get` for specific failures that will occur
   * per photo.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (StreetViewPublishServiceClient streetViewPublishServiceClient = StreetViewPublishServiceClient.create()) {
   *   List&lt;String&gt; photoIds = new ArrayList&lt;&gt;();
   *   PhotoView view = PhotoView.BASIC;
   *   BatchGetPhotosRequest request = BatchGetPhotosRequest.newBuilder()
   *     .addAllPhotoIds(photoIds)
   *     .setView(view)
   *     .build();
   *   ApiFuture&lt;BatchGetPhotosResponse&gt; future = streetViewPublishServiceClient.batchGetPhotosCallable().futureCall(request);
   *   // Do something
   *   BatchGetPhotosResponse response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<BatchGetPhotosRequest, BatchGetPhotosResponse>
      batchGetPhotosCallable() {
    return batchGetPhotosCallable;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Lists all the photos that belong to the user.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (StreetViewPublishServiceClient streetViewPublishServiceClient = StreetViewPublishServiceClient.create()) {
   *   PhotoView view = PhotoView.BASIC;
   *   String filter = "";
   *   for (Photo element : streetViewPublishServiceClient.listPhotos(view, filter).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param view Specifies if a download URL for the photos bytes should be returned in the Photos
   *     response.
   * @param filter The filter expression. Example: `placeId=ChIJj61dQgK6j4AR4GeTYWZsKWw`
   * @throws com.google.api.gax.grpc.ApiException if the remote call fails
   */
  public final ListPhotosPagedResponse listPhotos(PhotoView view, String filter) {
    ListPhotosRequest request =
        ListPhotosRequest.newBuilder().setView(view).setFilter(filter).build();
    return listPhotos(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Lists all the photos that belong to the user.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (StreetViewPublishServiceClient streetViewPublishServiceClient = StreetViewPublishServiceClient.create()) {
   *   PhotoView view = PhotoView.BASIC;
   *   String filter = "";
   *   ListPhotosRequest request = ListPhotosRequest.newBuilder()
   *     .setView(view)
   *     .setFilter(filter)
   *     .build();
   *   for (Photo element : streetViewPublishServiceClient.listPhotos(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.grpc.ApiException if the remote call fails
   */
  public final ListPhotosPagedResponse listPhotos(ListPhotosRequest request) {
    return listPhotosPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Lists all the photos that belong to the user.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (StreetViewPublishServiceClient streetViewPublishServiceClient = StreetViewPublishServiceClient.create()) {
   *   PhotoView view = PhotoView.BASIC;
   *   String filter = "";
   *   ListPhotosRequest request = ListPhotosRequest.newBuilder()
   *     .setView(view)
   *     .setFilter(filter)
   *     .build();
   *   ApiFuture&lt;ListPhotosPagedResponse&gt; future = streetViewPublishServiceClient.listPhotosPagedCallable().futureCall(request);
   *   // Do something
   *   for (Photo element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   */
  public final UnaryCallable<ListPhotosRequest, ListPhotosPagedResponse> listPhotosPagedCallable() {
    return listPhotosPagedCallable;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Lists all the photos that belong to the user.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (StreetViewPublishServiceClient streetViewPublishServiceClient = StreetViewPublishServiceClient.create()) {
   *   PhotoView view = PhotoView.BASIC;
   *   String filter = "";
   *   ListPhotosRequest request = ListPhotosRequest.newBuilder()
   *     .setView(view)
   *     .setFilter(filter)
   *     .build();
   *   while (true) {
   *     ListPhotosResponse response = streetViewPublishServiceClient.listPhotosCallable().call(request);
   *     for (Photo element : response.getPhotosList()) {
   *       // doThingsWith(element);
   *     }
   *     String nextPageToken = response.getNextPageToken();
   *     if (!Strings.isNullOrEmpty(nextPageToken)) {
   *       request = request.toBuilder().setPageToken(nextPageToken).build();
   *     } else {
   *       break;
   *     }
   *   }
   * }
   * </code></pre>
   */
  public final UnaryCallable<ListPhotosRequest, ListPhotosResponse> listPhotosCallable() {
    return listPhotosCallable;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates the metadata of a photo, such as pose, place association, etc. Changing the pixels of a
   * photo is not supported.
   *
   * <p>This method returns the following error codes:
   *
   * <p>&#42; `PERMISSION_DENIED` if the requesting user did not create the requested photo. &#42;
   * `INVALID_ARGUMENT` if the request is malformed. &#42; `NOT_FOUND` if the photo ID does not
   * exist.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (StreetViewPublishServiceClient streetViewPublishServiceClient = StreetViewPublishServiceClient.create()) {
   *   Photo photo = Photo.newBuilder().build();
   *   FieldMask updateMask = FieldMask.newBuilder().build();
   *   Photo response = streetViewPublishServiceClient.updatePhoto(photo, updateMask);
   * }
   * </code></pre>
   *
   * @param photo Required. Photo object containing the new metadata. Only the fields specified in
   *     `update_mask` are used. If `update_mask` is not present, the update applies to all fields.
   *     &#42;&#42;Note:&#42;&#42; To update `pose.altitude`, `pose.latlngpair` has to be filled as
   *     well. Otherwise, the request will fail.
   * @param updateMask Mask that identifies fields on the photo metadata to update. If not present,
   *     the old Photo metadata will be entirely replaced with the new Photo metadata in this
   *     request. The update fails if invalid fields are specified. Multiple fields can be specified
   *     in a comma-delimited list.
   *     <p>The following fields are valid:
   *     <p>&#42; `pose.heading` &#42; `pose.latlngpair` &#42; `pose.level` &#42; `pose.altitude`
   *     &#42; `connections` &#42; `places`
   *     <p>&#42;&#42;Note:&#42;&#42; Repeated fields in `update_mask` mean the entire set of
   *     repeated values will be replaced with the new contents. For example, if
   *     `UpdatePhotoRequest.photo.update_mask` contains `connections` and
   *     `UpdatePhotoRequest.photo.connections` is empty, all connections will be removed.
   * @throws com.google.api.gax.grpc.ApiException if the remote call fails
   */
  public final Photo updatePhoto(Photo photo, FieldMask updateMask) {

    UpdatePhotoRequest request =
        UpdatePhotoRequest.newBuilder().setPhoto(photo).setUpdateMask(updateMask).build();
    return updatePhoto(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates the metadata of a photo, such as pose, place association, etc. Changing the pixels of a
   * photo is not supported.
   *
   * <p>This method returns the following error codes:
   *
   * <p>&#42; `PERMISSION_DENIED` if the requesting user did not create the requested photo. &#42;
   * `INVALID_ARGUMENT` if the request is malformed. &#42; `NOT_FOUND` if the photo ID does not
   * exist.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (StreetViewPublishServiceClient streetViewPublishServiceClient = StreetViewPublishServiceClient.create()) {
   *   Photo photo = Photo.newBuilder().build();
   *   FieldMask updateMask = FieldMask.newBuilder().build();
   *   UpdatePhotoRequest request = UpdatePhotoRequest.newBuilder()
   *     .setPhoto(photo)
   *     .setUpdateMask(updateMask)
   *     .build();
   *   Photo response = streetViewPublishServiceClient.updatePhoto(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.grpc.ApiException if the remote call fails
   */
  public final Photo updatePhoto(UpdatePhotoRequest request) {
    return updatePhotoCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates the metadata of a photo, such as pose, place association, etc. Changing the pixels of a
   * photo is not supported.
   *
   * <p>This method returns the following error codes:
   *
   * <p>&#42; `PERMISSION_DENIED` if the requesting user did not create the requested photo. &#42;
   * `INVALID_ARGUMENT` if the request is malformed. &#42; `NOT_FOUND` if the photo ID does not
   * exist.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (StreetViewPublishServiceClient streetViewPublishServiceClient = StreetViewPublishServiceClient.create()) {
   *   Photo photo = Photo.newBuilder().build();
   *   FieldMask updateMask = FieldMask.newBuilder().build();
   *   UpdatePhotoRequest request = UpdatePhotoRequest.newBuilder()
   *     .setPhoto(photo)
   *     .setUpdateMask(updateMask)
   *     .build();
   *   ApiFuture&lt;Photo&gt; future = streetViewPublishServiceClient.updatePhotoCallable().futureCall(request);
   *   // Do something
   *   Photo response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<UpdatePhotoRequest, Photo> updatePhotoCallable() {
    return updatePhotoCallable;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates the metadata of photos, such as pose, place association, etc. Changing the pixels of a
   * photo is not supported.
   *
   * <p>Note that if `photos.batchUpdate` fails, either critical fields are missing or there was an
   * authentication error. Even if `photos.batchUpdate` succeeds, there may have been failures for
   * single photos in the batch. These failures will be specified in
   * `BatchUpdatePhotosResponse.results.status`. See `UpdatePhoto` for specific failures that will
   * occur per photo.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (StreetViewPublishServiceClient streetViewPublishServiceClient = StreetViewPublishServiceClient.create()) {
   *   List&lt;UpdatePhotoRequest&gt; updatePhotoRequests = new ArrayList&lt;&gt;();
   *   BatchUpdatePhotosResponse response = streetViewPublishServiceClient.batchUpdatePhotos(updatePhotoRequests);
   * }
   * </code></pre>
   *
   * @param updatePhotoRequests Required. List of update photo requests.
   * @throws com.google.api.gax.grpc.ApiException if the remote call fails
   */
  public final BatchUpdatePhotosResponse batchUpdatePhotos(
      List<UpdatePhotoRequest> updatePhotoRequests) {

    BatchUpdatePhotosRequest request =
        BatchUpdatePhotosRequest.newBuilder()
            .addAllUpdatePhotoRequests(updatePhotoRequests)
            .build();
    return batchUpdatePhotos(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates the metadata of photos, such as pose, place association, etc. Changing the pixels of a
   * photo is not supported.
   *
   * <p>Note that if `photos.batchUpdate` fails, either critical fields are missing or there was an
   * authentication error. Even if `photos.batchUpdate` succeeds, there may have been failures for
   * single photos in the batch. These failures will be specified in
   * `BatchUpdatePhotosResponse.results.status`. See `UpdatePhoto` for specific failures that will
   * occur per photo.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (StreetViewPublishServiceClient streetViewPublishServiceClient = StreetViewPublishServiceClient.create()) {
   *   List&lt;UpdatePhotoRequest&gt; updatePhotoRequests = new ArrayList&lt;&gt;();
   *   BatchUpdatePhotosRequest request = BatchUpdatePhotosRequest.newBuilder()
   *     .addAllUpdatePhotoRequests(updatePhotoRequests)
   *     .build();
   *   BatchUpdatePhotosResponse response = streetViewPublishServiceClient.batchUpdatePhotos(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.grpc.ApiException if the remote call fails
   */
  private final BatchUpdatePhotosResponse batchUpdatePhotos(BatchUpdatePhotosRequest request) {
    return batchUpdatePhotosCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates the metadata of photos, such as pose, place association, etc. Changing the pixels of a
   * photo is not supported.
   *
   * <p>Note that if `photos.batchUpdate` fails, either critical fields are missing or there was an
   * authentication error. Even if `photos.batchUpdate` succeeds, there may have been failures for
   * single photos in the batch. These failures will be specified in
   * `BatchUpdatePhotosResponse.results.status`. See `UpdatePhoto` for specific failures that will
   * occur per photo.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (StreetViewPublishServiceClient streetViewPublishServiceClient = StreetViewPublishServiceClient.create()) {
   *   List&lt;UpdatePhotoRequest&gt; updatePhotoRequests = new ArrayList&lt;&gt;();
   *   BatchUpdatePhotosRequest request = BatchUpdatePhotosRequest.newBuilder()
   *     .addAllUpdatePhotoRequests(updatePhotoRequests)
   *     .build();
   *   ApiFuture&lt;BatchUpdatePhotosResponse&gt; future = streetViewPublishServiceClient.batchUpdatePhotosCallable().futureCall(request);
   *   // Do something
   *   BatchUpdatePhotosResponse response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<BatchUpdatePhotosRequest, BatchUpdatePhotosResponse>
      batchUpdatePhotosCallable() {
    return batchUpdatePhotosCallable;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes a photo and its metadata.
   *
   * <p>This method returns the following error codes:
   *
   * <p>&#42; `PERMISSION_DENIED` if the requesting user did not create the requested photo. &#42;
   * `NOT_FOUND` if the photo ID does not exist.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (StreetViewPublishServiceClient streetViewPublishServiceClient = StreetViewPublishServiceClient.create()) {
   *   String photoId = "";
   *   streetViewPublishServiceClient.deletePhoto(photoId);
   * }
   * </code></pre>
   *
   * @param photoId Required. ID of the photo.
   * @throws com.google.api.gax.grpc.ApiException if the remote call fails
   */
  public final void deletePhoto(String photoId) {

    DeletePhotoRequest request = DeletePhotoRequest.newBuilder().setPhotoId(photoId).build();
    deletePhoto(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes a photo and its metadata.
   *
   * <p>This method returns the following error codes:
   *
   * <p>&#42; `PERMISSION_DENIED` if the requesting user did not create the requested photo. &#42;
   * `NOT_FOUND` if the photo ID does not exist.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (StreetViewPublishServiceClient streetViewPublishServiceClient = StreetViewPublishServiceClient.create()) {
   *   String photoId = "";
   *   DeletePhotoRequest request = DeletePhotoRequest.newBuilder()
   *     .setPhotoId(photoId)
   *     .build();
   *   streetViewPublishServiceClient.deletePhoto(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.grpc.ApiException if the remote call fails
   */
  private final void deletePhoto(DeletePhotoRequest request) {
    deletePhotoCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes a photo and its metadata.
   *
   * <p>This method returns the following error codes:
   *
   * <p>&#42; `PERMISSION_DENIED` if the requesting user did not create the requested photo. &#42;
   * `NOT_FOUND` if the photo ID does not exist.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (StreetViewPublishServiceClient streetViewPublishServiceClient = StreetViewPublishServiceClient.create()) {
   *   String photoId = "";
   *   DeletePhotoRequest request = DeletePhotoRequest.newBuilder()
   *     .setPhotoId(photoId)
   *     .build();
   *   ApiFuture&lt;Void&gt; future = streetViewPublishServiceClient.deletePhotoCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<DeletePhotoRequest, Empty> deletePhotoCallable() {
    return deletePhotoCallable;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes a list of photos and their metadata.
   *
   * <p>Note that if `photos.batchDelete` fails, either critical fields are missing or there was an
   * authentication error. Even if `photos.batchDelete` succeeds, there may have been failures for
   * single photos in the batch. These failures will be specified in
   * `BatchDeletePhotosResponse.status`. See `photo.update` for specific failures that will occur
   * per photo.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (StreetViewPublishServiceClient streetViewPublishServiceClient = StreetViewPublishServiceClient.create()) {
   *   List&lt;String&gt; photoIds = new ArrayList&lt;&gt;();
   *   BatchDeletePhotosResponse response = streetViewPublishServiceClient.batchDeletePhotos(photoIds);
   * }
   * </code></pre>
   *
   * @param photoIds Required. List of delete photo requests.
   * @throws com.google.api.gax.grpc.ApiException if the remote call fails
   */
  public final BatchDeletePhotosResponse batchDeletePhotos(List<String> photoIds) {

    BatchDeletePhotosRequest request =
        BatchDeletePhotosRequest.newBuilder().addAllPhotoIds(photoIds).build();
    return batchDeletePhotos(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes a list of photos and their metadata.
   *
   * <p>Note that if `photos.batchDelete` fails, either critical fields are missing or there was an
   * authentication error. Even if `photos.batchDelete` succeeds, there may have been failures for
   * single photos in the batch. These failures will be specified in
   * `BatchDeletePhotosResponse.status`. See `photo.update` for specific failures that will occur
   * per photo.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (StreetViewPublishServiceClient streetViewPublishServiceClient = StreetViewPublishServiceClient.create()) {
   *   List&lt;String&gt; photoIds = new ArrayList&lt;&gt;();
   *   BatchDeletePhotosRequest request = BatchDeletePhotosRequest.newBuilder()
   *     .addAllPhotoIds(photoIds)
   *     .build();
   *   BatchDeletePhotosResponse response = streetViewPublishServiceClient.batchDeletePhotos(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.grpc.ApiException if the remote call fails
   */
  private final BatchDeletePhotosResponse batchDeletePhotos(BatchDeletePhotosRequest request) {
    return batchDeletePhotosCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes a list of photos and their metadata.
   *
   * <p>Note that if `photos.batchDelete` fails, either critical fields are missing or there was an
   * authentication error. Even if `photos.batchDelete` succeeds, there may have been failures for
   * single photos in the batch. These failures will be specified in
   * `BatchDeletePhotosResponse.status`. See `photo.update` for specific failures that will occur
   * per photo.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (StreetViewPublishServiceClient streetViewPublishServiceClient = StreetViewPublishServiceClient.create()) {
   *   List&lt;String&gt; photoIds = new ArrayList&lt;&gt;();
   *   BatchDeletePhotosRequest request = BatchDeletePhotosRequest.newBuilder()
   *     .addAllPhotoIds(photoIds)
   *     .build();
   *   ApiFuture&lt;BatchDeletePhotosResponse&gt; future = streetViewPublishServiceClient.batchDeletePhotosCallable().futureCall(request);
   *   // Do something
   *   BatchDeletePhotosResponse response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<BatchDeletePhotosRequest, BatchDeletePhotosResponse>
      batchDeletePhotosCallable() {
    return batchDeletePhotosCallable;
  }

  /**
   * Initiates an orderly shutdown in which preexisting calls continue but new calls are immediately
   * cancelled.
   */
  @Override
  public final void close() throws Exception {
    for (AutoCloseable closeable : closeables) {
      closeable.close();
    }
  }
}
