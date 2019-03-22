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
"""Unit tests."""

import mock
import pytest

from google.protobuf import empty_pb2
from google.protobuf import field_mask_pb2
from google.streetview import publish_v1
from google.streetview.publish_v1 import enums
from google.streetview.publish_v1.proto import resources_pb2
from google.streetview.publish_v1.proto import rpcmessages_pb2


class MultiCallableStub(object):
    """Stub for the grpc.UnaryUnaryMultiCallable interface."""

    def __init__(self, method, channel_stub):
        self.method = method
        self.channel_stub = channel_stub

    def __call__(self, request, timeout=None, metadata=None, credentials=None):
        self.channel_stub.requests.append((self.method, request))

        response = None
        if self.channel_stub.responses:
            response = self.channel_stub.responses.pop()

        if isinstance(response, Exception):
            raise response

        if response:
            return response


class ChannelStub(object):
    """Stub for the grpc.Channel interface."""

    def __init__(self, responses=[]):
        self.responses = responses
        self.requests = []

    def unary_unary(self,
                    method,
                    request_serializer=None,
                    response_deserializer=None):
        return MultiCallableStub(method, self)


class CustomException(Exception):
    pass


class TestStreetViewPublishServiceClient(object):
    def test_start_upload(self):
        # Setup Expected Response
        upload_url = 'uploadUrl-242738639'
        expected_response = {'upload_url': upload_url}
        expected_response = resources_pb2.UploadRef(**expected_response)

        # Mock the API response
        channel = ChannelStub(responses=[expected_response])
        patch = mock.patch('google.api_core.grpc_helpers.create_channel')
        with patch as create_channel:
            create_channel.return_value = channel
            client = publish_v1.StreetViewPublishServiceClient()

        response = client.start_upload()
        assert expected_response == response

        assert len(channel.requests) == 1
        expected_request = empty_pb2.Empty()
        actual_request = channel.requests[0][1]
        assert expected_request == actual_request

    def test_start_upload_exception(self):
        # Mock the API response
        channel = ChannelStub(responses=[CustomException()])
        patch = mock.patch('google.api_core.grpc_helpers.create_channel')
        with patch as create_channel:
            create_channel.return_value = channel
            client = publish_v1.StreetViewPublishServiceClient()

        with pytest.raises(CustomException):
            client.start_upload()

    def test_create_photo(self):
        # Setup Expected Response
        download_url = 'downloadUrl1109408056'
        thumbnail_url = 'thumbnailUrl1825632156'
        share_link = 'shareLink-1788203942'
        view_count = 1534353675
        expected_response = {
            'download_url': download_url,
            'thumbnail_url': thumbnail_url,
            'share_link': share_link,
            'view_count': view_count
        }
        expected_response = resources_pb2.Photo(**expected_response)

        # Mock the API response
        channel = ChannelStub(responses=[expected_response])
        patch = mock.patch('google.api_core.grpc_helpers.create_channel')
        with patch as create_channel:
            create_channel.return_value = channel
            client = publish_v1.StreetViewPublishServiceClient()

        # Setup Request
        photo = {}

        response = client.create_photo(photo)
        assert expected_response == response

        assert len(channel.requests) == 1
        expected_request = rpcmessages_pb2.CreatePhotoRequest(photo=photo)
        actual_request = channel.requests[0][1]
        assert expected_request == actual_request

    def test_create_photo_exception(self):
        # Mock the API response
        channel = ChannelStub(responses=[CustomException()])
        patch = mock.patch('google.api_core.grpc_helpers.create_channel')
        with patch as create_channel:
            create_channel.return_value = channel
            client = publish_v1.StreetViewPublishServiceClient()

        # Setup request
        photo = {}

        with pytest.raises(CustomException):
            client.create_photo(photo)

    def test_get_photo(self):
        # Setup Expected Response
        download_url = 'downloadUrl1109408056'
        thumbnail_url = 'thumbnailUrl1825632156'
        share_link = 'shareLink-1788203942'
        view_count = 1534353675
        expected_response = {
            'download_url': download_url,
            'thumbnail_url': thumbnail_url,
            'share_link': share_link,
            'view_count': view_count
        }
        expected_response = resources_pb2.Photo(**expected_response)

        # Mock the API response
        channel = ChannelStub(responses=[expected_response])
        patch = mock.patch('google.api_core.grpc_helpers.create_channel')
        with patch as create_channel:
            create_channel.return_value = channel
            client = publish_v1.StreetViewPublishServiceClient()

        # Setup Request
        photo_id = 'photoId-1274270136'
        view = enums.PhotoView.BASIC

        response = client.get_photo(photo_id, view)
        assert expected_response == response

        assert len(channel.requests) == 1
        expected_request = rpcmessages_pb2.GetPhotoRequest(
            photo_id=photo_id, view=view)
        actual_request = channel.requests[0][1]
        assert expected_request == actual_request

    def test_get_photo_exception(self):
        # Mock the API response
        channel = ChannelStub(responses=[CustomException()])
        patch = mock.patch('google.api_core.grpc_helpers.create_channel')
        with patch as create_channel:
            create_channel.return_value = channel
            client = publish_v1.StreetViewPublishServiceClient()

        # Setup request
        photo_id = 'photoId-1274270136'
        view = enums.PhotoView.BASIC

        with pytest.raises(CustomException):
            client.get_photo(photo_id, view)

    def test_batch_get_photos(self):
        # Setup Expected Response
        expected_response = {}
        expected_response = rpcmessages_pb2.BatchGetPhotosResponse(
            **expected_response)

        # Mock the API response
        channel = ChannelStub(responses=[expected_response])
        patch = mock.patch('google.api_core.grpc_helpers.create_channel')
        with patch as create_channel:
            create_channel.return_value = channel
            client = publish_v1.StreetViewPublishServiceClient()

        # Setup Request
        photo_ids = []
        view = enums.PhotoView.BASIC

        response = client.batch_get_photos(photo_ids, view)
        assert expected_response == response

        assert len(channel.requests) == 1
        expected_request = rpcmessages_pb2.BatchGetPhotosRequest(
            photo_ids=photo_ids, view=view)
        actual_request = channel.requests[0][1]
        assert expected_request == actual_request

    def test_batch_get_photos_exception(self):
        # Mock the API response
        channel = ChannelStub(responses=[CustomException()])
        patch = mock.patch('google.api_core.grpc_helpers.create_channel')
        with patch as create_channel:
            create_channel.return_value = channel
            client = publish_v1.StreetViewPublishServiceClient()

        # Setup request
        photo_ids = []
        view = enums.PhotoView.BASIC

        with pytest.raises(CustomException):
            client.batch_get_photos(photo_ids, view)

    def test_list_photos(self):
        # Setup Expected Response
        next_page_token = ''
        photos_element = {}
        photos = [photos_element]
        expected_response = {
            'next_page_token': next_page_token,
            'photos': photos
        }
        expected_response = rpcmessages_pb2.ListPhotosResponse(
            **expected_response)

        # Mock the API response
        channel = ChannelStub(responses=[expected_response])
        patch = mock.patch('google.api_core.grpc_helpers.create_channel')
        with patch as create_channel:
            create_channel.return_value = channel
            client = publish_v1.StreetViewPublishServiceClient()

        # Setup Request
        view = enums.PhotoView.BASIC
        filter_ = 'filter-1274492040'

        paged_list_response = client.list_photos(view, filter_)
        resources = list(paged_list_response)
        assert len(resources) == 1

        assert expected_response.photos[0] == resources[0]

        assert len(channel.requests) == 1
        expected_request = rpcmessages_pb2.ListPhotosRequest(
            view=view, filter=filter_)
        actual_request = channel.requests[0][1]
        assert expected_request == actual_request

    def test_list_photos_exception(self):
        channel = ChannelStub(responses=[CustomException()])
        patch = mock.patch('google.api_core.grpc_helpers.create_channel')
        with patch as create_channel:
            create_channel.return_value = channel
            client = publish_v1.StreetViewPublishServiceClient()

        # Setup request
        view = enums.PhotoView.BASIC
        filter_ = 'filter-1274492040'

        paged_list_response = client.list_photos(view, filter_)
        with pytest.raises(CustomException):
            list(paged_list_response)

    def test_update_photo(self):
        # Setup Expected Response
        download_url = 'downloadUrl1109408056'
        thumbnail_url = 'thumbnailUrl1825632156'
        share_link = 'shareLink-1788203942'
        view_count = 1534353675
        expected_response = {
            'download_url': download_url,
            'thumbnail_url': thumbnail_url,
            'share_link': share_link,
            'view_count': view_count
        }
        expected_response = resources_pb2.Photo(**expected_response)

        # Mock the API response
        channel = ChannelStub(responses=[expected_response])
        patch = mock.patch('google.api_core.grpc_helpers.create_channel')
        with patch as create_channel:
            create_channel.return_value = channel
            client = publish_v1.StreetViewPublishServiceClient()

        # Setup Request
        photo = {}
        update_mask = {}

        response = client.update_photo(photo, update_mask)
        assert expected_response == response

        assert len(channel.requests) == 1
        expected_request = rpcmessages_pb2.UpdatePhotoRequest(
            photo=photo, update_mask=update_mask)
        actual_request = channel.requests[0][1]
        assert expected_request == actual_request

    def test_update_photo_exception(self):
        # Mock the API response
        channel = ChannelStub(responses=[CustomException()])
        patch = mock.patch('google.api_core.grpc_helpers.create_channel')
        with patch as create_channel:
            create_channel.return_value = channel
            client = publish_v1.StreetViewPublishServiceClient()

        # Setup request
        photo = {}
        update_mask = {}

        with pytest.raises(CustomException):
            client.update_photo(photo, update_mask)

    def test_batch_update_photos(self):
        # Setup Expected Response
        expected_response = {}
        expected_response = rpcmessages_pb2.BatchUpdatePhotosResponse(
            **expected_response)

        # Mock the API response
        channel = ChannelStub(responses=[expected_response])
        patch = mock.patch('google.api_core.grpc_helpers.create_channel')
        with patch as create_channel:
            create_channel.return_value = channel
            client = publish_v1.StreetViewPublishServiceClient()

        # Setup Request
        update_photo_requests = []

        response = client.batch_update_photos(update_photo_requests)
        assert expected_response == response

        assert len(channel.requests) == 1
        expected_request = rpcmessages_pb2.BatchUpdatePhotosRequest(
            update_photo_requests=update_photo_requests)
        actual_request = channel.requests[0][1]
        assert expected_request == actual_request

    def test_batch_update_photos_exception(self):
        # Mock the API response
        channel = ChannelStub(responses=[CustomException()])
        patch = mock.patch('google.api_core.grpc_helpers.create_channel')
        with patch as create_channel:
            create_channel.return_value = channel
            client = publish_v1.StreetViewPublishServiceClient()

        # Setup request
        update_photo_requests = []

        with pytest.raises(CustomException):
            client.batch_update_photos(update_photo_requests)

    def test_delete_photo(self):
        channel = ChannelStub()
        patch = mock.patch('google.api_core.grpc_helpers.create_channel')
        with patch as create_channel:
            create_channel.return_value = channel
            client = publish_v1.StreetViewPublishServiceClient()

        # Setup Request
        photo_id = 'photoId-1274270136'

        client.delete_photo(photo_id)

        assert len(channel.requests) == 1
        expected_request = rpcmessages_pb2.DeletePhotoRequest(
            photo_id=photo_id)
        actual_request = channel.requests[0][1]
        assert expected_request == actual_request

    def test_delete_photo_exception(self):
        # Mock the API response
        channel = ChannelStub(responses=[CustomException()])
        patch = mock.patch('google.api_core.grpc_helpers.create_channel')
        with patch as create_channel:
            create_channel.return_value = channel
            client = publish_v1.StreetViewPublishServiceClient()

        # Setup request
        photo_id = 'photoId-1274270136'

        with pytest.raises(CustomException):
            client.delete_photo(photo_id)

    def test_batch_delete_photos(self):
        # Setup Expected Response
        expected_response = {}
        expected_response = rpcmessages_pb2.BatchDeletePhotosResponse(
            **expected_response)

        # Mock the API response
        channel = ChannelStub(responses=[expected_response])
        patch = mock.patch('google.api_core.grpc_helpers.create_channel')
        with patch as create_channel:
            create_channel.return_value = channel
            client = publish_v1.StreetViewPublishServiceClient()

        # Setup Request
        photo_ids = []

        response = client.batch_delete_photos(photo_ids)
        assert expected_response == response

        assert len(channel.requests) == 1
        expected_request = rpcmessages_pb2.BatchDeletePhotosRequest(
            photo_ids=photo_ids)
        actual_request = channel.requests[0][1]
        assert expected_request == actual_request

    def test_batch_delete_photos_exception(self):
        # Mock the API response
        channel = ChannelStub(responses=[CustomException()])
        patch = mock.patch('google.api_core.grpc_helpers.create_channel')
        with patch as create_channel:
            create_channel.return_value = channel
            client = publish_v1.StreetViewPublishServiceClient()

        # Setup request
        photo_ids = []

        with pytest.raises(CustomException):
            client.batch_delete_photos(photo_ids)
