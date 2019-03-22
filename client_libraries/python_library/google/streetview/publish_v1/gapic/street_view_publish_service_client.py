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
"""Accesses the google.streetview.publish.v1 StreetViewPublishService API."""

import functools
import pkg_resources
import warnings

from google.oauth2 import service_account
import google.api_core.gapic_v1.client_info
import google.api_core.gapic_v1.config
import google.api_core.gapic_v1.method
import google.api_core.grpc_helpers
import google.api_core.page_iterator
import grpc

from google.protobuf import empty_pb2
from google.protobuf import field_mask_pb2
from google.streetview.publish_v1.gapic import enums
from google.streetview.publish_v1.gapic import street_view_publish_service_client_config
from google.streetview.publish_v1.gapic.transports import street_view_publish_service_grpc_transport
from google.streetview.publish_v1.proto import resources_pb2
from google.streetview.publish_v1.proto import rpcmessages_pb2
from google.streetview.publish_v1.proto import streetview_publish_pb2_grpc

_GAPIC_LIBRARY_VERSION = pkg_resources.get_distribution(
    'gapic-google-maps-streetview_publish-v1', ).version


class StreetViewPublishServiceClient(object):
    """Publishes and connects user-contributed photos on Street View."""

    SERVICE_ADDRESS = 'streetviewpublish.googleapis.com:443'
    """The default address of the service."""

    # The name of the interface for this client. This is the key used to
    # find the method configuration in the client_config dictionary.
    _INTERFACE_NAME = 'google.streetview.publish.v1.StreetViewPublishService'

    @classmethod
    def from_service_account_file(cls, filename, *args, **kwargs):
        """Creates an instance of this client using the provided credentials
        file.

        Args:
            filename (str): The path to the service account private key json
                file.
            args: Additional arguments to pass to the constructor.
            kwargs: Additional arguments to pass to the constructor.

        Returns:
            StreetViewPublishServiceClient: The constructed client.
        """
        credentials = service_account.Credentials.from_service_account_file(
            filename)
        kwargs['credentials'] = credentials
        return cls(*args, **kwargs)

    from_service_account_json = from_service_account_file

    def __init__(self,
                 transport=None,
                 channel=None,
                 credentials=None,
                 client_config=None,
                 client_info=None):
        """Constructor.

        Args:
            transport (Union[~.StreetViewPublishServiceGrpcTransport,
                    Callable[[~.Credentials, type], ~.StreetViewPublishServiceGrpcTransport]): A transport
                instance, responsible for actually making the API calls.
                The default transport uses the gRPC protocol.
                This argument may also be a callable which returns a
                transport instance. Callables will be sent the credentials
                as the first argument and the default transport class as
                the second argument.
            channel (grpc.Channel): DEPRECATED. A ``Channel`` instance
                through which to make calls. This argument is mutually exclusive
                with ``credentials``; providing both will raise an exception.
            credentials (google.auth.credentials.Credentials): The
                authorization credentials to attach to requests. These
                credentials identify this application to the service. If none
                are specified, the client will attempt to ascertain the
                credentials from the environment.
                This argument is mutually exclusive with providing a
                transport instance to ``transport``; doing so will raise
                an exception.
            client_config (dict): DEPRECATED. A dictionary of call options for
                each method. If not specified, the default configuration is used.
            client_info (google.api_core.gapic_v1.client_info.ClientInfo):
                The client info used to send a user-agent string along with
                API requests. If ``None``, then default info will be used.
                Generally, you only need to set this if you're developing
                your own client library.
        """
        # Raise deprecation warnings for things we want to go away.
        if client_config is not None:
            warnings.warn(
                'The `client_config` argument is deprecated.',
                PendingDeprecationWarning,
                stacklevel=2)
        else:
            client_config = street_view_publish_service_client_config.config

        if channel:
            warnings.warn(
                'The `channel` argument is deprecated; use '
                '`transport` instead.',
                PendingDeprecationWarning,
                stacklevel=2)

        # Instantiate the transport.
        # The transport is responsible for handling serialization and
        # deserialization and actually sending data to the service.
        if transport:
            if callable(transport):
                self.transport = transport(
                    credentials=credentials,
                    default_class=street_view_publish_service_grpc_transport.
                    StreetViewPublishServiceGrpcTransport,
                )
            else:
                if credentials:
                    raise ValueError(
                        'Received both a transport instance and '
                        'credentials; these are mutually exclusive.')
                self.transport = transport
        else:
            self.transport = street_view_publish_service_grpc_transport.StreetViewPublishServiceGrpcTransport(
                address=self.SERVICE_ADDRESS,
                channel=channel,
                credentials=credentials,
            )

        if client_info is None:
            client_info = google.api_core.gapic_v1.client_info.ClientInfo(
                gapic_version=_GAPIC_LIBRARY_VERSION, )
        else:
            client_info.gapic_version = _GAPIC_LIBRARY_VERSION
        self._client_info = client_info

        # Parse out the default settings for retry and timeout for each RPC
        # from the client configuration.
        # (Ordinarily, these are the defaults specified in the `*_config.py`
        # file next to this one.)
        self._method_configs = google.api_core.gapic_v1.config.parse_method_configs(
            client_config['interfaces'][self._INTERFACE_NAME], )

        # Save a dictionary of cached API call functions.
        # These are the actual callables which invoke the proper
        # transport methods, wrapped with `wrap_method` to add retry,
        # timeout, and the like.
        self._inner_api_calls = {}

    # Service calls
    def start_upload(self,
                     retry=google.api_core.gapic_v1.method.DEFAULT,
                     timeout=google.api_core.gapic_v1.method.DEFAULT,
                     metadata=None):
        """
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

        Example:
            >>> from google.streetview import publish_v1
            >>>
            >>> client = publish_v1.StreetViewPublishServiceClient()
            >>>
            >>> response = client.start_upload()

        Args:
            retry (Optional[google.api_core.retry.Retry]):  A retry object used
                to retry requests. If ``None`` is specified, requests will not
                be retried.
            timeout (Optional[float]): The amount of time, in seconds, to wait
                for the request to complete. Note that if ``retry`` is
                specified, the timeout applies to each individual attempt.
            metadata (Optional[Sequence[Tuple[str, str]]]): Additional metadata
                that is provided to the method.

        Returns:
            A :class:`~google.streetview.publish_v1.types.UploadRef` instance.

        Raises:
            google.api_core.exceptions.GoogleAPICallError: If the request
                    failed for any reason.
            google.api_core.exceptions.RetryError: If the request failed due
                    to a retryable error and retry attempts failed.
        """
        # Wrap the transport method to add retry and timeout logic.
        if 'start_upload' not in self._inner_api_calls:
            self._inner_api_calls[
                'start_upload'] = google.api_core.gapic_v1.method.wrap_method(
                    self.transport.start_upload,
                    default_retry=self._method_configs['StartUpload'].retry,
                    default_timeout=self._method_configs['StartUpload'].
                    timeout,
                    client_info=self._client_info,
                )

        request = empty_pb2.Empty()
        return self._inner_api_calls['start_upload'](
            request, retry=retry, timeout=timeout, metadata=metadata)

    def create_photo(self,
                     photo,
                     retry=google.api_core.gapic_v1.method.DEFAULT,
                     timeout=google.api_core.gapic_v1.method.DEFAULT,
                     metadata=None):
        """
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

        Example:
            >>> from google.streetview import publish_v1
            >>>
            >>> client = publish_v1.StreetViewPublishServiceClient()
            >>>
            >>> # TODO: Initialize `photo`:
            >>> photo = {}
            >>>
            >>> response = client.create_photo(photo)

        Args:
            photo (Union[dict, ~google.streetview.publish_v1.types.Photo]): Required. Photo to create.

                If a dict is provided, it must be of the same form as the protobuf
                message :class:`~google.streetview.publish_v1.types.Photo`
            retry (Optional[google.api_core.retry.Retry]):  A retry object used
                to retry requests. If ``None`` is specified, requests will not
                be retried.
            timeout (Optional[float]): The amount of time, in seconds, to wait
                for the request to complete. Note that if ``retry`` is
                specified, the timeout applies to each individual attempt.
            metadata (Optional[Sequence[Tuple[str, str]]]): Additional metadata
                that is provided to the method.

        Returns:
            A :class:`~google.streetview.publish_v1.types.Photo` instance.

        Raises:
            google.api_core.exceptions.GoogleAPICallError: If the request
                    failed for any reason.
            google.api_core.exceptions.RetryError: If the request failed due
                    to a retryable error and retry attempts failed.
            ValueError: If the parameters are invalid.
        """
        # Wrap the transport method to add retry and timeout logic.
        if 'create_photo' not in self._inner_api_calls:
            self._inner_api_calls[
                'create_photo'] = google.api_core.gapic_v1.method.wrap_method(
                    self.transport.create_photo,
                    default_retry=self._method_configs['CreatePhoto'].retry,
                    default_timeout=self._method_configs['CreatePhoto'].
                    timeout,
                    client_info=self._client_info,
                )

        request = rpcmessages_pb2.CreatePhotoRequest(photo=photo, )
        return self._inner_api_calls['create_photo'](
            request, retry=retry, timeout=timeout, metadata=metadata)

    def get_photo(self,
                  photo_id,
                  view,
                  language_code=None,
                  retry=google.api_core.gapic_v1.method.DEFAULT,
                  timeout=google.api_core.gapic_v1.method.DEFAULT,
                  metadata=None):
        """
        Gets the metadata of the specified ``Photo``.

        This method returns the following error codes:

        -  ``google.rpc.Code.PERMISSION_DENIED`` if the requesting user did not
           create the requested ``Photo``.
        -  ``google.rpc.Code.NOT_FOUND`` if the requested ``Photo`` does not
           exist.
        -  ``google.rpc.Code.UNAVAILABLE`` if the requested ``Photo`` is still
           being indexed.

        Example:
            >>> from google.streetview import publish_v1
            >>> from google.streetview.publish_v1 import enums
            >>>
            >>> client = publish_v1.StreetViewPublishServiceClient()
            >>>
            >>> # TODO: Initialize `photo_id`:
            >>> photo_id = ''
            >>>
            >>> # TODO: Initialize `view`:
            >>> view = enums.PhotoView.BASIC
            >>>
            >>> response = client.get_photo(photo_id, view)

        Args:
            photo_id (str): Required. ID of the ``Photo``.
            view (~google.streetview.publish_v1.types.PhotoView): Specifies if a download URL for the photo bytes should be returned in
                the ``Photo`` response.
            language_code (str): The BCP-47 language code, such as "en-US" or "sr-Latn". For more
                information, see
                http://www.unicode.org/reports/tr35/#Unicode\_locale\_identifier. If
                language\_code is unspecified, the user's language preference for Google
                services is used.
            retry (Optional[google.api_core.retry.Retry]):  A retry object used
                to retry requests. If ``None`` is specified, requests will not
                be retried.
            timeout (Optional[float]): The amount of time, in seconds, to wait
                for the request to complete. Note that if ``retry`` is
                specified, the timeout applies to each individual attempt.
            metadata (Optional[Sequence[Tuple[str, str]]]): Additional metadata
                that is provided to the method.

        Returns:
            A :class:`~google.streetview.publish_v1.types.Photo` instance.

        Raises:
            google.api_core.exceptions.GoogleAPICallError: If the request
                    failed for any reason.
            google.api_core.exceptions.RetryError: If the request failed due
                    to a retryable error and retry attempts failed.
            ValueError: If the parameters are invalid.
        """
        # Wrap the transport method to add retry and timeout logic.
        if 'get_photo' not in self._inner_api_calls:
            self._inner_api_calls[
                'get_photo'] = google.api_core.gapic_v1.method.wrap_method(
                    self.transport.get_photo,
                    default_retry=self._method_configs['GetPhoto'].retry,
                    default_timeout=self._method_configs['GetPhoto'].timeout,
                    client_info=self._client_info,
                )

        request = rpcmessages_pb2.GetPhotoRequest(
            photo_id=photo_id,
            view=view,
            language_code=language_code,
        )
        return self._inner_api_calls['get_photo'](
            request, retry=retry, timeout=timeout, metadata=metadata)

    def batch_get_photos(self,
                         photo_ids,
                         view,
                         language_code=None,
                         retry=google.api_core.gapic_v1.method.DEFAULT,
                         timeout=google.api_core.gapic_v1.method.DEFAULT,
                         metadata=None):
        """
        Gets the metadata of the specified ``Photo`` batch.

        Note that if ``BatchGetPhotos`` fails, either critical fields are
        missing or there is an authentication error. Even if ``BatchGetPhotos``
        succeeds, individual photos in the batch may have failures. These
        failures are specified in each ``PhotoResponse.status`` in
        ``BatchGetPhotosResponse.results``. See ``GetPhoto`` for specific
        failures that can occur per photo.

        Example:
            >>> from google.streetview import publish_v1
            >>> from google.streetview.publish_v1 import enums
            >>>
            >>> client = publish_v1.StreetViewPublishServiceClient()
            >>>
            >>> # TODO: Initialize `photo_ids`:
            >>> photo_ids = []
            >>>
            >>> # TODO: Initialize `view`:
            >>> view = enums.PhotoView.BASIC
            >>>
            >>> response = client.batch_get_photos(photo_ids, view)

        Args:
            photo_ids (list[str]): Required. IDs of the ``Photos``. HTTP GET requests require the following
                syntax for the URL query parameter:
                ``photoIds=<id1>&photoIds=<id2>&...``.
            view (~google.streetview.publish_v1.types.PhotoView): Specifies if a download URL for the photo bytes should be returned in the
                Photo response.
            language_code (str): The BCP-47 language code, such as "en-US" or "sr-Latn". For more
                information, see
                http://www.unicode.org/reports/tr35/#Unicode\_locale\_identifier. If
                language\_code is unspecified, the user's language preference for Google
                services is used.
            retry (Optional[google.api_core.retry.Retry]):  A retry object used
                to retry requests. If ``None`` is specified, requests will not
                be retried.
            timeout (Optional[float]): The amount of time, in seconds, to wait
                for the request to complete. Note that if ``retry`` is
                specified, the timeout applies to each individual attempt.
            metadata (Optional[Sequence[Tuple[str, str]]]): Additional metadata
                that is provided to the method.

        Returns:
            A :class:`~google.streetview.publish_v1.types.BatchGetPhotosResponse` instance.

        Raises:
            google.api_core.exceptions.GoogleAPICallError: If the request
                    failed for any reason.
            google.api_core.exceptions.RetryError: If the request failed due
                    to a retryable error and retry attempts failed.
            ValueError: If the parameters are invalid.
        """
        # Wrap the transport method to add retry and timeout logic.
        if 'batch_get_photos' not in self._inner_api_calls:
            self._inner_api_calls[
                'batch_get_photos'] = google.api_core.gapic_v1.method.wrap_method(
                    self.transport.batch_get_photos,
                    default_retry=self._method_configs['BatchGetPhotos'].retry,
                    default_timeout=self._method_configs['BatchGetPhotos'].
                    timeout,
                    client_info=self._client_info,
                )

        request = rpcmessages_pb2.BatchGetPhotosRequest(
            photo_ids=photo_ids,
            view=view,
            language_code=language_code,
        )
        return self._inner_api_calls['batch_get_photos'](
            request, retry=retry, timeout=timeout, metadata=metadata)

    def list_photos(self,
                    view,
                    filter_,
                    page_size=None,
                    language_code=None,
                    retry=google.api_core.gapic_v1.method.DEFAULT,
                    timeout=google.api_core.gapic_v1.method.DEFAULT,
                    metadata=None):
        """
        Lists all the ``Photos`` that belong to the user.

        .. raw:: html

           <aside class="note">

        Note: Recently created photos that are still being indexed are not
        returned in the response.

        .. raw:: html

           </aside>

        Example:
            >>> from google.streetview import publish_v1
            >>> from google.streetview.publish_v1 import enums
            >>>
            >>> client = publish_v1.StreetViewPublishServiceClient()
            >>>
            >>> # TODO: Initialize `view`:
            >>> view = enums.PhotoView.BASIC
            >>>
            >>> # TODO: Initialize `filter_`:
            >>> filter_ = ''
            >>>
            >>> # Iterate over all results
            >>> for element in client.list_photos(view, filter_):
            ...     # process element
            ...     pass
            >>>
            >>>
            >>> # Alternatively:
            >>>
            >>> # Iterate over results one page at a time
            >>> for page in client.list_photos(view, filter_).pages:
            ...     for element in page:
            ...         # process element
            ...         pass

        Args:
            view (~google.streetview.publish_v1.types.PhotoView): Specifies if a download URL for the photos bytes should be returned in the
                Photos response.
            filter_ (str): The filter expression. For example:
                ``placeId=ChIJj61dQgK6j4AR4GeTYWZsKWw``.

                The only filter supported at the moment is ``placeId``.
            page_size (int): The maximum number of resources contained in the
                underlying API response. If page streaming is performed per-
                resource, this parameter does not affect the return value. If page
                streaming is performed per-page, this determines the maximum number
                of resources in a page.
            language_code (str): The BCP-47 language code, such as "en-US" or "sr-Latn". For more
                information, see
                http://www.unicode.org/reports/tr35/#Unicode\_locale\_identifier. If
                language\_code is unspecified, the user's language preference for Google
                services is used.
            retry (Optional[google.api_core.retry.Retry]):  A retry object used
                to retry requests. If ``None`` is specified, requests will not
                be retried.
            timeout (Optional[float]): The amount of time, in seconds, to wait
                for the request to complete. Note that if ``retry`` is
                specified, the timeout applies to each individual attempt.
            metadata (Optional[Sequence[Tuple[str, str]]]): Additional metadata
                that is provided to the method.

        Returns:
            A :class:`~google.gax.PageIterator` instance. By default, this
            is an iterable of :class:`~google.streetview.publish_v1.types.Photo` instances.
            This object can also be configured to iterate over the pages
            of the response through the `options` parameter.

        Raises:
            google.api_core.exceptions.GoogleAPICallError: If the request
                    failed for any reason.
            google.api_core.exceptions.RetryError: If the request failed due
                    to a retryable error and retry attempts failed.
            ValueError: If the parameters are invalid.
        """
        # Wrap the transport method to add retry and timeout logic.
        if 'list_photos' not in self._inner_api_calls:
            self._inner_api_calls[
                'list_photos'] = google.api_core.gapic_v1.method.wrap_method(
                    self.transport.list_photos,
                    default_retry=self._method_configs['ListPhotos'].retry,
                    default_timeout=self._method_configs['ListPhotos'].timeout,
                    client_info=self._client_info,
                )

        request = rpcmessages_pb2.ListPhotosRequest(
            view=view,
            filter=filter_,
            page_size=page_size,
            language_code=language_code,
        )
        iterator = google.api_core.page_iterator.GRPCIterator(
            client=None,
            method=functools.partial(
                self._inner_api_calls['list_photos'],
                retry=retry,
                timeout=timeout,
                metadata=metadata),
            request=request,
            items_field='photos',
            request_token_field='page_token',
            response_token_field='next_page_token',
        )
        return iterator

    def update_photo(self,
                     photo,
                     update_mask,
                     retry=google.api_core.gapic_v1.method.DEFAULT,
                     timeout=google.api_core.gapic_v1.method.DEFAULT,
                     metadata=None):
        """
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

        Example:
            >>> from google.streetview import publish_v1
            >>>
            >>> client = publish_v1.StreetViewPublishServiceClient()
            >>>
            >>> # TODO: Initialize `photo`:
            >>> photo = {}
            >>>
            >>> # TODO: Initialize `update_mask`:
            >>> update_mask = {}
            >>>
            >>> response = client.update_photo(photo, update_mask)

        Args:
            photo (Union[dict, ~google.streetview.publish_v1.types.Photo]): Required. ``Photo`` object containing the new metadata.

                If a dict is provided, it must be of the same form as the protobuf
                message :class:`~google.streetview.publish_v1.types.Photo`
            update_mask (Union[dict, ~google.streetview.publish_v1.types.FieldMask]): Mask that identifies fields on the photo metadata to update. If not
                present, the old ``Photo`` metadata is entirely replaced with the new
                ``Photo`` metadata in this request. The update fails if invalid fields
                are specified. Multiple fields can be specified in a comma-delimited
                list.

                The following fields are valid:

                -  ``pose.heading``
                -  ``pose.latLngPair``
                -  ``pose.pitch``
                -  ``pose.roll``
                -  ``pose.level``
                -  ``pose.altitude``
                -  ``connections``
                -  ``places``

                .. raw:: html

                   <aside class="note">

                Note: When ``updateMask`` contains repeated fields, the entire set of
                repeated values get replaced with the new contents. For example, if
                ``updateMask`` contains ``connections`` and
                ``UpdatePhotoRequest.photo.connections`` is empty, all connections are
                removed.

                .. raw:: html

                   </aside>

                If a dict is provided, it must be of the same form as the protobuf
                message :class:`~google.streetview.publish_v1.types.FieldMask`
            retry (Optional[google.api_core.retry.Retry]):  A retry object used
                to retry requests. If ``None`` is specified, requests will not
                be retried.
            timeout (Optional[float]): The amount of time, in seconds, to wait
                for the request to complete. Note that if ``retry`` is
                specified, the timeout applies to each individual attempt.
            metadata (Optional[Sequence[Tuple[str, str]]]): Additional metadata
                that is provided to the method.

        Returns:
            A :class:`~google.streetview.publish_v1.types.Photo` instance.

        Raises:
            google.api_core.exceptions.GoogleAPICallError: If the request
                    failed for any reason.
            google.api_core.exceptions.RetryError: If the request failed due
                    to a retryable error and retry attempts failed.
            ValueError: If the parameters are invalid.
        """
        # Wrap the transport method to add retry and timeout logic.
        if 'update_photo' not in self._inner_api_calls:
            self._inner_api_calls[
                'update_photo'] = google.api_core.gapic_v1.method.wrap_method(
                    self.transport.update_photo,
                    default_retry=self._method_configs['UpdatePhoto'].retry,
                    default_timeout=self._method_configs['UpdatePhoto'].
                    timeout,
                    client_info=self._client_info,
                )

        request = rpcmessages_pb2.UpdatePhotoRequest(
            photo=photo,
            update_mask=update_mask,
        )
        return self._inner_api_calls['update_photo'](
            request, retry=retry, timeout=timeout, metadata=metadata)

    def batch_update_photos(self,
                            update_photo_requests,
                            retry=google.api_core.gapic_v1.method.DEFAULT,
                            timeout=google.api_core.gapic_v1.method.DEFAULT,
                            metadata=None):
        """
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

        Example:
            >>> from google.streetview import publish_v1
            >>>
            >>> client = publish_v1.StreetViewPublishServiceClient()
            >>>
            >>> # TODO: Initialize `update_photo_requests`:
            >>> update_photo_requests = []
            >>>
            >>> response = client.batch_update_photos(update_photo_requests)

        Args:
            update_photo_requests (list[Union[dict, ~google.streetview.publish_v1.types.UpdatePhotoRequest]]): Required. List of ``UpdatePhotoRequests``.

                If a dict is provided, it must be of the same form as the protobuf
                message :class:`~google.streetview.publish_v1.types.UpdatePhotoRequest`
            retry (Optional[google.api_core.retry.Retry]):  A retry object used
                to retry requests. If ``None`` is specified, requests will not
                be retried.
            timeout (Optional[float]): The amount of time, in seconds, to wait
                for the request to complete. Note that if ``retry`` is
                specified, the timeout applies to each individual attempt.
            metadata (Optional[Sequence[Tuple[str, str]]]): Additional metadata
                that is provided to the method.

        Returns:
            A :class:`~google.streetview.publish_v1.types.BatchUpdatePhotosResponse` instance.

        Raises:
            google.api_core.exceptions.GoogleAPICallError: If the request
                    failed for any reason.
            google.api_core.exceptions.RetryError: If the request failed due
                    to a retryable error and retry attempts failed.
            ValueError: If the parameters are invalid.
        """
        # Wrap the transport method to add retry and timeout logic.
        if 'batch_update_photos' not in self._inner_api_calls:
            self._inner_api_calls[
                'batch_update_photos'] = google.api_core.gapic_v1.method.wrap_method(
                    self.transport.batch_update_photos,
                    default_retry=self._method_configs['BatchUpdatePhotos'].
                    retry,
                    default_timeout=self._method_configs['BatchUpdatePhotos'].
                    timeout,
                    client_info=self._client_info,
                )

        request = rpcmessages_pb2.BatchUpdatePhotosRequest(
            update_photo_requests=update_photo_requests, )
        return self._inner_api_calls['batch_update_photos'](
            request, retry=retry, timeout=timeout, metadata=metadata)

    def delete_photo(self,
                     photo_id,
                     retry=google.api_core.gapic_v1.method.DEFAULT,
                     timeout=google.api_core.gapic_v1.method.DEFAULT,
                     metadata=None):
        """
        Deletes a ``Photo`` and its metadata.

        This method returns the following error codes:

        -  ``google.rpc.Code.PERMISSION_DENIED`` if the requesting user did not
           create the requested photo.
        -  ``google.rpc.Code.NOT_FOUND`` if the photo ID does not exist.

        Example:
            >>> from google.streetview import publish_v1
            >>>
            >>> client = publish_v1.StreetViewPublishServiceClient()
            >>>
            >>> # TODO: Initialize `photo_id`:
            >>> photo_id = ''
            >>>
            >>> client.delete_photo(photo_id)

        Args:
            photo_id (str): Required. ID of the ``Photo``.
            retry (Optional[google.api_core.retry.Retry]):  A retry object used
                to retry requests. If ``None`` is specified, requests will not
                be retried.
            timeout (Optional[float]): The amount of time, in seconds, to wait
                for the request to complete. Note that if ``retry`` is
                specified, the timeout applies to each individual attempt.
            metadata (Optional[Sequence[Tuple[str, str]]]): Additional metadata
                that is provided to the method.

        Raises:
            google.api_core.exceptions.GoogleAPICallError: If the request
                    failed for any reason.
            google.api_core.exceptions.RetryError: If the request failed due
                    to a retryable error and retry attempts failed.
            ValueError: If the parameters are invalid.
        """
        # Wrap the transport method to add retry and timeout logic.
        if 'delete_photo' not in self._inner_api_calls:
            self._inner_api_calls[
                'delete_photo'] = google.api_core.gapic_v1.method.wrap_method(
                    self.transport.delete_photo,
                    default_retry=self._method_configs['DeletePhoto'].retry,
                    default_timeout=self._method_configs['DeletePhoto'].
                    timeout,
                    client_info=self._client_info,
                )

        request = rpcmessages_pb2.DeletePhotoRequest(photo_id=photo_id, )
        self._inner_api_calls['delete_photo'](
            request, retry=retry, timeout=timeout, metadata=metadata)

    def batch_delete_photos(self,
                            photo_ids,
                            retry=google.api_core.gapic_v1.method.DEFAULT,
                            timeout=google.api_core.gapic_v1.method.DEFAULT,
                            metadata=None):
        """
        Deletes a list of ``Photos`` and their metadata.

        Note that if ``BatchDeletePhotos`` fails, either critical fields are
        missing or there was an authentication error. Even if
        ``BatchDeletePhotos`` succeeds, individual photos in the batch may have
        failures. These failures are specified in each ``PhotoResponse.status``
        in ``BatchDeletePhotosResponse.results``. See ``DeletePhoto`` for
        specific failures that can occur per photo.

        Example:
            >>> from google.streetview import publish_v1
            >>>
            >>> client = publish_v1.StreetViewPublishServiceClient()
            >>>
            >>> # TODO: Initialize `photo_ids`:
            >>> photo_ids = []
            >>>
            >>> response = client.batch_delete_photos(photo_ids)

        Args:
            photo_ids (list[str]): Required. IDs of the ``Photos``. HTTP GET requests require the following
                syntax for the URL query parameter:
                ``photoIds=<id1>&photoIds=<id2>&...``.
            retry (Optional[google.api_core.retry.Retry]):  A retry object used
                to retry requests. If ``None`` is specified, requests will not
                be retried.
            timeout (Optional[float]): The amount of time, in seconds, to wait
                for the request to complete. Note that if ``retry`` is
                specified, the timeout applies to each individual attempt.
            metadata (Optional[Sequence[Tuple[str, str]]]): Additional metadata
                that is provided to the method.

        Returns:
            A :class:`~google.streetview.publish_v1.types.BatchDeletePhotosResponse` instance.

        Raises:
            google.api_core.exceptions.GoogleAPICallError: If the request
                    failed for any reason.
            google.api_core.exceptions.RetryError: If the request failed due
                    to a retryable error and retry attempts failed.
            ValueError: If the parameters are invalid.
        """
        # Wrap the transport method to add retry and timeout logic.
        if 'batch_delete_photos' not in self._inner_api_calls:
            self._inner_api_calls[
                'batch_delete_photos'] = google.api_core.gapic_v1.method.wrap_method(
                    self.transport.batch_delete_photos,
                    default_retry=self._method_configs['BatchDeletePhotos'].
                    retry,
                    default_timeout=self._method_configs['BatchDeletePhotos'].
                    timeout,
                    client_info=self._client_info,
                )

        request = rpcmessages_pb2.BatchDeletePhotosRequest(
            photo_ids=photo_ids, )
        return self._inner_api_calls['batch_delete_photos'](
            request, retry=retry, timeout=timeout, metadata=metadata)
