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

// Note: this file is purely for documentation. Any contents are not expected
// to be loaded as the JS file.

/**
 * Request to create a Photo.
 *
 * @property {Object} photo
 *   Required. Photo to create.
 *
 *   This object should have the same structure as [Photo]{@link google.streetview.publish.v1.Photo}
 *
 * @typedef CreatePhotoRequest
 * @memberof google.streetview.publish.v1
 * @see [google.streetview.publish.v1.CreatePhotoRequest definition in proto format]{@link https://github.com/googleapis/googleapis/blob/master/google/streetview/publish/v1/rpcmessages.proto}
 */
const CreatePhotoRequest = {
  // This is for documentation. Actual contents will be loaded by gRPC.
};

/**
 * Request to get a Photo.
 *
 * By default
 *
 * * does not return the download URL for the photo bytes.
 *
 * Parameters:
 *
 * * `view` controls if the download URL for the photo bytes is returned.
 *
 * @property {string} photoId
 *   Required. ID of the Photo.
 *
 * @property {number} view
 *   Specifies if a download URL for the photo bytes should be returned in the
 *   Photo response.
 *
 *   The number should be among the values of [PhotoView]{@link google.streetview.publish.v1.PhotoView}
 *
 * @property {string} languageCode
 *   The BCP-47 language code, such as "en-US" or "sr-Latn". For more
 *   information, see
 *   http://www.unicode.org/reports/tr35/#Unicode_locale_identifier.
 *   If language_code is unspecified, the user's language preference for Google
 *   services is used.
 *
 * @typedef GetPhotoRequest
 * @memberof google.streetview.publish.v1
 * @see [google.streetview.publish.v1.GetPhotoRequest definition in proto format]{@link https://github.com/googleapis/googleapis/blob/master/google/streetview/publish/v1/rpcmessages.proto}
 */
const GetPhotoRequest = {
  // This is for documentation. Actual contents will be loaded by gRPC.
};

/**
 * Request to get one or more Photos.
 * By default
 *
 * * does not return the download URL for the photo bytes.
 *
 * Parameters:
 *
 * * `view` controls if the download URL for the photo bytes is returned.
 *
 * @property {string[]} photoIds
 *   Required. IDs of the Photos. HTTP GET
 *   requests require the following syntax for the URL query parameter:
 *   `photoIds=<id1>&photoIds=<id2>&...`.
 *
 * @property {number} view
 *   Specifies if a download URL for the photo bytes should be returned in the
 *   Photo response.
 *
 *   The number should be among the values of [PhotoView]{@link google.streetview.publish.v1.PhotoView}
 *
 * @property {string} languageCode
 *   The BCP-47 language code, such as "en-US" or "sr-Latn". For more
 *   information, see
 *   http://www.unicode.org/reports/tr35/#Unicode_locale_identifier.
 *   If language_code is unspecified, the user's language preference for Google
 *   services is used.
 *
 * @typedef BatchGetPhotosRequest
 * @memberof google.streetview.publish.v1
 * @see [google.streetview.publish.v1.BatchGetPhotosRequest definition in proto format]{@link https://github.com/googleapis/googleapis/blob/master/google/streetview/publish/v1/rpcmessages.proto}
 */
const BatchGetPhotosRequest = {
  // This is for documentation. Actual contents will be loaded by gRPC.
};

/**
 * Response to batch get of Photos.
 *
 * @property {Object[]} results
 *   List of results for each individual
 *   Photo requested, in the same order as
 *   the requests in
 *   BatchGetPhotos.
 *
 *   This object should have the same structure as [PhotoResponse]{@link google.streetview.publish.v1.PhotoResponse}
 *
 * @typedef BatchGetPhotosResponse
 * @memberof google.streetview.publish.v1
 * @see [google.streetview.publish.v1.BatchGetPhotosResponse definition in proto format]{@link https://github.com/googleapis/googleapis/blob/master/google/streetview/publish/v1/rpcmessages.proto}
 */
const BatchGetPhotosResponse = {
  // This is for documentation. Actual contents will be loaded by gRPC.
};

/**
 * Response payload for a single
 * Photo
 * in batch operations including
 * BatchGetPhotos
 * and
 * BatchUpdatePhotos.
 *
 * @property {Object} status
 *   The status for the operation to get or update a single photo in the batch
 *   request.
 *
 *   This object should have the same structure as [Status]{@link google.rpc.Status}
 *
 * @property {Object} photo
 *   The Photo resource, if the request
 *   was successful.
 *
 *   This object should have the same structure as [Photo]{@link google.streetview.publish.v1.Photo}
 *
 * @typedef PhotoResponse
 * @memberof google.streetview.publish.v1
 * @see [google.streetview.publish.v1.PhotoResponse definition in proto format]{@link https://github.com/googleapis/googleapis/blob/master/google/streetview/publish/v1/rpcmessages.proto}
 */
const PhotoResponse = {
  // This is for documentation. Actual contents will be loaded by gRPC.
};

/**
 * Request to list all photos that belong to the user sending the request.
 *
 * By default
 *
 * * does not return the download URL for the photo bytes.
 *
 * Parameters:
 *
 * * `view` controls if the download URL for the photo bytes is returned.
 * * `pageSize` determines the maximum number of photos to return.
 * * `pageToken` is the next page token value returned from a previous
 * ListPhotos
 *     request, if any.
 * * `filter` allows filtering by a given parameter. 'placeId' is the only
 * parameter supported at the moment.
 *
 * @property {number} view
 *   Specifies if a download URL for the photos bytes should be returned in the
 *   Photos response.
 *
 *   The number should be among the values of [PhotoView]{@link google.streetview.publish.v1.PhotoView}
 *
 * @property {number} pageSize
 *   The maximum number of photos to return.
 *   `pageSize` must be non-negative. If `pageSize` is zero or is not provided,
 *   the default page size of 100 is used.
 *   The number of photos returned in the response may be less than `pageSize`
 *   if the number of photos that belong to the user is less than `pageSize`.
 *
 * @property {string} pageToken
 *   The
 *   nextPageToken
 *   value returned from a previous
 *   ListPhotos
 *   request, if any.
 *
 * @property {string} filter
 *   The filter expression. For example: `placeId=ChIJj61dQgK6j4AR4GeTYWZsKWw`.
 *
 *   The only filter supported at the moment is `placeId`.
 *
 * @property {string} languageCode
 *   The BCP-47 language code, such as "en-US" or "sr-Latn". For more
 *   information, see
 *   http://www.unicode.org/reports/tr35/#Unicode_locale_identifier.
 *   If language_code is unspecified, the user's language preference for Google
 *   services is used.
 *
 * @typedef ListPhotosRequest
 * @memberof google.streetview.publish.v1
 * @see [google.streetview.publish.v1.ListPhotosRequest definition in proto format]{@link https://github.com/googleapis/googleapis/blob/master/google/streetview/publish/v1/rpcmessages.proto}
 */
const ListPhotosRequest = {
  // This is for documentation. Actual contents will be loaded by gRPC.
};

/**
 * Response to list all photos that belong to a user.
 *
 * @property {Object[]} photos
 *   List of photos. The
 *   pageSize field
 *   in the request determines the number of items returned.
 *
 *   This object should have the same structure as [Photo]{@link google.streetview.publish.v1.Photo}
 *
 * @property {string} nextPageToken
 *   Token to retrieve the next page of results, or empty if there are no more
 *   results in the list.
 *
 * @typedef ListPhotosResponse
 * @memberof google.streetview.publish.v1
 * @see [google.streetview.publish.v1.ListPhotosResponse definition in proto format]{@link https://github.com/googleapis/googleapis/blob/master/google/streetview/publish/v1/rpcmessages.proto}
 */
const ListPhotosResponse = {
  // This is for documentation. Actual contents will be loaded by gRPC.
};

/**
 * Request to update the metadata of a
 * Photo. Updating the pixels of a photo
 * is not supported.
 *
 * @property {Object} photo
 *   Required. Photo object containing the
 *   new metadata.
 *
 *   This object should have the same structure as [Photo]{@link google.streetview.publish.v1.Photo}
 *
 * @property {Object} updateMask
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
 *
 * @typedef UpdatePhotoRequest
 * @memberof google.streetview.publish.v1
 * @see [google.streetview.publish.v1.UpdatePhotoRequest definition in proto format]{@link https://github.com/googleapis/googleapis/blob/master/google/streetview/publish/v1/rpcmessages.proto}
 */
const UpdatePhotoRequest = {
  // This is for documentation. Actual contents will be loaded by gRPC.
};

/**
 * Request to update the metadata of photos.
 * Updating the pixels of photos is not supported.
 *
 * @property {Object[]} updatePhotoRequests
 *   Required. List of
 *   UpdatePhotoRequests.
 *
 *   This object should have the same structure as [UpdatePhotoRequest]{@link google.streetview.publish.v1.UpdatePhotoRequest}
 *
 * @typedef BatchUpdatePhotosRequest
 * @memberof google.streetview.publish.v1
 * @see [google.streetview.publish.v1.BatchUpdatePhotosRequest definition in proto format]{@link https://github.com/googleapis/googleapis/blob/master/google/streetview/publish/v1/rpcmessages.proto}
 */
const BatchUpdatePhotosRequest = {
  // This is for documentation. Actual contents will be loaded by gRPC.
};

/**
 * Response to batch update of metadata of one or more
 * Photos.
 *
 * @property {Object[]} results
 *   List of results for each individual
 *   Photo updated, in the same order as
 *   the request.
 *
 *   This object should have the same structure as [PhotoResponse]{@link google.streetview.publish.v1.PhotoResponse}
 *
 * @typedef BatchUpdatePhotosResponse
 * @memberof google.streetview.publish.v1
 * @see [google.streetview.publish.v1.BatchUpdatePhotosResponse definition in proto format]{@link https://github.com/googleapis/googleapis/blob/master/google/streetview/publish/v1/rpcmessages.proto}
 */
const BatchUpdatePhotosResponse = {
  // This is for documentation. Actual contents will be loaded by gRPC.
};

/**
 * Request to delete a Photo.
 *
 * @property {string} photoId
 *   Required. ID of the Photo.
 *
 * @typedef DeletePhotoRequest
 * @memberof google.streetview.publish.v1
 * @see [google.streetview.publish.v1.DeletePhotoRequest definition in proto format]{@link https://github.com/googleapis/googleapis/blob/master/google/streetview/publish/v1/rpcmessages.proto}
 */
const DeletePhotoRequest = {
  // This is for documentation. Actual contents will be loaded by gRPC.
};

/**
 * Request to delete multiple Photos.
 *
 * @property {string[]} photoIds
 *   Required. IDs of the Photos. HTTP
 *   GET requests require the following syntax for the URL query parameter:
 *   `photoIds=<id1>&photoIds=<id2>&...`.
 *
 * @typedef BatchDeletePhotosRequest
 * @memberof google.streetview.publish.v1
 * @see [google.streetview.publish.v1.BatchDeletePhotosRequest definition in proto format]{@link https://github.com/googleapis/googleapis/blob/master/google/streetview/publish/v1/rpcmessages.proto}
 */
const BatchDeletePhotosRequest = {
  // This is for documentation. Actual contents will be loaded by gRPC.
};

/**
 * Response to batch delete of one or more
 * Photos.
 *
 * @property {Object[]} status
 *   The status for the operation to delete a single
 *   Photo in the batch request.
 *
 *   This object should have the same structure as [Status]{@link google.rpc.Status}
 *
 * @typedef BatchDeletePhotosResponse
 * @memberof google.streetview.publish.v1
 * @see [google.streetview.publish.v1.BatchDeletePhotosResponse definition in proto format]{@link https://github.com/googleapis/googleapis/blob/master/google/streetview/publish/v1/rpcmessages.proto}
 */
const BatchDeletePhotosResponse = {
  // This is for documentation. Actual contents will be loaded by gRPC.
};

/**
 * Specifies which view of the Photo
 * to include in the response.
 *
 * @enum {number}
 * @memberof google.streetview.publish.v1
 */
const PhotoView = {

  /**
   * Server reponses do not include the download URL for the photo bytes.
   * The default value.
   */
  BASIC: 0,

  /**
   * Server responses include the download URL for the photo bytes.
   */
  INCLUDE_DOWNLOAD_URL: 1
};