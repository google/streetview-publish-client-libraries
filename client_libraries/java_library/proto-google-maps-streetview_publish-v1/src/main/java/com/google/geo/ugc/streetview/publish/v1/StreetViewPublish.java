// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/streetview/publish/v1/streetview_publish.proto

package com.google.geo.ugc.streetview.publish.v1;

public final class StreetViewPublish {
  private StreetViewPublish() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n5google/streetview/publish/v1/streetvie"
          + "w_publish.proto\022\034google.streetview.publi"
          + "sh.v1\032\034google/api/annotations.proto\032\033goo"
          + "gle/protobuf/empty.proto\032,google/streetv"
          + "iew/publish/v1/resources.proto\032.google/s"
          + "treetview/publish/v1/rpcmessages.proto2\213"
          + "\n\n\030StreetViewPublishService\022p\n\013StartUplo"
          + "ad\022\026.google.protobuf.Empty\032\'.google.stre"
          + "etview.publish.v1.UploadRef\" \202\323\344\223\002\032\"\025/v1"
          + "/photo:startUpload:\001*\022~\n\013CreatePhoto\0220.g"
          + "oogle.streetview.publish.v1.CreatePhotoR"
          + "equest\032#.google.streetview.publish.v1.Ph"
          + "oto\"\030\202\323\344\223\002\022\"\t/v1/photo:\005photo\022|\n\010GetPhot"
          + "o\022-.google.streetview.publish.v1.GetPhot"
          + "oRequest\032#.google.streetview.publish.v1."
          + "Photo\"\034\202\323\344\223\002\026\022\024/v1/photo/{photo_id}\022\230\001\n\016"
          + "BatchGetPhotos\0223.google.streetview.publi"
          + "sh.v1.BatchGetPhotosRequest\0324.google.str"
          + "eetview.publish.v1.BatchGetPhotosRespons"
          + "e\"\033\202\323\344\223\002\025\022\023/v1/photos:batchGet\022\203\001\n\nListP"
          + "hotos\022/.google.streetview.publish.v1.Lis"
          + "tPhotosRequest\0320.google.streetview.publi"
          + "sh.v1.ListPhotosResponse\"\022\202\323\344\223\002\014\022\n/v1/ph"
          + "otos\022\222\001\n\013UpdatePhoto\0220.google.streetview"
          + ".publish.v1.UpdatePhotoRequest\032#.google."
          + "streetview.publish.v1.Photo\",\202\323\344\223\002&\032\035/v1"
          + "/photo/{photo.photo_id.id}:\005photo\022\247\001\n\021Ba"
          + "tchUpdatePhotos\0226.google.streetview.publ"
          + "ish.v1.BatchUpdatePhotosRequest\0327.google"
          + ".streetview.publish.v1.BatchUpdatePhotos"
          + "Response\"!\202\323\344\223\002\033\"\026/v1/photos:batchUpdate"
          + ":\001*\022u\n\013DeletePhoto\0220.google.streetview.p"
          + "ublish.v1.DeletePhotoRequest\032\026.google.pr"
          + "otobuf.Empty\"\034\202\323\344\223\002\026*\024/v1/photo/{photo_i"
          + "d}\022\247\001\n\021BatchDeletePhotos\0226.google.street"
          + "view.publish.v1.BatchDeletePhotosRequest"
          + "\0327.google.streetview.publish.v1.BatchDel"
          + "etePhotosResponse\"!\202\323\344\223\002\033\"\026/v1/photos:ba"
          + "tchDelete:\001*B\202\001\n(com.google.geo.ugc.stre"
          + "etview.publish.v1B\021StreetViewPublishZCgo"
          + "ogle.golang.org/genproto/googleapis/stre"
          + "etview/publish/v1;publishb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
        descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.protobuf.EmptyProto.getDescriptor(),
          com.google.geo.ugc.streetview.publish.v1.StreetViewPublishResources.getDescriptor(),
          com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.getDescriptor(),
        },
        assigner);
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.geo.ugc.streetview.publish.v1.StreetViewPublishResources.getDescriptor();
    com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
