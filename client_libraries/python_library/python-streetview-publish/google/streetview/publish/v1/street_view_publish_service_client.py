from google.proto.streetview.publish.v1 import streetview_publish_pb2

# Copyright 2017, Google Inc. All rights reserved.
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
#
# EDITING INSTRUCTIONS
# This file was generated from the file
# https://github.com/google/googleapis/blob/master/google/streetview/publish/v1/streetview_publish.proto,
# and updates to that file get reflected here through a refresh process.
# For the short term, the refresh process will only be runnable by Google engineers.
#
# The only allowed edits are to method and file documentation. A 3-way
# merge preserves those additions if the generated source changes.
"""Accesses the google.streetview.publish.v1 StreetViewPublishService API."""

import collections
import json
import os
import pkg_resources
import platform

from google.gax import api_callable
from google.gax import config
from google.gax import path_template
import google.gax

from google.proto.streetview.publish.v1 import resources_pb2
from google.proto.streetview.publish.v1 import rpcmessages_pb2
from google.protobuf import empty_pb2
from google.protobuf import field_mask_pb2
from google.streetview.publish.v1 import enums

_PageDesc = google.gax.PageDescriptor


class StreetViewPublishServiceClient(object):
    """Publishes and connects user-contributed photos on Street View."""

    SERVICE_ADDRESS = 'streetviewpublish.googleapis.com'
    """The default address of the service."""

    DEFAULT_SERVICE_PORT = 443
    """The default port of the service."""

    _PAGE_DESCRIPTORS = {
        'list_photos': _PageDesc('page_token', 'next_page_token', 'photos')
    }

    # The scopes needed to make gRPC calls to all of the methods defined in
    # this service
    _ALL_SCOPES = ('https://www.googleapis.com/auth/streetviewpublish', )

    def __init__(self,
                 service_path=SERVICE_ADDRESS,
                 port=DEFAULT_SERVICE_PORT,
                 channel=None,
                 credentials=None,
                 ssl_credentials=None,
                 scopes=None,
                 client_config=None,
                 app_name=None,
                 app_version='',
                 lib_name=None,
                 lib_version='',
                 metrics_headers=()):
        """Constructor.

        Args:
          service_path (string): The domain name of the API remote host.
          port (int): The port on which to connect to the remote host.
          channel (:class:`grpc.Channel`): A ``Channel`` instance through
            which to make calls.
          credentials (object): The authorization credentials to attach to
            requests. These credentials identify this application to the
            service.
          ssl_credentials (:class:`grpc.ChannelCredentials`): A
            ``ChannelCredentials`` instance for use with an SSL-enabled
            channel.
          scopes (list[string]): A list of OAuth2 scopes to attach to requests.
          client_config (dict):
            A dictionary for call options for each method. See
            :func:`google.gax.construct_settings` for the structure of
            this data. Falls back to the default config if not specified
            or the specified config is missing data points.
          app_name (string): The name of the application calling
            the service. Recommended for analytics purposes.
          app_version (string): The version of the application calling
            the service. Recommended for analytics purposes.
          lib_name (string): The API library software used for calling
            the service. (Unless you are writing an API client itself,
            leave this as default.)
          lib_version (string): The API library software version used
            for calling the service. (Unless you are writing an API client
            itself, leave this as default.)
          metrics_headers (dict): A dictionary of values for tracking
            client library metrics. Ultimately serializes to a string
            (e.g. 'foo/1.2.3 bar/3.14.1'). This argument should be
            considered private.

        Returns:
          A StreetViewPublishServiceClient object.
        """
        # Unless the calling application specifically requested
        # OAuth scopes, request everything.
        if scopes is None:
            scopes = self._ALL_SCOPES

        # Initialize an empty client config, if none is set.
        if client_config is None:
            client_config = {}

        # Initialize metrics_headers as an ordered dictionary
        # (cuts down on cardinality of the resulting string slightly).
        metrics_headers = collections.OrderedDict(metrics_headers)
        metrics_headers['gl-python'] = platform.python_version()

        # The library may or may not be set, depending on what is
        # calling this client. Newer client libraries set the library name
        # and version.
        if lib_name:
            metrics_headers[lib_name] = lib_version

        # Finally, track the GAPIC package version.
        metrics_headers['gapic'] = pkg_resources.get_distribution(
            'gapic-google-maps-streetview_publish-v1', ).version

        # Load the configuration defaults.
        default_client_config = json.loads(
            pkg_resources.resource_string(
                __name__, 'street_view_publish_service_client_config.json')
            .decode())
        defaults = api_callable.construct_settings(
            'google.streetview.publish.v1.StreetViewPublishService',
            default_client_config,
            client_config,
            config.STATUS_CODE_NAMES,
            metrics_headers=metrics_headers,
            page_descriptors=self._PAGE_DESCRIPTORS, )
        self.street_view_publish_service_stub = config.create_stub(
            streetview_publish_pb2.StreetViewPublishServiceStub,
            channel=channel,
            service_path=service_path,
            service_port=port,
            credentials=credentials,
            scopes=scopes,
            ssl_credentials=ssl_credentials)

        self._start_upload = api_callable.create_api_call(
            self.street_view_publish_service_stub.StartUpload,
            settings=defaults['start_upload'])
        self._create_photo = api_callable.create_api_call(
            self.street_view_publish_service_stub.CreatePhoto,
            settings=defaults['create_photo'])
        self._get_photo = api_callable.create_api_call(
            self.street_view_publish_service_stub.GetPhoto,
            settings=defaults['get_photo'])
        self._batch_get_photos = api_callable.create_api_call(
            self.street_view_publish_service_stub.BatchGetPhotos,
            settings=defaults['batch_get_photos'])
        self._list_photos = api_callable.create_api_call(
            self.street_view_publish_service_stub.ListPhotos,
            settings=defaults['list_photos'])
        self._update_photo = api_callable.create_api_call(
            self.street_view_publish_service_stub.UpdatePhoto,
            settings=defaults['update_photo'])
        self._batch_update_photos = api_callable.create_api_call(
            self.street_view_publish_service_stub.BatchUpdatePhotos,
            settings=defaults['batch_update_photos'])
        self._delete_photo = api_callable.create_api_call(
            self.street_view_publish_service_stub.DeletePhoto,
            settings=defaults['delete_photo'])
        self._batch_delete_photos = api_callable.create_api_call(
            self.street_view_publish_service_stub.BatchDeletePhotos,
            settings=defaults['batch_delete_photos'])

    # Service calls
    def start_upload(self, options=None):
        """
        Creates an upload session to start uploading photo data. The upload URL of
        the returned ``UploadRef`` is used to upload the data for the photo.

        After the upload is complete, the ``UploadRef`` is used with
        ``StreetViewPublishService:CreatePhoto()`` to create the ``Photo`` object
        entry.

        Example:
          >>> from google.streetview.publish.v1 import street_view_publish_service_client
          >>> client = street_view_publish_service_client.StreetViewPublishServiceClient()
          >>> response = client.start_upload()

        Args:
          options (:class:`google.gax.CallOptions`): Overrides the default
            settings for this call, e.g, timeout, retries etc.

        Returns:
          A :class:`google.proto.streetview.publish.v1.resources_pb2.UploadRef` instance.

        Raises:
          :exc:`google.gax.errors.GaxError` if the RPC is aborted.
        """
        request = empty_pb2.Empty()
        return self._start_upload(request, options)

    def create_photo(self, photo, options=None):
        """
        After the client finishes uploading the photo with the returned
        ``UploadRef``, ``photo.create`` publishes the uploaded photo to Street View on
        Google Maps.

        This method returns the following error codes:

        * ``INVALID_ARGUMENT`` if the request is malformed.
        * ``NOT_FOUND`` if the upload reference does not exist.

        Example:
          >>> from google.streetview.publish.v1 import street_view_publish_service_client
          >>> from google.proto.streetview.publish.v1 import resources_pb2
          >>> client = street_view_publish_service_client.StreetViewPublishServiceClient()
          >>> photo = resources_pb2.Photo()
          >>> response = client.create_photo(photo)

        Args:
          photo (:class:`google.proto.streetview.publish.v1.resources_pb2.Photo`): Required. Photo to create.
          options (:class:`google.gax.CallOptions`): Overrides the default
            settings for this call, e.g, timeout, retries etc.

        Returns:
          A :class:`google.proto.streetview.publish.v1.resources_pb2.Photo` instance.

        Raises:
          :exc:`google.gax.errors.GaxError` if the RPC is aborted.
          :exc:`ValueError` if the parameters are invalid.
        """
        # Create the request object.
        request = rpcmessages_pb2.CreatePhotoRequest(photo=photo)
        return self._create_photo(request, options)

    def get_photo(self, photo_id, view, options=None):
        """
        Gets the metadata of the specified ``Photo``.

        This method returns the following error codes:

        * ``PERMISSION_DENIED`` if the requesting user did not create the requested
        photo.
        * ``NOT_FOUND`` if the requested photo does not exist.

        Example:
          >>> from google.streetview.publish.v1 import street_view_publish_service_client
          >>> from google.streetview.publish.v1 import enums
          >>> client = street_view_publish_service_client.StreetViewPublishServiceClient()
          >>> photo_id = ''
          >>> view = enums.PhotoView.BASIC
          >>> response = client.get_photo(photo_id, view)

        Args:
          photo_id (string): Required. ID of the photo.
          view (enum :class:`google.streetview.publish.v1.enums.PhotoView`): Specifies if a download URL for the photo bytes should be returned in the
            Photo response.
          options (:class:`google.gax.CallOptions`): Overrides the default
            settings for this call, e.g, timeout, retries etc.

        Returns:
          A :class:`google.proto.streetview.publish.v1.resources_pb2.Photo` instance.

        Raises:
          :exc:`google.gax.errors.GaxError` if the RPC is aborted.
          :exc:`ValueError` if the parameters are invalid.
        """
        # Create the request object.
        request = rpcmessages_pb2.GetPhotoRequest(photo_id=photo_id, view=view)
        return self._get_photo(request, options)

    def batch_get_photos(self, photo_ids, view, options=None):
        """
        Gets the metadata of the specified ``Photo`` batch.

        Note that if ``photos.batchGet`` fails, either critical fields are
        missing or there was an authentication error.
        Even if ``photos.batchGet`` succeeds, there may have been failures
        for single photos in the batch. These failures will be specified in
        ``BatchGetPhotosResponse.results.status``.
        See ``photo.get`` for specific failures that will occur per photo.

        Example:
          >>> from google.streetview.publish.v1 import street_view_publish_service_client
          >>> from google.streetview.publish.v1 import enums
          >>> client = street_view_publish_service_client.StreetViewPublishServiceClient()
          >>> photo_ids = []
          >>> view = enums.PhotoView.BASIC
          >>> response = client.batch_get_photos(photo_ids, view)

        Args:
          photo_ids (list[string]): Required. IDs of the photos.
          view (enum :class:`google.streetview.publish.v1.enums.PhotoView`): Specifies if a download URL for the photo bytes should be returned in the
            Photo response.
          options (:class:`google.gax.CallOptions`): Overrides the default
            settings for this call, e.g, timeout, retries etc.

        Returns:
          A :class:`google.proto.streetview.publish.v1.rpcmessages_pb2.BatchGetPhotosResponse` instance.

        Raises:
          :exc:`google.gax.errors.GaxError` if the RPC is aborted.
          :exc:`ValueError` if the parameters are invalid.
        """
        # Create the request object.
        request = rpcmessages_pb2.BatchGetPhotosRequest(
            photo_ids=photo_ids, view=view)
        return self._batch_get_photos(request, options)

    def list_photos(self, view, filter_, page_size=None, options=None):
        """
        Lists all the photos that belong to the user.

        Example:
          >>> from google.streetview.publish.v1 import street_view_publish_service_client
          >>> from google.streetview.publish.v1 import enums
          >>> from google.gax import CallOptions, INITIAL_PAGE
          >>> client = street_view_publish_service_client.StreetViewPublishServiceClient()
          >>> view = enums.PhotoView.BASIC
          >>> filter_ = ''
          >>>
          >>> # Iterate over all results
          >>> for element in client.list_photos(view, filter_):
          >>>     # process element
          >>>     pass
          >>>
          >>> # Or iterate over results one page at a time
          >>> for page in client.list_photos(view, filter_, options=CallOptions(page_token=INITIAL_PAGE)):
          >>>     for element in page:
          >>>         # process element
          >>>         pass

        Args:
          view (enum :class:`google.streetview.publish.v1.enums.PhotoView`): Specifies if a download URL for the photos bytes should be returned in the
            Photos response.
          filter_ (string): The filter expression.
            Example: ``placeId=ChIJj61dQgK6j4AR4GeTYWZsKWw``
          page_size (int): The maximum number of resources contained in the
            underlying API response. If page streaming is performed per-
            resource, this parameter does not affect the return value. If page
            streaming is performed per-page, this determines the maximum number
            of resources in a page.
          options (:class:`google.gax.CallOptions`): Overrides the default
            settings for this call, e.g, timeout, retries etc.

        Returns:
          A :class:`google.gax.PageIterator` instance. By default, this
          is an iterable of :class:`google.proto.streetview.publish.v1.resources_pb2.Photo` instances.
          This object can also be configured to iterate over the pages
          of the response through the `CallOptions` parameter.

        Raises:
          :exc:`google.gax.errors.GaxError` if the RPC is aborted.
          :exc:`ValueError` if the parameters are invalid.
        """
        # Create the request object.
        request = rpcmessages_pb2.ListPhotosRequest(
            view=view, filter=filter_, page_size=page_size)
        return self._list_photos(request, options)

    def update_photo(self, photo, update_mask, options=None):
        """
        Updates the metadata of a photo, such as pose, place association, etc.
        Changing the pixels of a photo is not supported.

        This method returns the following error codes:

        * ``PERMISSION_DENIED`` if the requesting user did not create the requested
        photo.
        * ``INVALID_ARGUMENT`` if the request is malformed.
        * ``NOT_FOUND`` if the photo ID does not exist.

        Example:
          >>> from google.streetview.publish.v1 import street_view_publish_service_client
          >>> from google.proto.streetview.publish.v1 import resources_pb2
          >>> from google.protobuf import field_mask_pb2
          >>> client = street_view_publish_service_client.StreetViewPublishServiceClient()
          >>> photo = resources_pb2.Photo()
          >>> update_mask = field_mask_pb2.FieldMask()
          >>> response = client.update_photo(photo, update_mask)

        Args:
          photo (:class:`google.proto.streetview.publish.v1.resources_pb2.Photo`): Required. Photo object containing the new metadata. Only the fields
            specified in ``update_mask`` are used. If ``update_mask`` is not present, the
            update applies to all fields.
            **Note:** To update ``pose.altitude``, ``pose.latlngpair`` has to be filled as
            well. Otherwise, the request will fail.
          update_mask (:class:`google.protobuf.field_mask_pb2.FieldMask`): Mask that identifies fields on the photo metadata to update.
            If not present, the old Photo metadata will be entirely replaced with the
            new Photo metadata in this request. The update fails if invalid fields are
            specified. Multiple fields can be specified in a comma-delimited list.

            The following fields are valid:

            * ``pose.heading``
            * ``pose.latlngpair``
            * ``pose.level``
            * ``pose.altitude``
            * ``connections``
            * ``places``


            **Note:** Repeated fields in ``update_mask`` mean the entire set of repeated
            values will be replaced with the new contents. For example, if
            ``UpdatePhotoRequest.photo.update_mask`` contains ``connections`` and
            ``UpdatePhotoRequest.photo.connections`` is empty, all connections will be
            removed.
          options (:class:`google.gax.CallOptions`): Overrides the default
            settings for this call, e.g, timeout, retries etc.

        Returns:
          A :class:`google.proto.streetview.publish.v1.resources_pb2.Photo` instance.

        Raises:
          :exc:`google.gax.errors.GaxError` if the RPC is aborted.
          :exc:`ValueError` if the parameters are invalid.
        """
        # Create the request object.
        request = rpcmessages_pb2.UpdatePhotoRequest(
            photo=photo, update_mask=update_mask)
        return self._update_photo(request, options)

    def batch_update_photos(self, update_photo_requests, options=None):
        """
        Updates the metadata of photos, such as pose, place association, etc.
        Changing the pixels of a photo is not supported.

        Note that if ``photos.batchUpdate`` fails, either critical fields
        are missing or there was an authentication error.
        Even if ``photos.batchUpdate`` succeeds, there may have been
        failures for single photos in the batch. These failures will be specified
        in ``BatchUpdatePhotosResponse.results.status``.
        See ``UpdatePhoto`` for specific failures that will occur per photo.

        Example:
          >>> from google.streetview.publish.v1 import street_view_publish_service_client
          >>> client = street_view_publish_service_client.StreetViewPublishServiceClient()
          >>> update_photo_requests = []
          >>> response = client.batch_update_photos(update_photo_requests)

        Args:
          update_photo_requests (list[:class:`google.proto.streetview.publish.v1.rpcmessages_pb2.UpdatePhotoRequest`]): Required. List of update photo requests.
          options (:class:`google.gax.CallOptions`): Overrides the default
            settings for this call, e.g, timeout, retries etc.

        Returns:
          A :class:`google.proto.streetview.publish.v1.rpcmessages_pb2.BatchUpdatePhotosResponse` instance.

        Raises:
          :exc:`google.gax.errors.GaxError` if the RPC is aborted.
          :exc:`ValueError` if the parameters are invalid.
        """
        # Create the request object.
        request = rpcmessages_pb2.BatchUpdatePhotosRequest(
            update_photo_requests=update_photo_requests)
        return self._batch_update_photos(request, options)

    def delete_photo(self, photo_id, options=None):
        """
        Deletes a photo and its metadata.

        This method returns the following error codes:

        * ``PERMISSION_DENIED`` if the requesting user did not create the requested
        photo.
        * ``NOT_FOUND`` if the photo ID does not exist.

        Example:
          >>> from google.streetview.publish.v1 import street_view_publish_service_client
          >>> client = street_view_publish_service_client.StreetViewPublishServiceClient()
          >>> photo_id = ''
          >>> client.delete_photo(photo_id)

        Args:
          photo_id (string): Required. ID of the photo.
          options (:class:`google.gax.CallOptions`): Overrides the default
            settings for this call, e.g, timeout, retries etc.

        Raises:
          :exc:`google.gax.errors.GaxError` if the RPC is aborted.
          :exc:`ValueError` if the parameters are invalid.
        """
        # Create the request object.
        request = rpcmessages_pb2.DeletePhotoRequest(photo_id=photo_id)
        self._delete_photo(request, options)

    def batch_delete_photos(self, photo_ids, options=None):
        """
        Deletes a list of photos and their metadata.

        Note that if ``photos.batchDelete`` fails, either critical fields
        are missing or there was an authentication error.
        Even if ``photos.batchDelete`` succeeds, there may have been
        failures for single photos in the batch. These failures will be specified
        in ``BatchDeletePhotosResponse.status``.
        See ``photo.update`` for specific failures that will occur per photo.

        Example:
          >>> from google.streetview.publish.v1 import street_view_publish_service_client
          >>> client = street_view_publish_service_client.StreetViewPublishServiceClient()
          >>> photo_ids = []
          >>> response = client.batch_delete_photos(photo_ids)

        Args:
          photo_ids (list[string]): Required. List of delete photo requests.
          options (:class:`google.gax.CallOptions`): Overrides the default
            settings for this call, e.g, timeout, retries etc.

        Returns:
          A :class:`google.proto.streetview.publish.v1.rpcmessages_pb2.BatchDeletePhotosResponse` instance.

        Raises:
          :exc:`google.gax.errors.GaxError` if the RPC is aborted.
          :exc:`ValueError` if the parameters are invalid.
        """
        # Create the request object.
        request = rpcmessages_pb2.BatchDeletePhotosRequest(photo_ids=photo_ids)
        return self._batch_delete_photos(request, options)
