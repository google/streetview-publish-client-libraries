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
package com.google.streetview.publish.v1.stub;

import static com.google.streetview.publish.v1.StreetViewPublishServiceClient.ListPhotosPagedResponse;

import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.core.BackgroundResourceAggregation;
import com.google.api.gax.grpc.GrpcCallSettings;
import com.google.api.gax.grpc.GrpcStubCallableFactory;
import com.google.api.gax.rpc.ClientContext;
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
import com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.UpdatePhotoRequest;
import com.google.protobuf.Empty;
import io.grpc.MethodDescriptor;
import io.grpc.protobuf.ProtoUtils;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * gRPC stub implementation for Street View Publish API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator")
@BetaApi("A restructuring of stub classes is planned, so this may break in the future")
public class GrpcStreetViewPublishServiceStub extends StreetViewPublishServiceStub {

  private static final MethodDescriptor<Empty, UploadRef> startUploadMethodDescriptor =
      MethodDescriptor.<Empty, UploadRef>newBuilder()
          .setType(MethodDescriptor.MethodType.UNARY)
          .setFullMethodName("google.streetview.publish.v1.StreetViewPublishService/StartUpload")
          .setRequestMarshaller(ProtoUtils.marshaller(Empty.getDefaultInstance()))
          .setResponseMarshaller(ProtoUtils.marshaller(UploadRef.getDefaultInstance()))
          .build();
  private static final MethodDescriptor<CreatePhotoRequest, Photo> createPhotoMethodDescriptor =
      MethodDescriptor.<CreatePhotoRequest, Photo>newBuilder()
          .setType(MethodDescriptor.MethodType.UNARY)
          .setFullMethodName("google.streetview.publish.v1.StreetViewPublishService/CreatePhoto")
          .setRequestMarshaller(ProtoUtils.marshaller(CreatePhotoRequest.getDefaultInstance()))
          .setResponseMarshaller(ProtoUtils.marshaller(Photo.getDefaultInstance()))
          .build();
  private static final MethodDescriptor<GetPhotoRequest, Photo> getPhotoMethodDescriptor =
      MethodDescriptor.<GetPhotoRequest, Photo>newBuilder()
          .setType(MethodDescriptor.MethodType.UNARY)
          .setFullMethodName("google.streetview.publish.v1.StreetViewPublishService/GetPhoto")
          .setRequestMarshaller(ProtoUtils.marshaller(GetPhotoRequest.getDefaultInstance()))
          .setResponseMarshaller(ProtoUtils.marshaller(Photo.getDefaultInstance()))
          .build();
  private static final MethodDescriptor<BatchGetPhotosRequest, BatchGetPhotosResponse>
      batchGetPhotosMethodDescriptor =
          MethodDescriptor.<BatchGetPhotosRequest, BatchGetPhotosResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.streetview.publish.v1.StreetViewPublishService/BatchGetPhotos")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(BatchGetPhotosRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(BatchGetPhotosResponse.getDefaultInstance()))
              .build();
  private static final MethodDescriptor<ListPhotosRequest, ListPhotosResponse>
      listPhotosMethodDescriptor =
          MethodDescriptor.<ListPhotosRequest, ListPhotosResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.streetview.publish.v1.StreetViewPublishService/ListPhotos")
              .setRequestMarshaller(ProtoUtils.marshaller(ListPhotosRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(ListPhotosResponse.getDefaultInstance()))
              .build();
  private static final MethodDescriptor<UpdatePhotoRequest, Photo> updatePhotoMethodDescriptor =
      MethodDescriptor.<UpdatePhotoRequest, Photo>newBuilder()
          .setType(MethodDescriptor.MethodType.UNARY)
          .setFullMethodName("google.streetview.publish.v1.StreetViewPublishService/UpdatePhoto")
          .setRequestMarshaller(ProtoUtils.marshaller(UpdatePhotoRequest.getDefaultInstance()))
          .setResponseMarshaller(ProtoUtils.marshaller(Photo.getDefaultInstance()))
          .build();
  private static final MethodDescriptor<BatchUpdatePhotosRequest, BatchUpdatePhotosResponse>
      batchUpdatePhotosMethodDescriptor =
          MethodDescriptor.<BatchUpdatePhotosRequest, BatchUpdatePhotosResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.streetview.publish.v1.StreetViewPublishService/BatchUpdatePhotos")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(BatchUpdatePhotosRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(BatchUpdatePhotosResponse.getDefaultInstance()))
              .build();
  private static final MethodDescriptor<DeletePhotoRequest, Empty> deletePhotoMethodDescriptor =
      MethodDescriptor.<DeletePhotoRequest, Empty>newBuilder()
          .setType(MethodDescriptor.MethodType.UNARY)
          .setFullMethodName("google.streetview.publish.v1.StreetViewPublishService/DeletePhoto")
          .setRequestMarshaller(ProtoUtils.marshaller(DeletePhotoRequest.getDefaultInstance()))
          .setResponseMarshaller(ProtoUtils.marshaller(Empty.getDefaultInstance()))
          .build();
  private static final MethodDescriptor<BatchDeletePhotosRequest, BatchDeletePhotosResponse>
      batchDeletePhotosMethodDescriptor =
          MethodDescriptor.<BatchDeletePhotosRequest, BatchDeletePhotosResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.streetview.publish.v1.StreetViewPublishService/BatchDeletePhotos")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(BatchDeletePhotosRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(BatchDeletePhotosResponse.getDefaultInstance()))
              .build();

  private final BackgroundResource backgroundResources;

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

  private final GrpcStubCallableFactory callableFactory;

  public static final GrpcStreetViewPublishServiceStub create(
      StreetViewPublishServiceStubSettings settings) throws IOException {
    return new GrpcStreetViewPublishServiceStub(settings, ClientContext.create(settings));
  }

  public static final GrpcStreetViewPublishServiceStub create(ClientContext clientContext)
      throws IOException {
    return new GrpcStreetViewPublishServiceStub(
        StreetViewPublishServiceStubSettings.newBuilder().build(), clientContext);
  }

  public static final GrpcStreetViewPublishServiceStub create(
      ClientContext clientContext, GrpcStubCallableFactory callableFactory) throws IOException {
    return new GrpcStreetViewPublishServiceStub(
        StreetViewPublishServiceStubSettings.newBuilder().build(), clientContext, callableFactory);
  }

  /**
   * Constructs an instance of GrpcStreetViewPublishServiceStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcStreetViewPublishServiceStub(
      StreetViewPublishServiceStubSettings settings, ClientContext clientContext)
      throws IOException {
    this(settings, clientContext, new GrpcStreetViewPublishServiceCallableFactory());
  }

  /**
   * Constructs an instance of GrpcStreetViewPublishServiceStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcStreetViewPublishServiceStub(
      StreetViewPublishServiceStubSettings settings,
      ClientContext clientContext,
      GrpcStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;

    GrpcCallSettings<Empty, UploadRef> startUploadTransportSettings =
        GrpcCallSettings.<Empty, UploadRef>newBuilder()
            .setMethodDescriptor(startUploadMethodDescriptor)
            .build();
    GrpcCallSettings<CreatePhotoRequest, Photo> createPhotoTransportSettings =
        GrpcCallSettings.<CreatePhotoRequest, Photo>newBuilder()
            .setMethodDescriptor(createPhotoMethodDescriptor)
            .build();
    GrpcCallSettings<GetPhotoRequest, Photo> getPhotoTransportSettings =
        GrpcCallSettings.<GetPhotoRequest, Photo>newBuilder()
            .setMethodDescriptor(getPhotoMethodDescriptor)
            .build();
    GrpcCallSettings<BatchGetPhotosRequest, BatchGetPhotosResponse>
        batchGetPhotosTransportSettings =
            GrpcCallSettings.<BatchGetPhotosRequest, BatchGetPhotosResponse>newBuilder()
                .setMethodDescriptor(batchGetPhotosMethodDescriptor)
                .build();
    GrpcCallSettings<ListPhotosRequest, ListPhotosResponse> listPhotosTransportSettings =
        GrpcCallSettings.<ListPhotosRequest, ListPhotosResponse>newBuilder()
            .setMethodDescriptor(listPhotosMethodDescriptor)
            .build();
    GrpcCallSettings<UpdatePhotoRequest, Photo> updatePhotoTransportSettings =
        GrpcCallSettings.<UpdatePhotoRequest, Photo>newBuilder()
            .setMethodDescriptor(updatePhotoMethodDescriptor)
            .build();
    GrpcCallSettings<BatchUpdatePhotosRequest, BatchUpdatePhotosResponse>
        batchUpdatePhotosTransportSettings =
            GrpcCallSettings.<BatchUpdatePhotosRequest, BatchUpdatePhotosResponse>newBuilder()
                .setMethodDescriptor(batchUpdatePhotosMethodDescriptor)
                .build();
    GrpcCallSettings<DeletePhotoRequest, Empty> deletePhotoTransportSettings =
        GrpcCallSettings.<DeletePhotoRequest, Empty>newBuilder()
            .setMethodDescriptor(deletePhotoMethodDescriptor)
            .build();
    GrpcCallSettings<BatchDeletePhotosRequest, BatchDeletePhotosResponse>
        batchDeletePhotosTransportSettings =
            GrpcCallSettings.<BatchDeletePhotosRequest, BatchDeletePhotosResponse>newBuilder()
                .setMethodDescriptor(batchDeletePhotosMethodDescriptor)
                .build();

    this.startUploadCallable =
        callableFactory.createUnaryCallable(
            startUploadTransportSettings, settings.startUploadSettings(), clientContext);
    this.createPhotoCallable =
        callableFactory.createUnaryCallable(
            createPhotoTransportSettings, settings.createPhotoSettings(), clientContext);
    this.getPhotoCallable =
        callableFactory.createUnaryCallable(
            getPhotoTransportSettings, settings.getPhotoSettings(), clientContext);
    this.batchGetPhotosCallable =
        callableFactory.createUnaryCallable(
            batchGetPhotosTransportSettings, settings.batchGetPhotosSettings(), clientContext);
    this.listPhotosCallable =
        callableFactory.createUnaryCallable(
            listPhotosTransportSettings, settings.listPhotosSettings(), clientContext);
    this.listPhotosPagedCallable =
        callableFactory.createPagedCallable(
            listPhotosTransportSettings, settings.listPhotosSettings(), clientContext);
    this.updatePhotoCallable =
        callableFactory.createUnaryCallable(
            updatePhotoTransportSettings, settings.updatePhotoSettings(), clientContext);
    this.batchUpdatePhotosCallable =
        callableFactory.createUnaryCallable(
            batchUpdatePhotosTransportSettings,
            settings.batchUpdatePhotosSettings(),
            clientContext);
    this.deletePhotoCallable =
        callableFactory.createUnaryCallable(
            deletePhotoTransportSettings, settings.deletePhotoSettings(), clientContext);
    this.batchDeletePhotosCallable =
        callableFactory.createUnaryCallable(
            batchDeletePhotosTransportSettings,
            settings.batchDeletePhotosSettings(),
            clientContext);

    backgroundResources = new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public UnaryCallable<Empty, UploadRef> startUploadCallable() {
    return startUploadCallable;
  }

  public UnaryCallable<CreatePhotoRequest, Photo> createPhotoCallable() {
    return createPhotoCallable;
  }

  public UnaryCallable<GetPhotoRequest, Photo> getPhotoCallable() {
    return getPhotoCallable;
  }

  public UnaryCallable<BatchGetPhotosRequest, BatchGetPhotosResponse> batchGetPhotosCallable() {
    return batchGetPhotosCallable;
  }

  public UnaryCallable<ListPhotosRequest, ListPhotosPagedResponse> listPhotosPagedCallable() {
    return listPhotosPagedCallable;
  }

  public UnaryCallable<ListPhotosRequest, ListPhotosResponse> listPhotosCallable() {
    return listPhotosCallable;
  }

  public UnaryCallable<UpdatePhotoRequest, Photo> updatePhotoCallable() {
    return updatePhotoCallable;
  }

  public UnaryCallable<BatchUpdatePhotosRequest, BatchUpdatePhotosResponse>
      batchUpdatePhotosCallable() {
    return batchUpdatePhotosCallable;
  }

  public UnaryCallable<DeletePhotoRequest, Empty> deletePhotoCallable() {
    return deletePhotoCallable;
  }

  public UnaryCallable<BatchDeletePhotosRequest, BatchDeletePhotosResponse>
      batchDeletePhotosCallable() {
    return batchDeletePhotosCallable;
  }

  @Override
  public final void close() {
    shutdown();
  }

  @Override
  public void shutdown() {
    backgroundResources.shutdown();
  }

  @Override
  public boolean isShutdown() {
    return backgroundResources.isShutdown();
  }

  @Override
  public boolean isTerminated() {
    return backgroundResources.isTerminated();
  }

  @Override
  public void shutdownNow() {
    backgroundResources.shutdownNow();
  }

  @Override
  public boolean awaitTermination(long duration, TimeUnit unit) throws InterruptedException {
    return backgroundResources.awaitTermination(duration, unit);
  }
}
