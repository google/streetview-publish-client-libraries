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
 *
 * EDITING INSTRUCTIONS
 * This file was generated from the file
 * https://github.com/googleapis/googleapis/blob/master/google/streetview/publish/v1/streetview_publish.proto,
 * and updates to that file get reflected here through a refresh process.
 * For the short term, the refresh process will only be runnable by Google
 * engineers.
 *
 * The only allowed edits are to method and file documentation. A 3-way
 * merge preserves those additions if the generated source changes.
 */
/* TODO: introduce line-wrapping so that it never exceeds the limit. */
/* jscs: disable maximumLineLength */
'use strict';

var configData = require('./street_view_publish_service_client_config');
var extend = require('extend');
var gax = require('google-gax');

var SERVICE_ADDRESS = 'streetviewpublish.googleapis.com';

var DEFAULT_SERVICE_PORT = 443;

var CODE_GEN_NAME_VERSION = 'gapic/0.7.1';

var PAGE_DESCRIPTORS = {
  listPhotos: new gax.PageDescriptor(
      'pageToken',
      'nextPageToken',
      'photos')
};

/**
 * The scopes needed to make gRPC calls to all of the methods defined in
 * this service.
 */
var ALL_SCOPES = [
  'https://www.googleapis.com/auth/streetviewpublish'
];

/**
 * Publishes and connects user-contributed photos on Street View.
 *
 * This will be created through a builder function which can be obtained by the module.
 * See the following example of how to initialize the module and how to access to the builder.
 * @see {@link streetViewPublishServiceClient}
 *
 * @example
 * var googleStreetview = require('google.streetview.publish.v1').v1({
 *   // optional auth parameters.
 * });
 * var client = googleStreetview.streetViewPublishServiceClient();
 *
 * @class
 */
function StreetViewPublishServiceClient(gaxGrpc, grpcClients, opts) {
  opts = extend({
    servicePath: SERVICE_ADDRESS,
    port: DEFAULT_SERVICE_PORT,
    clientConfig: {}
  }, opts);

  var googleApiClient = [
    'gl-node/' + process.versions.node
  ];
  if (opts.libName && opts.libVersion) {
    googleApiClient.push(opts.libName + '/' + opts.libVersion);
  }
  googleApiClient.push(
    CODE_GEN_NAME_VERSION,
    'gax/' + gax.version,
    'grpc/' + gaxGrpc.grpcVersion
  );

  var defaults = gaxGrpc.constructSettings(
      'google.streetview.publish.v1.StreetViewPublishService',
      configData,
      opts.clientConfig,
      {'x-goog-api-client': googleApiClient.join(' ')});

  var self = this;

  this.auth = gaxGrpc.auth;
  var streetViewPublishServiceStub = gaxGrpc.createStub(
      grpcClients.google.streetview.publish.v1.StreetViewPublishService,
      opts);
  var streetViewPublishServiceStubMethods = [
    'startUpload',
    'createPhoto',
    'getPhoto',
    'batchGetPhotos',
    'listPhotos',
    'updatePhoto',
    'batchUpdatePhotos',
    'deletePhoto',
    'batchDeletePhotos'
  ];
  streetViewPublishServiceStubMethods.forEach(function(methodName) {
    self['_' + methodName] = gax.createApiCall(
      streetViewPublishServiceStub.then(function(streetViewPublishServiceStub) {
        return function() {
          var args = Array.prototype.slice.call(arguments, 0);
          return streetViewPublishServiceStub[methodName].apply(streetViewPublishServiceStub, args);
        };
      }),
      defaults[methodName],
      PAGE_DESCRIPTORS[methodName]);
  });
}


/**
 * Get the project ID used by this class.
 * @param {function(Error, string)} callback - the callback to be called with
 *   the current project Id.
 */
StreetViewPublishServiceClient.prototype.getProjectId = function(callback) {
  return this.auth.getProjectId(callback);
};

// Service calls

/**
 * Creates an upload session to start uploading photo data. The upload URL of
 * the returned `UploadRef` is used to upload the data for the photo.
 *
 * After the upload is complete, the `UploadRef` is used with
 * `StreetViewPublishService:CreatePhoto()` to create the `Photo` object
 * entry.
 *
 * @param {Object=} request
 *   The request object that will be sent.
 * @param {Object=} options
 *   Optional parameters. You can override the default settings for this call, e.g, timeout,
 *   retries, paginations, etc. See [gax.CallOptions]{@link https://googleapis.github.io/gax-nodejs/global.html#CallOptions} for the details.
 * @param {function(?Error, ?Object)=} callback
 *   The function which will be called with the result of the API call.
 *
 *   The second parameter to the callback is an object representing [UploadRef]{@link UploadRef}.
 * @return {Promise} - The promise which resolves to an array.
 *   The first element of the array is an object representing [UploadRef]{@link UploadRef}.
 *   The promise has a method named "cancel" which cancels the ongoing API call.
 *
 * @example
 *
 * var client = googleStreetview.streetViewPublishServiceClient();
 *
 * client.startUpload({}).then(function(responses) {
 *     var response = responses[0];
 *     // doThingsWith(response)
 * }).catch(function(err) {
 *     console.error(err);
 * });
 */
StreetViewPublishServiceClient.prototype.startUpload = function(request, options, callback) {
  if (options instanceof Function && callback === undefined) {
    callback = options;
    options = {};
  }
  if (options === undefined) {
    options = {};
  }
  if (request === undefined) {
    request = {};
  }
  return this._startUpload(request, options, callback);
};

/**
 * After the client finishes uploading the photo with the returned
 * `UploadRef`, `photo.create` publishes the uploaded photo to Street View on
 * Google Maps.
 *
 * This method returns the following error codes:
 *
 * * `INVALID_ARGUMENT` if the request is malformed.
 * * `NOT_FOUND` if the upload reference does not exist.
 *
 * @param {Object} request
 *   The request object that will be sent.
 * @param {Object} request.photo
 *   Required. Photo to create.
 *
 *   This object should have the same structure as [Photo]{@link Photo}
 * @param {Object=} options
 *   Optional parameters. You can override the default settings for this call, e.g, timeout,
 *   retries, paginations, etc. See [gax.CallOptions]{@link https://googleapis.github.io/gax-nodejs/global.html#CallOptions} for the details.
 * @param {function(?Error, ?Object)=} callback
 *   The function which will be called with the result of the API call.
 *
 *   The second parameter to the callback is an object representing [Photo]{@link Photo}.
 * @return {Promise} - The promise which resolves to an array.
 *   The first element of the array is an object representing [Photo]{@link Photo}.
 *   The promise has a method named "cancel" which cancels the ongoing API call.
 *
 * @example
 *
 * var client = googleStreetview.streetViewPublishServiceClient();
 * var photo = {};
 * client.createPhoto({photo: photo}).then(function(responses) {
 *     var response = responses[0];
 *     // doThingsWith(response)
 * }).catch(function(err) {
 *     console.error(err);
 * });
 */
StreetViewPublishServiceClient.prototype.createPhoto = function(request, options, callback) {
  if (options instanceof Function && callback === undefined) {
    callback = options;
    options = {};
  }
  if (options === undefined) {
    options = {};
  }

  return this._createPhoto(request, options, callback);
};

/**
 * Gets the metadata of the specified `Photo`.
 *
 * This method returns the following error codes:
 *
 * * `PERMISSION_DENIED` if the requesting user did not create the requested
 * photo.
 * * `NOT_FOUND` if the requested photo does not exist.
 *
 * @param {Object} request
 *   The request object that will be sent.
 * @param {string} request.photoId
 *   Required. ID of the photo.
 * @param {number} request.view
 *   Specifies if a download URL for the photo bytes should be returned in the
 *   Photo response.
 *
 *   The number should be among the values of [PhotoView]{@link PhotoView}
 * @param {Object=} options
 *   Optional parameters. You can override the default settings for this call, e.g, timeout,
 *   retries, paginations, etc. See [gax.CallOptions]{@link https://googleapis.github.io/gax-nodejs/global.html#CallOptions} for the details.
 * @param {function(?Error, ?Object)=} callback
 *   The function which will be called with the result of the API call.
 *
 *   The second parameter to the callback is an object representing [Photo]{@link Photo}.
 * @return {Promise} - The promise which resolves to an array.
 *   The first element of the array is an object representing [Photo]{@link Photo}.
 *   The promise has a method named "cancel" which cancels the ongoing API call.
 *
 * @example
 *
 * var client = googleStreetview.streetViewPublishServiceClient();
 * var photoId = '';
 * var view = googleStreetviewPublishV1.PhotoView.BASIC;
 * var request = {
 *     photoId: photoId,
 *     view: view
 * };
 * client.getPhoto(request).then(function(responses) {
 *     var response = responses[0];
 *     // doThingsWith(response)
 * }).catch(function(err) {
 *     console.error(err);
 * });
 */
StreetViewPublishServiceClient.prototype.getPhoto = function(request, options, callback) {
  if (options instanceof Function && callback === undefined) {
    callback = options;
    options = {};
  }
  if (options === undefined) {
    options = {};
  }

  return this._getPhoto(request, options, callback);
};

/**
 * Gets the metadata of the specified `Photo` batch.
 *
 * Note that if `photos.batchGet` fails, either critical fields are
 * missing or there was an authentication error.
 * Even if `photos.batchGet` succeeds, there may have been failures
 * for single photos in the batch. These failures will be specified in
 * `BatchGetPhotosResponse.results.status`.
 * See `photo.get` for specific failures that will occur per photo.
 *
 * @param {Object} request
 *   The request object that will be sent.
 * @param {string[]} request.photoIds
 *   Required. IDs of the photos.
 * @param {number} request.view
 *   Specifies if a download URL for the photo bytes should be returned in the
 *   Photo response.
 *
 *   The number should be among the values of [PhotoView]{@link PhotoView}
 * @param {Object=} options
 *   Optional parameters. You can override the default settings for this call, e.g, timeout,
 *   retries, paginations, etc. See [gax.CallOptions]{@link https://googleapis.github.io/gax-nodejs/global.html#CallOptions} for the details.
 * @param {function(?Error, ?Object)=} callback
 *   The function which will be called with the result of the API call.
 *
 *   The second parameter to the callback is an object representing [BatchGetPhotosResponse]{@link BatchGetPhotosResponse}.
 * @return {Promise} - The promise which resolves to an array.
 *   The first element of the array is an object representing [BatchGetPhotosResponse]{@link BatchGetPhotosResponse}.
 *   The promise has a method named "cancel" which cancels the ongoing API call.
 *
 * @example
 *
 * var client = googleStreetview.streetViewPublishServiceClient();
 * var photoIds = [];
 * var view = googleStreetviewPublishV1.PhotoView.BASIC;
 * var request = {
 *     photoIds: photoIds,
 *     view: view
 * };
 * client.batchGetPhotos(request).then(function(responses) {
 *     var response = responses[0];
 *     // doThingsWith(response)
 * }).catch(function(err) {
 *     console.error(err);
 * });
 */
StreetViewPublishServiceClient.prototype.batchGetPhotos = function(request, options, callback) {
  if (options instanceof Function && callback === undefined) {
    callback = options;
    options = {};
  }
  if (options === undefined) {
    options = {};
  }

  return this._batchGetPhotos(request, options, callback);
};

/**
 * Lists all the photos that belong to the user.
 *
 * @param {Object} request
 *   The request object that will be sent.
 * @param {number} request.view
 *   Specifies if a download URL for the photos bytes should be returned in the
 *   Photos response.
 *
 *   The number should be among the values of [PhotoView]{@link PhotoView}
 * @param {string} request.filter
 *   The filter expression.
 *   Example: `placeId=ChIJj61dQgK6j4AR4GeTYWZsKWw`
 * @param {number=} request.pageSize
 *   The maximum number of resources contained in the underlying API
 *   response. If page streaming is performed per-resource, this
 *   parameter does not affect the return value. If page streaming is
 *   performed per-page, this determines the maximum number of
 *   resources in a page.
 * @param {Object=} options
 *   Optional parameters. You can override the default settings for this call, e.g, timeout,
 *   retries, paginations, etc. See [gax.CallOptions]{@link https://googleapis.github.io/gax-nodejs/global.html#CallOptions} for the details.
 * @param {function(?Error, ?Array, ?Object, ?Object)=} callback
 *   The function which will be called with the result of the API call.
 *
 *   The second parameter to the callback is Array of [Photo]{@link Photo}.
 *
 *   When autoPaginate: false is specified through options, it contains the result
 *   in a single response. If the response indicates the next page exists, the third
 *   parameter is set to be used for the next request object. The fourth parameter keeps
 *   the raw response object of an object representing [ListPhotosResponse]{@link ListPhotosResponse}.
 * @return {Promise} - The promise which resolves to an array.
 *   The first element of the array is Array of [Photo]{@link Photo}.
 *
 *   When autoPaginate: false is specified through options, the array has three elements.
 *   The first element is Array of [Photo]{@link Photo} in a single response.
 *   The second element is the next request object if the response
 *   indicates the next page exists, or null. The third element is
 *   an object representing [ListPhotosResponse]{@link ListPhotosResponse}.
 *
 *   The promise has a method named "cancel" which cancels the ongoing API call.
 *
 * @example
 *
 * var client = googleStreetview.streetViewPublishServiceClient();
 * var view = googleStreetviewPublishV1.PhotoView.BASIC;
 * var filter = '';
 * var request = {
 *     view: view,
 *     filter: filter
 * };
 * // Iterate over all elements.
 * client.listPhotos(request).then(function(responses) {
 *     var resources = responses[0];
 *     for (var i = 0; i < resources.length; ++i) {
 *         // doThingsWith(resources[i])
 *     }
 * }).catch(function(err) {
 *     console.error(err);
 * });
 *
 * // Or obtain the paged response.
 * var options = {autoPaginate: false};
 * function callback(responses) {
 *     // The actual resources in a response.
 *     var resources = responses[0];
 *     // The next request if the response shows there's more responses.
 *     var nextRequest = responses[1];
 *     // The actual response object, if necessary.
 *     // var rawResponse = responses[2];
 *     for (var i = 0; i < resources.length; ++i) {
 *         // doThingsWith(resources[i]);
 *     }
 *     if (nextRequest) {
 *         // Fetch the next page.
 *         return client.listPhotos(nextRequest, options).then(callback);
 *     }
 * }
 * client.listPhotos(request, options)
 *     .then(callback)
 *     .catch(function(err) {
 *         console.error(err);
 *     });
 */
StreetViewPublishServiceClient.prototype.listPhotos = function(request, options, callback) {
  if (options instanceof Function && callback === undefined) {
    callback = options;
    options = {};
  }
  if (options === undefined) {
    options = {};
  }

  return this._listPhotos(request, options, callback);
};

/**
 * Equivalent to {@link listPhotos}, but returns a NodeJS Stream object.
 *
 * This fetches the paged responses for {@link listPhotos} continuously
 * and invokes the callback registered for 'data' event for each element in the
 * responses.
 *
 * The returned object has 'end' method when no more elements are required.
 *
 * autoPaginate option will be ignored.
 *
 * @see {@link https://nodejs.org/api/stream.html}
 *
 * @param {Object} request
 *   The request object that will be sent.
 * @param {number} request.view
 *   Specifies if a download URL for the photos bytes should be returned in the
 *   Photos response.
 *
 *   The number should be among the values of [PhotoView]{@link PhotoView}
 * @param {string} request.filter
 *   The filter expression.
 *   Example: `placeId=ChIJj61dQgK6j4AR4GeTYWZsKWw`
 * @param {number=} request.pageSize
 *   The maximum number of resources contained in the underlying API
 *   response. If page streaming is performed per-resource, this
 *   parameter does not affect the return value. If page streaming is
 *   performed per-page, this determines the maximum number of
 *   resources in a page.
 * @param {Object=} options
 *   Optional parameters. You can override the default settings for this call, e.g, timeout,
 *   retries, paginations, etc. See [gax.CallOptions]{@link https://googleapis.github.io/gax-nodejs/global.html#CallOptions} for the details.
 * @return {Stream}
 *   An object stream which emits an object representing [Photo]{@link Photo} on 'data' event.
 *
 * @example
 *
 * var client = googleStreetview.streetViewPublishServiceClient();
 * var view = googleStreetviewPublishV1.PhotoView.BASIC;
 * var filter = '';
 * var request = {
 *     view: view,
 *     filter: filter
 * };
 * client.listPhotosStream(request).on('data', function(element) {
 *     // doThingsWith(element)
 * }).on('error', function(err) {
 *     console.error(err);
 * });
 */
StreetViewPublishServiceClient.prototype.listPhotosStream = function(request, options) {
  if (options === undefined) {
    options = {};
  }

  return PAGE_DESCRIPTORS.listPhotos.createStream(this._listPhotos, request, options);
};

/**
 * Updates the metadata of a photo, such as pose, place association, etc.
 * Changing the pixels of a photo is not supported.
 *
 * This method returns the following error codes:
 *
 * * `PERMISSION_DENIED` if the requesting user did not create the requested
 * photo.
 * * `INVALID_ARGUMENT` if the request is malformed.
 * * `NOT_FOUND` if the photo ID does not exist.
 *
 * @param {Object} request
 *   The request object that will be sent.
 * @param {Object} request.photo
 *   Required. Photo object containing the new metadata. Only the fields
 *   specified in `update_mask` are used. If `update_mask` is not present, the
 *   update applies to all fields.
 *   **Note:** To update `pose.altitude`, `pose.latlngpair` has to be filled as
 *   well. Otherwise, the request will fail.
 *
 *   This object should have the same structure as [Photo]{@link Photo}
 * @param {Object} request.updateMask
 *   Mask that identifies fields on the photo metadata to update.
 *   If not present, the old Photo metadata will be entirely replaced with the
 *   new Photo metadata in this request. The update fails if invalid fields are
 *   specified. Multiple fields can be specified in a comma-delimited list.
 *
 *   The following fields are valid:
 *
 *   * `pose.heading`
 *   * `pose.latlngpair`
 *   * `pose.level`
 *   * `pose.altitude`
 *   * `connections`
 *   * `places`
 *
 *
 *   **Note:** Repeated fields in `update_mask` mean the entire set of repeated
 *   values will be replaced with the new contents. For example, if
 *   `UpdatePhotoRequest.photo.update_mask` contains `connections` and
 *   `UpdatePhotoRequest.photo.connections` is empty, all connections will be
 *   removed.
 *
 *   This object should have the same structure as [google.protobuf.FieldMask]{@link external:"google.protobuf.FieldMask"}
 * @param {Object=} options
 *   Optional parameters. You can override the default settings for this call, e.g, timeout,
 *   retries, paginations, etc. See [gax.CallOptions]{@link https://googleapis.github.io/gax-nodejs/global.html#CallOptions} for the details.
 * @param {function(?Error, ?Object)=} callback
 *   The function which will be called with the result of the API call.
 *
 *   The second parameter to the callback is an object representing [Photo]{@link Photo}.
 * @return {Promise} - The promise which resolves to an array.
 *   The first element of the array is an object representing [Photo]{@link Photo}.
 *   The promise has a method named "cancel" which cancels the ongoing API call.
 *
 * @example
 *
 * var client = googleStreetview.streetViewPublishServiceClient();
 * var photo = {};
 * var updateMask = {};
 * var request = {
 *     photo: photo,
 *     updateMask: updateMask
 * };
 * client.updatePhoto(request).then(function(responses) {
 *     var response = responses[0];
 *     // doThingsWith(response)
 * }).catch(function(err) {
 *     console.error(err);
 * });
 */
StreetViewPublishServiceClient.prototype.updatePhoto = function(request, options, callback) {
  if (options instanceof Function && callback === undefined) {
    callback = options;
    options = {};
  }
  if (options === undefined) {
    options = {};
  }

  return this._updatePhoto(request, options, callback);
};

/**
 * Updates the metadata of photos, such as pose, place association, etc.
 * Changing the pixels of a photo is not supported.
 *
 * Note that if `photos.batchUpdate` fails, either critical fields
 * are missing or there was an authentication error.
 * Even if `photos.batchUpdate` succeeds, there may have been
 * failures for single photos in the batch. These failures will be specified
 * in `BatchUpdatePhotosResponse.results.status`.
 * See `UpdatePhoto` for specific failures that will occur per photo.
 *
 * @param {Object} request
 *   The request object that will be sent.
 * @param {Object[]} request.updatePhotoRequests
 *   Required. List of update photo requests.
 *
 *   This object should have the same structure as [UpdatePhotoRequest]{@link UpdatePhotoRequest}
 * @param {Object=} options
 *   Optional parameters. You can override the default settings for this call, e.g, timeout,
 *   retries, paginations, etc. See [gax.CallOptions]{@link https://googleapis.github.io/gax-nodejs/global.html#CallOptions} for the details.
 * @param {function(?Error, ?Object)=} callback
 *   The function which will be called with the result of the API call.
 *
 *   The second parameter to the callback is an object representing [BatchUpdatePhotosResponse]{@link BatchUpdatePhotosResponse}.
 * @return {Promise} - The promise which resolves to an array.
 *   The first element of the array is an object representing [BatchUpdatePhotosResponse]{@link BatchUpdatePhotosResponse}.
 *   The promise has a method named "cancel" which cancels the ongoing API call.
 *
 * @example
 *
 * var client = googleStreetview.streetViewPublishServiceClient();
 * var updatePhotoRequests = [];
 * client.batchUpdatePhotos({updatePhotoRequests: updatePhotoRequests}).then(function(responses) {
 *     var response = responses[0];
 *     // doThingsWith(response)
 * }).catch(function(err) {
 *     console.error(err);
 * });
 */
StreetViewPublishServiceClient.prototype.batchUpdatePhotos = function(request, options, callback) {
  if (options instanceof Function && callback === undefined) {
    callback = options;
    options = {};
  }
  if (options === undefined) {
    options = {};
  }

  return this._batchUpdatePhotos(request, options, callback);
};

/**
 * Deletes a photo and its metadata.
 *
 * This method returns the following error codes:
 *
 * * `PERMISSION_DENIED` if the requesting user did not create the requested
 * photo.
 * * `NOT_FOUND` if the photo ID does not exist.
 *
 * @param {Object} request
 *   The request object that will be sent.
 * @param {string} request.photoId
 *   Required. ID of the photo.
 * @param {Object=} options
 *   Optional parameters. You can override the default settings for this call, e.g, timeout,
 *   retries, paginations, etc. See [gax.CallOptions]{@link https://googleapis.github.io/gax-nodejs/global.html#CallOptions} for the details.
 * @param {function(?Error)=} callback
 *   The function which will be called with the result of the API call.
 * @return {Promise} - The promise which resolves when API call finishes.
 *   The promise has a method named "cancel" which cancels the ongoing API call.
 *
 * @example
 *
 * var client = googleStreetview.streetViewPublishServiceClient();
 * var photoId = '';
 * client.deletePhoto({photoId: photoId}).catch(function(err) {
 *     console.error(err);
 * });
 */
StreetViewPublishServiceClient.prototype.deletePhoto = function(request, options, callback) {
  if (options instanceof Function && callback === undefined) {
    callback = options;
    options = {};
  }
  if (options === undefined) {
    options = {};
  }

  return this._deletePhoto(request, options, callback);
};

/**
 * Deletes a list of photos and their metadata.
 *
 * Note that if `photos.batchDelete` fails, either critical fields
 * are missing or there was an authentication error.
 * Even if `photos.batchDelete` succeeds, there may have been
 * failures for single photos in the batch. These failures will be specified
 * in `BatchDeletePhotosResponse.status`.
 * See `photo.update` for specific failures that will occur per photo.
 *
 * @param {Object} request
 *   The request object that will be sent.
 * @param {string[]} request.photoIds
 *   Required. List of delete photo requests.
 * @param {Object=} options
 *   Optional parameters. You can override the default settings for this call, e.g, timeout,
 *   retries, paginations, etc. See [gax.CallOptions]{@link https://googleapis.github.io/gax-nodejs/global.html#CallOptions} for the details.
 * @param {function(?Error, ?Object)=} callback
 *   The function which will be called with the result of the API call.
 *
 *   The second parameter to the callback is an object representing [BatchDeletePhotosResponse]{@link BatchDeletePhotosResponse}.
 * @return {Promise} - The promise which resolves to an array.
 *   The first element of the array is an object representing [BatchDeletePhotosResponse]{@link BatchDeletePhotosResponse}.
 *   The promise has a method named "cancel" which cancels the ongoing API call.
 *
 * @example
 *
 * var client = googleStreetview.streetViewPublishServiceClient();
 * var photoIds = [];
 * client.batchDeletePhotos({photoIds: photoIds}).then(function(responses) {
 *     var response = responses[0];
 *     // doThingsWith(response)
 * }).catch(function(err) {
 *     console.error(err);
 * });
 */
StreetViewPublishServiceClient.prototype.batchDeletePhotos = function(request, options, callback) {
  if (options instanceof Function && callback === undefined) {
    callback = options;
    options = {};
  }
  if (options === undefined) {
    options = {};
  }

  return this._batchDeletePhotos(request, options, callback);
};

function StreetViewPublishServiceClientBuilder(gaxGrpc) {
  if (!(this instanceof StreetViewPublishServiceClientBuilder)) {
    return new StreetViewPublishServiceClientBuilder(gaxGrpc);
  }

  var streetViewPublishServiceClient = require('grpc-google-streetview-publish-v1').client;
  extend(this, streetViewPublishServiceClient.google.streetview.publish.v1);


  /**
   * Build a new instance of {@link StreetViewPublishServiceClient}.
   *
   * @param {Object=} opts - The optional parameters.
   * @param {String=} opts.servicePath
   *   The domain name of the API remote host.
   * @param {number=} opts.port
   *   The port on which to connect to the remote host.
   * @param {grpc.ClientCredentials=} opts.sslCreds
   *   A ClientCredentials for use with an SSL-enabled channel.
   * @param {Object=} opts.clientConfig
   *   The customized config to build the call settings. See
   *   {@link gax.constructSettings} for the format.
   */
  this.streetViewPublishServiceClient = function(opts) {
    return new StreetViewPublishServiceClient(gaxGrpc, streetViewPublishServiceClient, opts);
  };
  extend(this.streetViewPublishServiceClient, StreetViewPublishServiceClient);
}
module.exports = StreetViewPublishServiceClientBuilder;
module.exports.SERVICE_ADDRESS = SERVICE_ADDRESS;
module.exports.ALL_SCOPES = ALL_SCOPES;