// Copyright 2019 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     https://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

'use strict';

const assert = require('assert');

const googleModule = require('../src');

const FAKE_STATUS_CODE = 1;
const error = new Error();
error.code = FAKE_STATUS_CODE;

describe('StreetViewPublishServiceClient', () => {
  describe('startUpload', () => {
    it('invokes startUpload without error', done => {
      const client = new googleModule.v1.StreetViewPublishServiceClient({
        credentials: {client_email: 'bogus', private_key: 'bogus'},
        projectId: 'bogus',
      });

      // Mock request
      const request = {};

      // Mock response
      const uploadUrl = 'uploadUrl-242738639';
      const expectedResponse = {
        uploadUrl: uploadUrl,
      };

      // Mock Grpc layer
      client._innerApiCalls.startUpload = mockSimpleGrpcMethod(
        request,
        expectedResponse
      );

      client.startUpload(request, (err, response) => {
        assert.ifError(err);
        assert.deepStrictEqual(response, expectedResponse);
        done();
      });
    });

    it('invokes startUpload with error', done => {
      const client = new googleModule.v1.StreetViewPublishServiceClient({
        credentials: {client_email: 'bogus', private_key: 'bogus'},
        projectId: 'bogus',
      });

      // Mock request
      const request = {};

      // Mock Grpc layer
      client._innerApiCalls.startUpload = mockSimpleGrpcMethod(
        request,
        null,
        error
      );

      client.startUpload(request, (err, response) => {
        assert(err instanceof Error);
        assert.strictEqual(err.code, FAKE_STATUS_CODE);
        assert(typeof response === 'undefined');
        done();
      });
    });
  });

  describe('createPhoto', () => {
    it('invokes createPhoto without error', done => {
      const client = new googleModule.v1.StreetViewPublishServiceClient({
        credentials: {client_email: 'bogus', private_key: 'bogus'},
        projectId: 'bogus',
      });

      // Mock request
      const photo = {};
      const request = {
        photo: photo,
      };

      // Mock response
      const downloadUrl = 'downloadUrl1109408056';
      const thumbnailUrl = 'thumbnailUrl1825632156';
      const shareLink = 'shareLink-1788203942';
      const viewCount = 1534353675;
      const expectedResponse = {
        downloadUrl: downloadUrl,
        thumbnailUrl: thumbnailUrl,
        shareLink: shareLink,
        viewCount: viewCount,
      };

      // Mock Grpc layer
      client._innerApiCalls.createPhoto = mockSimpleGrpcMethod(
        request,
        expectedResponse
      );

      client.createPhoto(request, (err, response) => {
        assert.ifError(err);
        assert.deepStrictEqual(response, expectedResponse);
        done();
      });
    });

    it('invokes createPhoto with error', done => {
      const client = new googleModule.v1.StreetViewPublishServiceClient({
        credentials: {client_email: 'bogus', private_key: 'bogus'},
        projectId: 'bogus',
      });

      // Mock request
      const photo = {};
      const request = {
        photo: photo,
      };

      // Mock Grpc layer
      client._innerApiCalls.createPhoto = mockSimpleGrpcMethod(
        request,
        null,
        error
      );

      client.createPhoto(request, (err, response) => {
        assert(err instanceof Error);
        assert.strictEqual(err.code, FAKE_STATUS_CODE);
        assert(typeof response === 'undefined');
        done();
      });
    });
  });

  describe('getPhoto', () => {
    it('invokes getPhoto without error', done => {
      const client = new googleModule.v1.StreetViewPublishServiceClient({
        credentials: {client_email: 'bogus', private_key: 'bogus'},
        projectId: 'bogus',
      });

      // Mock request
      const photoId = 'photoId-1274270136';
      const view = 'BASIC';
      const request = {
        photoId: photoId,
        view: view,
      };

      // Mock response
      const downloadUrl = 'downloadUrl1109408056';
      const thumbnailUrl = 'thumbnailUrl1825632156';
      const shareLink = 'shareLink-1788203942';
      const viewCount = 1534353675;
      const expectedResponse = {
        downloadUrl: downloadUrl,
        thumbnailUrl: thumbnailUrl,
        shareLink: shareLink,
        viewCount: viewCount,
      };

      // Mock Grpc layer
      client._innerApiCalls.getPhoto = mockSimpleGrpcMethod(
        request,
        expectedResponse
      );

      client.getPhoto(request, (err, response) => {
        assert.ifError(err);
        assert.deepStrictEqual(response, expectedResponse);
        done();
      });
    });

    it('invokes getPhoto with error', done => {
      const client = new googleModule.v1.StreetViewPublishServiceClient({
        credentials: {client_email: 'bogus', private_key: 'bogus'},
        projectId: 'bogus',
      });

      // Mock request
      const photoId = 'photoId-1274270136';
      const view = 'BASIC';
      const request = {
        photoId: photoId,
        view: view,
      };

      // Mock Grpc layer
      client._innerApiCalls.getPhoto = mockSimpleGrpcMethod(
        request,
        null,
        error
      );

      client.getPhoto(request, (err, response) => {
        assert(err instanceof Error);
        assert.strictEqual(err.code, FAKE_STATUS_CODE);
        assert(typeof response === 'undefined');
        done();
      });
    });
  });

  describe('batchGetPhotos', () => {
    it('invokes batchGetPhotos without error', done => {
      const client = new googleModule.v1.StreetViewPublishServiceClient({
        credentials: {client_email: 'bogus', private_key: 'bogus'},
        projectId: 'bogus',
      });

      // Mock request
      const photoIds = [];
      const view = 'BASIC';
      const request = {
        photoIds: photoIds,
        view: view,
      };

      // Mock response
      const expectedResponse = {};

      // Mock Grpc layer
      client._innerApiCalls.batchGetPhotos = mockSimpleGrpcMethod(
        request,
        expectedResponse
      );

      client.batchGetPhotos(request, (err, response) => {
        assert.ifError(err);
        assert.deepStrictEqual(response, expectedResponse);
        done();
      });
    });

    it('invokes batchGetPhotos with error', done => {
      const client = new googleModule.v1.StreetViewPublishServiceClient({
        credentials: {client_email: 'bogus', private_key: 'bogus'},
        projectId: 'bogus',
      });

      // Mock request
      const photoIds = [];
      const view = 'BASIC';
      const request = {
        photoIds: photoIds,
        view: view,
      };

      // Mock Grpc layer
      client._innerApiCalls.batchGetPhotos = mockSimpleGrpcMethod(
        request,
        null,
        error
      );

      client.batchGetPhotos(request, (err, response) => {
        assert(err instanceof Error);
        assert.strictEqual(err.code, FAKE_STATUS_CODE);
        assert(typeof response === 'undefined');
        done();
      });
    });
  });

  describe('listPhotos', () => {
    it('invokes listPhotos without error', done => {
      const client = new googleModule.v1.StreetViewPublishServiceClient({
        credentials: {client_email: 'bogus', private_key: 'bogus'},
        projectId: 'bogus',
      });

      // Mock request
      const view = 'BASIC';
      const filter = 'filter-1274492040';
      const request = {
        view: view,
        filter: filter,
      };

      // Mock response
      const nextPageToken = '';
      const photosElement = {};
      const photos = [photosElement];
      const expectedResponse = {
        nextPageToken: nextPageToken,
        photos: photos,
      };

      // Mock Grpc layer
      client._innerApiCalls.listPhotos = (actualRequest, options, callback) => {
        assert.deepStrictEqual(actualRequest, request);
        callback(null, expectedResponse.photos);
      };

      client.listPhotos(request, (err, response) => {
        assert.ifError(err);
        assert.deepStrictEqual(response, expectedResponse.photos);
        done();
      });
    });

    it('invokes listPhotos with error', done => {
      const client = new googleModule.v1.StreetViewPublishServiceClient({
        credentials: {client_email: 'bogus', private_key: 'bogus'},
        projectId: 'bogus',
      });

      // Mock request
      const view = 'BASIC';
      const filter = 'filter-1274492040';
      const request = {
        view: view,
        filter: filter,
      };

      // Mock Grpc layer
      client._innerApiCalls.listPhotos = mockSimpleGrpcMethod(
        request,
        null,
        error
      );

      client.listPhotos(request, (err, response) => {
        assert(err instanceof Error);
        assert.strictEqual(err.code, FAKE_STATUS_CODE);
        assert(typeof response === 'undefined');
        done();
      });
    });
  });

  describe('updatePhoto', () => {
    it('invokes updatePhoto without error', done => {
      const client = new googleModule.v1.StreetViewPublishServiceClient({
        credentials: {client_email: 'bogus', private_key: 'bogus'},
        projectId: 'bogus',
      });

      // Mock request
      const photo = {};
      const updateMask = {};
      const request = {
        photo: photo,
        updateMask: updateMask,
      };

      // Mock response
      const downloadUrl = 'downloadUrl1109408056';
      const thumbnailUrl = 'thumbnailUrl1825632156';
      const shareLink = 'shareLink-1788203942';
      const viewCount = 1534353675;
      const expectedResponse = {
        downloadUrl: downloadUrl,
        thumbnailUrl: thumbnailUrl,
        shareLink: shareLink,
        viewCount: viewCount,
      };

      // Mock Grpc layer
      client._innerApiCalls.updatePhoto = mockSimpleGrpcMethod(
        request,
        expectedResponse
      );

      client.updatePhoto(request, (err, response) => {
        assert.ifError(err);
        assert.deepStrictEqual(response, expectedResponse);
        done();
      });
    });

    it('invokes updatePhoto with error', done => {
      const client = new googleModule.v1.StreetViewPublishServiceClient({
        credentials: {client_email: 'bogus', private_key: 'bogus'},
        projectId: 'bogus',
      });

      // Mock request
      const photo = {};
      const updateMask = {};
      const request = {
        photo: photo,
        updateMask: updateMask,
      };

      // Mock Grpc layer
      client._innerApiCalls.updatePhoto = mockSimpleGrpcMethod(
        request,
        null,
        error
      );

      client.updatePhoto(request, (err, response) => {
        assert(err instanceof Error);
        assert.strictEqual(err.code, FAKE_STATUS_CODE);
        assert(typeof response === 'undefined');
        done();
      });
    });
  });

  describe('batchUpdatePhotos', () => {
    it('invokes batchUpdatePhotos without error', done => {
      const client = new googleModule.v1.StreetViewPublishServiceClient({
        credentials: {client_email: 'bogus', private_key: 'bogus'},
        projectId: 'bogus',
      });

      // Mock request
      const updatePhotoRequests = [];
      const request = {
        updatePhotoRequests: updatePhotoRequests,
      };

      // Mock response
      const expectedResponse = {};

      // Mock Grpc layer
      client._innerApiCalls.batchUpdatePhotos = mockSimpleGrpcMethod(
        request,
        expectedResponse
      );

      client.batchUpdatePhotos(request, (err, response) => {
        assert.ifError(err);
        assert.deepStrictEqual(response, expectedResponse);
        done();
      });
    });

    it('invokes batchUpdatePhotos with error', done => {
      const client = new googleModule.v1.StreetViewPublishServiceClient({
        credentials: {client_email: 'bogus', private_key: 'bogus'},
        projectId: 'bogus',
      });

      // Mock request
      const updatePhotoRequests = [];
      const request = {
        updatePhotoRequests: updatePhotoRequests,
      };

      // Mock Grpc layer
      client._innerApiCalls.batchUpdatePhotos = mockSimpleGrpcMethod(
        request,
        null,
        error
      );

      client.batchUpdatePhotos(request, (err, response) => {
        assert(err instanceof Error);
        assert.strictEqual(err.code, FAKE_STATUS_CODE);
        assert(typeof response === 'undefined');
        done();
      });
    });
  });

  describe('deletePhoto', () => {
    it('invokes deletePhoto without error', done => {
      const client = new googleModule.v1.StreetViewPublishServiceClient({
        credentials: {client_email: 'bogus', private_key: 'bogus'},
        projectId: 'bogus',
      });

      // Mock request
      const photoId = 'photoId-1274270136';
      const request = {
        photoId: photoId,
      };

      // Mock Grpc layer
      client._innerApiCalls.deletePhoto = mockSimpleGrpcMethod(request);

      client.deletePhoto(request, err => {
        assert.ifError(err);
        done();
      });
    });

    it('invokes deletePhoto with error', done => {
      const client = new googleModule.v1.StreetViewPublishServiceClient({
        credentials: {client_email: 'bogus', private_key: 'bogus'},
        projectId: 'bogus',
      });

      // Mock request
      const photoId = 'photoId-1274270136';
      const request = {
        photoId: photoId,
      };

      // Mock Grpc layer
      client._innerApiCalls.deletePhoto = mockSimpleGrpcMethod(
        request,
        null,
        error
      );

      client.deletePhoto(request, err => {
        assert(err instanceof Error);
        assert.strictEqual(err.code, FAKE_STATUS_CODE);
        done();
      });
    });
  });

  describe('batchDeletePhotos', () => {
    it('invokes batchDeletePhotos without error', done => {
      const client = new googleModule.v1.StreetViewPublishServiceClient({
        credentials: {client_email: 'bogus', private_key: 'bogus'},
        projectId: 'bogus',
      });

      // Mock request
      const photoIds = [];
      const request = {
        photoIds: photoIds,
      };

      // Mock response
      const expectedResponse = {};

      // Mock Grpc layer
      client._innerApiCalls.batchDeletePhotos = mockSimpleGrpcMethod(
        request,
        expectedResponse
      );

      client.batchDeletePhotos(request, (err, response) => {
        assert.ifError(err);
        assert.deepStrictEqual(response, expectedResponse);
        done();
      });
    });

    it('invokes batchDeletePhotos with error', done => {
      const client = new googleModule.v1.StreetViewPublishServiceClient({
        credentials: {client_email: 'bogus', private_key: 'bogus'},
        projectId: 'bogus',
      });

      // Mock request
      const photoIds = [];
      const request = {
        photoIds: photoIds,
      };

      // Mock Grpc layer
      client._innerApiCalls.batchDeletePhotos = mockSimpleGrpcMethod(
        request,
        null,
        error
      );

      client.batchDeletePhotos(request, (err, response) => {
        assert(err instanceof Error);
        assert.strictEqual(err.code, FAKE_STATUS_CODE);
        assert(typeof response === 'undefined');
        done();
      });
    });
  });

});

function mockSimpleGrpcMethod(expectedRequest, response, error) {
  return function(actualRequest, options, callback) {
    assert.deepStrictEqual(actualRequest, expectedRequest);
    if (error) {
      callback(error);
    } else if (response) {
      callback(null, response);
    } else {
      callback(null);
    }
  };
}
