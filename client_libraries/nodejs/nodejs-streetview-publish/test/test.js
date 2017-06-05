/*
 * Copyright 2017, Google Inc. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

var assert = require('assert');
var googleStreetview = require('../src/v1')();

var FAKE_STATUS_CODE = 1;
var error = new Error();
error.code = FAKE_STATUS_CODE;

describe('StreetViewPublishServiceClient', function() {
  describe('startUpload', function() {
    it('invokes startUpload without error', function(done) {
      var client = googleStreetview.streetViewPublishServiceClient();
      // Mock request
      var request = {};

      // Mock response
      var uploadUrl = 'uploadUrl-242738639';
      var expectedResponse = {
          uploadUrl : uploadUrl
      };

      // Mock Grpc layer
      client._startUpload = mockSimpleGrpcMethod(request, expectedResponse);

      client.startUpload(request, function(err, response) {
        assert.ifError(err);
        assert.deepStrictEqual(response, expectedResponse);
        done();
      });
    });

    it('invokes startUpload with error', function(done) {
      var client = googleStreetview.streetViewPublishServiceClient();
      // Mock request
      var request = {};

      // Mock Grpc layer
      client._startUpload = mockSimpleGrpcMethod(request, null, error);

      client.startUpload(request, function(err, response) {
        assert(err instanceof Error);
        assert.equal(err.code, FAKE_STATUS_CODE);
        done();
      });
    });
  });

  describe('createPhoto', function() {
    it('invokes createPhoto without error', function(done) {
      var client = googleStreetview.streetViewPublishServiceClient();
      // Mock request
      var photo = {};
      var request = {
          photo : photo
      };

      // Mock response
      var downloadUrl = 'downloadUrl1109408056';
      var thumbnailUrl = 'thumbnailUrl1825632156';
      var shareLink = 'shareLink-1788203942';
      var viewCount = -1534353675;
      var expectedResponse = {
          downloadUrl : downloadUrl,
          thumbnailUrl : thumbnailUrl,
          shareLink : shareLink,
          viewCount : viewCount
      };

      // Mock Grpc layer
      client._createPhoto = mockSimpleGrpcMethod(request, expectedResponse);

      client.createPhoto(request, function(err, response) {
        assert.ifError(err);
        assert.deepStrictEqual(response, expectedResponse);
        done();
      });
    });

    it('invokes createPhoto with error', function(done) {
      var client = googleStreetview.streetViewPublishServiceClient();
      // Mock request
      var photo = {};
      var request = {
          photo : photo
      };

      // Mock Grpc layer
      client._createPhoto = mockSimpleGrpcMethod(request, null, error);

      client.createPhoto(request, function(err, response) {
        assert(err instanceof Error);
        assert.equal(err.code, FAKE_STATUS_CODE);
        done();
      });
    });
  });

  describe('getPhoto', function() {
    it('invokes getPhoto without error', function(done) {
      var client = googleStreetview.streetViewPublishServiceClient();
      // Mock request
      var photoId = 'photoId-1274270136';
      var view = googleStreetviewPublishV1.PhotoView.BASIC;
      var request = {
          photoId : photoId,
          view : view
      };

      // Mock response
      var downloadUrl = 'downloadUrl1109408056';
      var thumbnailUrl = 'thumbnailUrl1825632156';
      var shareLink = 'shareLink-1788203942';
      var viewCount = -1534353675;
      var expectedResponse = {
          downloadUrl : downloadUrl,
          thumbnailUrl : thumbnailUrl,
          shareLink : shareLink,
          viewCount : viewCount
      };

      // Mock Grpc layer
      client._getPhoto = mockSimpleGrpcMethod(request, expectedResponse);

      client.getPhoto(request, function(err, response) {
        assert.ifError(err);
        assert.deepStrictEqual(response, expectedResponse);
        done();
      });
    });

    it('invokes getPhoto with error', function(done) {
      var client = googleStreetview.streetViewPublishServiceClient();
      // Mock request
      var photoId = 'photoId-1274270136';
      var view = googleStreetviewPublishV1.PhotoView.BASIC;
      var request = {
          photoId : photoId,
          view : view
      };

      // Mock Grpc layer
      client._getPhoto = mockSimpleGrpcMethod(request, null, error);

      client.getPhoto(request, function(err, response) {
        assert(err instanceof Error);
        assert.equal(err.code, FAKE_STATUS_CODE);
        done();
      });
    });
  });

  describe('batchGetPhotos', function() {
    it('invokes batchGetPhotos without error', function(done) {
      var client = googleStreetview.streetViewPublishServiceClient();
      // Mock request
      var photoIds = [];
      var view = googleStreetviewPublishV1.PhotoView.BASIC;
      var request = {
          photoIds : photoIds,
          view : view
      };

      // Mock response
      var expectedResponse = {};

      // Mock Grpc layer
      client._batchGetPhotos = mockSimpleGrpcMethod(request, expectedResponse);

      client.batchGetPhotos(request, function(err, response) {
        assert.ifError(err);
        assert.deepStrictEqual(response, expectedResponse);
        done();
      });
    });

    it('invokes batchGetPhotos with error', function(done) {
      var client = googleStreetview.streetViewPublishServiceClient();
      // Mock request
      var photoIds = [];
      var view = googleStreetviewPublishV1.PhotoView.BASIC;
      var request = {
          photoIds : photoIds,
          view : view
      };

      // Mock Grpc layer
      client._batchGetPhotos = mockSimpleGrpcMethod(request, null, error);

      client.batchGetPhotos(request, function(err, response) {
        assert(err instanceof Error);
        assert.equal(err.code, FAKE_STATUS_CODE);
        done();
      });
    });
  });

  describe('listPhotos', function() {
    it('invokes listPhotos without error', function(done) {
      var client = googleStreetview.streetViewPublishServiceClient();
      // Mock request
      var view = googleStreetviewPublishV1.PhotoView.BASIC;
      var filter = 'filter-1274492040';
      var request = {
          view : view,
          filter : filter
      };

      // Mock response
      var nextPageToken = '';
      var photosElement = {};
      var photos = [photosElement];
      var expectedResponse = {
          nextPageToken : nextPageToken,
          photos : photos
      };

      // Mock Grpc layer
      client._listPhotos = function(actualRequest, options, callback) {
        assert.deepStrictEqual(actualRequest, request);
        callback(null, expectedResponse.photos);
      };

      client.listPhotos(request, function(err, response) {
        assert.ifError(err);
        assert.deepStrictEqual(response, expectedResponse.photos);
        done();
      });
    });

    it('invokes listPhotos with error', function(done) {
      var client = googleStreetview.streetViewPublishServiceClient();
      // Mock request
      var view = googleStreetviewPublishV1.PhotoView.BASIC;
      var filter = 'filter-1274492040';
      var request = {
          view : view,
          filter : filter
      };

      // Mock Grpc layer
      client._listPhotos = mockSimpleGrpcMethod(request, null, error);

      client.listPhotos(request, function(err, response) {
        assert(err instanceof Error);
        assert.equal(err.code, FAKE_STATUS_CODE);
        done();
      });
    });
  });

  describe('updatePhoto', function() {
    it('invokes updatePhoto without error', function(done) {
      var client = googleStreetview.streetViewPublishServiceClient();
      // Mock request
      var photo = {};
      var updateMask = {};
      var request = {
          photo : photo,
          updateMask : updateMask
      };

      // Mock response
      var downloadUrl = 'downloadUrl1109408056';
      var thumbnailUrl = 'thumbnailUrl1825632156';
      var shareLink = 'shareLink-1788203942';
      var viewCount = -1534353675;
      var expectedResponse = {
          downloadUrl : downloadUrl,
          thumbnailUrl : thumbnailUrl,
          shareLink : shareLink,
          viewCount : viewCount
      };

      // Mock Grpc layer
      client._updatePhoto = mockSimpleGrpcMethod(request, expectedResponse);

      client.updatePhoto(request, function(err, response) {
        assert.ifError(err);
        assert.deepStrictEqual(response, expectedResponse);
        done();
      });
    });

    it('invokes updatePhoto with error', function(done) {
      var client = googleStreetview.streetViewPublishServiceClient();
      // Mock request
      var photo = {};
      var updateMask = {};
      var request = {
          photo : photo,
          updateMask : updateMask
      };

      // Mock Grpc layer
      client._updatePhoto = mockSimpleGrpcMethod(request, null, error);

      client.updatePhoto(request, function(err, response) {
        assert(err instanceof Error);
        assert.equal(err.code, FAKE_STATUS_CODE);
        done();
      });
    });
  });

  describe('batchUpdatePhotos', function() {
    it('invokes batchUpdatePhotos without error', function(done) {
      var client = googleStreetview.streetViewPublishServiceClient();
      // Mock request
      var updatePhotoRequests = [];
      var request = {
          updatePhotoRequests : updatePhotoRequests
      };

      // Mock response
      var expectedResponse = {};

      // Mock Grpc layer
      client._batchUpdatePhotos = mockSimpleGrpcMethod(request, expectedResponse);

      client.batchUpdatePhotos(request, function(err, response) {
        assert.ifError(err);
        assert.deepStrictEqual(response, expectedResponse);
        done();
      });
    });

    it('invokes batchUpdatePhotos with error', function(done) {
      var client = googleStreetview.streetViewPublishServiceClient();
      // Mock request
      var updatePhotoRequests = [];
      var request = {
          updatePhotoRequests : updatePhotoRequests
      };

      // Mock Grpc layer
      client._batchUpdatePhotos = mockSimpleGrpcMethod(request, null, error);

      client.batchUpdatePhotos(request, function(err, response) {
        assert(err instanceof Error);
        assert.equal(err.code, FAKE_STATUS_CODE);
        done();
      });
    });
  });

  describe('deletePhoto', function() {
    it('invokes deletePhoto without error', function(done) {
      var client = googleStreetview.streetViewPublishServiceClient();
      // Mock request
      var photoId = 'photoId-1274270136';
      var request = {
          photoId : photoId
      };

      // Mock Grpc layer
      client._deletePhoto = mockSimpleGrpcMethod(request);

      client.deletePhoto(request, function(err) {
        assert.ifError(err);
        done();
      });
    });

    it('invokes deletePhoto with error', function(done) {
      var client = googleStreetview.streetViewPublishServiceClient();
      // Mock request
      var photoId = 'photoId-1274270136';
      var request = {
          photoId : photoId
      };

      // Mock Grpc layer
      client._deletePhoto = mockSimpleGrpcMethod(request, null, error);

      client.deletePhoto(request, function(err) {
        assert(err instanceof Error);
        assert.equal(err.code, FAKE_STATUS_CODE);
        done();
      });
    });
  });

  describe('batchDeletePhotos', function() {
    it('invokes batchDeletePhotos without error', function(done) {
      var client = googleStreetview.streetViewPublishServiceClient();
      // Mock request
      var photoIds = [];
      var request = {
          photoIds : photoIds
      };

      // Mock response
      var expectedResponse = {};

      // Mock Grpc layer
      client._batchDeletePhotos = mockSimpleGrpcMethod(request, expectedResponse);

      client.batchDeletePhotos(request, function(err, response) {
        assert.ifError(err);
        assert.deepStrictEqual(response, expectedResponse);
        done();
      });
    });

    it('invokes batchDeletePhotos with error', function(done) {
      var client = googleStreetview.streetViewPublishServiceClient();
      // Mock request
      var photoIds = [];
      var request = {
          photoIds : photoIds
      };

      // Mock Grpc layer
      client._batchDeletePhotos = mockSimpleGrpcMethod(request, null, error);

      client.batchDeletePhotos(request, function(err, response) {
        assert(err instanceof Error);
        assert.equal(err.code, FAKE_STATUS_CODE);
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
