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
"""Unit tests."""

import mock
import unittest

from google.gax import errors

from google.cloud.proto.streetview.publish.v1 import resources_pb2
from google.cloud.proto.streetview.publish.v1 import rpcmessages_pb2
from google.protobuf import empty_pb2
from google.protobuf import field_mask_pb2
from google.streetview.publish.v1 import enums
from google.streetview.publish.v1 import street_view_publish_service_client


class CustomException(Exception):
    pass


class TestStreetViewPublishServiceClient(unittest.TestCase):
    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_start_upload(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = street_view_publish_service_client.StreetViewPublishServiceClient(
        )

        # Mock response
        upload_url = 'uploadUrl-242738639'
        expected_response = resources_pb2.UploadRef(upload_url=upload_url)
        grpc_stub.StartUpload.return_value = expected_response

        response = client.start_upload()
        self.assertEqual(expected_response, response)

        grpc_stub.StartUpload.assert_called_once()
        args, kwargs = grpc_stub.StartUpload.call_args
        self.assertEqual(len(args), 2)
        self.assertEqual(len(kwargs), 1)
        self.assertIn('metadata', kwargs)
        actual_request = args[0]

        expected_request = empty_pb2.Empty()
        self.assertEqual(expected_request, actual_request)

    @mock.patch('google.gax.config.API_ERRORS', (CustomException, ))
    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_start_upload_exception(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = street_view_publish_service_client.StreetViewPublishServiceClient(
        )

        # Mock exception response
        grpc_stub.StartUpload.side_effect = CustomException()

        self.assertRaises(errors.GaxError, client.start_upload)

    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_create_photo(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = street_view_publish_service_client.StreetViewPublishServiceClient(
        )

        # Mock request
        photo = resources_pb2.Photo()

        # Mock response
        download_url = 'downloadUrl1109408056'
        thumbnail_url = 'thumbnailUrl1825632156'
        share_link = 'shareLink-1788203942'
        view_count = -1534353675
        expected_response = resources_pb2.Photo(
            download_url=download_url,
            thumbnail_url=thumbnail_url,
            share_link=share_link,
            view_count=view_count)
        grpc_stub.CreatePhoto.return_value = expected_response

        response = client.create_photo(photo)
        self.assertEqual(expected_response, response)

        grpc_stub.CreatePhoto.assert_called_once()
        args, kwargs = grpc_stub.CreatePhoto.call_args
        self.assertEqual(len(args), 2)
        self.assertEqual(len(kwargs), 1)
        self.assertIn('metadata', kwargs)
        actual_request = args[0]

        expected_request = rpcmessages_pb2.CreatePhotoRequest(photo=photo)
        self.assertEqual(expected_request, actual_request)

    @mock.patch('google.gax.config.API_ERRORS', (CustomException, ))
    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_create_photo_exception(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = street_view_publish_service_client.StreetViewPublishServiceClient(
        )

        # Mock request
        photo = resources_pb2.Photo()

        # Mock exception response
        grpc_stub.CreatePhoto.side_effect = CustomException()

        self.assertRaises(errors.GaxError, client.create_photo, photo)

    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_get_photo(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = street_view_publish_service_client.StreetViewPublishServiceClient(
        )

        # Mock request
        photo_id = 'photoId-1274270136'
        view = enums.PhotoView.BASIC

        # Mock response
        download_url = 'downloadUrl1109408056'
        thumbnail_url = 'thumbnailUrl1825632156'
        share_link = 'shareLink-1788203942'
        view_count = -1534353675
        expected_response = resources_pb2.Photo(
            download_url=download_url,
            thumbnail_url=thumbnail_url,
            share_link=share_link,
            view_count=view_count)
        grpc_stub.GetPhoto.return_value = expected_response

        response = client.get_photo(photo_id, view)
        self.assertEqual(expected_response, response)

        grpc_stub.GetPhoto.assert_called_once()
        args, kwargs = grpc_stub.GetPhoto.call_args
        self.assertEqual(len(args), 2)
        self.assertEqual(len(kwargs), 1)
        self.assertIn('metadata', kwargs)
        actual_request = args[0]

        expected_request = rpcmessages_pb2.GetPhotoRequest(
            photo_id=photo_id, view=view)
        self.assertEqual(expected_request, actual_request)

    @mock.patch('google.gax.config.API_ERRORS', (CustomException, ))
    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_get_photo_exception(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = street_view_publish_service_client.StreetViewPublishServiceClient(
        )

        # Mock request
        photo_id = 'photoId-1274270136'
        view = enums.PhotoView.BASIC

        # Mock exception response
        grpc_stub.GetPhoto.side_effect = CustomException()

        self.assertRaises(errors.GaxError, client.get_photo, photo_id, view)

    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_batch_get_photos(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = street_view_publish_service_client.StreetViewPublishServiceClient(
        )

        # Mock request
        photo_ids = []
        view = enums.PhotoView.BASIC

        # Mock response
        expected_response = rpcmessages_pb2.BatchGetPhotosResponse()
        grpc_stub.BatchGetPhotos.return_value = expected_response

        response = client.batch_get_photos(photo_ids, view)
        self.assertEqual(expected_response, response)

        grpc_stub.BatchGetPhotos.assert_called_once()
        args, kwargs = grpc_stub.BatchGetPhotos.call_args
        self.assertEqual(len(args), 2)
        self.assertEqual(len(kwargs), 1)
        self.assertIn('metadata', kwargs)
        actual_request = args[0]

        expected_request = rpcmessages_pb2.BatchGetPhotosRequest(
            photo_ids=photo_ids, view=view)
        self.assertEqual(expected_request, actual_request)

    @mock.patch('google.gax.config.API_ERRORS', (CustomException, ))
    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_batch_get_photos_exception(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = street_view_publish_service_client.StreetViewPublishServiceClient(
        )

        # Mock request
        photo_ids = []
        view = enums.PhotoView.BASIC

        # Mock exception response
        grpc_stub.BatchGetPhotos.side_effect = CustomException()

        self.assertRaises(errors.GaxError, client.batch_get_photos, photo_ids,
                          view)

    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_list_photos(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = street_view_publish_service_client.StreetViewPublishServiceClient(
        )

        # Mock request
        view = enums.PhotoView.BASIC
        filter_ = 'filter-1274492040'

        # Mock response
        next_page_token = ''
        photos_element = resources_pb2.Photo()
        photos = [photos_element]
        expected_response = rpcmessages_pb2.ListPhotosResponse(
            next_page_token=next_page_token, photos=photos)
        grpc_stub.ListPhotos.return_value = expected_response

        paged_list_response = client.list_photos(view, filter_)
        resources = list(paged_list_response)
        self.assertEqual(1, len(resources))
        self.assertEqual(expected_response.photos[0], resources[0])

        grpc_stub.ListPhotos.assert_called_once()
        args, kwargs = grpc_stub.ListPhotos.call_args
        self.assertEqual(len(args), 2)
        self.assertEqual(len(kwargs), 1)
        self.assertIn('metadata', kwargs)
        actual_request = args[0]

        expected_request = rpcmessages_pb2.ListPhotosRequest(
            view=view, filter=filter_)
        self.assertEqual(expected_request, actual_request)

    @mock.patch('google.gax.config.API_ERRORS', (CustomException, ))
    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_list_photos_exception(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = street_view_publish_service_client.StreetViewPublishServiceClient(
        )

        # Mock request
        view = enums.PhotoView.BASIC
        filter_ = 'filter-1274492040'

        # Mock exception response
        grpc_stub.ListPhotos.side_effect = CustomException()

        paged_list_response = client.list_photos(view, filter_)
        self.assertRaises(errors.GaxError, list, paged_list_response)

    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_update_photo(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = street_view_publish_service_client.StreetViewPublishServiceClient(
        )

        # Mock request
        photo = resources_pb2.Photo()
        update_mask = field_mask_pb2.FieldMask()

        # Mock response
        download_url = 'downloadUrl1109408056'
        thumbnail_url = 'thumbnailUrl1825632156'
        share_link = 'shareLink-1788203942'
        view_count = -1534353675
        expected_response = resources_pb2.Photo(
            download_url=download_url,
            thumbnail_url=thumbnail_url,
            share_link=share_link,
            view_count=view_count)
        grpc_stub.UpdatePhoto.return_value = expected_response

        response = client.update_photo(photo, update_mask)
        self.assertEqual(expected_response, response)

        grpc_stub.UpdatePhoto.assert_called_once()
        args, kwargs = grpc_stub.UpdatePhoto.call_args
        self.assertEqual(len(args), 2)
        self.assertEqual(len(kwargs), 1)
        self.assertIn('metadata', kwargs)
        actual_request = args[0]

        expected_request = rpcmessages_pb2.UpdatePhotoRequest(
            photo=photo, update_mask=update_mask)
        self.assertEqual(expected_request, actual_request)

    @mock.patch('google.gax.config.API_ERRORS', (CustomException, ))
    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_update_photo_exception(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = street_view_publish_service_client.StreetViewPublishServiceClient(
        )

        # Mock request
        photo = resources_pb2.Photo()
        update_mask = field_mask_pb2.FieldMask()

        # Mock exception response
        grpc_stub.UpdatePhoto.side_effect = CustomException()

        self.assertRaises(errors.GaxError, client.update_photo, photo,
                          update_mask)

    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_batch_update_photos(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = street_view_publish_service_client.StreetViewPublishServiceClient(
        )

        # Mock request
        update_photo_requests = []

        # Mock response
        expected_response = rpcmessages_pb2.BatchUpdatePhotosResponse()
        grpc_stub.BatchUpdatePhotos.return_value = expected_response

        response = client.batch_update_photos(update_photo_requests)
        self.assertEqual(expected_response, response)

        grpc_stub.BatchUpdatePhotos.assert_called_once()
        args, kwargs = grpc_stub.BatchUpdatePhotos.call_args
        self.assertEqual(len(args), 2)
        self.assertEqual(len(kwargs), 1)
        self.assertIn('metadata', kwargs)
        actual_request = args[0]

        expected_request = rpcmessages_pb2.BatchUpdatePhotosRequest(
            update_photo_requests=update_photo_requests)
        self.assertEqual(expected_request, actual_request)

    @mock.patch('google.gax.config.API_ERRORS', (CustomException, ))
    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_batch_update_photos_exception(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = street_view_publish_service_client.StreetViewPublishServiceClient(
        )

        # Mock request
        update_photo_requests = []

        # Mock exception response
        grpc_stub.BatchUpdatePhotos.side_effect = CustomException()

        self.assertRaises(errors.GaxError, client.batch_update_photos,
                          update_photo_requests)

    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_delete_photo(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = street_view_publish_service_client.StreetViewPublishServiceClient(
        )

        # Mock request
        photo_id = 'photoId-1274270136'

        client.delete_photo(photo_id)

        grpc_stub.DeletePhoto.assert_called_once()
        args, kwargs = grpc_stub.DeletePhoto.call_args
        self.assertEqual(len(args), 2)
        self.assertEqual(len(kwargs), 1)
        self.assertIn('metadata', kwargs)
        actual_request = args[0]

        expected_request = rpcmessages_pb2.DeletePhotoRequest(
            photo_id=photo_id)
        self.assertEqual(expected_request, actual_request)

    @mock.patch('google.gax.config.API_ERRORS', (CustomException, ))
    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_delete_photo_exception(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = street_view_publish_service_client.StreetViewPublishServiceClient(
        )

        # Mock request
        photo_id = 'photoId-1274270136'

        # Mock exception response
        grpc_stub.DeletePhoto.side_effect = CustomException()

        self.assertRaises(errors.GaxError, client.delete_photo, photo_id)

    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_batch_delete_photos(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = street_view_publish_service_client.StreetViewPublishServiceClient(
        )

        # Mock request
        photo_ids = []

        # Mock response
        expected_response = rpcmessages_pb2.BatchDeletePhotosResponse()
        grpc_stub.BatchDeletePhotos.return_value = expected_response

        response = client.batch_delete_photos(photo_ids)
        self.assertEqual(expected_response, response)

        grpc_stub.BatchDeletePhotos.assert_called_once()
        args, kwargs = grpc_stub.BatchDeletePhotos.call_args
        self.assertEqual(len(args), 2)
        self.assertEqual(len(kwargs), 1)
        self.assertIn('metadata', kwargs)
        actual_request = args[0]

        expected_request = rpcmessages_pb2.BatchDeletePhotosRequest(
            photo_ids=photo_ids)
        self.assertEqual(expected_request, actual_request)

    @mock.patch('google.gax.config.API_ERRORS', (CustomException, ))
    @mock.patch('google.gax.config.create_stub', spec=True)
    def test_batch_delete_photos_exception(self, mock_create_stub):
        # Mock gRPC layer
        grpc_stub = mock.Mock()
        mock_create_stub.return_value = grpc_stub

        client = street_view_publish_service_client.StreetViewPublishServiceClient(
        )

        # Mock request
        photo_ids = []

        # Mock exception response
        grpc_stub.BatchDeletePhotos.side_effect = CustomException()

        self.assertRaises(errors.GaxError, client.batch_delete_photos,
                          photo_ids)
