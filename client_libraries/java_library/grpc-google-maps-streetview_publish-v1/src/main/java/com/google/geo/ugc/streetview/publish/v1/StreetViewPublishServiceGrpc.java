package com.google.geo.ugc.streetview.publish.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 *
 *
 * <pre>
 * Publishes and connects user-contributed photos on Street View.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.10.0)",
    comments = "Source: google/streetview/publish/v1/streetview_publish.proto")
public final class StreetViewPublishServiceGrpc {

  private StreetViewPublishServiceGrpc() {}

  public static final String SERVICE_NAME = "google.streetview.publish.v1.StreetViewPublishService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getStartUploadMethod()} instead.
  public static final io.grpc.MethodDescriptor<
          com.google.protobuf.Empty,
          com.google.geo.ugc.streetview.publish.v1.StreetViewPublishResources.UploadRef>
      METHOD_START_UPLOAD = getStartUploadMethodHelper();

  private static volatile io.grpc.MethodDescriptor<
          com.google.protobuf.Empty,
          com.google.geo.ugc.streetview.publish.v1.StreetViewPublishResources.UploadRef>
      getStartUploadMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<
          com.google.protobuf.Empty,
          com.google.geo.ugc.streetview.publish.v1.StreetViewPublishResources.UploadRef>
      getStartUploadMethod() {
    return getStartUploadMethodHelper();
  }

  private static io.grpc.MethodDescriptor<
          com.google.protobuf.Empty,
          com.google.geo.ugc.streetview.publish.v1.StreetViewPublishResources.UploadRef>
      getStartUploadMethodHelper() {
    io.grpc.MethodDescriptor<
            com.google.protobuf.Empty,
            com.google.geo.ugc.streetview.publish.v1.StreetViewPublishResources.UploadRef>
        getStartUploadMethod;
    if ((getStartUploadMethod = StreetViewPublishServiceGrpc.getStartUploadMethod) == null) {
      synchronized (StreetViewPublishServiceGrpc.class) {
        if ((getStartUploadMethod = StreetViewPublishServiceGrpc.getStartUploadMethod) == null) {
          StreetViewPublishServiceGrpc.getStartUploadMethod =
              getStartUploadMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.protobuf.Empty,
                          com.google.geo.ugc.streetview.publish.v1.StreetViewPublishResources
                              .UploadRef>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(
                              "google.streetview.publish.v1.StreetViewPublishService",
                              "StartUpload"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.protobuf.Empty.getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.geo.ugc.streetview.publish.v1.StreetViewPublishResources
                                  .UploadRef.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new StreetViewPublishServiceMethodDescriptorSupplier("StartUpload"))
                      .build();
        }
      }
    }
    return getStartUploadMethod;
  }

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getCreatePhotoMethod()} instead.
  public static final io.grpc.MethodDescriptor<
          com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.CreatePhotoRequest,
          com.google.geo.ugc.streetview.publish.v1.StreetViewPublishResources.Photo>
      METHOD_CREATE_PHOTO = getCreatePhotoMethodHelper();

  private static volatile io.grpc.MethodDescriptor<
          com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.CreatePhotoRequest,
          com.google.geo.ugc.streetview.publish.v1.StreetViewPublishResources.Photo>
      getCreatePhotoMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<
          com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.CreatePhotoRequest,
          com.google.geo.ugc.streetview.publish.v1.StreetViewPublishResources.Photo>
      getCreatePhotoMethod() {
    return getCreatePhotoMethodHelper();
  }

  private static io.grpc.MethodDescriptor<
          com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.CreatePhotoRequest,
          com.google.geo.ugc.streetview.publish.v1.StreetViewPublishResources.Photo>
      getCreatePhotoMethodHelper() {
    io.grpc.MethodDescriptor<
            com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages
                .CreatePhotoRequest,
            com.google.geo.ugc.streetview.publish.v1.StreetViewPublishResources.Photo>
        getCreatePhotoMethod;
    if ((getCreatePhotoMethod = StreetViewPublishServiceGrpc.getCreatePhotoMethod) == null) {
      synchronized (StreetViewPublishServiceGrpc.class) {
        if ((getCreatePhotoMethod = StreetViewPublishServiceGrpc.getCreatePhotoMethod) == null) {
          StreetViewPublishServiceGrpc.getCreatePhotoMethod =
              getCreatePhotoMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages
                              .CreatePhotoRequest,
                          com.google.geo.ugc.streetview.publish.v1.StreetViewPublishResources.Photo>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(
                              "google.streetview.publish.v1.StreetViewPublishService",
                              "CreatePhoto"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages
                                  .CreatePhotoRequest.getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.geo.ugc.streetview.publish.v1.StreetViewPublishResources
                                  .Photo.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new StreetViewPublishServiceMethodDescriptorSupplier("CreatePhoto"))
                      .build();
        }
      }
    }
    return getCreatePhotoMethod;
  }

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetPhotoMethod()} instead.
  public static final io.grpc.MethodDescriptor<
          com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.GetPhotoRequest,
          com.google.geo.ugc.streetview.publish.v1.StreetViewPublishResources.Photo>
      METHOD_GET_PHOTO = getGetPhotoMethodHelper();

  private static volatile io.grpc.MethodDescriptor<
          com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.GetPhotoRequest,
          com.google.geo.ugc.streetview.publish.v1.StreetViewPublishResources.Photo>
      getGetPhotoMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<
          com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.GetPhotoRequest,
          com.google.geo.ugc.streetview.publish.v1.StreetViewPublishResources.Photo>
      getGetPhotoMethod() {
    return getGetPhotoMethodHelper();
  }

  private static io.grpc.MethodDescriptor<
          com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.GetPhotoRequest,
          com.google.geo.ugc.streetview.publish.v1.StreetViewPublishResources.Photo>
      getGetPhotoMethodHelper() {
    io.grpc.MethodDescriptor<
            com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.GetPhotoRequest,
            com.google.geo.ugc.streetview.publish.v1.StreetViewPublishResources.Photo>
        getGetPhotoMethod;
    if ((getGetPhotoMethod = StreetViewPublishServiceGrpc.getGetPhotoMethod) == null) {
      synchronized (StreetViewPublishServiceGrpc.class) {
        if ((getGetPhotoMethod = StreetViewPublishServiceGrpc.getGetPhotoMethod) == null) {
          StreetViewPublishServiceGrpc.getGetPhotoMethod =
              getGetPhotoMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages
                              .GetPhotoRequest,
                          com.google.geo.ugc.streetview.publish.v1.StreetViewPublishResources.Photo>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(
                              "google.streetview.publish.v1.StreetViewPublishService", "GetPhoto"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages
                                  .GetPhotoRequest.getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.geo.ugc.streetview.publish.v1.StreetViewPublishResources
                                  .Photo.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new StreetViewPublishServiceMethodDescriptorSupplier("GetPhoto"))
                      .build();
        }
      }
    }
    return getGetPhotoMethod;
  }

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getBatchGetPhotosMethod()} instead.
  public static final io.grpc.MethodDescriptor<
          com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages
              .BatchGetPhotosRequest,
          com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages
              .BatchGetPhotosResponse>
      METHOD_BATCH_GET_PHOTOS = getBatchGetPhotosMethodHelper();

  private static volatile io.grpc.MethodDescriptor<
          com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages
              .BatchGetPhotosRequest,
          com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages
              .BatchGetPhotosResponse>
      getBatchGetPhotosMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<
          com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages
              .BatchGetPhotosRequest,
          com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages
              .BatchGetPhotosResponse>
      getBatchGetPhotosMethod() {
    return getBatchGetPhotosMethodHelper();
  }

  private static io.grpc.MethodDescriptor<
          com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages
              .BatchGetPhotosRequest,
          com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages
              .BatchGetPhotosResponse>
      getBatchGetPhotosMethodHelper() {
    io.grpc.MethodDescriptor<
            com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages
                .BatchGetPhotosRequest,
            com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages
                .BatchGetPhotosResponse>
        getBatchGetPhotosMethod;
    if ((getBatchGetPhotosMethod = StreetViewPublishServiceGrpc.getBatchGetPhotosMethod) == null) {
      synchronized (StreetViewPublishServiceGrpc.class) {
        if ((getBatchGetPhotosMethod = StreetViewPublishServiceGrpc.getBatchGetPhotosMethod)
            == null) {
          StreetViewPublishServiceGrpc.getBatchGetPhotosMethod =
              getBatchGetPhotosMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages
                              .BatchGetPhotosRequest,
                          com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages
                              .BatchGetPhotosResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(
                              "google.streetview.publish.v1.StreetViewPublishService",
                              "BatchGetPhotos"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages
                                  .BatchGetPhotosRequest.getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages
                                  .BatchGetPhotosResponse.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new StreetViewPublishServiceMethodDescriptorSupplier("BatchGetPhotos"))
                      .build();
        }
      }
    }
    return getBatchGetPhotosMethod;
  }

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getListPhotosMethod()} instead.
  public static final io.grpc.MethodDescriptor<
          com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.ListPhotosRequest,
          com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.ListPhotosResponse>
      METHOD_LIST_PHOTOS = getListPhotosMethodHelper();

  private static volatile io.grpc.MethodDescriptor<
          com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.ListPhotosRequest,
          com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.ListPhotosResponse>
      getListPhotosMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<
          com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.ListPhotosRequest,
          com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.ListPhotosResponse>
      getListPhotosMethod() {
    return getListPhotosMethodHelper();
  }

  private static io.grpc.MethodDescriptor<
          com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.ListPhotosRequest,
          com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.ListPhotosResponse>
      getListPhotosMethodHelper() {
    io.grpc.MethodDescriptor<
            com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.ListPhotosRequest,
            com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages
                .ListPhotosResponse>
        getListPhotosMethod;
    if ((getListPhotosMethod = StreetViewPublishServiceGrpc.getListPhotosMethod) == null) {
      synchronized (StreetViewPublishServiceGrpc.class) {
        if ((getListPhotosMethod = StreetViewPublishServiceGrpc.getListPhotosMethod) == null) {
          StreetViewPublishServiceGrpc.getListPhotosMethod =
              getListPhotosMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages
                              .ListPhotosRequest,
                          com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages
                              .ListPhotosResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(
                              "google.streetview.publish.v1.StreetViewPublishService",
                              "ListPhotos"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages
                                  .ListPhotosRequest.getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages
                                  .ListPhotosResponse.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new StreetViewPublishServiceMethodDescriptorSupplier("ListPhotos"))
                      .build();
        }
      }
    }
    return getListPhotosMethod;
  }

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getUpdatePhotoMethod()} instead.
  public static final io.grpc.MethodDescriptor<
          com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.UpdatePhotoRequest,
          com.google.geo.ugc.streetview.publish.v1.StreetViewPublishResources.Photo>
      METHOD_UPDATE_PHOTO = getUpdatePhotoMethodHelper();

  private static volatile io.grpc.MethodDescriptor<
          com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.UpdatePhotoRequest,
          com.google.geo.ugc.streetview.publish.v1.StreetViewPublishResources.Photo>
      getUpdatePhotoMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<
          com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.UpdatePhotoRequest,
          com.google.geo.ugc.streetview.publish.v1.StreetViewPublishResources.Photo>
      getUpdatePhotoMethod() {
    return getUpdatePhotoMethodHelper();
  }

  private static io.grpc.MethodDescriptor<
          com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.UpdatePhotoRequest,
          com.google.geo.ugc.streetview.publish.v1.StreetViewPublishResources.Photo>
      getUpdatePhotoMethodHelper() {
    io.grpc.MethodDescriptor<
            com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages
                .UpdatePhotoRequest,
            com.google.geo.ugc.streetview.publish.v1.StreetViewPublishResources.Photo>
        getUpdatePhotoMethod;
    if ((getUpdatePhotoMethod = StreetViewPublishServiceGrpc.getUpdatePhotoMethod) == null) {
      synchronized (StreetViewPublishServiceGrpc.class) {
        if ((getUpdatePhotoMethod = StreetViewPublishServiceGrpc.getUpdatePhotoMethod) == null) {
          StreetViewPublishServiceGrpc.getUpdatePhotoMethod =
              getUpdatePhotoMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages
                              .UpdatePhotoRequest,
                          com.google.geo.ugc.streetview.publish.v1.StreetViewPublishResources.Photo>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(
                              "google.streetview.publish.v1.StreetViewPublishService",
                              "UpdatePhoto"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages
                                  .UpdatePhotoRequest.getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.geo.ugc.streetview.publish.v1.StreetViewPublishResources
                                  .Photo.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new StreetViewPublishServiceMethodDescriptorSupplier("UpdatePhoto"))
                      .build();
        }
      }
    }
    return getUpdatePhotoMethod;
  }

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getBatchUpdatePhotosMethod()} instead.
  public static final io.grpc.MethodDescriptor<
          com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages
              .BatchUpdatePhotosRequest,
          com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages
              .BatchUpdatePhotosResponse>
      METHOD_BATCH_UPDATE_PHOTOS = getBatchUpdatePhotosMethodHelper();

  private static volatile io.grpc.MethodDescriptor<
          com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages
              .BatchUpdatePhotosRequest,
          com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages
              .BatchUpdatePhotosResponse>
      getBatchUpdatePhotosMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<
          com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages
              .BatchUpdatePhotosRequest,
          com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages
              .BatchUpdatePhotosResponse>
      getBatchUpdatePhotosMethod() {
    return getBatchUpdatePhotosMethodHelper();
  }

  private static io.grpc.MethodDescriptor<
          com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages
              .BatchUpdatePhotosRequest,
          com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages
              .BatchUpdatePhotosResponse>
      getBatchUpdatePhotosMethodHelper() {
    io.grpc.MethodDescriptor<
            com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages
                .BatchUpdatePhotosRequest,
            com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages
                .BatchUpdatePhotosResponse>
        getBatchUpdatePhotosMethod;
    if ((getBatchUpdatePhotosMethod = StreetViewPublishServiceGrpc.getBatchUpdatePhotosMethod)
        == null) {
      synchronized (StreetViewPublishServiceGrpc.class) {
        if ((getBatchUpdatePhotosMethod = StreetViewPublishServiceGrpc.getBatchUpdatePhotosMethod)
            == null) {
          StreetViewPublishServiceGrpc.getBatchUpdatePhotosMethod =
              getBatchUpdatePhotosMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages
                              .BatchUpdatePhotosRequest,
                          com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages
                              .BatchUpdatePhotosResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(
                              "google.streetview.publish.v1.StreetViewPublishService",
                              "BatchUpdatePhotos"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages
                                  .BatchUpdatePhotosRequest.getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages
                                  .BatchUpdatePhotosResponse.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new StreetViewPublishServiceMethodDescriptorSupplier("BatchUpdatePhotos"))
                      .build();
        }
      }
    }
    return getBatchUpdatePhotosMethod;
  }

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getDeletePhotoMethod()} instead.
  public static final io.grpc.MethodDescriptor<
          com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.DeletePhotoRequest,
          com.google.protobuf.Empty>
      METHOD_DELETE_PHOTO = getDeletePhotoMethodHelper();

  private static volatile io.grpc.MethodDescriptor<
          com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.DeletePhotoRequest,
          com.google.protobuf.Empty>
      getDeletePhotoMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<
          com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.DeletePhotoRequest,
          com.google.protobuf.Empty>
      getDeletePhotoMethod() {
    return getDeletePhotoMethodHelper();
  }

  private static io.grpc.MethodDescriptor<
          com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.DeletePhotoRequest,
          com.google.protobuf.Empty>
      getDeletePhotoMethodHelper() {
    io.grpc.MethodDescriptor<
            com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages
                .DeletePhotoRequest,
            com.google.protobuf.Empty>
        getDeletePhotoMethod;
    if ((getDeletePhotoMethod = StreetViewPublishServiceGrpc.getDeletePhotoMethod) == null) {
      synchronized (StreetViewPublishServiceGrpc.class) {
        if ((getDeletePhotoMethod = StreetViewPublishServiceGrpc.getDeletePhotoMethod) == null) {
          StreetViewPublishServiceGrpc.getDeletePhotoMethod =
              getDeletePhotoMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages
                              .DeletePhotoRequest,
                          com.google.protobuf.Empty>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(
                              "google.streetview.publish.v1.StreetViewPublishService",
                              "DeletePhoto"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages
                                  .DeletePhotoRequest.getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.protobuf.Empty.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new StreetViewPublishServiceMethodDescriptorSupplier("DeletePhoto"))
                      .build();
        }
      }
    }
    return getDeletePhotoMethod;
  }

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getBatchDeletePhotosMethod()} instead.
  public static final io.grpc.MethodDescriptor<
          com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages
              .BatchDeletePhotosRequest,
          com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages
              .BatchDeletePhotosResponse>
      METHOD_BATCH_DELETE_PHOTOS = getBatchDeletePhotosMethodHelper();

  private static volatile io.grpc.MethodDescriptor<
          com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages
              .BatchDeletePhotosRequest,
          com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages
              .BatchDeletePhotosResponse>
      getBatchDeletePhotosMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<
          com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages
              .BatchDeletePhotosRequest,
          com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages
              .BatchDeletePhotosResponse>
      getBatchDeletePhotosMethod() {
    return getBatchDeletePhotosMethodHelper();
  }

  private static io.grpc.MethodDescriptor<
          com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages
              .BatchDeletePhotosRequest,
          com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages
              .BatchDeletePhotosResponse>
      getBatchDeletePhotosMethodHelper() {
    io.grpc.MethodDescriptor<
            com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages
                .BatchDeletePhotosRequest,
            com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages
                .BatchDeletePhotosResponse>
        getBatchDeletePhotosMethod;
    if ((getBatchDeletePhotosMethod = StreetViewPublishServiceGrpc.getBatchDeletePhotosMethod)
        == null) {
      synchronized (StreetViewPublishServiceGrpc.class) {
        if ((getBatchDeletePhotosMethod = StreetViewPublishServiceGrpc.getBatchDeletePhotosMethod)
            == null) {
          StreetViewPublishServiceGrpc.getBatchDeletePhotosMethod =
              getBatchDeletePhotosMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages
                              .BatchDeletePhotosRequest,
                          com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages
                              .BatchDeletePhotosResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(
                              "google.streetview.publish.v1.StreetViewPublishService",
                              "BatchDeletePhotos"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages
                                  .BatchDeletePhotosRequest.getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages
                                  .BatchDeletePhotosResponse.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new StreetViewPublishServiceMethodDescriptorSupplier("BatchDeletePhotos"))
                      .build();
        }
      }
    }
    return getBatchDeletePhotosMethod;
  }

  /** Creates a new async stub that supports all call types for the service */
  public static StreetViewPublishServiceStub newStub(io.grpc.Channel channel) {
    return new StreetViewPublishServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static StreetViewPublishServiceBlockingStub newBlockingStub(io.grpc.Channel channel) {
    return new StreetViewPublishServiceBlockingStub(channel);
  }

  /** Creates a new ListenableFuture-style stub that supports unary calls on the service */
  public static StreetViewPublishServiceFutureStub newFutureStub(io.grpc.Channel channel) {
    return new StreetViewPublishServiceFutureStub(channel);
  }

  /**
   *
   *
   * <pre>
   * Publishes and connects user-contributed photos on Street View.
   * </pre>
   */
  public abstract static class StreetViewPublishServiceImplBase implements io.grpc.BindableService {

    /**
     *
     *
     * <pre>
     * Creates an upload session to start uploading photo bytes. The method uses
     * the upload URL of the returned
     * [UploadRef][google.streetview.publish.v1.UploadRef] to upload the bytes for
     * the [Photo][google.streetview.publish.v1.Photo].
     * In addition to the photo requirements shown in
     * https://support.google.com/maps/answer/7012050?hl=en&amp;ref_topic=6275604,
     * the photo must meet the following requirements:
     * * Photo Sphere XMP metadata must be included in the photo medadata. See
     * https://developers.google.com/streetview/spherical-metadata for the
     * required fields.
     * * The pixel size of the photo must meet the size requirements listed in
     * https://support.google.com/maps/answer/7012050?hl=en&amp;ref_topic=6275604, and
     * the photo must be a full 360 horizontally.
     * After the upload completes, the method uses
     * [UploadRef][google.streetview.publish.v1.UploadRef] with
     * [CreatePhoto][google.streetview.publish.v1.StreetViewPublishService.CreatePhoto]
     * to create the [Photo][google.streetview.publish.v1.Photo] object entry.
     * </pre>
     */
    public void startUpload(
        com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<
                com.google.geo.ugc.streetview.publish.v1.StreetViewPublishResources.UploadRef>
            responseObserver) {
      asyncUnimplementedUnaryCall(getStartUploadMethodHelper(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * After the client finishes uploading the photo with the returned
     * [UploadRef][google.streetview.publish.v1.UploadRef],
     * [CreatePhoto][google.streetview.publish.v1.StreetViewPublishService.CreatePhoto]
     * publishes the uploaded [Photo][google.streetview.publish.v1.Photo] to
     * Street View on Google Maps.
     * Currently, the only way to set heading, pitch, and roll in CreatePhoto is
     * through the [Photo Sphere XMP
     * metadata](https://developers.google.com/streetview/spherical-metadata) in
     * the photo bytes. CreatePhoto ignores the `pose.heading`, `pose.pitch`,
     * `pose.roll`, `pose.altitude`, and `pose.level` fields in Pose.
     * This method returns the following error codes:
     * * [google.rpc.Code.INVALID_ARGUMENT][google.rpc.Code.INVALID_ARGUMENT] if
     * the request is malformed or if the uploaded photo is not a 360 photo.
     * * [google.rpc.Code.NOT_FOUND][google.rpc.Code.NOT_FOUND] if the upload
     * reference does not exist.
     * * [google.rpc.Code.RESOURCE_EXHAUSTED][google.rpc.Code.RESOURCE_EXHAUSTED]
     * if the account has reached the storage limit.
     * </pre>
     */
    public void createPhoto(
        com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.CreatePhotoRequest
            request,
        io.grpc.stub.StreamObserver<
                com.google.geo.ugc.streetview.publish.v1.StreetViewPublishResources.Photo>
            responseObserver) {
      asyncUnimplementedUnaryCall(getCreatePhotoMethodHelper(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Gets the metadata of the specified
     * [Photo][google.streetview.publish.v1.Photo].
     * This method returns the following error codes:
     * * [google.rpc.Code.PERMISSION_DENIED][google.rpc.Code.PERMISSION_DENIED] if
     * the requesting user did not create the requested
     * [Photo][google.streetview.publish.v1.Photo].
     * * [google.rpc.Code.NOT_FOUND][google.rpc.Code.NOT_FOUND] if the requested
     * [Photo][google.streetview.publish.v1.Photo] does not exist.
     * * [google.rpc.Code.UNAVAILABLE][google.rpc.Code.UNAVAILABLE] if the
     * requested [Photo][google.streetview.publish.v1.Photo] is still being
     * indexed.
     * </pre>
     */
    public void getPhoto(
        com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.GetPhotoRequest
            request,
        io.grpc.stub.StreamObserver<
                com.google.geo.ugc.streetview.publish.v1.StreetViewPublishResources.Photo>
            responseObserver) {
      asyncUnimplementedUnaryCall(getGetPhotoMethodHelper(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Gets the metadata of the specified
     * [Photo][google.streetview.publish.v1.Photo] batch.
     * Note that if
     * [BatchGetPhotos][google.streetview.publish.v1.StreetViewPublishService.BatchGetPhotos]
     * fails, either critical fields are missing or there is an authentication
     * error. Even if
     * [BatchGetPhotos][google.streetview.publish.v1.StreetViewPublishService.BatchGetPhotos]
     * succeeds, individual photos in the batch may have failures.
     * These failures are specified in each
     * [PhotoResponse.status][google.streetview.publish.v1.PhotoResponse.status]
     * in
     * [BatchGetPhotosResponse.results][google.streetview.publish.v1.BatchGetPhotosResponse.results].
     * See
     * [GetPhoto][google.streetview.publish.v1.StreetViewPublishService.GetPhoto]
     * for specific failures that can occur per photo.
     * </pre>
     */
    public void batchGetPhotos(
        com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.BatchGetPhotosRequest
            request,
        io.grpc.stub.StreamObserver<
                com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages
                    .BatchGetPhotosResponse>
            responseObserver) {
      asyncUnimplementedUnaryCall(getBatchGetPhotosMethodHelper(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Lists all the [Photos][google.streetview.publish.v1.Photo] that belong to
     * the user.
     * &lt;aside class="note"&gt;&lt;b&gt;Note:&lt;/b&gt; Recently created photos that are still
     * being indexed are not returned in the response.&lt;/aside&gt;
     * </pre>
     */
    public void listPhotos(
        com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.ListPhotosRequest
            request,
        io.grpc.stub.StreamObserver<
                com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages
                    .ListPhotosResponse>
            responseObserver) {
      asyncUnimplementedUnaryCall(getListPhotosMethodHelper(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Updates the metadata of a [Photo][google.streetview.publish.v1.Photo], such
     * as pose, place association, connections, etc. Changing the pixels of a
     * photo is not supported.
     * Only the fields specified in the
     * [updateMask][google.streetview.publish.v1.UpdatePhotoRequest.update_mask]
     * field are used. If `updateMask` is not present, the update applies to all
     * fields.
     * This method returns the following error codes:
     * * [google.rpc.Code.PERMISSION_DENIED][google.rpc.Code.PERMISSION_DENIED] if
     * the requesting user did not create the requested photo.
     * * [google.rpc.Code.INVALID_ARGUMENT][google.rpc.Code.INVALID_ARGUMENT] if
     * the request is malformed.
     * * [google.rpc.Code.NOT_FOUND][google.rpc.Code.NOT_FOUND] if the requested
     * photo does not exist.
     * * [google.rpc.Code.UNAVAILABLE][google.rpc.Code.UNAVAILABLE] if the
     * requested [Photo][google.streetview.publish.v1.Photo] is still being
     * indexed.
     * </pre>
     */
    public void updatePhoto(
        com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.UpdatePhotoRequest
            request,
        io.grpc.stub.StreamObserver<
                com.google.geo.ugc.streetview.publish.v1.StreetViewPublishResources.Photo>
            responseObserver) {
      asyncUnimplementedUnaryCall(getUpdatePhotoMethodHelper(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Updates the metadata of [Photos][google.streetview.publish.v1.Photo], such
     * as pose, place association, connections, etc. Changing the pixels of photos
     * is not supported.
     * Note that if
     * [BatchUpdatePhotos][google.streetview.publish.v1.StreetViewPublishService.BatchUpdatePhotos]
     * fails, either critical fields are missing or there is an authentication
     * error. Even if
     * [BatchUpdatePhotos][google.streetview.publish.v1.StreetViewPublishService.BatchUpdatePhotos]
     * succeeds, individual photos in the batch may have failures.
     * These failures are specified in each
     * [PhotoResponse.status][google.streetview.publish.v1.PhotoResponse.status]
     * in
     * [BatchUpdatePhotosResponse.results][google.streetview.publish.v1.BatchUpdatePhotosResponse.results].
     * See
     * [UpdatePhoto][google.streetview.publish.v1.StreetViewPublishService.UpdatePhoto]
     * for specific failures that can occur per photo.
     * Only the fields specified in
     * [updateMask][google.streetview.publish.v1.UpdatePhotoRequest.update_mask]
     * field are used. If `updateMask` is not present, the update applies to all
     * fields.
     * The number of
     * [UpdatePhotoRequest][google.streetview.publish.v1.UpdatePhotoRequest]
     * messages in a
     * [BatchUpdatePhotosRequest][google.streetview.publish.v1.BatchUpdatePhotosRequest]
     * must not exceed 20.
     * &lt;aside class="note"&gt;&lt;b&gt;Note:&lt;/b&gt; To update
     * [Pose.altitude][google.streetview.publish.v1.Pose.altitude],
     * [Pose.latLngPair][google.streetview.publish.v1.Pose.lat_lng_pair] has to be
     * filled as well. Otherwise, the request will fail.&lt;/aside&gt;
     * </pre>
     */
    public void batchUpdatePhotos(
        com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages
                .BatchUpdatePhotosRequest
            request,
        io.grpc.stub.StreamObserver<
                com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages
                    .BatchUpdatePhotosResponse>
            responseObserver) {
      asyncUnimplementedUnaryCall(getBatchUpdatePhotosMethodHelper(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Deletes a [Photo][google.streetview.publish.v1.Photo] and its metadata.
     * This method returns the following error codes:
     * * [google.rpc.Code.PERMISSION_DENIED][google.rpc.Code.PERMISSION_DENIED] if
     * the requesting user did not create the requested photo.
     * * [google.rpc.Code.NOT_FOUND][google.rpc.Code.NOT_FOUND] if the photo ID
     * does not exist.
     * </pre>
     */
    public void deletePhoto(
        com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.DeletePhotoRequest
            request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDeletePhotoMethodHelper(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Deletes a list of [Photos][google.streetview.publish.v1.Photo] and their
     * metadata.
     * Note that if
     * [BatchDeletePhotos][google.streetview.publish.v1.StreetViewPublishService.BatchDeletePhotos]
     * fails, either critical fields are missing or there was an authentication
     * error. Even if
     * [BatchDeletePhotos][google.streetview.publish.v1.StreetViewPublishService.BatchDeletePhotos]
     * succeeds, individual photos in the batch may have failures.
     * These failures are specified in each
     * [PhotoResponse.status][google.streetview.publish.v1.PhotoResponse.status]
     * in
     * [BatchDeletePhotosResponse.results][google.streetview.publish.v1.BatchDeletePhotosResponse.status].
     * See
     * [DeletePhoto][google.streetview.publish.v1.StreetViewPublishService.DeletePhoto]
     * for specific failures that can occur per photo.
     * </pre>
     */
    public void batchDeletePhotos(
        com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages
                .BatchDeletePhotosRequest
            request,
        io.grpc.stub.StreamObserver<
                com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages
                    .BatchDeletePhotosResponse>
            responseObserver) {
      asyncUnimplementedUnaryCall(getBatchDeletePhotosMethodHelper(), responseObserver);
    }

    @java.lang.Override
    public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
              getStartUploadMethodHelper(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.protobuf.Empty,
                      com.google.geo.ugc.streetview.publish.v1.StreetViewPublishResources
                          .UploadRef>(this, METHODID_START_UPLOAD)))
          .addMethod(
              getCreatePhotoMethodHelper(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages
                          .CreatePhotoRequest,
                      com.google.geo.ugc.streetview.publish.v1.StreetViewPublishResources.Photo>(
                      this, METHODID_CREATE_PHOTO)))
          .addMethod(
              getGetPhotoMethodHelper(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages
                          .GetPhotoRequest,
                      com.google.geo.ugc.streetview.publish.v1.StreetViewPublishResources.Photo>(
                      this, METHODID_GET_PHOTO)))
          .addMethod(
              getBatchGetPhotosMethodHelper(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages
                          .BatchGetPhotosRequest,
                      com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages
                          .BatchGetPhotosResponse>(this, METHODID_BATCH_GET_PHOTOS)))
          .addMethod(
              getListPhotosMethodHelper(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages
                          .ListPhotosRequest,
                      com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages
                          .ListPhotosResponse>(this, METHODID_LIST_PHOTOS)))
          .addMethod(
              getUpdatePhotoMethodHelper(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages
                          .UpdatePhotoRequest,
                      com.google.geo.ugc.streetview.publish.v1.StreetViewPublishResources.Photo>(
                      this, METHODID_UPDATE_PHOTO)))
          .addMethod(
              getBatchUpdatePhotosMethodHelper(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages
                          .BatchUpdatePhotosRequest,
                      com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages
                          .BatchUpdatePhotosResponse>(this, METHODID_BATCH_UPDATE_PHOTOS)))
          .addMethod(
              getDeletePhotoMethodHelper(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages
                          .DeletePhotoRequest,
                      com.google.protobuf.Empty>(this, METHODID_DELETE_PHOTO)))
          .addMethod(
              getBatchDeletePhotosMethodHelper(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages
                          .BatchDeletePhotosRequest,
                      com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages
                          .BatchDeletePhotosResponse>(this, METHODID_BATCH_DELETE_PHOTOS)))
          .build();
    }
  }

  /**
   *
   *
   * <pre>
   * Publishes and connects user-contributed photos on Street View.
   * </pre>
   */
  public static final class StreetViewPublishServiceStub
      extends io.grpc.stub.AbstractStub<StreetViewPublishServiceStub> {
    private StreetViewPublishServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private StreetViewPublishServiceStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StreetViewPublishServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StreetViewPublishServiceStub(channel, callOptions);
    }

    /**
     *
     *
     * <pre>
     * Creates an upload session to start uploading photo bytes. The method uses
     * the upload URL of the returned
     * [UploadRef][google.streetview.publish.v1.UploadRef] to upload the bytes for
     * the [Photo][google.streetview.publish.v1.Photo].
     * In addition to the photo requirements shown in
     * https://support.google.com/maps/answer/7012050?hl=en&amp;ref_topic=6275604,
     * the photo must meet the following requirements:
     * * Photo Sphere XMP metadata must be included in the photo medadata. See
     * https://developers.google.com/streetview/spherical-metadata for the
     * required fields.
     * * The pixel size of the photo must meet the size requirements listed in
     * https://support.google.com/maps/answer/7012050?hl=en&amp;ref_topic=6275604, and
     * the photo must be a full 360 horizontally.
     * After the upload completes, the method uses
     * [UploadRef][google.streetview.publish.v1.UploadRef] with
     * [CreatePhoto][google.streetview.publish.v1.StreetViewPublishService.CreatePhoto]
     * to create the [Photo][google.streetview.publish.v1.Photo] object entry.
     * </pre>
     */
    public void startUpload(
        com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<
                com.google.geo.ugc.streetview.publish.v1.StreetViewPublishResources.UploadRef>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStartUploadMethodHelper(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * After the client finishes uploading the photo with the returned
     * [UploadRef][google.streetview.publish.v1.UploadRef],
     * [CreatePhoto][google.streetview.publish.v1.StreetViewPublishService.CreatePhoto]
     * publishes the uploaded [Photo][google.streetview.publish.v1.Photo] to
     * Street View on Google Maps.
     * Currently, the only way to set heading, pitch, and roll in CreatePhoto is
     * through the [Photo Sphere XMP
     * metadata](https://developers.google.com/streetview/spherical-metadata) in
     * the photo bytes. CreatePhoto ignores the `pose.heading`, `pose.pitch`,
     * `pose.roll`, `pose.altitude`, and `pose.level` fields in Pose.
     * This method returns the following error codes:
     * * [google.rpc.Code.INVALID_ARGUMENT][google.rpc.Code.INVALID_ARGUMENT] if
     * the request is malformed or if the uploaded photo is not a 360 photo.
     * * [google.rpc.Code.NOT_FOUND][google.rpc.Code.NOT_FOUND] if the upload
     * reference does not exist.
     * * [google.rpc.Code.RESOURCE_EXHAUSTED][google.rpc.Code.RESOURCE_EXHAUSTED]
     * if the account has reached the storage limit.
     * </pre>
     */
    public void createPhoto(
        com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.CreatePhotoRequest
            request,
        io.grpc.stub.StreamObserver<
                com.google.geo.ugc.streetview.publish.v1.StreetViewPublishResources.Photo>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreatePhotoMethodHelper(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Gets the metadata of the specified
     * [Photo][google.streetview.publish.v1.Photo].
     * This method returns the following error codes:
     * * [google.rpc.Code.PERMISSION_DENIED][google.rpc.Code.PERMISSION_DENIED] if
     * the requesting user did not create the requested
     * [Photo][google.streetview.publish.v1.Photo].
     * * [google.rpc.Code.NOT_FOUND][google.rpc.Code.NOT_FOUND] if the requested
     * [Photo][google.streetview.publish.v1.Photo] does not exist.
     * * [google.rpc.Code.UNAVAILABLE][google.rpc.Code.UNAVAILABLE] if the
     * requested [Photo][google.streetview.publish.v1.Photo] is still being
     * indexed.
     * </pre>
     */
    public void getPhoto(
        com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.GetPhotoRequest
            request,
        io.grpc.stub.StreamObserver<
                com.google.geo.ugc.streetview.publish.v1.StreetViewPublishResources.Photo>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetPhotoMethodHelper(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Gets the metadata of the specified
     * [Photo][google.streetview.publish.v1.Photo] batch.
     * Note that if
     * [BatchGetPhotos][google.streetview.publish.v1.StreetViewPublishService.BatchGetPhotos]
     * fails, either critical fields are missing or there is an authentication
     * error. Even if
     * [BatchGetPhotos][google.streetview.publish.v1.StreetViewPublishService.BatchGetPhotos]
     * succeeds, individual photos in the batch may have failures.
     * These failures are specified in each
     * [PhotoResponse.status][google.streetview.publish.v1.PhotoResponse.status]
     * in
     * [BatchGetPhotosResponse.results][google.streetview.publish.v1.BatchGetPhotosResponse.results].
     * See
     * [GetPhoto][google.streetview.publish.v1.StreetViewPublishService.GetPhoto]
     * for specific failures that can occur per photo.
     * </pre>
     */
    public void batchGetPhotos(
        com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.BatchGetPhotosRequest
            request,
        io.grpc.stub.StreamObserver<
                com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages
                    .BatchGetPhotosResponse>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getBatchGetPhotosMethodHelper(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Lists all the [Photos][google.streetview.publish.v1.Photo] that belong to
     * the user.
     * &lt;aside class="note"&gt;&lt;b&gt;Note:&lt;/b&gt; Recently created photos that are still
     * being indexed are not returned in the response.&lt;/aside&gt;
     * </pre>
     */
    public void listPhotos(
        com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.ListPhotosRequest
            request,
        io.grpc.stub.StreamObserver<
                com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages
                    .ListPhotosResponse>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListPhotosMethodHelper(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Updates the metadata of a [Photo][google.streetview.publish.v1.Photo], such
     * as pose, place association, connections, etc. Changing the pixels of a
     * photo is not supported.
     * Only the fields specified in the
     * [updateMask][google.streetview.publish.v1.UpdatePhotoRequest.update_mask]
     * field are used. If `updateMask` is not present, the update applies to all
     * fields.
     * This method returns the following error codes:
     * * [google.rpc.Code.PERMISSION_DENIED][google.rpc.Code.PERMISSION_DENIED] if
     * the requesting user did not create the requested photo.
     * * [google.rpc.Code.INVALID_ARGUMENT][google.rpc.Code.INVALID_ARGUMENT] if
     * the request is malformed.
     * * [google.rpc.Code.NOT_FOUND][google.rpc.Code.NOT_FOUND] if the requested
     * photo does not exist.
     * * [google.rpc.Code.UNAVAILABLE][google.rpc.Code.UNAVAILABLE] if the
     * requested [Photo][google.streetview.publish.v1.Photo] is still being
     * indexed.
     * </pre>
     */
    public void updatePhoto(
        com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.UpdatePhotoRequest
            request,
        io.grpc.stub.StreamObserver<
                com.google.geo.ugc.streetview.publish.v1.StreetViewPublishResources.Photo>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdatePhotoMethodHelper(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Updates the metadata of [Photos][google.streetview.publish.v1.Photo], such
     * as pose, place association, connections, etc. Changing the pixels of photos
     * is not supported.
     * Note that if
     * [BatchUpdatePhotos][google.streetview.publish.v1.StreetViewPublishService.BatchUpdatePhotos]
     * fails, either critical fields are missing or there is an authentication
     * error. Even if
     * [BatchUpdatePhotos][google.streetview.publish.v1.StreetViewPublishService.BatchUpdatePhotos]
     * succeeds, individual photos in the batch may have failures.
     * These failures are specified in each
     * [PhotoResponse.status][google.streetview.publish.v1.PhotoResponse.status]
     * in
     * [BatchUpdatePhotosResponse.results][google.streetview.publish.v1.BatchUpdatePhotosResponse.results].
     * See
     * [UpdatePhoto][google.streetview.publish.v1.StreetViewPublishService.UpdatePhoto]
     * for specific failures that can occur per photo.
     * Only the fields specified in
     * [updateMask][google.streetview.publish.v1.UpdatePhotoRequest.update_mask]
     * field are used. If `updateMask` is not present, the update applies to all
     * fields.
     * The number of
     * [UpdatePhotoRequest][google.streetview.publish.v1.UpdatePhotoRequest]
     * messages in a
     * [BatchUpdatePhotosRequest][google.streetview.publish.v1.BatchUpdatePhotosRequest]
     * must not exceed 20.
     * &lt;aside class="note"&gt;&lt;b&gt;Note:&lt;/b&gt; To update
     * [Pose.altitude][google.streetview.publish.v1.Pose.altitude],
     * [Pose.latLngPair][google.streetview.publish.v1.Pose.lat_lng_pair] has to be
     * filled as well. Otherwise, the request will fail.&lt;/aside&gt;
     * </pre>
     */
    public void batchUpdatePhotos(
        com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages
                .BatchUpdatePhotosRequest
            request,
        io.grpc.stub.StreamObserver<
                com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages
                    .BatchUpdatePhotosResponse>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getBatchUpdatePhotosMethodHelper(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Deletes a [Photo][google.streetview.publish.v1.Photo] and its metadata.
     * This method returns the following error codes:
     * * [google.rpc.Code.PERMISSION_DENIED][google.rpc.Code.PERMISSION_DENIED] if
     * the requesting user did not create the requested photo.
     * * [google.rpc.Code.NOT_FOUND][google.rpc.Code.NOT_FOUND] if the photo ID
     * does not exist.
     * </pre>
     */
    public void deletePhoto(
        com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.DeletePhotoRequest
            request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeletePhotoMethodHelper(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Deletes a list of [Photos][google.streetview.publish.v1.Photo] and their
     * metadata.
     * Note that if
     * [BatchDeletePhotos][google.streetview.publish.v1.StreetViewPublishService.BatchDeletePhotos]
     * fails, either critical fields are missing or there was an authentication
     * error. Even if
     * [BatchDeletePhotos][google.streetview.publish.v1.StreetViewPublishService.BatchDeletePhotos]
     * succeeds, individual photos in the batch may have failures.
     * These failures are specified in each
     * [PhotoResponse.status][google.streetview.publish.v1.PhotoResponse.status]
     * in
     * [BatchDeletePhotosResponse.results][google.streetview.publish.v1.BatchDeletePhotosResponse.status].
     * See
     * [DeletePhoto][google.streetview.publish.v1.StreetViewPublishService.DeletePhoto]
     * for specific failures that can occur per photo.
     * </pre>
     */
    public void batchDeletePhotos(
        com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages
                .BatchDeletePhotosRequest
            request,
        io.grpc.stub.StreamObserver<
                com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages
                    .BatchDeletePhotosResponse>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getBatchDeletePhotosMethodHelper(), getCallOptions()),
          request,
          responseObserver);
    }
  }

  /**
   *
   *
   * <pre>
   * Publishes and connects user-contributed photos on Street View.
   * </pre>
   */
  public static final class StreetViewPublishServiceBlockingStub
      extends io.grpc.stub.AbstractStub<StreetViewPublishServiceBlockingStub> {
    private StreetViewPublishServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private StreetViewPublishServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StreetViewPublishServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StreetViewPublishServiceBlockingStub(channel, callOptions);
    }

    /**
     *
     *
     * <pre>
     * Creates an upload session to start uploading photo bytes. The method uses
     * the upload URL of the returned
     * [UploadRef][google.streetview.publish.v1.UploadRef] to upload the bytes for
     * the [Photo][google.streetview.publish.v1.Photo].
     * In addition to the photo requirements shown in
     * https://support.google.com/maps/answer/7012050?hl=en&amp;ref_topic=6275604,
     * the photo must meet the following requirements:
     * * Photo Sphere XMP metadata must be included in the photo medadata. See
     * https://developers.google.com/streetview/spherical-metadata for the
     * required fields.
     * * The pixel size of the photo must meet the size requirements listed in
     * https://support.google.com/maps/answer/7012050?hl=en&amp;ref_topic=6275604, and
     * the photo must be a full 360 horizontally.
     * After the upload completes, the method uses
     * [UploadRef][google.streetview.publish.v1.UploadRef] with
     * [CreatePhoto][google.streetview.publish.v1.StreetViewPublishService.CreatePhoto]
     * to create the [Photo][google.streetview.publish.v1.Photo] object entry.
     * </pre>
     */
    public com.google.geo.ugc.streetview.publish.v1.StreetViewPublishResources.UploadRef
        startUpload(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getStartUploadMethodHelper(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * After the client finishes uploading the photo with the returned
     * [UploadRef][google.streetview.publish.v1.UploadRef],
     * [CreatePhoto][google.streetview.publish.v1.StreetViewPublishService.CreatePhoto]
     * publishes the uploaded [Photo][google.streetview.publish.v1.Photo] to
     * Street View on Google Maps.
     * Currently, the only way to set heading, pitch, and roll in CreatePhoto is
     * through the [Photo Sphere XMP
     * metadata](https://developers.google.com/streetview/spherical-metadata) in
     * the photo bytes. CreatePhoto ignores the `pose.heading`, `pose.pitch`,
     * `pose.roll`, `pose.altitude`, and `pose.level` fields in Pose.
     * This method returns the following error codes:
     * * [google.rpc.Code.INVALID_ARGUMENT][google.rpc.Code.INVALID_ARGUMENT] if
     * the request is malformed or if the uploaded photo is not a 360 photo.
     * * [google.rpc.Code.NOT_FOUND][google.rpc.Code.NOT_FOUND] if the upload
     * reference does not exist.
     * * [google.rpc.Code.RESOURCE_EXHAUSTED][google.rpc.Code.RESOURCE_EXHAUSTED]
     * if the account has reached the storage limit.
     * </pre>
     */
    public com.google.geo.ugc.streetview.publish.v1.StreetViewPublishResources.Photo createPhoto(
        com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.CreatePhotoRequest
            request) {
      return blockingUnaryCall(
          getChannel(), getCreatePhotoMethodHelper(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Gets the metadata of the specified
     * [Photo][google.streetview.publish.v1.Photo].
     * This method returns the following error codes:
     * * [google.rpc.Code.PERMISSION_DENIED][google.rpc.Code.PERMISSION_DENIED] if
     * the requesting user did not create the requested
     * [Photo][google.streetview.publish.v1.Photo].
     * * [google.rpc.Code.NOT_FOUND][google.rpc.Code.NOT_FOUND] if the requested
     * [Photo][google.streetview.publish.v1.Photo] does not exist.
     * * [google.rpc.Code.UNAVAILABLE][google.rpc.Code.UNAVAILABLE] if the
     * requested [Photo][google.streetview.publish.v1.Photo] is still being
     * indexed.
     * </pre>
     */
    public com.google.geo.ugc.streetview.publish.v1.StreetViewPublishResources.Photo getPhoto(
        com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.GetPhotoRequest
            request) {
      return blockingUnaryCall(getChannel(), getGetPhotoMethodHelper(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Gets the metadata of the specified
     * [Photo][google.streetview.publish.v1.Photo] batch.
     * Note that if
     * [BatchGetPhotos][google.streetview.publish.v1.StreetViewPublishService.BatchGetPhotos]
     * fails, either critical fields are missing or there is an authentication
     * error. Even if
     * [BatchGetPhotos][google.streetview.publish.v1.StreetViewPublishService.BatchGetPhotos]
     * succeeds, individual photos in the batch may have failures.
     * These failures are specified in each
     * [PhotoResponse.status][google.streetview.publish.v1.PhotoResponse.status]
     * in
     * [BatchGetPhotosResponse.results][google.streetview.publish.v1.BatchGetPhotosResponse.results].
     * See
     * [GetPhoto][google.streetview.publish.v1.StreetViewPublishService.GetPhoto]
     * for specific failures that can occur per photo.
     * </pre>
     */
    public com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages
            .BatchGetPhotosResponse
        batchGetPhotos(
            com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages
                    .BatchGetPhotosRequest
                request) {
      return blockingUnaryCall(
          getChannel(), getBatchGetPhotosMethodHelper(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Lists all the [Photos][google.streetview.publish.v1.Photo] that belong to
     * the user.
     * &lt;aside class="note"&gt;&lt;b&gt;Note:&lt;/b&gt; Recently created photos that are still
     * being indexed are not returned in the response.&lt;/aside&gt;
     * </pre>
     */
    public com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.ListPhotosResponse
        listPhotos(
            com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.ListPhotosRequest
                request) {
      return blockingUnaryCall(
          getChannel(), getListPhotosMethodHelper(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Updates the metadata of a [Photo][google.streetview.publish.v1.Photo], such
     * as pose, place association, connections, etc. Changing the pixels of a
     * photo is not supported.
     * Only the fields specified in the
     * [updateMask][google.streetview.publish.v1.UpdatePhotoRequest.update_mask]
     * field are used. If `updateMask` is not present, the update applies to all
     * fields.
     * This method returns the following error codes:
     * * [google.rpc.Code.PERMISSION_DENIED][google.rpc.Code.PERMISSION_DENIED] if
     * the requesting user did not create the requested photo.
     * * [google.rpc.Code.INVALID_ARGUMENT][google.rpc.Code.INVALID_ARGUMENT] if
     * the request is malformed.
     * * [google.rpc.Code.NOT_FOUND][google.rpc.Code.NOT_FOUND] if the requested
     * photo does not exist.
     * * [google.rpc.Code.UNAVAILABLE][google.rpc.Code.UNAVAILABLE] if the
     * requested [Photo][google.streetview.publish.v1.Photo] is still being
     * indexed.
     * </pre>
     */
    public com.google.geo.ugc.streetview.publish.v1.StreetViewPublishResources.Photo updatePhoto(
        com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.UpdatePhotoRequest
            request) {
      return blockingUnaryCall(
          getChannel(), getUpdatePhotoMethodHelper(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Updates the metadata of [Photos][google.streetview.publish.v1.Photo], such
     * as pose, place association, connections, etc. Changing the pixels of photos
     * is not supported.
     * Note that if
     * [BatchUpdatePhotos][google.streetview.publish.v1.StreetViewPublishService.BatchUpdatePhotos]
     * fails, either critical fields are missing or there is an authentication
     * error. Even if
     * [BatchUpdatePhotos][google.streetview.publish.v1.StreetViewPublishService.BatchUpdatePhotos]
     * succeeds, individual photos in the batch may have failures.
     * These failures are specified in each
     * [PhotoResponse.status][google.streetview.publish.v1.PhotoResponse.status]
     * in
     * [BatchUpdatePhotosResponse.results][google.streetview.publish.v1.BatchUpdatePhotosResponse.results].
     * See
     * [UpdatePhoto][google.streetview.publish.v1.StreetViewPublishService.UpdatePhoto]
     * for specific failures that can occur per photo.
     * Only the fields specified in
     * [updateMask][google.streetview.publish.v1.UpdatePhotoRequest.update_mask]
     * field are used. If `updateMask` is not present, the update applies to all
     * fields.
     * The number of
     * [UpdatePhotoRequest][google.streetview.publish.v1.UpdatePhotoRequest]
     * messages in a
     * [BatchUpdatePhotosRequest][google.streetview.publish.v1.BatchUpdatePhotosRequest]
     * must not exceed 20.
     * &lt;aside class="note"&gt;&lt;b&gt;Note:&lt;/b&gt; To update
     * [Pose.altitude][google.streetview.publish.v1.Pose.altitude],
     * [Pose.latLngPair][google.streetview.publish.v1.Pose.lat_lng_pair] has to be
     * filled as well. Otherwise, the request will fail.&lt;/aside&gt;
     * </pre>
     */
    public com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages
            .BatchUpdatePhotosResponse
        batchUpdatePhotos(
            com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages
                    .BatchUpdatePhotosRequest
                request) {
      return blockingUnaryCall(
          getChannel(), getBatchUpdatePhotosMethodHelper(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Deletes a [Photo][google.streetview.publish.v1.Photo] and its metadata.
     * This method returns the following error codes:
     * * [google.rpc.Code.PERMISSION_DENIED][google.rpc.Code.PERMISSION_DENIED] if
     * the requesting user did not create the requested photo.
     * * [google.rpc.Code.NOT_FOUND][google.rpc.Code.NOT_FOUND] if the photo ID
     * does not exist.
     * </pre>
     */
    public com.google.protobuf.Empty deletePhoto(
        com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.DeletePhotoRequest
            request) {
      return blockingUnaryCall(
          getChannel(), getDeletePhotoMethodHelper(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Deletes a list of [Photos][google.streetview.publish.v1.Photo] and their
     * metadata.
     * Note that if
     * [BatchDeletePhotos][google.streetview.publish.v1.StreetViewPublishService.BatchDeletePhotos]
     * fails, either critical fields are missing or there was an authentication
     * error. Even if
     * [BatchDeletePhotos][google.streetview.publish.v1.StreetViewPublishService.BatchDeletePhotos]
     * succeeds, individual photos in the batch may have failures.
     * These failures are specified in each
     * [PhotoResponse.status][google.streetview.publish.v1.PhotoResponse.status]
     * in
     * [BatchDeletePhotosResponse.results][google.streetview.publish.v1.BatchDeletePhotosResponse.status].
     * See
     * [DeletePhoto][google.streetview.publish.v1.StreetViewPublishService.DeletePhoto]
     * for specific failures that can occur per photo.
     * </pre>
     */
    public com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages
            .BatchDeletePhotosResponse
        batchDeletePhotos(
            com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages
                    .BatchDeletePhotosRequest
                request) {
      return blockingUnaryCall(
          getChannel(), getBatchDeletePhotosMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   *
   *
   * <pre>
   * Publishes and connects user-contributed photos on Street View.
   * </pre>
   */
  public static final class StreetViewPublishServiceFutureStub
      extends io.grpc.stub.AbstractStub<StreetViewPublishServiceFutureStub> {
    private StreetViewPublishServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private StreetViewPublishServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StreetViewPublishServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StreetViewPublishServiceFutureStub(channel, callOptions);
    }

    /**
     *
     *
     * <pre>
     * Creates an upload session to start uploading photo bytes. The method uses
     * the upload URL of the returned
     * [UploadRef][google.streetview.publish.v1.UploadRef] to upload the bytes for
     * the [Photo][google.streetview.publish.v1.Photo].
     * In addition to the photo requirements shown in
     * https://support.google.com/maps/answer/7012050?hl=en&amp;ref_topic=6275604,
     * the photo must meet the following requirements:
     * * Photo Sphere XMP metadata must be included in the photo medadata. See
     * https://developers.google.com/streetview/spherical-metadata for the
     * required fields.
     * * The pixel size of the photo must meet the size requirements listed in
     * https://support.google.com/maps/answer/7012050?hl=en&amp;ref_topic=6275604, and
     * the photo must be a full 360 horizontally.
     * After the upload completes, the method uses
     * [UploadRef][google.streetview.publish.v1.UploadRef] with
     * [CreatePhoto][google.streetview.publish.v1.StreetViewPublishService.CreatePhoto]
     * to create the [Photo][google.streetview.publish.v1.Photo] object entry.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.geo.ugc.streetview.publish.v1.StreetViewPublishResources.UploadRef>
        startUpload(com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getStartUploadMethodHelper(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * After the client finishes uploading the photo with the returned
     * [UploadRef][google.streetview.publish.v1.UploadRef],
     * [CreatePhoto][google.streetview.publish.v1.StreetViewPublishService.CreatePhoto]
     * publishes the uploaded [Photo][google.streetview.publish.v1.Photo] to
     * Street View on Google Maps.
     * Currently, the only way to set heading, pitch, and roll in CreatePhoto is
     * through the [Photo Sphere XMP
     * metadata](https://developers.google.com/streetview/spherical-metadata) in
     * the photo bytes. CreatePhoto ignores the `pose.heading`, `pose.pitch`,
     * `pose.roll`, `pose.altitude`, and `pose.level` fields in Pose.
     * This method returns the following error codes:
     * * [google.rpc.Code.INVALID_ARGUMENT][google.rpc.Code.INVALID_ARGUMENT] if
     * the request is malformed or if the uploaded photo is not a 360 photo.
     * * [google.rpc.Code.NOT_FOUND][google.rpc.Code.NOT_FOUND] if the upload
     * reference does not exist.
     * * [google.rpc.Code.RESOURCE_EXHAUSTED][google.rpc.Code.RESOURCE_EXHAUSTED]
     * if the account has reached the storage limit.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.geo.ugc.streetview.publish.v1.StreetViewPublishResources.Photo>
        createPhoto(
            com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.CreatePhotoRequest
                request) {
      return futureUnaryCall(
          getChannel().newCall(getCreatePhotoMethodHelper(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Gets the metadata of the specified
     * [Photo][google.streetview.publish.v1.Photo].
     * This method returns the following error codes:
     * * [google.rpc.Code.PERMISSION_DENIED][google.rpc.Code.PERMISSION_DENIED] if
     * the requesting user did not create the requested
     * [Photo][google.streetview.publish.v1.Photo].
     * * [google.rpc.Code.NOT_FOUND][google.rpc.Code.NOT_FOUND] if the requested
     * [Photo][google.streetview.publish.v1.Photo] does not exist.
     * * [google.rpc.Code.UNAVAILABLE][google.rpc.Code.UNAVAILABLE] if the
     * requested [Photo][google.streetview.publish.v1.Photo] is still being
     * indexed.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.geo.ugc.streetview.publish.v1.StreetViewPublishResources.Photo>
        getPhoto(
            com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.GetPhotoRequest
                request) {
      return futureUnaryCall(
          getChannel().newCall(getGetPhotoMethodHelper(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Gets the metadata of the specified
     * [Photo][google.streetview.publish.v1.Photo] batch.
     * Note that if
     * [BatchGetPhotos][google.streetview.publish.v1.StreetViewPublishService.BatchGetPhotos]
     * fails, either critical fields are missing or there is an authentication
     * error. Even if
     * [BatchGetPhotos][google.streetview.publish.v1.StreetViewPublishService.BatchGetPhotos]
     * succeeds, individual photos in the batch may have failures.
     * These failures are specified in each
     * [PhotoResponse.status][google.streetview.publish.v1.PhotoResponse.status]
     * in
     * [BatchGetPhotosResponse.results][google.streetview.publish.v1.BatchGetPhotosResponse.results].
     * See
     * [GetPhoto][google.streetview.publish.v1.StreetViewPublishService.GetPhoto]
     * for specific failures that can occur per photo.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages
                .BatchGetPhotosResponse>
        batchGetPhotos(
            com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages
                    .BatchGetPhotosRequest
                request) {
      return futureUnaryCall(
          getChannel().newCall(getBatchGetPhotosMethodHelper(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Lists all the [Photos][google.streetview.publish.v1.Photo] that belong to
     * the user.
     * &lt;aside class="note"&gt;&lt;b&gt;Note:&lt;/b&gt; Recently created photos that are still
     * being indexed are not returned in the response.&lt;/aside&gt;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages
                .ListPhotosResponse>
        listPhotos(
            com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.ListPhotosRequest
                request) {
      return futureUnaryCall(
          getChannel().newCall(getListPhotosMethodHelper(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Updates the metadata of a [Photo][google.streetview.publish.v1.Photo], such
     * as pose, place association, connections, etc. Changing the pixels of a
     * photo is not supported.
     * Only the fields specified in the
     * [updateMask][google.streetview.publish.v1.UpdatePhotoRequest.update_mask]
     * field are used. If `updateMask` is not present, the update applies to all
     * fields.
     * This method returns the following error codes:
     * * [google.rpc.Code.PERMISSION_DENIED][google.rpc.Code.PERMISSION_DENIED] if
     * the requesting user did not create the requested photo.
     * * [google.rpc.Code.INVALID_ARGUMENT][google.rpc.Code.INVALID_ARGUMENT] if
     * the request is malformed.
     * * [google.rpc.Code.NOT_FOUND][google.rpc.Code.NOT_FOUND] if the requested
     * photo does not exist.
     * * [google.rpc.Code.UNAVAILABLE][google.rpc.Code.UNAVAILABLE] if the
     * requested [Photo][google.streetview.publish.v1.Photo] is still being
     * indexed.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.geo.ugc.streetview.publish.v1.StreetViewPublishResources.Photo>
        updatePhoto(
            com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.UpdatePhotoRequest
                request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdatePhotoMethodHelper(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Updates the metadata of [Photos][google.streetview.publish.v1.Photo], such
     * as pose, place association, connections, etc. Changing the pixels of photos
     * is not supported.
     * Note that if
     * [BatchUpdatePhotos][google.streetview.publish.v1.StreetViewPublishService.BatchUpdatePhotos]
     * fails, either critical fields are missing or there is an authentication
     * error. Even if
     * [BatchUpdatePhotos][google.streetview.publish.v1.StreetViewPublishService.BatchUpdatePhotos]
     * succeeds, individual photos in the batch may have failures.
     * These failures are specified in each
     * [PhotoResponse.status][google.streetview.publish.v1.PhotoResponse.status]
     * in
     * [BatchUpdatePhotosResponse.results][google.streetview.publish.v1.BatchUpdatePhotosResponse.results].
     * See
     * [UpdatePhoto][google.streetview.publish.v1.StreetViewPublishService.UpdatePhoto]
     * for specific failures that can occur per photo.
     * Only the fields specified in
     * [updateMask][google.streetview.publish.v1.UpdatePhotoRequest.update_mask]
     * field are used. If `updateMask` is not present, the update applies to all
     * fields.
     * The number of
     * [UpdatePhotoRequest][google.streetview.publish.v1.UpdatePhotoRequest]
     * messages in a
     * [BatchUpdatePhotosRequest][google.streetview.publish.v1.BatchUpdatePhotosRequest]
     * must not exceed 20.
     * &lt;aside class="note"&gt;&lt;b&gt;Note:&lt;/b&gt; To update
     * [Pose.altitude][google.streetview.publish.v1.Pose.altitude],
     * [Pose.latLngPair][google.streetview.publish.v1.Pose.lat_lng_pair] has to be
     * filled as well. Otherwise, the request will fail.&lt;/aside&gt;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages
                .BatchUpdatePhotosResponse>
        batchUpdatePhotos(
            com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages
                    .BatchUpdatePhotosRequest
                request) {
      return futureUnaryCall(
          getChannel().newCall(getBatchUpdatePhotosMethodHelper(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Deletes a [Photo][google.streetview.publish.v1.Photo] and its metadata.
     * This method returns the following error codes:
     * * [google.rpc.Code.PERMISSION_DENIED][google.rpc.Code.PERMISSION_DENIED] if
     * the requesting user did not create the requested photo.
     * * [google.rpc.Code.NOT_FOUND][google.rpc.Code.NOT_FOUND] if the photo ID
     * does not exist.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty>
        deletePhoto(
            com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.DeletePhotoRequest
                request) {
      return futureUnaryCall(
          getChannel().newCall(getDeletePhotoMethodHelper(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Deletes a list of [Photos][google.streetview.publish.v1.Photo] and their
     * metadata.
     * Note that if
     * [BatchDeletePhotos][google.streetview.publish.v1.StreetViewPublishService.BatchDeletePhotos]
     * fails, either critical fields are missing or there was an authentication
     * error. Even if
     * [BatchDeletePhotos][google.streetview.publish.v1.StreetViewPublishService.BatchDeletePhotos]
     * succeeds, individual photos in the batch may have failures.
     * These failures are specified in each
     * [PhotoResponse.status][google.streetview.publish.v1.PhotoResponse.status]
     * in
     * [BatchDeletePhotosResponse.results][google.streetview.publish.v1.BatchDeletePhotosResponse.status].
     * See
     * [DeletePhoto][google.streetview.publish.v1.StreetViewPublishService.DeletePhoto]
     * for specific failures that can occur per photo.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages
                .BatchDeletePhotosResponse>
        batchDeletePhotos(
            com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages
                    .BatchDeletePhotosRequest
                request) {
      return futureUnaryCall(
          getChannel().newCall(getBatchDeletePhotosMethodHelper(), getCallOptions()), request);
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

  private static final class MethodHandlers<Req, Resp>
      implements io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
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
          serviceImpl.startUpload(
              (com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<
                      com.google.geo.ugc.streetview.publish.v1.StreetViewPublishResources
                          .UploadRef>)
                  responseObserver);
          break;
        case METHODID_CREATE_PHOTO:
          serviceImpl.createPhoto(
              (com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages
                      .CreatePhotoRequest)
                  request,
              (io.grpc.stub.StreamObserver<
                      com.google.geo.ugc.streetview.publish.v1.StreetViewPublishResources.Photo>)
                  responseObserver);
          break;
        case METHODID_GET_PHOTO:
          serviceImpl.getPhoto(
              (com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages
                      .GetPhotoRequest)
                  request,
              (io.grpc.stub.StreamObserver<
                      com.google.geo.ugc.streetview.publish.v1.StreetViewPublishResources.Photo>)
                  responseObserver);
          break;
        case METHODID_BATCH_GET_PHOTOS:
          serviceImpl.batchGetPhotos(
              (com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages
                      .BatchGetPhotosRequest)
                  request,
              (io.grpc.stub.StreamObserver<
                      com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages
                          .BatchGetPhotosResponse>)
                  responseObserver);
          break;
        case METHODID_LIST_PHOTOS:
          serviceImpl.listPhotos(
              (com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages
                      .ListPhotosRequest)
                  request,
              (io.grpc.stub.StreamObserver<
                      com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages
                          .ListPhotosResponse>)
                  responseObserver);
          break;
        case METHODID_UPDATE_PHOTO:
          serviceImpl.updatePhoto(
              (com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages
                      .UpdatePhotoRequest)
                  request,
              (io.grpc.stub.StreamObserver<
                      com.google.geo.ugc.streetview.publish.v1.StreetViewPublishResources.Photo>)
                  responseObserver);
          break;
        case METHODID_BATCH_UPDATE_PHOTOS:
          serviceImpl.batchUpdatePhotos(
              (com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages
                      .BatchUpdatePhotosRequest)
                  request,
              (io.grpc.stub.StreamObserver<
                      com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages
                          .BatchUpdatePhotosResponse>)
                  responseObserver);
          break;
        case METHODID_DELETE_PHOTO:
          serviceImpl.deletePhoto(
              (com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages
                      .DeletePhotoRequest)
                  request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_BATCH_DELETE_PHOTOS:
          serviceImpl.batchDeletePhotos(
              (com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages
                      .BatchDeletePhotosRequest)
                  request,
              (io.grpc.stub.StreamObserver<
                      com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages
                          .BatchDeletePhotosResponse>)
                  responseObserver);
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

  private abstract static class StreetViewPublishServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier,
          io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    StreetViewPublishServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.geo.ugc.streetview.publish.v1.StreetViewPublish.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("StreetViewPublishService");
    }
  }

  private static final class StreetViewPublishServiceFileDescriptorSupplier
      extends StreetViewPublishServiceBaseDescriptorSupplier {
    StreetViewPublishServiceFileDescriptorSupplier() {}
  }

  private static final class StreetViewPublishServiceMethodDescriptorSupplier
      extends StreetViewPublishServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    StreetViewPublishServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (StreetViewPublishServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor =
              result =
                  io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
                      .setSchemaDescriptor(new StreetViewPublishServiceFileDescriptorSupplier())
                      .addMethod(getStartUploadMethodHelper())
                      .addMethod(getCreatePhotoMethodHelper())
                      .addMethod(getGetPhotoMethodHelper())
                      .addMethod(getBatchGetPhotosMethodHelper())
                      .addMethod(getListPhotosMethodHelper())
                      .addMethod(getUpdatePhotoMethodHelper())
                      .addMethod(getBatchUpdatePhotosMethodHelper())
                      .addMethod(getDeletePhotoMethodHelper())
                      .addMethod(getBatchDeletePhotosMethodHelper())
                      .build();
        }
      }
    }
    return result;
  }
}
