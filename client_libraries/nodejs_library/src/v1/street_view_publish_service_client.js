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

const gapicConfig = require('./street_view_publish_service_client_config');
const gax = require('google-gax');
const merge = require('lodash.merge');
const path = require('path');

const VERSION = require('../../package.json').version;

/**
 * Publishes and connects user-contributed photos on Street View.
 *
 * @class
 * @memberof v1
 */
class StreetViewPublishServiceClient {
  /**
   * Construct an instance of StreetViewPublishServiceClient.
   *
   * @param {object} [options] - The configuration object. See the subsequent
   *   parameters for more details.
   * @param {object} [options.credentials] - Credentials object.
   * @param {string} [options.credentials.client_email]
   * @param {string} [options.credentials.private_key]
   * @param {string} [options.email] - Account email address. Required when
   *     using a .pem or .p12 keyFilename.
   * @param {string} [options.keyFilename] - Full path to the a .json, .pem, or
   *     .p12 key downloaded from the Google Developers Console. If you provide
   *     a path to a JSON file, the projectId option below is not necessary.
   *     NOTE: .pem and .p12 require you to specify options.email as well.
   * @param {number} [options.port] - The port on which to connect to
   *     the remote host.
   * @param {string} [options.projectId] - The project ID from the Google
   *     Developer's Console, e.g. 'grape-spaceship-123'. We will also check
   *     the environment variable GCLOUD_PROJECT for your project ID. If your
   *     app is running in an environment which supports
   *     {@link https://developers.google.com/identity/protocols/application-default-credentials Application Default Credentials},
   *     your project ID will be detected automatically.
   * @param {function} [options.promise] - Custom promise module to use instead
   *     of native Promises.
   * @param {string} [options.servicePath] - The domain name of the
   *     API remote host.
   */
  constructor(opts) {
    this._descriptors = {};

    // Ensure that options include the service address and port.
    opts = Object.assign(
      {
        clientConfig: {},
        port: this.constructor.port,
        servicePath: this.constructor.servicePath,
      },
      opts
    );

    // Create a `gaxGrpc` object, with any grpc-specific options
    // sent to the client.
    opts.scopes = this.constructor.scopes;
    const gaxGrpc = new gax.GrpcClient(opts);

    // Save the auth object to the client, for use by other methods.
    this.auth = gaxGrpc.auth;

    // Determine the client header string.
    const clientHeader = [
      `gl-node/${process.version}`,
      `grpc/${gaxGrpc.grpcVersion}`,
      `gax/${gax.version}`,
      `gapic/${VERSION}`,
    ];
    if (opts.libName && opts.libVersion) {
      clientHeader.push(`${opts.libName}/${opts.libVersion}`);
    }

    // Load the applicable protos.
    const protos = merge(
      {},
      gaxGrpc.loadProto(
        path.join(__dirname, '..', '..', 'protos'),
        'google/streetview/publish/v1/streetview_publish.proto'
      )
    );

    // Some of the methods on this service return "paged" results,
    // (e.g. 50 results at a time, with tokens to get subsequent
    // pages). Denote the keys used for pagination and results.
    this._descriptors.page = {
      listPhotos: new gax.PageDescriptor(
        'pageToken',
        'nextPageToken',
        'photos'
      ),
    };

    // Put together the default options sent with requests.
    const defaults = gaxGrpc.constructSettings(
      'google.streetview.publish.v1.StreetViewPublishService',
      gapicConfig,
      opts.clientConfig,
      {'x-goog-api-client': clientHeader.join(' ')}
    );

    // Set up a dictionary of "inner API calls"; the core implementation
    // of calling the API is handled in `google-gax`, with this code
    // merely providing the destination and request information.
    this._innerApiCalls = {};

    // Put together the "service stub" for
    // google.streetview.publish.v1.StreetViewPublishService.
    const streetViewPublishServiceStub = gaxGrpc.createStub(
      protos.google.streetview.publish.v1.StreetViewPublishService,
      opts
    );

    // Iterate over each of the methods that the service provides
    // and create an API call method for each.
    const streetViewPublishServiceStubMethods = [
      'startUpload',
      'createPhoto',
      'getPhoto',
      'batchGetPhotos',
      'listPhotos',
      'updatePhoto',
      'batchUpdatePhotos',
      'deletePhoto',
      'batchDeletePhotos',
    ];
    for (const methodName of streetViewPublishServiceStubMethods) {
      this._innerApiCalls[methodName] = gax.createApiCall(
        streetViewPublishServiceStub.then(
          stub =>
            function() {
              const args = Array.prototype.slice.call(arguments, 0);
              return stub[methodName].apply(stub, args);
            },
          err =>
            function() {
              throw err;
            }
        ),
        defaults[methodName],
        this._descriptors.page[methodName]
      );
    }
  }

  /**
   * The DNS address for this API service.
   */
  static get servicePath() {
    return 'streetviewpublish.googleapis.com';
  }

  /**
   * The port for this API service.
   */
  static get port() {
    return 443;
  }

  /**
   * The scopes needed to make gRPC calls for every method defined
   * in this service.
   */
  static get scopes() {
    return [
      'https://www.googleapis.com/auth/streetviewpublish',
    ];
  }

  /**
   * Return the project ID used by this class.
   * @param {function(Error, string)} callback - the callback to
   *   be called with the current project Id.
   */
  getProjectId(callback) {
    return this.auth.getProjectId(callback);
  }

  // -------------------
  // -- Service calls --
  // -------------------

  /**
   * Creates an upload session to start uploading photo bytes. The method uses
   * the upload URL of the returned
   * UploadRef to upload the bytes for
   * the Photo.
   *
   * In addition to the photo requirements shown in
   * https://support.google.com/maps/answer/7012050?hl=en&ref_topic=6275604,
   * the photo must meet the following requirements:
   *
   * * Photo Sphere XMP metadata must be included in the photo medadata. See
   * https://developers.google.com/streetview/spherical-metadata for the
   * required fields.
   * * The pixel size of the photo must meet the size requirements listed in
   * https://support.google.com/maps/answer/7012050?hl=en&ref_topic=6275604, and
   * the photo must be a full 360 horizontally.
   *
   * After the upload completes, the method uses
   * UploadRef with
   * CreatePhoto
   * to create the Photo object entry.
   *
   * @param {Object} [request]
   *   The request object that will be sent.
   * @param {Object} [options]
   *   Optional parameters. You can override the default settings for this call, e.g, timeout,
   *   retries, paginations, etc. See [gax.CallOptions]{@link https://googleapis.github.io/gax-nodejs/global.html#CallOptions} for the details.
   * @param {function(?Error, ?Object)} [callback]
   *   The function which will be called with the result of the API call.
   *
   *   The second parameter to the callback is an object representing [UploadRef]{@link google.streetview.publish.v1.UploadRef}.
   * @returns {Promise} - The promise which resolves to an array.
   *   The first element of the array is an object representing [UploadRef]{@link google.streetview.publish.v1.UploadRef}.
   *   The promise has a method named "cancel" which cancels the ongoing API call.
   *
   * @example
   *
   * const google = require('google.streetview.publish.v1');
   *
   * const client = new google.v1.StreetViewPublishServiceClient({
   *   // optional auth parameters.
   * });
   *
   *
   * client.startUpload({})
   *   .then(responses => {
   *     const response = responses[0];
   *     // doThingsWith(response)
   *   })
   *   .catch(err => {
   *     console.error(err);
   *   });
   */
  startUpload(request, options, callback) {
    if (options instanceof Function && callback === undefined) {
      callback = options;
      options = {};
    }
    options = options || {};
    if (request === undefined) {
      request = {};
    }
    return this._innerApiCalls.startUpload(request, options, callback);
  }

  /**
   * After the client finishes uploading the photo with the returned
   * UploadRef,
   * CreatePhoto
   * publishes the uploaded Photo to
   * Street View on Google Maps.
   *
   * Currently, the only way to set heading, pitch, and roll in CreatePhoto is
   * through the [Photo Sphere XMP
   * metadata](https://developers.google.com/streetview/spherical-metadata) in
   * the photo bytes. CreatePhoto ignores the `pose.heading`, `pose.pitch`,
   * `pose.roll`, `pose.altitude`, and `pose.level` fields in Pose.
   *
   * This method returns the following error codes:
   *
   * * google.rpc.Code.INVALID_ARGUMENT if
   * the request is malformed or if the uploaded photo is not a 360 photo.
   * * google.rpc.Code.NOT_FOUND if the upload
   * reference does not exist.
   * * google.rpc.Code.RESOURCE_EXHAUSTED
   * if the account has reached the storage limit.
   *
   * @param {Object} request
   *   The request object that will be sent.
   * @param {Object} request.photo
   *   Required. Photo to create.
   *
   *   This object should have the same structure as [Photo]{@link google.streetview.publish.v1.Photo}
   * @param {Object} [options]
   *   Optional parameters. You can override the default settings for this call, e.g, timeout,
   *   retries, paginations, etc. See [gax.CallOptions]{@link https://googleapis.github.io/gax-nodejs/global.html#CallOptions} for the details.
   * @param {function(?Error, ?Object)} [callback]
   *   The function which will be called with the result of the API call.
   *
   *   The second parameter to the callback is an object representing [Photo]{@link google.streetview.publish.v1.Photo}.
   * @returns {Promise} - The promise which resolves to an array.
   *   The first element of the array is an object representing [Photo]{@link google.streetview.publish.v1.Photo}.
   *   The promise has a method named "cancel" which cancels the ongoing API call.
   *
   * @example
   *
   * const google = require('google.streetview.publish.v1');
   *
   * const client = new google.v1.StreetViewPublishServiceClient({
   *   // optional auth parameters.
   * });
   *
   * const photo = {};
   * client.createPhoto({photo: photo})
   *   .then(responses => {
   *     const response = responses[0];
   *     // doThingsWith(response)
   *   })
   *   .catch(err => {
   *     console.error(err);
   *   });
   */
  createPhoto(request, options, callback) {
    if (options instanceof Function && callback === undefined) {
      callback = options;
      options = {};
    }
    options = options || {};

    return this._innerApiCalls.createPhoto(request, options, callback);
  }

  /**
   * Gets the metadata of the specified
   * Photo.
   *
   * This method returns the following error codes:
   *
   * * google.rpc.Code.PERMISSION_DENIED if
   * the requesting user did not create the requested
   * Photo.
   * * google.rpc.Code.NOT_FOUND if the requested
   * Photo does not exist.
   * * google.rpc.Code.UNAVAILABLE if the
   * requested Photo is still being
   * indexed.
   *
   * @param {Object} request
   *   The request object that will be sent.
   * @param {string} request.photoId
   *   Required. ID of the Photo.
   * @param {number} request.view
   *   Specifies if a download URL for the photo bytes should be returned in the
   *   Photo response.
   *
   *   The number should be among the values of [PhotoView]{@link google.streetview.publish.v1.PhotoView}
   * @param {string} [request.languageCode]
   *   The BCP-47 language code, such as "en-US" or "sr-Latn". For more
   *   information, see
   *   http://www.unicode.org/reports/tr35/#Unicode_locale_identifier.
   *   If language_code is unspecified, the user's language preference for Google
   *   services is used.
   * @param {Object} [options]
   *   Optional parameters. You can override the default settings for this call, e.g, timeout,
   *   retries, paginations, etc. See [gax.CallOptions]{@link https://googleapis.github.io/gax-nodejs/global.html#CallOptions} for the details.
   * @param {function(?Error, ?Object)} [callback]
   *   The function which will be called with the result of the API call.
   *
   *   The second parameter to the callback is an object representing [Photo]{@link google.streetview.publish.v1.Photo}.
   * @returns {Promise} - The promise which resolves to an array.
   *   The first element of the array is an object representing [Photo]{@link google.streetview.publish.v1.Photo}.
   *   The promise has a method named "cancel" which cancels the ongoing API call.
   *
   * @example
   *
   * const google = require('google.streetview.publish.v1');
   *
   * const client = new google.v1.StreetViewPublishServiceClient({
   *   // optional auth parameters.
   * });
   *
   * const photoId = '';
   * const view = 'BASIC';
   * const request = {
   *   photoId: photoId,
   *   view: view,
   * };
   * client.getPhoto(request)
   *   .then(responses => {
   *     const response = responses[0];
   *     // doThingsWith(response)
   *   })
   *   .catch(err => {
   *     console.error(err);
   *   });
   */
  getPhoto(request, options, callback) {
    if (options instanceof Function && callback === undefined) {
      callback = options;
      options = {};
    }
    options = options || {};

    return this._innerApiCalls.getPhoto(request, options, callback);
  }

  /**
   * Gets the metadata of the specified
   * Photo batch.
   *
   * Note that if
   * BatchGetPhotos
   * fails, either critical fields are missing or there is an authentication
   * error. Even if
   * BatchGetPhotos
   * succeeds, individual photos in the batch may have failures.
   * These failures are specified in each
   * PhotoResponse.status
   * in
   * BatchGetPhotosResponse.results.
   * See
   * GetPhoto
   * for specific failures that can occur per photo.
   *
   * @param {Object} request
   *   The request object that will be sent.
   * @param {string[]} request.photoIds
   *   Required. IDs of the Photos. HTTP GET
   *   requests require the following syntax for the URL query parameter:
   *   `photoIds=<id1>&photoIds=<id2>&...`.
   * @param {number} request.view
   *   Specifies if a download URL for the photo bytes should be returned in the
   *   Photo response.
   *
   *   The number should be among the values of [PhotoView]{@link google.streetview.publish.v1.PhotoView}
   * @param {string} [request.languageCode]
   *   The BCP-47 language code, such as "en-US" or "sr-Latn". For more
   *   information, see
   *   http://www.unicode.org/reports/tr35/#Unicode_locale_identifier.
   *   If language_code is unspecified, the user's language preference for Google
   *   services is used.
   * @param {Object} [options]
   *   Optional parameters. You can override the default settings for this call, e.g, timeout,
   *   retries, paginations, etc. See [gax.CallOptions]{@link https://googleapis.github.io/gax-nodejs/global.html#CallOptions} for the details.
   * @param {function(?Error, ?Object)} [callback]
   *   The function which will be called with the result of the API call.
   *
   *   The second parameter to the callback is an object representing [BatchGetPhotosResponse]{@link google.streetview.publish.v1.BatchGetPhotosResponse}.
   * @returns {Promise} - The promise which resolves to an array.
   *   The first element of the array is an object representing [BatchGetPhotosResponse]{@link google.streetview.publish.v1.BatchGetPhotosResponse}.
   *   The promise has a method named "cancel" which cancels the ongoing API call.
   *
   * @example
   *
   * const google = require('google.streetview.publish.v1');
   *
   * const client = new google.v1.StreetViewPublishServiceClient({
   *   // optional auth parameters.
   * });
   *
   * const photoIds = [];
   * const view = 'BASIC';
   * const request = {
   *   photoIds: photoIds,
   *   view: view,
   * };
   * client.batchGetPhotos(request)
   *   .then(responses => {
   *     const response = responses[0];
   *     // doThingsWith(response)
   *   })
   *   .catch(err => {
   *     console.error(err);
   *   });
   */
  batchGetPhotos(request, options, callback) {
    if (options instanceof Function && callback === undefined) {
      callback = options;
      options = {};
    }
    options = options || {};

    return this._innerApiCalls.batchGetPhotos(request, options, callback);
  }

  /**
   * Lists all the Photos that belong to
   * the user.
   *
   * <aside class="note"><b>Note:</b> Recently created photos that are still
   * being indexed are not returned in the response.</aside>
   *
   * @param {Object} request
   *   The request object that will be sent.
   * @param {number} request.view
   *   Specifies if a download URL for the photos bytes should be returned in the
   *   Photos response.
   *
   *   The number should be among the values of [PhotoView]{@link google.streetview.publish.v1.PhotoView}
   * @param {string} request.filter
   *   The filter expression. For example: `placeId=ChIJj61dQgK6j4AR4GeTYWZsKWw`.
   *
   *   The only filter supported at the moment is `placeId`.
   * @param {number} [request.pageSize]
   *   The maximum number of resources contained in the underlying API
   *   response. If page streaming is performed per-resource, this
   *   parameter does not affect the return value. If page streaming is
   *   performed per-page, this determines the maximum number of
   *   resources in a page.
   * @param {string} [request.languageCode]
   *   The BCP-47 language code, such as "en-US" or "sr-Latn". For more
   *   information, see
   *   http://www.unicode.org/reports/tr35/#Unicode_locale_identifier.
   *   If language_code is unspecified, the user's language preference for Google
   *   services is used.
   * @param {Object} [options]
   *   Optional parameters. You can override the default settings for this call, e.g, timeout,
   *   retries, paginations, etc. See [gax.CallOptions]{@link https://googleapis.github.io/gax-nodejs/global.html#CallOptions} for the details.
   * @param {function(?Error, ?Array, ?Object, ?Object)} [callback]
   *   The function which will be called with the result of the API call.
   *
   *   The second parameter to the callback is Array of [Photo]{@link google.streetview.publish.v1.Photo}.
   *
   *   When autoPaginate: false is specified through options, it contains the result
   *   in a single response. If the response indicates the next page exists, the third
   *   parameter is set to be used for the next request object. The fourth parameter keeps
   *   the raw response object of an object representing [ListPhotosResponse]{@link google.streetview.publish.v1.ListPhotosResponse}.
   * @returns {Promise} - The promise which resolves to an array.
   *   The first element of the array is Array of [Photo]{@link google.streetview.publish.v1.Photo}.
   *
   *   When autoPaginate: false is specified through options, the array has three elements.
   *   The first element is Array of [Photo]{@link google.streetview.publish.v1.Photo} in a single response.
   *   The second element is the next request object if the response
   *   indicates the next page exists, or null. The third element is
   *   an object representing [ListPhotosResponse]{@link google.streetview.publish.v1.ListPhotosResponse}.
   *
   *   The promise has a method named "cancel" which cancels the ongoing API call.
   *
   * @example
   *
   * const google = require('google.streetview.publish.v1');
   *
   * const client = new google.v1.StreetViewPublishServiceClient({
   *   // optional auth parameters.
   * });
   *
   * // Iterate over all elements.
   * const view = 'BASIC';
   * const filter = '';
   * const request = {
   *   view: view,
   *   filter: filter,
   * };
   *
   * client.listPhotos(request)
   *   .then(responses => {
   *     const resources = responses[0];
   *     for (const resource of resources) {
   *       // doThingsWith(resource)
   *     }
   *   })
   *   .catch(err => {
   *     console.error(err);
   *   });
   *
   * // Or obtain the paged response.
   * const view = 'BASIC';
   * const filter = '';
   * const request = {
   *   view: view,
   *   filter: filter,
   * };
   *
   *
   * const options = {autoPaginate: false};
   * const callback = responses => {
   *   // The actual resources in a response.
   *   const resources = responses[0];
   *   // The next request if the response shows that there are more responses.
   *   const nextRequest = responses[1];
   *   // The actual response object, if necessary.
   *   // const rawResponse = responses[2];
   *   for (const resource of resources) {
   *     // doThingsWith(resource);
   *   }
   *   if (nextRequest) {
   *     // Fetch the next page.
   *     return client.listPhotos(nextRequest, options).then(callback);
   *   }
   * }
   * client.listPhotos(request, options)
   *   .then(callback)
   *   .catch(err => {
   *     console.error(err);
   *   });
   */
  listPhotos(request, options, callback) {
    if (options instanceof Function && callback === undefined) {
      callback = options;
      options = {};
    }
    options = options || {};

    return this._innerApiCalls.listPhotos(request, options, callback);
  }

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
   *   The number should be among the values of [PhotoView]{@link google.streetview.publish.v1.PhotoView}
   * @param {string} request.filter
   *   The filter expression. For example: `placeId=ChIJj61dQgK6j4AR4GeTYWZsKWw`.
   *
   *   The only filter supported at the moment is `placeId`.
   * @param {number} [request.pageSize]
   *   The maximum number of resources contained in the underlying API
   *   response. If page streaming is performed per-resource, this
   *   parameter does not affect the return value. If page streaming is
   *   performed per-page, this determines the maximum number of
   *   resources in a page.
   * @param {string} [request.languageCode]
   *   The BCP-47 language code, such as "en-US" or "sr-Latn". For more
   *   information, see
   *   http://www.unicode.org/reports/tr35/#Unicode_locale_identifier.
   *   If language_code is unspecified, the user's language preference for Google
   *   services is used.
   * @param {Object} [options]
   *   Optional parameters. You can override the default settings for this call, e.g, timeout,
   *   retries, paginations, etc. See [gax.CallOptions]{@link https://googleapis.github.io/gax-nodejs/global.html#CallOptions} for the details.
   * @returns {Stream}
   *   An object stream which emits an object representing [Photo]{@link google.streetview.publish.v1.Photo} on 'data' event.
   *
   * @example
   *
   * const google = require('google.streetview.publish.v1');
   *
   * const client = new google.v1.StreetViewPublishServiceClient({
   *   // optional auth parameters.
   * });
   *
   * const view = 'BASIC';
   * const filter = '';
   * const request = {
   *   view: view,
   *   filter: filter,
   * };
   * client.listPhotosStream(request)
   *   .on('data', element => {
   *     // doThingsWith(element)
   *   }).on('error', err => {
   *     console.log(err);
   *   });
   */
  listPhotosStream(request, options) {
    options = options || {};

    return this._descriptors.page.listPhotos.createStream(
      this._innerApiCalls.listPhotos,
      request,
      options
    );
  };

  /**
   * Updates the metadata of a Photo, such
   * as pose, place association, connections, etc. Changing the pixels of a
   * photo is not supported.
   *
   * Only the fields specified in the
   * updateMask
   * field are used. If `updateMask` is not present, the update applies to all
   * fields.
   *
   * This method returns the following error codes:
   *
   * * google.rpc.Code.PERMISSION_DENIED if
   * the requesting user did not create the requested photo.
   * * google.rpc.Code.INVALID_ARGUMENT if
   * the request is malformed.
   * * google.rpc.Code.NOT_FOUND if the requested
   * photo does not exist.
   * * google.rpc.Code.UNAVAILABLE if the
   * requested Photo is still being
   * indexed.
   *
   * @param {Object} request
   *   The request object that will be sent.
   * @param {Object} request.photo
   *   Required. Photo object containing the
   *   new metadata.
   *
   *   This object should have the same structure as [Photo]{@link google.streetview.publish.v1.Photo}
   * @param {Object} request.updateMask
   *   Mask that identifies fields on the photo metadata to update.
   *   If not present, the old Photo
   *   metadata is entirely replaced with the
   *   new Photo metadata in this request.
   *   The update fails if invalid fields are specified. Multiple fields can be
   *   specified in a comma-delimited list.
   *
   *   The following fields are valid:
   *
   *   * `pose.heading`
   *   * `pose.latLngPair`
   *   * `pose.pitch`
   *   * `pose.roll`
   *   * `pose.level`
   *   * `pose.altitude`
   *   * `connections`
   *   * `places`
   *
   *
   *   <aside class="note"><b>Note:</b>  When
   *   updateMask
   *   contains repeated fields, the entire set of repeated values get replaced
   *   with the new contents. For example, if
   *   updateMask
   *   contains `connections` and `UpdatePhotoRequest.photo.connections` is empty,
   *   all connections are removed.</aside>
   *
   *   This object should have the same structure as [FieldMask]{@link google.protobuf.FieldMask}
   * @param {Object} [options]
   *   Optional parameters. You can override the default settings for this call, e.g, timeout,
   *   retries, paginations, etc. See [gax.CallOptions]{@link https://googleapis.github.io/gax-nodejs/global.html#CallOptions} for the details.
   * @param {function(?Error, ?Object)} [callback]
   *   The function which will be called with the result of the API call.
   *
   *   The second parameter to the callback is an object representing [Photo]{@link google.streetview.publish.v1.Photo}.
   * @returns {Promise} - The promise which resolves to an array.
   *   The first element of the array is an object representing [Photo]{@link google.streetview.publish.v1.Photo}.
   *   The promise has a method named "cancel" which cancels the ongoing API call.
   *
   * @example
   *
   * const google = require('google.streetview.publish.v1');
   *
   * const client = new google.v1.StreetViewPublishServiceClient({
   *   // optional auth parameters.
   * });
   *
   * const photo = {};
   * const updateMask = {};
   * const request = {
   *   photo: photo,
   *   updateMask: updateMask,
   * };
   * client.updatePhoto(request)
   *   .then(responses => {
   *     const response = responses[0];
   *     // doThingsWith(response)
   *   })
   *   .catch(err => {
   *     console.error(err);
   *   });
   */
  updatePhoto(request, options, callback) {
    if (options instanceof Function && callback === undefined) {
      callback = options;
      options = {};
    }
    options = options || {};

    return this._innerApiCalls.updatePhoto(request, options, callback);
  }

  /**
   * Updates the metadata of Photos, such
   * as pose, place association, connections, etc. Changing the pixels of photos
   * is not supported.
   *
   * Note that if
   * BatchUpdatePhotos
   * fails, either critical fields are missing or there is an authentication
   * error. Even if
   * BatchUpdatePhotos
   * succeeds, individual photos in the batch may have failures.
   * These failures are specified in each
   * PhotoResponse.status
   * in
   * BatchUpdatePhotosResponse.results.
   * See
   * UpdatePhoto
   * for specific failures that can occur per photo.
   *
   * Only the fields specified in
   * updateMask
   * field are used. If `updateMask` is not present, the update applies to all
   * fields.
   *
   * The number of
   * UpdatePhotoRequest
   * messages in a
   * BatchUpdatePhotosRequest
   * must not exceed 20.
   *
   * <aside class="note"><b>Note:</b> To update
   * Pose.altitude,
   * Pose.latLngPair has to be
   * filled as well. Otherwise, the request will fail.</aside>
   *
   * @param {Object} request
   *   The request object that will be sent.
   * @param {Object[]} request.updatePhotoRequests
   *   Required. List of
   *   UpdatePhotoRequests.
   *
   *   This object should have the same structure as [UpdatePhotoRequest]{@link google.streetview.publish.v1.UpdatePhotoRequest}
   * @param {Object} [options]
   *   Optional parameters. You can override the default settings for this call, e.g, timeout,
   *   retries, paginations, etc. See [gax.CallOptions]{@link https://googleapis.github.io/gax-nodejs/global.html#CallOptions} for the details.
   * @param {function(?Error, ?Object)} [callback]
   *   The function which will be called with the result of the API call.
   *
   *   The second parameter to the callback is an object representing [BatchUpdatePhotosResponse]{@link google.streetview.publish.v1.BatchUpdatePhotosResponse}.
   * @returns {Promise} - The promise which resolves to an array.
   *   The first element of the array is an object representing [BatchUpdatePhotosResponse]{@link google.streetview.publish.v1.BatchUpdatePhotosResponse}.
   *   The promise has a method named "cancel" which cancels the ongoing API call.
   *
   * @example
   *
   * const google = require('google.streetview.publish.v1');
   *
   * const client = new google.v1.StreetViewPublishServiceClient({
   *   // optional auth parameters.
   * });
   *
   * const updatePhotoRequests = [];
   * client.batchUpdatePhotos({updatePhotoRequests: updatePhotoRequests})
   *   .then(responses => {
   *     const response = responses[0];
   *     // doThingsWith(response)
   *   })
   *   .catch(err => {
   *     console.error(err);
   *   });
   */
  batchUpdatePhotos(request, options, callback) {
    if (options instanceof Function && callback === undefined) {
      callback = options;
      options = {};
    }
    options = options || {};

    return this._innerApiCalls.batchUpdatePhotos(request, options, callback);
  }

  /**
   * Deletes a Photo and its metadata.
   *
   * This method returns the following error codes:
   *
   * * google.rpc.Code.PERMISSION_DENIED if
   * the requesting user did not create the requested photo.
   * * google.rpc.Code.NOT_FOUND if the photo ID
   * does not exist.
   *
   * @param {Object} request
   *   The request object that will be sent.
   * @param {string} request.photoId
   *   Required. ID of the Photo.
   * @param {Object} [options]
   *   Optional parameters. You can override the default settings for this call, e.g, timeout,
   *   retries, paginations, etc. See [gax.CallOptions]{@link https://googleapis.github.io/gax-nodejs/global.html#CallOptions} for the details.
   * @param {function(?Error)} [callback]
   *   The function which will be called with the result of the API call.
   * @returns {Promise} - The promise which resolves when API call finishes.
   *   The promise has a method named "cancel" which cancels the ongoing API call.
   *
   * @example
   *
   * const google = require('google.streetview.publish.v1');
   *
   * const client = new google.v1.StreetViewPublishServiceClient({
   *   // optional auth parameters.
   * });
   *
   * const photoId = '';
   * client.deletePhoto({photoId: photoId}).catch(err => {
   *   console.error(err);
   * });
   */
  deletePhoto(request, options, callback) {
    if (options instanceof Function && callback === undefined) {
      callback = options;
      options = {};
    }
    options = options || {};

    return this._innerApiCalls.deletePhoto(request, options, callback);
  }

  /**
   * Deletes a list of Photos and their
   * metadata.
   *
   * Note that if
   * BatchDeletePhotos
   * fails, either critical fields are missing or there was an authentication
   * error. Even if
   * BatchDeletePhotos
   * succeeds, individual photos in the batch may have failures.
   * These failures are specified in each
   * PhotoResponse.status
   * in
   * BatchDeletePhotosResponse.results.
   * See
   * DeletePhoto
   * for specific failures that can occur per photo.
   *
   * @param {Object} request
   *   The request object that will be sent.
   * @param {string[]} request.photoIds
   *   Required. IDs of the Photos. HTTP
   *   GET requests require the following syntax for the URL query parameter:
   *   `photoIds=<id1>&photoIds=<id2>&...`.
   * @param {Object} [options]
   *   Optional parameters. You can override the default settings for this call, e.g, timeout,
   *   retries, paginations, etc. See [gax.CallOptions]{@link https://googleapis.github.io/gax-nodejs/global.html#CallOptions} for the details.
   * @param {function(?Error, ?Object)} [callback]
   *   The function which will be called with the result of the API call.
   *
   *   The second parameter to the callback is an object representing [BatchDeletePhotosResponse]{@link google.streetview.publish.v1.BatchDeletePhotosResponse}.
   * @returns {Promise} - The promise which resolves to an array.
   *   The first element of the array is an object representing [BatchDeletePhotosResponse]{@link google.streetview.publish.v1.BatchDeletePhotosResponse}.
   *   The promise has a method named "cancel" which cancels the ongoing API call.
   *
   * @example
   *
   * const google = require('google.streetview.publish.v1');
   *
   * const client = new google.v1.StreetViewPublishServiceClient({
   *   // optional auth parameters.
   * });
   *
   * const photoIds = [];
   * client.batchDeletePhotos({photoIds: photoIds})
   *   .then(responses => {
   *     const response = responses[0];
   *     // doThingsWith(response)
   *   })
   *   .catch(err => {
   *     console.error(err);
   *   });
   */
  batchDeletePhotos(request, options, callback) {
    if (options instanceof Function && callback === undefined) {
      callback = options;
      options = {};
    }
    options = options || {};

    return this._innerApiCalls.batchDeletePhotos(request, options, callback);
  }
}


module.exports = StreetViewPublishServiceClient;
