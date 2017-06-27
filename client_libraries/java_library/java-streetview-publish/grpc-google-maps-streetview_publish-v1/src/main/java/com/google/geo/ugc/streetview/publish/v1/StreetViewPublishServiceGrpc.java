package com.google.geo.ugc.streetview.publish.v1;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 * <pre>
 * Publishes and connects user-contributed photos on Street View.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.2.0)",
    comments = "Source: google/streetview/publish/v1/streetview_publish.proto")
public final class StreetViewPublishServiceGrpc {

  private StreetViewPublishServiceGrpc() {}

  public static final String SERVICE_NAME = "google.streetview.publish.v1.StreetViewPublishService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.google.geo.ugc.streetview.publish.v1.StreetViewPublishResources.UploadRef> METHOD_START_UPLOAD =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.streetview.publish.v1.StreetViewPublishService", "StartUpload"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.Empty.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.geo.ugc.streetview.publish.v1.StreetViewPublishResources.UploadRef.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.CreatePhotoRequest,
      com.google.geo.ugc.streetview.publish.v1.StreetViewPublishResources.Photo> METHOD_CREATE_PHOTO =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.streetview.publish.v1.StreetViewPublishService", "CreatePhoto"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.CreatePhotoRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.geo.ugc.streetview.publish.v1.StreetViewPublishResources.Photo.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.GetPhotoRequest,
      com.google.geo.ugc.streetview.publish.v1.StreetViewPublishResources.Photo> METHOD_GET_PHOTO =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.streetview.publish.v1.StreetViewPublishService", "GetPhoto"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.GetPhotoRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.geo.ugc.streetview.publish.v1.StreetViewPublishResources.Photo.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.BatchGetPhotosRequest,
      com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.BatchGetPhotosResponse> METHOD_BATCH_GET_PHOTOS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.streetview.publish.v1.StreetViewPublishService", "BatchGetPhotos"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.BatchGetPhotosRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.BatchGetPhotosResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.ListPhotosRequest,
      com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.ListPhotosResponse> METHOD_LIST_PHOTOS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.streetview.publish.v1.StreetViewPublishService", "ListPhotos"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.ListPhotosRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.ListPhotosResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.UpdatePhotoRequest,
      com.google.geo.ugc.streetview.publish.v1.StreetViewPublishResources.Photo> METHOD_UPDATE_PHOTO =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.streetview.publish.v1.StreetViewPublishService", "UpdatePhoto"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.UpdatePhotoRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.geo.ugc.streetview.publish.v1.StreetViewPublishResources.Photo.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.BatchUpdatePhotosRequest,
      com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.BatchUpdatePhotosResponse> METHOD_BATCH_UPDATE_PHOTOS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.streetview.publish.v1.StreetViewPublishService", "BatchUpdatePhotos"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.BatchUpdatePhotosRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.BatchUpdatePhotosResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.DeletePhotoRequest,
      com.google.protobuf.Empty> METHOD_DELETE_PHOTO =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.streetview.publish.v1.StreetViewPublishService", "DeletePhoto"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.DeletePhotoRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.Empty.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.BatchDeletePhotosRequest,
      com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.BatchDeletePhotosResponse> METHOD_BATCH_DELETE_PHOTOS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "google.streetview.publish.v1.StreetViewPublishService", "BatchDeletePhotos"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.BatchDeletePhotosRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.BatchDeletePhotosResponse.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static StreetViewPublishServiceStub newStub(io.grpc.Channel channel) {
    return new StreetViewPublishServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static StreetViewPublishServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new StreetViewPublishServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static StreetViewPublishServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new StreetViewPublishServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Publishes and connects user-contributed photos on Street View.
   * </pre>
   */
  public static abstract class StreetViewPublishServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Creates an upload session to start uploading photo data. The upload URL of
     * the returned `UploadRef` is used to upload the data for the photo.
     * After the upload is complete, the `UploadRef` is used with
     * `StreetViewPublishService:CreatePhoto()` to create the `Photo` object
     * entry.
     * </pre>
     */
    public void startUpload(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.google.geo.ugc.streetview.publish.v1.StreetViewPublishResources.UploadRef> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_START_UPLOAD, responseObserver);
    }

    /**
     * <pre>
     * After the client finishes uploading the photo with the returned
     * `UploadRef`, `photo.create` publishes the uploaded photo to Street View on
     * Google Maps.
     * This method returns the following error codes:
     * * `INVALID_ARGUMENT` if the request is malformed.
     * * `NOT_FOUND` if the upload reference does not exist.
     * </pre>
     */
    public void createPhoto(com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.CreatePhotoRequest request,
        io.grpc.stub.StreamObserver<com.google.geo.ugc.streetview.publish.v1.StreetViewPublishResources.Photo> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE_PHOTO, responseObserver);
    }

    /**
     * <pre>
     * Gets the metadata of the specified `Photo`.
     * This method returns the following error codes:
     * * `PERMISSION_DENIED` if the requesting user did not create the requested
     * photo.
     * * `NOT_FOUND` if the requested photo does not exist.
     * </pre>
     */
    public void getPhoto(com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.GetPhotoRequest request,
        io.grpc.stub.StreamObserver<com.google.geo.ugc.streetview.publish.v1.StreetViewPublishResources.Photo> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_PHOTO, responseObserver);
    }

    /**
     * <pre>
     * Gets the metadata of the specified `Photo` batch.
     * Note that if `photos.batchGet` fails, either critical fields are
     * missing or there was an authentication error.
     * Even if `photos.batchGet` succeeds, there may have been failures
     * for single photos in the batch. These failures will be specified in
     * `BatchGetPhotosResponse.results.status`.
     * See `photo.get` for specific failures that will occur per photo.
     * </pre>
     */
    public void batchGetPhotos(com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.BatchGetPhotosRequest request,
        io.grpc.stub.StreamObserver<com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.BatchGetPhotosResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_BATCH_GET_PHOTOS, responseObserver);
    }

    /**
     * <pre>
     * Lists all the photos that belong to the user.
     * </pre>
     */
    public void listPhotos(com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.ListPhotosRequest request,
        io.grpc.stub.StreamObserver<com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.ListPhotosResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST_PHOTOS, responseObserver);
    }

    /**
     * <pre>
     * Updates the metadata of a photo, such as pose, place association, etc.
     * Changing the pixels of a photo is not supported.
     * This method returns the following error codes:
     * * `PERMISSION_DENIED` if the requesting user did not create the requested
     * photo.
     * * `INVALID_ARGUMENT` if the request is malformed.
     * * `NOT_FOUND` if the photo ID does not exist.
     * </pre>
     */
    public void updatePhoto(com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.UpdatePhotoRequest request,
        io.grpc.stub.StreamObserver<com.google.geo.ugc.streetview.publish.v1.StreetViewPublishResources.Photo> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE_PHOTO, responseObserver);
    }

    /**
     * <pre>
     * Updates the metadata of photos, such as pose, place association, etc.
     * Changing the pixels of a photo is not supported.
     * Note that if `photos.batchUpdate` fails, either critical fields
     * are missing or there was an authentication error.
     * Even if `photos.batchUpdate` succeeds, there may have been
     * failures for single photos in the batch. These failures will be specified
     * in `BatchUpdatePhotosResponse.results.status`.
     * See `UpdatePhoto` for specific failures that will occur per photo.
     * </pre>
     */
    public void batchUpdatePhotos(com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.BatchUpdatePhotosRequest request,
        io.grpc.stub.StreamObserver<com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.BatchUpdatePhotosResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_BATCH_UPDATE_PHOTOS, responseObserver);
    }

    /**
     * <pre>
     * Deletes a photo and its metadata.
     * This method returns the following error codes:
     * * `PERMISSION_DENIED` if the requesting user did not create the requested
     * photo.
     * * `NOT_FOUND` if the photo ID does not exist.
     * </pre>
     */
    public void deletePhoto(com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.DeletePhotoRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DELETE_PHOTO, responseObserver);
    }

    /**
     * <pre>
     * Deletes a list of photos and their metadata.
     * Note that if `photos.batchDelete` fails, either critical fields
     * are missing or there was an authentication error.
     * Even if `photos.batchDelete` succeeds, there may have been
     * failures for single photos in the batch. These failures will be specified
     * in `BatchDeletePhotosResponse.status`.
     * See `photo.update` for specific failures that will occur per photo.
     * </pre>
     */
    public void batchDeletePhotos(com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.BatchDeletePhotosRequest request,
        io.grpc.stub.StreamObserver<com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.BatchDeletePhotosResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_BATCH_DELETE_PHOTOS, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_START_UPLOAD,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                com.google.geo.ugc.streetview.publish.v1.StreetViewPublishResources.UploadRef>(
                  this, METHODID_START_UPLOAD)))
          .addMethod(
            METHOD_CREATE_PHOTO,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.CreatePhotoRequest,
                com.google.geo.ugc.streetview.publish.v1.StreetViewPublishResources.Photo>(
                  this, METHODID_CREATE_PHOTO)))
          .addMethod(
            METHOD_GET_PHOTO,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.GetPhotoRequest,
                com.google.geo.ugc.streetview.publish.v1.StreetViewPublishResources.Photo>(
                  this, METHODID_GET_PHOTO)))
          .addMethod(
            METHOD_BATCH_GET_PHOTOS,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.BatchGetPhotosRequest,
                com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.BatchGetPhotosResponse>(
                  this, METHODID_BATCH_GET_PHOTOS)))
          .addMethod(
            METHOD_LIST_PHOTOS,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.ListPhotosRequest,
                com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.ListPhotosResponse>(
                  this, METHODID_LIST_PHOTOS)))
          .addMethod(
            METHOD_UPDATE_PHOTO,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.UpdatePhotoRequest,
                com.google.geo.ugc.streetview.publish.v1.StreetViewPublishResources.Photo>(
                  this, METHODID_UPDATE_PHOTO)))
          .addMethod(
            METHOD_BATCH_UPDATE_PHOTOS,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.BatchUpdatePhotosRequest,
                com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.BatchUpdatePhotosResponse>(
                  this, METHODID_BATCH_UPDATE_PHOTOS)))
          .addMethod(
            METHOD_DELETE_PHOTO,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.DeletePhotoRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_PHOTO)))
          .addMethod(
            METHOD_BATCH_DELETE_PHOTOS,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.BatchDeletePhotosRequest,
                com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.BatchDeletePhotosResponse>(
                  this, METHODID_BATCH_DELETE_PHOTOS)))
          .build();
    }
  }

  /**
   * <pre>
   * Publishes and connects user-contributed photos on Street View.
   * </pre>
   */
  public static final class StreetViewPublishServiceStub extends io.grpc.stub.AbstractStub<StreetViewPublishServiceStub> {
    private StreetViewPublishServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private StreetViewPublishServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StreetViewPublishServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new StreetViewPublishServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates an upload session to start uploading photo data. The upload URL of
     * the returned `UploadRef` is used to upload the data for the photo.
     * After the upload is complete, the `UploadRef` is used with
     * `StreetViewPublishService:CreatePhoto()` to create the `Photo` object
     * entry.
     * </pre>
     */
    public void startUpload(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.google.geo.ugc.streetview.publish.v1.StreetViewPublishResources.UploadRef> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_START_UPLOAD, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * After the client finishes uploading the photo with the returned
     * `UploadRef`, `photo.create` publishes the uploaded photo to Street View on
     * Google Maps.
     * This method returns the following error codes:
     * * `INVALID_ARGUMENT` if the request is malformed.
     * * `NOT_FOUND` if the upload reference does not exist.
     * </pre>
     */
    public void createPhoto(com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.CreatePhotoRequest request,
        io.grpc.stub.StreamObserver<com.google.geo.ugc.streetview.publish.v1.StreetViewPublishResources.Photo> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE_PHOTO, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets the metadata of the specified `Photo`.
     * This method returns the following error codes:
     * * `PERMISSION_DENIED` if the requesting user did not create the requested
     * photo.
     * * `NOT_FOUND` if the requested photo does not exist.
     * </pre>
     */
    public void getPhoto(com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.GetPhotoRequest request,
        io.grpc.stub.StreamObserver<com.google.geo.ugc.streetview.publish.v1.StreetViewPublishResources.Photo> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_PHOTO, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets the metadata of the specified `Photo` batch.
     * Note that if `photos.batchGet` fails, either critical fields are
     * missing or there was an authentication error.
     * Even if `photos.batchGet` succeeds, there may have been failures
     * for single photos in the batch. These failures will be specified in
     * `BatchGetPhotosResponse.results.status`.
     * See `photo.get` for specific failures that will occur per photo.
     * </pre>
     */
    public void batchGetPhotos(com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.BatchGetPhotosRequest request,
        io.grpc.stub.StreamObserver<com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.BatchGetPhotosResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_BATCH_GET_PHOTOS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists all the photos that belong to the user.
     * </pre>
     */
    public void listPhotos(com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.ListPhotosRequest request,
        io.grpc.stub.StreamObserver<com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.ListPhotosResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST_PHOTOS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the metadata of a photo, such as pose, place association, etc.
     * Changing the pixels of a photo is not supported.
     * This method returns the following error codes:
     * * `PERMISSION_DENIED` if the requesting user did not create the requested
     * photo.
     * * `INVALID_ARGUMENT` if the request is malformed.
     * * `NOT_FOUND` if the photo ID does not exist.
     * </pre>
     */
    public void updatePhoto(com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.UpdatePhotoRequest request,
        io.grpc.stub.StreamObserver<com.google.geo.ugc.streetview.publish.v1.StreetViewPublishResources.Photo> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE_PHOTO, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the metadata of photos, such as pose, place association, etc.
     * Changing the pixels of a photo is not supported.
     * Note that if `photos.batchUpdate` fails, either critical fields
     * are missing or there was an authentication error.
     * Even if `photos.batchUpdate` succeeds, there may have been
     * failures for single photos in the batch. These failures will be specified
     * in `BatchUpdatePhotosResponse.results.status`.
     * See `UpdatePhoto` for specific failures that will occur per photo.
     * </pre>
     */
    public void batchUpdatePhotos(com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.BatchUpdatePhotosRequest request,
        io.grpc.stub.StreamObserver<com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.BatchUpdatePhotosResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_BATCH_UPDATE_PHOTOS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes a photo and its metadata.
     * This method returns the following error codes:
     * * `PERMISSION_DENIED` if the requesting user did not create the requested
     * photo.
     * * `NOT_FOUND` if the photo ID does not exist.
     * </pre>
     */
    public void deletePhoto(com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.DeletePhotoRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DELETE_PHOTO, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes a list of photos and their metadata.
     * Note that if `photos.batchDelete` fails, either critical fields
     * are missing or there was an authentication error.
     * Even if `photos.batchDelete` succeeds, there may have been
     * failures for single photos in the batch. These failures will be specified
     * in `BatchDeletePhotosResponse.status`.
     * See `photo.update` for specific failures that will occur per photo.
     * </pre>
     */
    public void batchDeletePhotos(com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.BatchDeletePhotosRequest request,
        io.grpc.stub.StreamObserver<com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.BatchDeletePhotosResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_BATCH_DELETE_PHOTOS, getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Publishes and connects user-contributed photos on Street View.
   * </pre>
   */
  public static final class StreetViewPublishServiceBlockingStub extends io.grpc.stub.AbstractStub<StreetViewPublishServiceBlockingStub> {
    private StreetViewPublishServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private StreetViewPublishServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StreetViewPublishServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new StreetViewPublishServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates an upload session to start uploading photo data. The upload URL of
     * the returned `UploadRef` is used to upload the data for the photo.
     * After the upload is complete, the `UploadRef` is used with
     * `StreetViewPublishService:CreatePhoto()` to create the `Photo` object
     * entry.
     * </pre>
     */
    public com.google.geo.ugc.streetview.publish.v1.StreetViewPublishResources.UploadRef startUpload(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), METHOD_START_UPLOAD, getCallOptions(), request);
    }

    /**
     * <pre>
     * After the client finishes uploading the photo with the returned
     * `UploadRef`, `photo.create` publishes the uploaded photo to Street View on
     * Google Maps.
     * This method returns the following error codes:
     * * `INVALID_ARGUMENT` if the request is malformed.
     * * `NOT_FOUND` if the upload reference does not exist.
     * </pre>
     */
    public com.google.geo.ugc.streetview.publish.v1.StreetViewPublishResources.Photo createPhoto(com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.CreatePhotoRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE_PHOTO, getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets the metadata of the specified `Photo`.
     * This method returns the following error codes:
     * * `PERMISSION_DENIED` if the requesting user did not create the requested
     * photo.
     * * `NOT_FOUND` if the requested photo does not exist.
     * </pre>
     */
    public com.google.geo.ugc.streetview.publish.v1.StreetViewPublishResources.Photo getPhoto(com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.GetPhotoRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_PHOTO, getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets the metadata of the specified `Photo` batch.
     * Note that if `photos.batchGet` fails, either critical fields are
     * missing or there was an authentication error.
     * Even if `photos.batchGet` succeeds, there may have been failures
     * for single photos in the batch. These failures will be specified in
     * `BatchGetPhotosResponse.results.status`.
     * See `photo.get` for specific failures that will occur per photo.
     * </pre>
     */
    public com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.BatchGetPhotosResponse batchGetPhotos(com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.BatchGetPhotosRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_BATCH_GET_PHOTOS, getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists all the photos that belong to the user.
     * </pre>
     */
    public com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.ListPhotosResponse listPhotos(com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.ListPhotosRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST_PHOTOS, getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the metadata of a photo, such as pose, place association, etc.
     * Changing the pixels of a photo is not supported.
     * This method returns the following error codes:
     * * `PERMISSION_DENIED` if the requesting user did not create the requested
     * photo.
     * * `INVALID_ARGUMENT` if the request is malformed.
     * * `NOT_FOUND` if the photo ID does not exist.
     * </pre>
     */
    public com.google.geo.ugc.streetview.publish.v1.StreetViewPublishResources.Photo updatePhoto(com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.UpdatePhotoRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE_PHOTO, getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the metadata of photos, such as pose, place association, etc.
     * Changing the pixels of a photo is not supported.
     * Note that if `photos.batchUpdate` fails, either critical fields
     * are missing or there was an authentication error.
     * Even if `photos.batchUpdate` succeeds, there may have been
     * failures for single photos in the batch. These failures will be specified
     * in `BatchUpdatePhotosResponse.results.status`.
     * See `UpdatePhoto` for specific failures that will occur per photo.
     * </pre>
     */
    public com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.BatchUpdatePhotosResponse batchUpdatePhotos(com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.BatchUpdatePhotosRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_BATCH_UPDATE_PHOTOS, getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes a photo and its metadata.
     * This method returns the following error codes:
     * * `PERMISSION_DENIED` if the requesting user did not create the requested
     * photo.
     * * `NOT_FOUND` if the photo ID does not exist.
     * </pre>
     */
    public com.google.protobuf.Empty deletePhoto(com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.DeletePhotoRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DELETE_PHOTO, getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes a list of photos and their metadata.
     * Note that if `photos.batchDelete` fails, either critical fields
     * are missing or there was an authentication error.
     * Even if `photos.batchDelete` succeeds, there may have been
     * failures for single photos in the batch. These failures will be specified
     * in `BatchDeletePhotosResponse.status`.
     * See `photo.update` for specific failures that will occur per photo.
     * </pre>
     */
    public com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.BatchDeletePhotosResponse batchDeletePhotos(com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.BatchDeletePhotosRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_BATCH_DELETE_PHOTOS, getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Publishes and connects user-contributed photos on Street View.
   * </pre>
   */
  public static final class StreetViewPublishServiceFutureStub extends io.grpc.stub.AbstractStub<StreetViewPublishServiceFutureStub> {
    private StreetViewPublishServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private StreetViewPublishServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StreetViewPublishServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new StreetViewPublishServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates an upload session to start uploading photo data. The upload URL of
     * the returned `UploadRef` is used to upload the data for the photo.
     * After the upload is complete, the `UploadRef` is used with
     * `StreetViewPublishService:CreatePhoto()` to create the `Photo` object
     * entry.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.geo.ugc.streetview.publish.v1.StreetViewPublishResources.UploadRef> startUpload(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_START_UPLOAD, getCallOptions()), request);
    }

    /**
     * <pre>
     * After the client finishes uploading the photo with the returned
     * `UploadRef`, `photo.create` publishes the uploaded photo to Street View on
     * Google Maps.
     * This method returns the following error codes:
     * * `INVALID_ARGUMENT` if the request is malformed.
     * * `NOT_FOUND` if the upload reference does not exist.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.geo.ugc.streetview.publish.v1.StreetViewPublishResources.Photo> createPhoto(
        com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.CreatePhotoRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE_PHOTO, getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets the metadata of the specified `Photo`.
     * This method returns the following error codes:
     * * `PERMISSION_DENIED` if the requesting user did not create the requested
     * photo.
     * * `NOT_FOUND` if the requested photo does not exist.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.geo.ugc.streetview.publish.v1.StreetViewPublishResources.Photo> getPhoto(
        com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.GetPhotoRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_PHOTO, getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets the metadata of the specified `Photo` batch.
     * Note that if `photos.batchGet` fails, either critical fields are
     * missing or there was an authentication error.
     * Even if `photos.batchGet` succeeds, there may have been failures
     * for single photos in the batch. These failures will be specified in
     * `BatchGetPhotosResponse.results.status`.
     * See `photo.get` for specific failures that will occur per photo.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.BatchGetPhotosResponse> batchGetPhotos(
        com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.BatchGetPhotosRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_BATCH_GET_PHOTOS, getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists all the photos that belong to the user.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.ListPhotosResponse> listPhotos(
        com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.ListPhotosRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST_PHOTOS, getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the metadata of a photo, such as pose, place association, etc.
     * Changing the pixels of a photo is not supported.
     * This method returns the following error codes:
     * * `PERMISSION_DENIED` if the requesting user did not create the requested
     * photo.
     * * `INVALID_ARGUMENT` if the request is malformed.
     * * `NOT_FOUND` if the photo ID does not exist.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.geo.ugc.streetview.publish.v1.StreetViewPublishResources.Photo> updatePhoto(
        com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.UpdatePhotoRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE_PHOTO, getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the metadata of photos, such as pose, place association, etc.
     * Changing the pixels of a photo is not supported.
     * Note that if `photos.batchUpdate` fails, either critical fields
     * are missing or there was an authentication error.
     * Even if `photos.batchUpdate` succeeds, there may have been
     * failures for single photos in the batch. These failures will be specified
     * in `BatchUpdatePhotosResponse.results.status`.
     * See `UpdatePhoto` for specific failures that will occur per photo.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.BatchUpdatePhotosResponse> batchUpdatePhotos(
        com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.BatchUpdatePhotosRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_BATCH_UPDATE_PHOTOS, getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes a photo and its metadata.
     * This method returns the following error codes:
     * * `PERMISSION_DENIED` if the requesting user did not create the requested
     * photo.
     * * `NOT_FOUND` if the photo ID does not exist.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deletePhoto(
        com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.DeletePhotoRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DELETE_PHOTO, getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes a list of photos and their metadata.
     * Note that if `photos.batchDelete` fails, either critical fields
     * are missing or there was an authentication error.
     * Even if `photos.batchDelete` succeeds, there may have been
     * failures for single photos in the batch. These failures will be specified
     * in `BatchDeletePhotosResponse.status`.
     * See `photo.update` for specific failures that will occur per photo.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.BatchDeletePhotosResponse> batchDeletePhotos(
        com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.BatchDeletePhotosRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_BATCH_DELETE_PHOTOS, getCallOptions()), request);
    }
  }

  private static final int METHODID_START_UPLOAD = 0;
  private static final int METHODID_CREATE_PHOTO = 1;
  private static final int METHODID_GET_PHOTO = 2;
  private static final int METHODID_BATCH_GET_PHOTOS = 3;
  private static final int METHODID_LIST_PHOTOS = 4;
  private static final int METHODID_UPDATE_PHOTO = 5;
  private static final int METHODID_BATCH_UPDATE_PHOTOS = 6;
  private static final int METHODID_DELETE_PHOTO = 7;
  private static final int METHODID_BATCH_DELETE_PHOTOS = 8;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final StreetViewPublishServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(StreetViewPublishServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_START_UPLOAD:
          serviceImpl.startUpload((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.google.geo.ugc.streetview.publish.v1.StreetViewPublishResources.UploadRef>) responseObserver);
          break;
        case METHODID_CREATE_PHOTO:
          serviceImpl.createPhoto((com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.CreatePhotoRequest) request,
              (io.grpc.stub.StreamObserver<com.google.geo.ugc.streetview.publish.v1.StreetViewPublishResources.Photo>) responseObserver);
          break;
        case METHODID_GET_PHOTO:
          serviceImpl.getPhoto((com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.GetPhotoRequest) request,
              (io.grpc.stub.StreamObserver<com.google.geo.ugc.streetview.publish.v1.StreetViewPublishResources.Photo>) responseObserver);
          break;
        case METHODID_BATCH_GET_PHOTOS:
          serviceImpl.batchGetPhotos((com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.BatchGetPhotosRequest) request,
              (io.grpc.stub.StreamObserver<com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.BatchGetPhotosResponse>) responseObserver);
          break;
        case METHODID_LIST_PHOTOS:
          serviceImpl.listPhotos((com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.ListPhotosRequest) request,
              (io.grpc.stub.StreamObserver<com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.ListPhotosResponse>) responseObserver);
          break;
        case METHODID_UPDATE_PHOTO:
          serviceImpl.updatePhoto((com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.UpdatePhotoRequest) request,
              (io.grpc.stub.StreamObserver<com.google.geo.ugc.streetview.publish.v1.StreetViewPublishResources.Photo>) responseObserver);
          break;
        case METHODID_BATCH_UPDATE_PHOTOS:
          serviceImpl.batchUpdatePhotos((com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.BatchUpdatePhotosRequest) request,
              (io.grpc.stub.StreamObserver<com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.BatchUpdatePhotosResponse>) responseObserver);
          break;
        case METHODID_DELETE_PHOTO:
          serviceImpl.deletePhoto((com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.DeletePhotoRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_BATCH_DELETE_PHOTOS:
          serviceImpl.batchDeletePhotos((com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.BatchDeletePhotosRequest) request,
              (io.grpc.stub.StreamObserver<com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.BatchDeletePhotosResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static final class StreetViewPublishServiceDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.geo.ugc.streetview.publish.v1.StreetViewPublish.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (StreetViewPublishServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new StreetViewPublishServiceDescriptorSupplier())
              .addMethod(METHOD_START_UPLOAD)
              .addMethod(METHOD_CREATE_PHOTO)
              .addMethod(METHOD_GET_PHOTO)
              .addMethod(METHOD_BATCH_GET_PHOTOS)
              .addMethod(METHOD_LIST_PHOTOS)
              .addMethod(METHOD_UPDATE_PHOTO)
              .addMethod(METHOD_BATCH_UPDATE_PHOTOS)
              .addMethod(METHOD_DELETE_PHOTO)
              .addMethod(METHOD_BATCH_DELETE_PHOTOS)
              .build();
        }
      }
    }
    return result;
  }
}
