/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.streetview.publish.v1;

import com.google.api.core.ApiFunction;
import com.google.api.core.ApiFuture;
import com.google.api.core.ApiFutures;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.paging.AbstractFixedSizeCollection;
import com.google.api.gax.paging.AbstractPage;
import com.google.api.gax.paging.AbstractPagedListResponse;
import com.google.api.gax.rpc.PageContext;
import com.google.api.gax.rpc.UnaryCallable;
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
import com.google.streetview.publish.v1.stub.StreetViewPublishServiceStub;
import com.google.streetview.publish.v1.stub.StreetViewPublishServiceStubSettings;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
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
 *   <li>A "flattened" method. With this type of method, the fields of the request type have been
 *       converted into function parameters. It may be the case that not all fields are available as
 *       parameters, and not every API method will have a flattened method entry point.
 *   <li>A "request object" method. This type of method only takes one parameter, a request object,
 *       which must be constructed before the call. Not every API method will have a request object
 *       method.
 *   <li>A "callable" method. This type of method takes no parameters and returns an immutable API
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
 * <p>To customize credentials:
 *
 * <pre>
 * <code>
 * StreetViewPublishServiceSettings streetViewPublishServiceSettings =
 *     StreetViewPublishServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * StreetViewPublishServiceClient streetViewPublishServiceClient =
 *     StreetViewPublishServiceClient.create(streetViewPublishServiceSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * StreetViewPublishServiceSettings streetViewPublishServiceSettings =
 *     StreetViewPublishServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * StreetViewPublishServiceClient streetViewPublishServiceClient =
 *     StreetViewPublishServiceClient.create(streetViewPublishServiceSettings);
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class StreetViewPublishServiceClient implements BackgroundResource {
  private final StreetViewPublishServiceSettings settings;
  private final StreetViewPublishServiceStub stub;

  /** Constructs an instance of StreetViewPublishServiceClient with default settings. */
  public static final StreetViewPublishServiceClient create() throws IOException {
    return create(StreetViewPublishServiceSettings.newBuilder().build());
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
   * Constructs an instance of StreetViewPublishServiceClient, using the given stub for making
   * calls. This is for advanced usage - prefer to use StreetViewPublishServiceSettings}.
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final StreetViewPublishServiceClient create(StreetViewPublishServiceStub stub) {
    return new StreetViewPublishServiceClient(stub);
  }

  /**
   * Constructs an instance of StreetViewPublishServiceClient, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected StreetViewPublishServiceClient(StreetViewPublishServiceSettings settings)
      throws IOException {
    this.settings = settings;
    this.stub = ((StreetViewPublishServiceStubSettings) settings.getStubSettings()).createStub();
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected StreetViewPublishServiceClient(StreetViewPublishServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final StreetViewPublishServiceSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public StreetViewPublishServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates an upload session to start uploading photo bytes. The method uses the upload URL of the
   * returned [UploadRef][google.streetview.publish.v1.UploadRef] to upload the bytes for the
   * [Photo][google.streetview.publish.v1.Photo].
   *
   * <p>In addition to the photo requirements shown in
   * https://support.google.com/maps/answer/7012050?hl=en&amp;ref_topic=6275604, the photo must meet
   * the following requirements:
   *
   * <p>&#42; Photo Sphere XMP metadata must be included in the photo medadata. See
   * https://developers.google.com/streetview/spherical-metadata for the required fields. &#42; The
   * pixel size of the photo must meet the size requirements listed in
   * https://support.google.com/maps/answer/7012050?hl=en&amp;ref_topic=6275604, and the photo must
   * be a full 360 horizontally.
   *
   * <p>After the upload completes, the method uses
   * [UploadRef][google.streetview.publish.v1.UploadRef] with
   * [CreatePhoto][google.streetview.publish.v1.StreetViewPublishService.CreatePhoto] to create the
   * [Photo][google.streetview.publish.v1.Photo] object entry.
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
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final UploadRef startUpload(Empty request) {
    return startUploadCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates an upload session to start uploading photo bytes. The method uses the upload URL of the
   * returned [UploadRef][google.streetview.publish.v1.UploadRef] to upload the bytes for the
   * [Photo][google.streetview.publish.v1.Photo].
   *
   * <p>In addition to the photo requirements shown in
   * https://support.google.com/maps/answer/7012050?hl=en&amp;ref_topic=6275604, the photo must meet
   * the following requirements:
   *
   * <p>&#42; Photo Sphere XMP metadata must be included in the photo medadata. See
   * https://developers.google.com/streetview/spherical-metadata for the required fields. &#42; The
   * pixel size of the photo must meet the size requirements listed in
   * https://support.google.com/maps/answer/7012050?hl=en&amp;ref_topic=6275604, and the photo must
   * be a full 360 horizontally.
   *
   * <p>After the upload completes, the method uses
   * [UploadRef][google.streetview.publish.v1.UploadRef] with
   * [CreatePhoto][google.streetview.publish.v1.StreetViewPublishService.CreatePhoto] to create the
   * [Photo][google.streetview.publish.v1.Photo] object entry.
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
    return stub.startUploadCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * After the client finishes uploading the photo with the returned
   * [UploadRef][google.streetview.publish.v1.UploadRef],
   * [CreatePhoto][google.streetview.publish.v1.StreetViewPublishService.CreatePhoto] publishes the
   * uploaded [Photo][google.streetview.publish.v1.Photo] to Street View on Google Maps.
   *
   * <p>Currently, the only way to set heading, pitch, and roll in CreatePhoto is through the [Photo
   * Sphere XMP metadata](https://developers.google.com/streetview/spherical-metadata) in the photo
   * bytes. CreatePhoto ignores the `pose.heading`, `pose.pitch`, `pose.roll`, `pose.altitude`, and
   * `pose.level` fields in Pose.
   *
   * <p>This method returns the following error codes:
   *
   * <p>&#42; [google.rpc.Code.INVALID_ARGUMENT][google.rpc.Code.INVALID_ARGUMENT] if the request is
   * malformed or if the uploaded photo is not a 360 photo. &#42;
   * [google.rpc.Code.NOT_FOUND][google.rpc.Code.NOT_FOUND] if the upload reference does not exist.
   * &#42; [google.rpc.Code.RESOURCE_EXHAUSTED][google.rpc.Code.RESOURCE_EXHAUSTED] if the account
   * has reached the storage limit.
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
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Photo createPhoto(Photo photo) {

    CreatePhotoRequest request = CreatePhotoRequest.newBuilder().setPhoto(photo).build();
    return createPhoto(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * After the client finishes uploading the photo with the returned
   * [UploadRef][google.streetview.publish.v1.UploadRef],
   * [CreatePhoto][google.streetview.publish.v1.StreetViewPublishService.CreatePhoto] publishes the
   * uploaded [Photo][google.streetview.publish.v1.Photo] to Street View on Google Maps.
   *
   * <p>Currently, the only way to set heading, pitch, and roll in CreatePhoto is through the [Photo
   * Sphere XMP metadata](https://developers.google.com/streetview/spherical-metadata) in the photo
   * bytes. CreatePhoto ignores the `pose.heading`, `pose.pitch`, `pose.roll`, `pose.altitude`, and
   * `pose.level` fields in Pose.
   *
   * <p>This method returns the following error codes:
   *
   * <p>&#42; [google.rpc.Code.INVALID_ARGUMENT][google.rpc.Code.INVALID_ARGUMENT] if the request is
   * malformed or if the uploaded photo is not a 360 photo. &#42;
   * [google.rpc.Code.NOT_FOUND][google.rpc.Code.NOT_FOUND] if the upload reference does not exist.
   * &#42; [google.rpc.Code.RESOURCE_EXHAUSTED][google.rpc.Code.RESOURCE_EXHAUSTED] if the account
   * has reached the storage limit.
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
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Photo createPhoto(CreatePhotoRequest request) {
    return createPhotoCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * After the client finishes uploading the photo with the returned
   * [UploadRef][google.streetview.publish.v1.UploadRef],
   * [CreatePhoto][google.streetview.publish.v1.StreetViewPublishService.CreatePhoto] publishes the
   * uploaded [Photo][google.streetview.publish.v1.Photo] to Street View on Google Maps.
   *
   * <p>Currently, the only way to set heading, pitch, and roll in CreatePhoto is through the [Photo
   * Sphere XMP metadata](https://developers.google.com/streetview/spherical-metadata) in the photo
   * bytes. CreatePhoto ignores the `pose.heading`, `pose.pitch`, `pose.roll`, `pose.altitude`, and
   * `pose.level` fields in Pose.
   *
   * <p>This method returns the following error codes:
   *
   * <p>&#42; [google.rpc.Code.INVALID_ARGUMENT][google.rpc.Code.INVALID_ARGUMENT] if the request is
   * malformed or if the uploaded photo is not a 360 photo. &#42;
   * [google.rpc.Code.NOT_FOUND][google.rpc.Code.NOT_FOUND] if the upload reference does not exist.
   * &#42; [google.rpc.Code.RESOURCE_EXHAUSTED][google.rpc.Code.RESOURCE_EXHAUSTED] if the account
   * has reached the storage limit.
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
    return stub.createPhotoCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Gets the metadata of the specified [Photo][google.streetview.publish.v1.Photo].
   *
   * <p>This method returns the following error codes:
   *
   * <p>&#42; [google.rpc.Code.PERMISSION_DENIED][google.rpc.Code.PERMISSION_DENIED] if the
   * requesting user did not create the requested [Photo][google.streetview.publish.v1.Photo]. &#42;
   * [google.rpc.Code.NOT_FOUND][google.rpc.Code.NOT_FOUND] if the requested
   * [Photo][google.streetview.publish.v1.Photo] does not exist. &#42;
   * [google.rpc.Code.UNAVAILABLE][google.rpc.Code.UNAVAILABLE] if the requested
   * [Photo][google.streetview.publish.v1.Photo] is still being indexed.
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
   * @param photoId Required. ID of the [Photo][google.streetview.publish.v1.Photo].
   * @param view Specifies if a download URL for the photo bytes should be returned in the
   *     [Photo][google.streetview.publish.v1.Photo] response.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Photo getPhoto(String photoId, PhotoView view) {

    GetPhotoRequest request =
        GetPhotoRequest.newBuilder().setPhotoId(photoId).setView(view).build();
    return getPhoto(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Gets the metadata of the specified [Photo][google.streetview.publish.v1.Photo].
   *
   * <p>This method returns the following error codes:
   *
   * <p>&#42; [google.rpc.Code.PERMISSION_DENIED][google.rpc.Code.PERMISSION_DENIED] if the
   * requesting user did not create the requested [Photo][google.streetview.publish.v1.Photo]. &#42;
   * [google.rpc.Code.NOT_FOUND][google.rpc.Code.NOT_FOUND] if the requested
   * [Photo][google.streetview.publish.v1.Photo] does not exist. &#42;
   * [google.rpc.Code.UNAVAILABLE][google.rpc.Code.UNAVAILABLE] if the requested
   * [Photo][google.streetview.publish.v1.Photo] is still being indexed.
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
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Photo getPhoto(GetPhotoRequest request) {
    return getPhotoCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Gets the metadata of the specified [Photo][google.streetview.publish.v1.Photo].
   *
   * <p>This method returns the following error codes:
   *
   * <p>&#42; [google.rpc.Code.PERMISSION_DENIED][google.rpc.Code.PERMISSION_DENIED] if the
   * requesting user did not create the requested [Photo][google.streetview.publish.v1.Photo]. &#42;
   * [google.rpc.Code.NOT_FOUND][google.rpc.Code.NOT_FOUND] if the requested
   * [Photo][google.streetview.publish.v1.Photo] does not exist. &#42;
   * [google.rpc.Code.UNAVAILABLE][google.rpc.Code.UNAVAILABLE] if the requested
   * [Photo][google.streetview.publish.v1.Photo] is still being indexed.
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
    return stub.getPhotoCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Gets the metadata of the specified [Photo][google.streetview.publish.v1.Photo] batch.
   *
   * <p>Note that if
   * [BatchGetPhotos][google.streetview.publish.v1.StreetViewPublishService.BatchGetPhotos] fails,
   * either critical fields are missing or there is an authentication error. Even if
   * [BatchGetPhotos][google.streetview.publish.v1.StreetViewPublishService.BatchGetPhotos]
   * succeeds, individual photos in the batch may have failures. These failures are specified in
   * each [PhotoResponse.status][google.streetview.publish.v1.PhotoResponse.status] in
   * [BatchGetPhotosResponse.results][google.streetview.publish.v1.BatchGetPhotosResponse.results].
   * See [GetPhoto][google.streetview.publish.v1.StreetViewPublishService.GetPhoto] for specific
   * failures that can occur per photo.
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
   * @param photoIds Required. IDs of the [Photos][google.streetview.publish.v1.Photo]. HTTP GET
   *     requests require the following syntax for the URL query parameter:
   *     `photoIds=&lt;id1&gt;&amp;photoIds=&lt;id2&gt;&amp;...`.
   * @param view Specifies if a download URL for the photo bytes should be returned in the Photo
   *     response.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final BatchGetPhotosResponse batchGetPhotos(List<String> photoIds, PhotoView view) {

    BatchGetPhotosRequest request =
        BatchGetPhotosRequest.newBuilder().addAllPhotoIds(photoIds).setView(view).build();
    return batchGetPhotos(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Gets the metadata of the specified [Photo][google.streetview.publish.v1.Photo] batch.
   *
   * <p>Note that if
   * [BatchGetPhotos][google.streetview.publish.v1.StreetViewPublishService.BatchGetPhotos] fails,
   * either critical fields are missing or there is an authentication error. Even if
   * [BatchGetPhotos][google.streetview.publish.v1.StreetViewPublishService.BatchGetPhotos]
   * succeeds, individual photos in the batch may have failures. These failures are specified in
   * each [PhotoResponse.status][google.streetview.publish.v1.PhotoResponse.status] in
   * [BatchGetPhotosResponse.results][google.streetview.publish.v1.BatchGetPhotosResponse.results].
   * See [GetPhoto][google.streetview.publish.v1.StreetViewPublishService.GetPhoto] for specific
   * failures that can occur per photo.
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
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final BatchGetPhotosResponse batchGetPhotos(BatchGetPhotosRequest request) {
    return batchGetPhotosCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Gets the metadata of the specified [Photo][google.streetview.publish.v1.Photo] batch.
   *
   * <p>Note that if
   * [BatchGetPhotos][google.streetview.publish.v1.StreetViewPublishService.BatchGetPhotos] fails,
   * either critical fields are missing or there is an authentication error. Even if
   * [BatchGetPhotos][google.streetview.publish.v1.StreetViewPublishService.BatchGetPhotos]
   * succeeds, individual photos in the batch may have failures. These failures are specified in
   * each [PhotoResponse.status][google.streetview.publish.v1.PhotoResponse.status] in
   * [BatchGetPhotosResponse.results][google.streetview.publish.v1.BatchGetPhotosResponse.results].
   * See [GetPhoto][google.streetview.publish.v1.StreetViewPublishService.GetPhoto] for specific
   * failures that can occur per photo.
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
    return stub.batchGetPhotosCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Lists all the [Photos][google.streetview.publish.v1.Photo] that belong to the user.
   *
   * <p>&lt;aside class="note"&gt;&lt;b&gt;Note:&lt;/b&gt; Recently created photos that are still
   * being indexed are not returned in the response.&lt;/aside&gt;
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
   * @param filter The filter expression. For example: `placeId=ChIJj61dQgK6j4AR4GeTYWZsKWw`.
   *     <p>The only filter supported at the moment is `placeId`.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListPhotosPagedResponse listPhotos(PhotoView view, String filter) {
    ListPhotosRequest request =
        ListPhotosRequest.newBuilder().setView(view).setFilter(filter).build();
    return listPhotos(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Lists all the [Photos][google.streetview.publish.v1.Photo] that belong to the user.
   *
   * <p>&lt;aside class="note"&gt;&lt;b&gt;Note:&lt;/b&gt; Recently created photos that are still
   * being indexed are not returned in the response.&lt;/aside&gt;
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
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListPhotosPagedResponse listPhotos(ListPhotosRequest request) {
    return listPhotosPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Lists all the [Photos][google.streetview.publish.v1.Photo] that belong to the user.
   *
   * <p>&lt;aside class="note"&gt;&lt;b&gt;Note:&lt;/b&gt; Recently created photos that are still
   * being indexed are not returned in the response.&lt;/aside&gt;
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
    return stub.listPhotosPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Lists all the [Photos][google.streetview.publish.v1.Photo] that belong to the user.
   *
   * <p>&lt;aside class="note"&gt;&lt;b&gt;Note:&lt;/b&gt; Recently created photos that are still
   * being indexed are not returned in the response.&lt;/aside&gt;
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
    return stub.listPhotosCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates the metadata of a [Photo][google.streetview.publish.v1.Photo], such as pose, place
   * association, connections, etc. Changing the pixels of a photo is not supported.
   *
   * <p>Only the fields specified in the
   * [updateMask][google.streetview.publish.v1.UpdatePhotoRequest.update_mask] field are used. If
   * `updateMask` is not present, the update applies to all fields.
   *
   * <p>This method returns the following error codes:
   *
   * <p>&#42; [google.rpc.Code.PERMISSION_DENIED][google.rpc.Code.PERMISSION_DENIED] if the
   * requesting user did not create the requested photo. &#42;
   * [google.rpc.Code.INVALID_ARGUMENT][google.rpc.Code.INVALID_ARGUMENT] if the request is
   * malformed. &#42; [google.rpc.Code.NOT_FOUND][google.rpc.Code.NOT_FOUND] if the requested photo
   * does not exist. &#42; [google.rpc.Code.UNAVAILABLE][google.rpc.Code.UNAVAILABLE] if the
   * requested [Photo][google.streetview.publish.v1.Photo] is still being indexed.
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
   * @param photo Required. [Photo][google.streetview.publish.v1.Photo] object containing the new
   *     metadata.
   * @param updateMask Mask that identifies fields on the photo metadata to update. If not present,
   *     the old [Photo][google.streetview.publish.v1.Photo] metadata is entirely replaced with the
   *     new [Photo][google.streetview.publish.v1.Photo] metadata in this request. The update fails
   *     if invalid fields are specified. Multiple fields can be specified in a comma-delimited
   *     list.
   *     <p>The following fields are valid:
   *     <p>&#42; `pose.heading` &#42; `pose.latLngPair` &#42; `pose.pitch` &#42; `pose.roll` &#42;
   *     `pose.level` &#42; `pose.altitude` &#42; `connections` &#42; `places`
   *     <p>&lt;aside class="note"&gt;&lt;b&gt;Note:&lt;/b&gt; When
   *     [updateMask][google.streetview.publish.v1.UpdatePhotoRequest.update_mask] contains repeated
   *     fields, the entire set of repeated values get replaced with the new contents. For example,
   *     if [updateMask][google.streetview.publish.v1.UpdatePhotoRequest.update_mask] contains
   *     `connections` and `UpdatePhotoRequest.photo.connections` is empty, all connections are
   *     removed.&lt;/aside&gt;
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Photo updatePhoto(Photo photo, FieldMask updateMask) {

    UpdatePhotoRequest request =
        UpdatePhotoRequest.newBuilder().setPhoto(photo).setUpdateMask(updateMask).build();
    return updatePhoto(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates the metadata of a [Photo][google.streetview.publish.v1.Photo], such as pose, place
   * association, connections, etc. Changing the pixels of a photo is not supported.
   *
   * <p>Only the fields specified in the
   * [updateMask][google.streetview.publish.v1.UpdatePhotoRequest.update_mask] field are used. If
   * `updateMask` is not present, the update applies to all fields.
   *
   * <p>This method returns the following error codes:
   *
   * <p>&#42; [google.rpc.Code.PERMISSION_DENIED][google.rpc.Code.PERMISSION_DENIED] if the
   * requesting user did not create the requested photo. &#42;
   * [google.rpc.Code.INVALID_ARGUMENT][google.rpc.Code.INVALID_ARGUMENT] if the request is
   * malformed. &#42; [google.rpc.Code.NOT_FOUND][google.rpc.Code.NOT_FOUND] if the requested photo
   * does not exist. &#42; [google.rpc.Code.UNAVAILABLE][google.rpc.Code.UNAVAILABLE] if the
   * requested [Photo][google.streetview.publish.v1.Photo] is still being indexed.
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
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Photo updatePhoto(UpdatePhotoRequest request) {
    return updatePhotoCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates the metadata of a [Photo][google.streetview.publish.v1.Photo], such as pose, place
   * association, connections, etc. Changing the pixels of a photo is not supported.
   *
   * <p>Only the fields specified in the
   * [updateMask][google.streetview.publish.v1.UpdatePhotoRequest.update_mask] field are used. If
   * `updateMask` is not present, the update applies to all fields.
   *
   * <p>This method returns the following error codes:
   *
   * <p>&#42; [google.rpc.Code.PERMISSION_DENIED][google.rpc.Code.PERMISSION_DENIED] if the
   * requesting user did not create the requested photo. &#42;
   * [google.rpc.Code.INVALID_ARGUMENT][google.rpc.Code.INVALID_ARGUMENT] if the request is
   * malformed. &#42; [google.rpc.Code.NOT_FOUND][google.rpc.Code.NOT_FOUND] if the requested photo
   * does not exist. &#42; [google.rpc.Code.UNAVAILABLE][google.rpc.Code.UNAVAILABLE] if the
   * requested [Photo][google.streetview.publish.v1.Photo] is still being indexed.
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
    return stub.updatePhotoCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates the metadata of [Photos][google.streetview.publish.v1.Photo], such as pose, place
   * association, connections, etc. Changing the pixels of photos is not supported.
   *
   * <p>Note that if
   * [BatchUpdatePhotos][google.streetview.publish.v1.StreetViewPublishService.BatchUpdatePhotos]
   * fails, either critical fields are missing or there is an authentication error. Even if
   * [BatchUpdatePhotos][google.streetview.publish.v1.StreetViewPublishService.BatchUpdatePhotos]
   * succeeds, individual photos in the batch may have failures. These failures are specified in
   * each [PhotoResponse.status][google.streetview.publish.v1.PhotoResponse.status] in
   * [BatchUpdatePhotosResponse.results][google.streetview.publish.v1.BatchUpdatePhotosResponse.results].
   * See [UpdatePhoto][google.streetview.publish.v1.StreetViewPublishService.UpdatePhoto] for
   * specific failures that can occur per photo.
   *
   * <p>Only the fields specified in
   * [updateMask][google.streetview.publish.v1.UpdatePhotoRequest.update_mask] field are used. If
   * `updateMask` is not present, the update applies to all fields.
   *
   * <p>The number of [UpdatePhotoRequest][google.streetview.publish.v1.UpdatePhotoRequest] messages
   * in a [BatchUpdatePhotosRequest][google.streetview.publish.v1.BatchUpdatePhotosRequest] must not
   * exceed 20.
   *
   * <p>&lt;aside class="note"&gt;&lt;b&gt;Note:&lt;/b&gt; To update
   * [Pose.altitude][google.streetview.publish.v1.Pose.altitude],
   * [Pose.latLngPair][google.streetview.publish.v1.Pose.lat_lng_pair] has to be filled as well.
   * Otherwise, the request will fail.&lt;/aside&gt;
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
   * @param updatePhotoRequests Required. List of
   *     [UpdatePhotoRequests][google.streetview.publish.v1.UpdatePhotoRequest].
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
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
   * Updates the metadata of [Photos][google.streetview.publish.v1.Photo], such as pose, place
   * association, connections, etc. Changing the pixels of photos is not supported.
   *
   * <p>Note that if
   * [BatchUpdatePhotos][google.streetview.publish.v1.StreetViewPublishService.BatchUpdatePhotos]
   * fails, either critical fields are missing or there is an authentication error. Even if
   * [BatchUpdatePhotos][google.streetview.publish.v1.StreetViewPublishService.BatchUpdatePhotos]
   * succeeds, individual photos in the batch may have failures. These failures are specified in
   * each [PhotoResponse.status][google.streetview.publish.v1.PhotoResponse.status] in
   * [BatchUpdatePhotosResponse.results][google.streetview.publish.v1.BatchUpdatePhotosResponse.results].
   * See [UpdatePhoto][google.streetview.publish.v1.StreetViewPublishService.UpdatePhoto] for
   * specific failures that can occur per photo.
   *
   * <p>Only the fields specified in
   * [updateMask][google.streetview.publish.v1.UpdatePhotoRequest.update_mask] field are used. If
   * `updateMask` is not present, the update applies to all fields.
   *
   * <p>The number of [UpdatePhotoRequest][google.streetview.publish.v1.UpdatePhotoRequest] messages
   * in a [BatchUpdatePhotosRequest][google.streetview.publish.v1.BatchUpdatePhotosRequest] must not
   * exceed 20.
   *
   * <p>&lt;aside class="note"&gt;&lt;b&gt;Note:&lt;/b&gt; To update
   * [Pose.altitude][google.streetview.publish.v1.Pose.altitude],
   * [Pose.latLngPair][google.streetview.publish.v1.Pose.lat_lng_pair] has to be filled as well.
   * Otherwise, the request will fail.&lt;/aside&gt;
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
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final BatchUpdatePhotosResponse batchUpdatePhotos(BatchUpdatePhotosRequest request) {
    return batchUpdatePhotosCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates the metadata of [Photos][google.streetview.publish.v1.Photo], such as pose, place
   * association, connections, etc. Changing the pixels of photos is not supported.
   *
   * <p>Note that if
   * [BatchUpdatePhotos][google.streetview.publish.v1.StreetViewPublishService.BatchUpdatePhotos]
   * fails, either critical fields are missing or there is an authentication error. Even if
   * [BatchUpdatePhotos][google.streetview.publish.v1.StreetViewPublishService.BatchUpdatePhotos]
   * succeeds, individual photos in the batch may have failures. These failures are specified in
   * each [PhotoResponse.status][google.streetview.publish.v1.PhotoResponse.status] in
   * [BatchUpdatePhotosResponse.results][google.streetview.publish.v1.BatchUpdatePhotosResponse.results].
   * See [UpdatePhoto][google.streetview.publish.v1.StreetViewPublishService.UpdatePhoto] for
   * specific failures that can occur per photo.
   *
   * <p>Only the fields specified in
   * [updateMask][google.streetview.publish.v1.UpdatePhotoRequest.update_mask] field are used. If
   * `updateMask` is not present, the update applies to all fields.
   *
   * <p>The number of [UpdatePhotoRequest][google.streetview.publish.v1.UpdatePhotoRequest] messages
   * in a [BatchUpdatePhotosRequest][google.streetview.publish.v1.BatchUpdatePhotosRequest] must not
   * exceed 20.
   *
   * <p>&lt;aside class="note"&gt;&lt;b&gt;Note:&lt;/b&gt; To update
   * [Pose.altitude][google.streetview.publish.v1.Pose.altitude],
   * [Pose.latLngPair][google.streetview.publish.v1.Pose.lat_lng_pair] has to be filled as well.
   * Otherwise, the request will fail.&lt;/aside&gt;
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
    return stub.batchUpdatePhotosCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes a [Photo][google.streetview.publish.v1.Photo] and its metadata.
   *
   * <p>This method returns the following error codes:
   *
   * <p>&#42; [google.rpc.Code.PERMISSION_DENIED][google.rpc.Code.PERMISSION_DENIED] if the
   * requesting user did not create the requested photo. &#42;
   * [google.rpc.Code.NOT_FOUND][google.rpc.Code.NOT_FOUND] if the photo ID does not exist.
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
   * @param photoId Required. ID of the [Photo][google.streetview.publish.v1.Photo].
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void deletePhoto(String photoId) {

    DeletePhotoRequest request = DeletePhotoRequest.newBuilder().setPhotoId(photoId).build();
    deletePhoto(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes a [Photo][google.streetview.publish.v1.Photo] and its metadata.
   *
   * <p>This method returns the following error codes:
   *
   * <p>&#42; [google.rpc.Code.PERMISSION_DENIED][google.rpc.Code.PERMISSION_DENIED] if the
   * requesting user did not create the requested photo. &#42;
   * [google.rpc.Code.NOT_FOUND][google.rpc.Code.NOT_FOUND] if the photo ID does not exist.
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
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void deletePhoto(DeletePhotoRequest request) {
    deletePhotoCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes a [Photo][google.streetview.publish.v1.Photo] and its metadata.
   *
   * <p>This method returns the following error codes:
   *
   * <p>&#42; [google.rpc.Code.PERMISSION_DENIED][google.rpc.Code.PERMISSION_DENIED] if the
   * requesting user did not create the requested photo. &#42;
   * [google.rpc.Code.NOT_FOUND][google.rpc.Code.NOT_FOUND] if the photo ID does not exist.
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
    return stub.deletePhotoCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes a list of [Photos][google.streetview.publish.v1.Photo] and their metadata.
   *
   * <p>Note that if
   * [BatchDeletePhotos][google.streetview.publish.v1.StreetViewPublishService.BatchDeletePhotos]
   * fails, either critical fields are missing or there was an authentication error. Even if
   * [BatchDeletePhotos][google.streetview.publish.v1.StreetViewPublishService.BatchDeletePhotos]
   * succeeds, individual photos in the batch may have failures. These failures are specified in
   * each [PhotoResponse.status][google.streetview.publish.v1.PhotoResponse.status] in
   * [BatchDeletePhotosResponse.results][google.streetview.publish.v1.BatchDeletePhotosResponse.status].
   * See [DeletePhoto][google.streetview.publish.v1.StreetViewPublishService.DeletePhoto] for
   * specific failures that can occur per photo.
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
   * @param photoIds Required. IDs of the [Photos][google.streetview.publish.v1.Photo]. HTTP GET
   *     requests require the following syntax for the URL query parameter:
   *     `photoIds=&lt;id1&gt;&amp;photoIds=&lt;id2&gt;&amp;...`.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final BatchDeletePhotosResponse batchDeletePhotos(List<String> photoIds) {

    BatchDeletePhotosRequest request =
        BatchDeletePhotosRequest.newBuilder().addAllPhotoIds(photoIds).build();
    return batchDeletePhotos(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes a list of [Photos][google.streetview.publish.v1.Photo] and their metadata.
   *
   * <p>Note that if
   * [BatchDeletePhotos][google.streetview.publish.v1.StreetViewPublishService.BatchDeletePhotos]
   * fails, either critical fields are missing or there was an authentication error. Even if
   * [BatchDeletePhotos][google.streetview.publish.v1.StreetViewPublishService.BatchDeletePhotos]
   * succeeds, individual photos in the batch may have failures. These failures are specified in
   * each [PhotoResponse.status][google.streetview.publish.v1.PhotoResponse.status] in
   * [BatchDeletePhotosResponse.results][google.streetview.publish.v1.BatchDeletePhotosResponse.status].
   * See [DeletePhoto][google.streetview.publish.v1.StreetViewPublishService.DeletePhoto] for
   * specific failures that can occur per photo.
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
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final BatchDeletePhotosResponse batchDeletePhotos(BatchDeletePhotosRequest request) {
    return batchDeletePhotosCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes a list of [Photos][google.streetview.publish.v1.Photo] and their metadata.
   *
   * <p>Note that if
   * [BatchDeletePhotos][google.streetview.publish.v1.StreetViewPublishService.BatchDeletePhotos]
   * fails, either critical fields are missing or there was an authentication error. Even if
   * [BatchDeletePhotos][google.streetview.publish.v1.StreetViewPublishService.BatchDeletePhotos]
   * succeeds, individual photos in the batch may have failures. These failures are specified in
   * each [PhotoResponse.status][google.streetview.publish.v1.PhotoResponse.status] in
   * [BatchDeletePhotosResponse.results][google.streetview.publish.v1.BatchDeletePhotosResponse.status].
   * See [DeletePhoto][google.streetview.publish.v1.StreetViewPublishService.DeletePhoto] for
   * specific failures that can occur per photo.
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
    return stub.batchDeletePhotosCallable();
  }

  @Override
  public final void close() {
    stub.close();
  }

  @Override
  public void shutdown() {
    stub.shutdown();
  }

  @Override
  public boolean isShutdown() {
    return stub.isShutdown();
  }

  @Override
  public boolean isTerminated() {
    return stub.isTerminated();
  }

  @Override
  public void shutdownNow() {
    stub.shutdownNow();
  }

  @Override
  public boolean awaitTermination(long duration, TimeUnit unit) throws InterruptedException {
    return stub.awaitTermination(duration, unit);
  }

  public static class ListPhotosPagedResponse
      extends AbstractPagedListResponse<
          ListPhotosRequest,
          ListPhotosResponse,
          Photo,
          ListPhotosPage,
          ListPhotosFixedSizeCollection> {

    public static ApiFuture<ListPhotosPagedResponse> createAsync(
        PageContext<ListPhotosRequest, ListPhotosResponse, Photo> context,
        ApiFuture<ListPhotosResponse> futureResponse) {
      ApiFuture<ListPhotosPage> futurePage =
          ListPhotosPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          new ApiFunction<ListPhotosPage, ListPhotosPagedResponse>() {
            @Override
            public ListPhotosPagedResponse apply(ListPhotosPage input) {
              return new ListPhotosPagedResponse(input);
            }
          });
    }

    private ListPhotosPagedResponse(ListPhotosPage page) {
      super(page, ListPhotosFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListPhotosPage
      extends AbstractPage<ListPhotosRequest, ListPhotosResponse, Photo, ListPhotosPage> {

    private ListPhotosPage(
        PageContext<ListPhotosRequest, ListPhotosResponse, Photo> context,
        ListPhotosResponse response) {
      super(context, response);
    }

    private static ListPhotosPage createEmptyPage() {
      return new ListPhotosPage(null, null);
    }

    @Override
    protected ListPhotosPage createPage(
        PageContext<ListPhotosRequest, ListPhotosResponse, Photo> context,
        ListPhotosResponse response) {
      return new ListPhotosPage(context, response);
    }

    @Override
    public ApiFuture<ListPhotosPage> createPageAsync(
        PageContext<ListPhotosRequest, ListPhotosResponse, Photo> context,
        ApiFuture<ListPhotosResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListPhotosFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListPhotosRequest,
          ListPhotosResponse,
          Photo,
          ListPhotosPage,
          ListPhotosFixedSizeCollection> {

    private ListPhotosFixedSizeCollection(List<ListPhotosPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListPhotosFixedSizeCollection createEmptyCollection() {
      return new ListPhotosFixedSizeCollection(null, 0);
    }

    @Override
    protected ListPhotosFixedSizeCollection createCollection(
        List<ListPhotosPage> pages, int collectionSize) {
      return new ListPhotosFixedSizeCollection(pages, collectionSize);
    }
  }
}
