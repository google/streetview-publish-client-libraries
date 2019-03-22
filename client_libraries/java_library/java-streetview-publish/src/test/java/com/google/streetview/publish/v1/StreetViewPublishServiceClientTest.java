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

import static com.google.streetview.publish.v1.StreetViewPublishServiceClient.ListPhotosPagedResponse;

import com.google.api.gax.core.NoCredentialsProvider;
import com.google.api.gax.grpc.GaxGrpcProperties;
import com.google.api.gax.grpc.testing.LocalChannelProvider;
import com.google.api.gax.grpc.testing.MockGrpcService;
import com.google.api.gax.grpc.testing.MockServiceHelper;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.InvalidArgumentException;
import com.google.common.collect.Lists;
import com.google.geo.ugc.streetview.publish.v1.StreetViewPublishResources.Photo;
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
import com.google.protobuf.GeneratedMessageV3;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

@javax.annotation.Generated("by GAPIC")
public class StreetViewPublishServiceClientTest {
  private static MockStreetViewPublishService mockStreetViewPublishService;
  private static MockServiceHelper serviceHelper;
  private StreetViewPublishServiceClient client;
  private LocalChannelProvider channelProvider;

  @BeforeClass
  public static void startStaticServer() {
    mockStreetViewPublishService = new MockStreetViewPublishService();
    serviceHelper =
        new MockServiceHelper(
            "in-process-1", Arrays.<MockGrpcService>asList(mockStreetViewPublishService));
    serviceHelper.start();
  }

  @AfterClass
  public static void stopServer() {
    serviceHelper.stop();
  }

  @Before
  public void setUp() throws IOException {
    serviceHelper.reset();
    channelProvider = serviceHelper.createChannelProvider();
    StreetViewPublishServiceSettings settings =
        StreetViewPublishServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = StreetViewPublishServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  @SuppressWarnings("all")
  public void createPhotoTest() {
    String downloadUrl = "downloadUrl1109408056";
    String thumbnailUrl = "thumbnailUrl1825632156";
    String shareLink = "shareLink-1788203942";
    long viewCount = 1534353675L;
    Photo expectedResponse =
        Photo.newBuilder()
            .setDownloadUrl(downloadUrl)
            .setThumbnailUrl(thumbnailUrl)
            .setShareLink(shareLink)
            .setViewCount(viewCount)
            .build();
    mockStreetViewPublishService.addResponse(expectedResponse);

    Photo photo = Photo.newBuilder().build();

    Photo actualResponse = client.createPhoto(photo);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<GeneratedMessageV3> actualRequests = mockStreetViewPublishService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CreatePhotoRequest actualRequest = (CreatePhotoRequest) actualRequests.get(0);

    Assert.assertEquals(photo, actualRequest.getPhoto());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void createPhotoExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockStreetViewPublishService.addException(exception);

    try {
      Photo photo = Photo.newBuilder().build();

      client.createPhoto(photo);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void getPhotoTest() {
    String downloadUrl = "downloadUrl1109408056";
    String thumbnailUrl = "thumbnailUrl1825632156";
    String shareLink = "shareLink-1788203942";
    long viewCount = 1534353675L;
    Photo expectedResponse =
        Photo.newBuilder()
            .setDownloadUrl(downloadUrl)
            .setThumbnailUrl(thumbnailUrl)
            .setShareLink(shareLink)
            .setViewCount(viewCount)
            .build();
    mockStreetViewPublishService.addResponse(expectedResponse);

    String photoId = "photoId-1274270136";
    PhotoView view = PhotoView.BASIC;

    Photo actualResponse = client.getPhoto(photoId, view);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<GeneratedMessageV3> actualRequests = mockStreetViewPublishService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetPhotoRequest actualRequest = (GetPhotoRequest) actualRequests.get(0);

    Assert.assertEquals(photoId, actualRequest.getPhotoId());
    Assert.assertEquals(view, actualRequest.getView());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void getPhotoExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockStreetViewPublishService.addException(exception);

    try {
      String photoId = "photoId-1274270136";
      PhotoView view = PhotoView.BASIC;

      client.getPhoto(photoId, view);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void batchGetPhotosTest() {
    BatchGetPhotosResponse expectedResponse = BatchGetPhotosResponse.newBuilder().build();
    mockStreetViewPublishService.addResponse(expectedResponse);

    List<String> photoIds = new ArrayList<>();
    PhotoView view = PhotoView.BASIC;

    BatchGetPhotosResponse actualResponse = client.batchGetPhotos(photoIds, view);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<GeneratedMessageV3> actualRequests = mockStreetViewPublishService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    BatchGetPhotosRequest actualRequest = (BatchGetPhotosRequest) actualRequests.get(0);

    Assert.assertEquals(photoIds, actualRequest.getPhotoIdsList());
    Assert.assertEquals(view, actualRequest.getView());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void batchGetPhotosExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockStreetViewPublishService.addException(exception);

    try {
      List<String> photoIds = new ArrayList<>();
      PhotoView view = PhotoView.BASIC;

      client.batchGetPhotos(photoIds, view);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void listPhotosTest() {
    String nextPageToken = "";
    Photo photosElement = Photo.newBuilder().build();
    List<Photo> photos = Arrays.asList(photosElement);
    ListPhotosResponse expectedResponse =
        ListPhotosResponse.newBuilder()
            .setNextPageToken(nextPageToken)
            .addAllPhotos(photos)
            .build();
    mockStreetViewPublishService.addResponse(expectedResponse);

    PhotoView view = PhotoView.BASIC;
    String filter = "filter-1274492040";

    ListPhotosPagedResponse pagedListResponse = client.listPhotos(view, filter);

    List<Photo> resources = Lists.newArrayList(pagedListResponse.iterateAll());
    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getPhotosList().get(0), resources.get(0));

    List<GeneratedMessageV3> actualRequests = mockStreetViewPublishService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListPhotosRequest actualRequest = (ListPhotosRequest) actualRequests.get(0);

    Assert.assertEquals(view, actualRequest.getView());
    Assert.assertEquals(filter, actualRequest.getFilter());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void listPhotosExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockStreetViewPublishService.addException(exception);

    try {
      PhotoView view = PhotoView.BASIC;
      String filter = "filter-1274492040";

      client.listPhotos(view, filter);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void updatePhotoTest() {
    String downloadUrl = "downloadUrl1109408056";
    String thumbnailUrl = "thumbnailUrl1825632156";
    String shareLink = "shareLink-1788203942";
    long viewCount = 1534353675L;
    Photo expectedResponse =
        Photo.newBuilder()
            .setDownloadUrl(downloadUrl)
            .setThumbnailUrl(thumbnailUrl)
            .setShareLink(shareLink)
            .setViewCount(viewCount)
            .build();
    mockStreetViewPublishService.addResponse(expectedResponse);

    Photo photo = Photo.newBuilder().build();
    FieldMask updateMask = FieldMask.newBuilder().build();

    Photo actualResponse = client.updatePhoto(photo, updateMask);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<GeneratedMessageV3> actualRequests = mockStreetViewPublishService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    UpdatePhotoRequest actualRequest = (UpdatePhotoRequest) actualRequests.get(0);

    Assert.assertEquals(photo, actualRequest.getPhoto());
    Assert.assertEquals(updateMask, actualRequest.getUpdateMask());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void updatePhotoExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockStreetViewPublishService.addException(exception);

    try {
      Photo photo = Photo.newBuilder().build();
      FieldMask updateMask = FieldMask.newBuilder().build();

      client.updatePhoto(photo, updateMask);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void batchUpdatePhotosTest() {
    BatchUpdatePhotosResponse expectedResponse = BatchUpdatePhotosResponse.newBuilder().build();
    mockStreetViewPublishService.addResponse(expectedResponse);

    List<UpdatePhotoRequest> updatePhotoRequests = new ArrayList<>();

    BatchUpdatePhotosResponse actualResponse = client.batchUpdatePhotos(updatePhotoRequests);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<GeneratedMessageV3> actualRequests = mockStreetViewPublishService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    BatchUpdatePhotosRequest actualRequest = (BatchUpdatePhotosRequest) actualRequests.get(0);

    Assert.assertEquals(updatePhotoRequests, actualRequest.getUpdatePhotoRequestsList());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void batchUpdatePhotosExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockStreetViewPublishService.addException(exception);

    try {
      List<UpdatePhotoRequest> updatePhotoRequests = new ArrayList<>();

      client.batchUpdatePhotos(updatePhotoRequests);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void deletePhotoTest() {
    Empty expectedResponse = Empty.newBuilder().build();
    mockStreetViewPublishService.addResponse(expectedResponse);

    String photoId = "photoId-1274270136";

    client.deletePhoto(photoId);

    List<GeneratedMessageV3> actualRequests = mockStreetViewPublishService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    DeletePhotoRequest actualRequest = (DeletePhotoRequest) actualRequests.get(0);

    Assert.assertEquals(photoId, actualRequest.getPhotoId());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void deletePhotoExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockStreetViewPublishService.addException(exception);

    try {
      String photoId = "photoId-1274270136";

      client.deletePhoto(photoId);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void batchDeletePhotosTest() {
    BatchDeletePhotosResponse expectedResponse = BatchDeletePhotosResponse.newBuilder().build();
    mockStreetViewPublishService.addResponse(expectedResponse);

    List<String> photoIds = new ArrayList<>();

    BatchDeletePhotosResponse actualResponse = client.batchDeletePhotos(photoIds);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<GeneratedMessageV3> actualRequests = mockStreetViewPublishService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    BatchDeletePhotosRequest actualRequest = (BatchDeletePhotosRequest) actualRequests.get(0);

    Assert.assertEquals(photoIds, actualRequest.getPhotoIdsList());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void batchDeletePhotosExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockStreetViewPublishService.addException(exception);

    try {
      List<String> photoIds = new ArrayList<>();

      client.batchDeletePhotos(photoIds);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }
}
