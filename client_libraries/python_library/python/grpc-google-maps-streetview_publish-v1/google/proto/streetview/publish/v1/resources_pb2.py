# Copyright 2017 Google Inc.
# 
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
# 
#     http://www.apache.org/licenses/LICENSE-2.0
# 
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.

# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/proto/streetview/publish/v1/resources.proto

import sys
_b=sys.version_info[0]<3 and (lambda x:x) or (lambda x:x.encode('latin1'))
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
from google.protobuf import descriptor_pb2
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2
from google.type import latlng_pb2 as google_dot_type_dot_latlng__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/proto/streetview/publish/v1/resources.proto',
  package='google.streetview.publish.v1',
  syntax='proto3',
  serialized_pb=_b('\n8google/cloud/proto/streetview/publish/v1/resources.proto\x12\x1cgoogle.streetview.publish.v1\x1a\x1cgoogle/api/annotations.proto\x1a\x1fgoogle/protobuf/timestamp.proto\x1a\x18google/type/latlng.proto\"\x1f\n\tUploadRef\x12\x12\n\nupload_url\x18\x01 \x01(\t\"\x15\n\x07PhotoId\x12\n\n\x02id\x18\x01 \x01(\t\"q\n\x04Pose\x12)\n\x0clat_lng_pair\x18\x01 \x01(\x0b\x32\x13.google.type.LatLng\x12\x10\n\x08\x61ltitude\x18\x02 \x01(\x01\x12\x0f\n\x07heading\x18\x03 \x01(\x01\x12\r\n\x05pitch\x18\x04 \x01(\x01\x12\x0c\n\x04roll\x18\x05 \x01(\x01\"\x19\n\x05Place\x12\x10\n\x08place_id\x18\x01 \x01(\t\"C\n\nConnection\x12\x35\n\x06target\x18\x01 \x01(\x0b\x32%.google.streetview.publish.v1.PhotoId\"\xb0\x03\n\x05Photo\x12\x37\n\x08photo_id\x18\x01 \x01(\x0b\x32%.google.streetview.publish.v1.PhotoId\x12\x41\n\x10upload_reference\x18\x02 \x01(\x0b\x32\'.google.streetview.publish.v1.UploadRef\x12\x14\n\x0c\x64ownload_url\x18\x03 \x01(\t\x12\x15\n\rthumbnail_url\x18\t \x01(\t\x12\x12\n\nshare_link\x18\x0b \x01(\t\x12\x30\n\x04pose\x18\x04 \x01(\x0b\x32\".google.streetview.publish.v1.Pose\x12=\n\x0b\x63onnections\x18\x05 \x03(\x0b\x32(.google.streetview.publish.v1.Connection\x12\x30\n\x0c\x63\x61pture_time\x18\x06 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12\x33\n\x06places\x18\x07 \x03(\x0b\x32#.google.streetview.publish.v1.Place\x12\x12\n\nview_count\x18\n \x01(\x03\x42\x8b\x01\n(com.google.geo.ugc.streetview.publish.v1B\x1aStreetViewPublishResourcesZCgoogle.golang.org/genproto/googleapis/streetview/publish/v1;publishb\x06proto3')
  ,
  dependencies=[google_dot_api_dot_annotations__pb2.DESCRIPTOR,google_dot_protobuf_dot_timestamp__pb2.DESCRIPTOR,google_dot_type_dot_latlng__pb2.DESCRIPTOR,])
_sym_db.RegisterFileDescriptor(DESCRIPTOR)




_UPLOADREF = _descriptor.Descriptor(
  name='UploadRef',
  full_name='google.streetview.publish.v1.UploadRef',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='upload_url', full_name='google.streetview.publish.v1.UploadRef.upload_url', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=179,
  serialized_end=210,
)


_PHOTOID = _descriptor.Descriptor(
  name='PhotoId',
  full_name='google.streetview.publish.v1.PhotoId',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='id', full_name='google.streetview.publish.v1.PhotoId.id', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=212,
  serialized_end=233,
)


_POSE = _descriptor.Descriptor(
  name='Pose',
  full_name='google.streetview.publish.v1.Pose',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='lat_lng_pair', full_name='google.streetview.publish.v1.Pose.lat_lng_pair', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='altitude', full_name='google.streetview.publish.v1.Pose.altitude', index=1,
      number=2, type=1, cpp_type=5, label=1,
      has_default_value=False, default_value=float(0),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='heading', full_name='google.streetview.publish.v1.Pose.heading', index=2,
      number=3, type=1, cpp_type=5, label=1,
      has_default_value=False, default_value=float(0),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='pitch', full_name='google.streetview.publish.v1.Pose.pitch', index=3,
      number=4, type=1, cpp_type=5, label=1,
      has_default_value=False, default_value=float(0),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='roll', full_name='google.streetview.publish.v1.Pose.roll', index=4,
      number=5, type=1, cpp_type=5, label=1,
      has_default_value=False, default_value=float(0),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=235,
  serialized_end=348,
)


_PLACE = _descriptor.Descriptor(
  name='Place',
  full_name='google.streetview.publish.v1.Place',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='place_id', full_name='google.streetview.publish.v1.Place.place_id', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=350,
  serialized_end=375,
)


_CONNECTION = _descriptor.Descriptor(
  name='Connection',
  full_name='google.streetview.publish.v1.Connection',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='target', full_name='google.streetview.publish.v1.Connection.target', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=377,
  serialized_end=444,
)


_PHOTO = _descriptor.Descriptor(
  name='Photo',
  full_name='google.streetview.publish.v1.Photo',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='photo_id', full_name='google.streetview.publish.v1.Photo.photo_id', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='upload_reference', full_name='google.streetview.publish.v1.Photo.upload_reference', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='download_url', full_name='google.streetview.publish.v1.Photo.download_url', index=2,
      number=3, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='thumbnail_url', full_name='google.streetview.publish.v1.Photo.thumbnail_url', index=3,
      number=9, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='share_link', full_name='google.streetview.publish.v1.Photo.share_link', index=4,
      number=11, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='pose', full_name='google.streetview.publish.v1.Photo.pose', index=5,
      number=4, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='connections', full_name='google.streetview.publish.v1.Photo.connections', index=6,
      number=5, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='capture_time', full_name='google.streetview.publish.v1.Photo.capture_time', index=7,
      number=6, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='places', full_name='google.streetview.publish.v1.Photo.places', index=8,
      number=7, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='view_count', full_name='google.streetview.publish.v1.Photo.view_count', index=9,
      number=10, type=3, cpp_type=2, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=447,
  serialized_end=879,
)

_POSE.fields_by_name['lat_lng_pair'].message_type = google_dot_type_dot_latlng__pb2._LATLNG
_CONNECTION.fields_by_name['target'].message_type = _PHOTOID
_PHOTO.fields_by_name['photo_id'].message_type = _PHOTOID
_PHOTO.fields_by_name['upload_reference'].message_type = _UPLOADREF
_PHOTO.fields_by_name['pose'].message_type = _POSE
_PHOTO.fields_by_name['connections'].message_type = _CONNECTION
_PHOTO.fields_by_name['capture_time'].message_type = google_dot_protobuf_dot_timestamp__pb2._TIMESTAMP
_PHOTO.fields_by_name['places'].message_type = _PLACE
DESCRIPTOR.message_types_by_name['UploadRef'] = _UPLOADREF
DESCRIPTOR.message_types_by_name['PhotoId'] = _PHOTOID
DESCRIPTOR.message_types_by_name['Pose'] = _POSE
DESCRIPTOR.message_types_by_name['Place'] = _PLACE
DESCRIPTOR.message_types_by_name['Connection'] = _CONNECTION
DESCRIPTOR.message_types_by_name['Photo'] = _PHOTO

UploadRef = _reflection.GeneratedProtocolMessageType('UploadRef', (_message.Message,), dict(
  DESCRIPTOR = _UPLOADREF,
  __module__ = 'google.proto.streetview.publish.v1.resources_pb2'
  # @@protoc_insertion_point(class_scope:google.streetview.publish.v1.UploadRef)
  ))
_sym_db.RegisterMessage(UploadRef)

PhotoId = _reflection.GeneratedProtocolMessageType('PhotoId', (_message.Message,), dict(
  DESCRIPTOR = _PHOTOID,
  __module__ = 'google.proto.streetview.publish.v1.resources_pb2'
  # @@protoc_insertion_point(class_scope:google.streetview.publish.v1.PhotoId)
  ))
_sym_db.RegisterMessage(PhotoId)

Pose = _reflection.GeneratedProtocolMessageType('Pose', (_message.Message,), dict(
  DESCRIPTOR = _POSE,
  __module__ = 'google.proto.streetview.publish.v1.resources_pb2'
  # @@protoc_insertion_point(class_scope:google.streetview.publish.v1.Pose)
  ))
_sym_db.RegisterMessage(Pose)

Place = _reflection.GeneratedProtocolMessageType('Place', (_message.Message,), dict(
  DESCRIPTOR = _PLACE,
  __module__ = 'google.proto.streetview.publish.v1.resources_pb2'
  # @@protoc_insertion_point(class_scope:google.streetview.publish.v1.Place)
  ))
_sym_db.RegisterMessage(Place)

Connection = _reflection.GeneratedProtocolMessageType('Connection', (_message.Message,), dict(
  DESCRIPTOR = _CONNECTION,
  __module__ = 'google.proto.streetview.publish.v1.resources_pb2'
  # @@protoc_insertion_point(class_scope:google.streetview.publish.v1.Connection)
  ))
_sym_db.RegisterMessage(Connection)

Photo = _reflection.GeneratedProtocolMessageType('Photo', (_message.Message,), dict(
  DESCRIPTOR = _PHOTO,
  __module__ = 'google.proto.streetview.publish.v1.resources_pb2'
  # @@protoc_insertion_point(class_scope:google.streetview.publish.v1.Photo)
  ))
_sym_db.RegisterMessage(Photo)


DESCRIPTOR.has_options = True
DESCRIPTOR._options = _descriptor._ParseOptions(descriptor_pb2.FileOptions(), _b('\n(com.google.geo.ugc.streetview.publish.v1B\032StreetViewPublishResourcesZCgoogle.golang.org/genproto/googleapis/streetview/publish/v1;publish'))
try:
  # THESE ELEMENTS WILL BE DEPRECATED.
  # Please use the generated *_pb2_grpc.py files instead.
  import grpc
  from grpc.beta import implementations as beta_implementations
  from grpc.beta import interfaces as beta_interfaces
  from grpc.framework.common import cardinality
  from grpc.framework.interfaces.face import utilities as face_utilities
except ImportError:
  pass
# @@protoc_insertion_point(module_scope)