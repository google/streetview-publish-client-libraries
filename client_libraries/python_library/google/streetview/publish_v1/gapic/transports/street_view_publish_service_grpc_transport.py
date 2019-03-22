# -*- coding: utf-8 -*-
#
# Copyright 2019 Google LLC
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#     https://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.

import google.api_core.grpc_helpers

from google.streetview.publish_v1.proto import streetview_publish_pb2_grpc


class StreetViewPublishServiceGrpcTransport(object):
    """gRPC transport class providing stubs for
    google.streetview.publish.v1 StreetViewPublishService API.

    The transport provides access to the raw gRPC stubs,
    which can be used to take advantage of advanced
    features of gRPC.
    """
    # The scopes needed to make gRPC calls to all of the methods defined
    # in this service.
    _OAUTH_SCOPES = ('https://www.googleapis.com/auth/streetviewpublish', )

    def __init__(self,
                 channel=None,
                 credentials=None,
                 address='streetviewpublish.googleapis.com:443'):
        """Instantiate the transport class.

        Args:
            channel (grpc.Channel): A ``Channel`` instance through
                which to make calls. This argument is mutually exclusive
                with ``credentials``; providing both will raise an exception.
            credentials (google.auth.credentials.Credentials): The
                authorization credentials to attach to requests. These
                credentials identify this application to the service. If none
                are specified, the client will attempt to ascertain the
                credentials from the environment.
            address (str): The address where the service is hosted.
        """
        # If both `channel` and `credentials` are specified, raise an
        # exception (channels come with credentials baked in already).
        if channel is not None and credentials is not None:
            raise ValueError(
                'The `channel` and `credentials` arguments are mutually '
                'exclusive.', )

        # Create the channel.
        if channel is None:
            channel = self.create_channel(
                address=address,
                credentials=credentials,
            )

        self._channel = channel

        # gRPC uses objects called "stubs" that are bound to the
        # channel and provide a basic method for each RPC.
        self._stubs = {
            'street_view_publish_service_stub':
            streetview_publish_pb2_grpc.StreetViewPublishServiceStub(channel),
        }

    @classmethod
    def create_channel(cls,
                       address='streetviewpublish.googleapis.com:443',
                       credentials=None):
        """Create and return a gRPC channel object.

        Args:
            address (str): The host for the channel to use.
            credentials (~.Credentials): The
                authorization credentials to attach to requests. These
                credentials identify this application to the service. If
                none are specified, the client will attempt to ascertain
                the credentials from the environment.

        Returns:
            grpc.Channel: A gRPC channel object.
        """
        return google.api_core.grpc_helpers.create_channel(
            address,
            credentials=credentials,
            scopes=cls._OAUTH_SCOPES,
        )

    @property
    def channel(self):
        """The gRPC channel used by the transport.

        Returns:
            grpc.Channel: A gRPC channel object.
        """
        return self._channel

    @property
    def start_upload(self):
        """Return the gRPC stub for :meth:`StreetViewPublishServiceClient.start_upload`.

        Creates an upload session to start uploading photo bytes. The method
        uses the upload URL of the returned ``UploadRef`` to upload the bytes
        for the ``Photo``.

        In addition to the photo requirements shown in
        https://support.google.com/maps/answer/7012050?hl=en&ref\_topic=6275604,
        the photo must meet the following requirements:

        -  Photo Sphere XMP metadata must be included in the photo medadata. See
           https://developers.google.com/streetview/spherical-metadata for the
           required fields.
        -  The pixel size of the photo must meet the size requirements listed in
           https://support.google.com/maps/answer/7012050?hl=en&ref\_topic=6275604,
           and the photo must be a full 360 horizontally.

        After the upload completes, the method uses ``UploadRef`` with
        ``CreatePhoto`` to create the ``Photo`` object entry.

        Returns:
            Callable: A callable which accepts the appropriate
                deserialized request object and returns a
                deserialized response object.
        """
        return self._stubs['street_view_publish_service_stub'].StartUpload

    @property
    def create_photo(self):
        """Return the gRPC stub for :meth:`StreetViewPublishServiceClient.create_photo`.

        After the client finishes uploading the photo with the returned
        ``UploadRef``, ``CreatePhoto`` publishes the uploaded ``Photo`` to
        Street View on Google Maps.

        Currently, the only way to set heading, pitch, and roll in CreatePhoto
        is through the `Photo Sphere XMP
        metadata <https://developers.google.com/streetview/spherical-metadata>`__
        in the photo bytes. CreatePhoto ignores the ``pose.heading``,
        ``pose.pitch``, ``pose.roll``, ``pose.altitude``, and ``pose.level``
        fields in Pose.

        This method returns the following error codes:

        -  ``google.rpc.Code.INVALID_ARGUMENT`` if the request is malformed or
           if the uploaded photo is not a 360 photo.
        -  ``google.rpc.Code.NOT_FOUND`` if the upload reference does not exist.
        -  ``google.rpc.Code.RESOURCE_EXHAUSTED`` if the account has reached the
           storage limit.

        Returns:
            Callable: A callable which accepts the appropriate
                deserialized request object and returns a
                deserialized response object.
        """
        return self._stubs['street_view_publish_service_stub'].CreatePhoto

    @property
    def get_photo(self):
        """Return the gRPC stub for :meth:`StreetViewPublishServiceClient.get_photo`.

        Gets the metadata of the specified ``Photo``.

        This method returns the following error codes:

        -  ``google.rpc.Code.PERMISSION_DENIED`` if the requesting user did not
           create the requested ``Photo``.
        -  ``google.rpc.Code.NOT_FOUND`` if the requested ``Photo`` does not
           exist.
        -  ``google.rpc.Code.UNAVAILABLE`` if the requested ``Photo`` is still
           being indexed.

        Returns:
            Callable: A callable which accepts the appropriate
                deserialized request object and returns a
                deserialized response object.
        """
        return self._stubs['street_view_publish_service_stub'].GetPhoto

    @property
    def batch_get_photos(self):
        """Return the gRPC stub for :meth:`StreetViewPublishServiceClient.batch_get_photos`.

        Gets the metadata of the specified ``Photo`` batch.

        Note that if ``BatchGetPhotos`` fails, either critical fields are
        missing or there is an authentication error. Even if ``BatchGetPhotos``
        succeeds, individual photos in the batch may have failures. These
        failures are specified in each ``PhotoResponse.status`` in
        ``BatchGetPhotosResponse.results``. See ``GetPhoto`` for specific
        failures that can occur per photo.

        Returns:
            Callable: A callable which accepts the appropriate
                deserialized request object and returns a
                deserialized response object.
        """
        return self._stubs['street_view_publish_service_stub'].BatchGetPhotos

    @property
    def list_photos(self):
        """Return the gRPC stub for :meth:`StreetViewPublishServiceClient.list_photos`.

        Lists all the ``Photos`` that belong to the user.

        .. raw:: html

           <aside class="note">

        Note: Recently created photos that are still being indexed are not
        returned in the response.

        .. raw:: html

           </aside>

        Returns:
            Callable: A callable which accepts the appropriate
                deserialized request object and returns a
                deserialized response object.
        """
        return self._stubs['street_view_publish_service_stub'].ListPhotos

    @property
    def update_photo(self):
        """Return the gRPC stub for :meth:`StreetViewPublishServiceClient.update_photo`.

        Updates the metadata of a ``Photo``, such as pose, place association,
        connections, etc. Changing the pixels of a photo is not supported.

        Only the fields specified in the ``updateMask`` field are used. If
        ``updateMask`` is not present, the update applies to all fields.

        This method returns the following error codes:

        -  ``google.rpc.Code.PERMISSION_DENIED`` if the requesting user did not
           create the requested photo.
        -  ``google.rpc.Code.INVALID_ARGUMENT`` if the request is malformed.
        -  ``google.rpc.Code.NOT_FOUND`` if the requested photo does not exist.
        -  ``google.rpc.Code.UNAVAILABLE`` if the requested ``Photo`` is still
           being indexed.

        Returns:
            Callable: A callable which accepts the appropriate
                deserialized request object and returns a
                deserialized response object.
        """
        return self._stubs['street_view_publish_service_stub'].UpdatePhoto

    @property
    def batch_update_photos(self):
        """Return the gRPC stub for :meth:`StreetViewPublishServiceClient.batch_update_photos`.

        Updates the metadata of ``Photos``, such as pose, place association,
        connections, etc. Changing the pixels of photos is not supported.

        Note that if ``BatchUpdatePhotos`` fails, either critical fields are
        missing or there is an authentication error. Even if
        ``BatchUpdatePhotos`` succeeds, individual photos in the batch may have
        failures. These failures are specified in each ``PhotoResponse.status``
        in ``BatchUpdatePhotosResponse.results``. See ``UpdatePhoto`` for
        specific failures that can occur per photo.

        Only the fields specified in ``updateMask`` field are used. If
        ``updateMask`` is not present, the update applies to all fields.

        The number of ``UpdatePhotoRequest`` messages in a
        ``BatchUpdatePhotosRequest`` must not exceed 20.

        .. raw:: html

           <aside class="note">

        Note: To update ``Pose.altitude``, ``Pose.latLngPair`` has to be filled
        as well. Otherwise, the request will fail.

        .. raw:: html

           </aside>

        Returns:
            Callable: A callable which accepts the appropriate
                deserialized request object and returns a
                deserialized response object.
        """
        return self._stubs[
            'street_view_publish_service_stub'].BatchUpdatePhotos

    @property
    def delete_photo(self):
        """Return the gRPC stub for :meth:`StreetViewPublishServiceClient.delete_photo`.

        Deletes a ``Photo`` and its metadata.

        This method returns the following error codes:

        -  ``google.rpc.Code.PERMISSION_DENIED`` if the requesting user did not
           create the requested photo.
        -  ``google.rpc.Code.NOT_FOUND`` if the photo ID does not exist.

        Returns:
            Callable: A callable which accepts the appropriate
                deserialized request object and returns a
                deserialized response object.
        """
        return self._stubs['street_view_publish_service_stub'].DeletePhoto

    @property
    def batch_delete_photos(self):
        """Return the gRPC stub for :meth:`StreetViewPublishServiceClient.batch_delete_photos`.

        Deletes a list of ``Photos`` and their metadata.

        Note that if ``BatchDeletePhotos`` fails, either critical fields are
        missing or there was an authentication error. Even if
        ``BatchDeletePhotos`` succeeds, individual photos in the batch may have
        failures. These failures are specified in each ``PhotoResponse.status``
        in ``BatchDeletePhotosResponse.results``. See ``DeletePhoto`` for
        specific failures that can occur per photo.

        Returns:
            Callable: A callable which accepts the appropriate
                deserialized request object and returns a
                deserialized response object.
        """
        return self._stubs[
            'street_view_publish_service_stub'].BatchDeletePhotos
