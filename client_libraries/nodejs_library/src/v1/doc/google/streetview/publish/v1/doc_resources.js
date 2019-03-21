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
 * Upload reference for media files.
 *
 * @property {string} uploadUrl
 *   Required. An upload reference should be unique for each user. It follows
 *   the form:
 *   "https://streetviewpublish.googleapis.com/media/user/{account_id}/photo/{upload_reference}"
 *
 * @typedef UploadRef
 * @memberof google.streetview.publish.v1
 * @see [google.streetview.publish.v1.UploadRef definition in proto format]{@link https://github.com/googleapis/googleapis/blob/master/google/streetview/publish/v1/resources.proto}
 */
const UploadRef = {
  // This is for documentation. Actual contents will be loaded by gRPC.
};

/**
 * Identifier for a Photo.
 *
 * @property {string} id
 *   Required. A unique identifier for a photo.
 *
 * @typedef PhotoId
 * @memberof google.streetview.publish.v1
 * @see [google.streetview.publish.v1.PhotoId definition in proto format]{@link https://github.com/googleapis/googleapis/blob/master/google/streetview/publish/v1/resources.proto}
 */
const PhotoId = {
  // This is for documentation. Actual contents will be loaded by gRPC.
};

/**
 * Level information containing level number and its corresponding name.
 *
 * @property {number} number
 *   Floor number, used for ordering. 0 indicates the ground level, 1 indicates
 *   the first level above ground level, -1 indicates the first level under
 *   ground level. Non-integer values are OK.
 *
 * @property {string} name
 *   Required. A name assigned to this Level, restricted to 3 characters.
 *   Consider how the elevator buttons would be labeled for this level if there
 *   was an elevator.
 *
 * @typedef Level
 * @memberof google.streetview.publish.v1
 * @see [google.streetview.publish.v1.Level definition in proto format]{@link https://github.com/googleapis/googleapis/blob/master/google/streetview/publish/v1/resources.proto}
 */
const Level = {
  // This is for documentation. Actual contents will be loaded by gRPC.
};

/**
 * Raw pose measurement for an entity.
 *
 * @property {Object} latLngPair
 *   Latitude and longitude pair of the pose, as explained here:
 *   https://cloud.google.com/datastore/docs/reference/rest/Shared.Types/LatLng
 *   When creating a Photo, if the
 *   latitude and longitude pair are not provided, the geolocation from the
 *   exif header is used. A latitude and longitude pair not provided in the
 *   photo or exif header causes the create photo process to fail.
 *
 *   This object should have the same structure as [LatLng]{@link google.type.LatLng}
 *
 * @property {number} altitude
 *   Altitude of the pose in meters above WGS84 ellipsoid.
 *   NaN indicates an unmeasured quantity.
 *
 * @property {number} heading
 *   Compass heading, measured at the center of the photo in degrees clockwise
 *   from North. Value must be >=0 and <360.
 *   NaN indicates an unmeasured quantity.
 *
 * @property {number} pitch
 *   Pitch, measured at the center of the photo in degrees. Value must be >=-90
 *   and <= 90. A value of -90 means looking directly down, and a value of 90
 *   means looking directly up.
 *   NaN indicates an unmeasured quantity.
 *
 * @property {number} roll
 *   Roll, measured in degrees. Value must be >= 0 and <360. A value of 0
 *   means level with the horizon.
 *   NaN indicates an unmeasured quantity.
 *
 * @property {Object} level
 *   Level (the floor in a building) used to configure vertical navigation.
 *
 *   This object should have the same structure as [Level]{@link google.streetview.publish.v1.Level}
 *
 * @property {number} accuracyMeters
 *   The estimated horizontal accuracy of this pose in meters with 68%
 *   confidence (one standard deviation). For example, on Android, this value is
 *   available from this method:
 *   https://developer.android.com/reference/android/location/Location#getAccuracy().
 *   Other platforms have different methods of obtaining similar accuracy
 *   estimations.
 *
 * @typedef Pose
 * @memberof google.streetview.publish.v1
 * @see [google.streetview.publish.v1.Pose definition in proto format]{@link https://github.com/googleapis/googleapis/blob/master/google/streetview/publish/v1/resources.proto}
 */
const Pose = {
  // This is for documentation. Actual contents will be loaded by gRPC.
};

/**
 * Place metadata for an entity.
 *
 * @property {string} placeId
 *   Place identifier, as described in
 *   https://developers.google.com/places/place-id.
 *
 * @property {string} name
 *   Output-only. The name of the place, localized to the language_code.
 *
 * @property {string} languageCode
 *   Output-only. The language_code that the name is localized with. This should
 *   be the language_code specified in the request, but may be a fallback.
 *
 * @typedef Place
 * @memberof google.streetview.publish.v1
 * @see [google.streetview.publish.v1.Place definition in proto format]{@link https://github.com/googleapis/googleapis/blob/master/google/streetview/publish/v1/resources.proto}
 */
const Place = {
  // This is for documentation. Actual contents will be loaded by gRPC.
};

/**
 * A connection is the link from a source photo to a destination photo.
 *
 * @property {Object} target
 *   Required. The destination of the connection from the containing photo to
 *   another photo.
 *
 *   This object should have the same structure as [PhotoId]{@link google.streetview.publish.v1.PhotoId}
 *
 * @typedef Connection
 * @memberof google.streetview.publish.v1
 * @see [google.streetview.publish.v1.Connection definition in proto format]{@link https://github.com/googleapis/googleapis/blob/master/google/streetview/publish/v1/resources.proto}
 */
const Connection = {
  // This is for documentation. Actual contents will be loaded by gRPC.
};

/**
 * Photo is used to store 360 photos along with photo metadata.
 *
 * @property {Object} photoId
 *   Required when updating a photo. Output only when creating a photo.
 *   Identifier for the photo, which is unique among all photos in
 *   Google.
 *
 *   This object should have the same structure as [PhotoId]{@link google.streetview.publish.v1.PhotoId}
 *
 * @property {Object} uploadReference
 *   Required when creating a photo. Input only. The resource URL where the
 *   photo bytes are uploaded to.
 *
 *   This object should have the same structure as [UploadRef]{@link google.streetview.publish.v1.UploadRef}
 *
 * @property {string} downloadUrl
 *   Output only. The download URL for the photo bytes. This field is set only
 *   when
 *   GetPhotoRequest.view
 *   is set to
 *   PhotoView.INCLUDE_DOWNLOAD_URL.
 *
 * @property {string} thumbnailUrl
 *   Output only. The thumbnail URL for showing a preview of the given photo.
 *
 * @property {string} shareLink
 *   Output only. The share link for the photo.
 *
 * @property {Object} pose
 *   Pose of the photo.
 *
 *   This object should have the same structure as [Pose]{@link google.streetview.publish.v1.Pose}
 *
 * @property {Object[]} connections
 *   Connections to other photos. A connection represents the link from this
 *   photo to another photo.
 *
 *   This object should have the same structure as [Connection]{@link google.streetview.publish.v1.Connection}
 *
 * @property {Object} captureTime
 *   Absolute time when the photo was captured.
 *   When the photo has no exif timestamp, this is used to set a timestamp in
 *   the photo metadata.
 *
 *   This object should have the same structure as [Timestamp]{@link google.protobuf.Timestamp}
 *
 * @property {Object[]} places
 *   Places where this photo belongs.
 *
 *   This object should have the same structure as [Place]{@link google.streetview.publish.v1.Place}
 *
 * @property {number} viewCount
 *   Output only. View count of the photo.
 *
 * @property {number} transferStatus
 *   Output only. Status of rights transfer on this photo.
 *
 *   The number should be among the values of [TransferStatus]{@link google.streetview.publish.v1.TransferStatus}
 *
 * @property {number} mapsPublishStatus
 *   Output only. Status in Google Maps, whether this photo was published or
 *   rejected.
 *
 *   The number should be among the values of [MapsPublishStatus]{@link google.streetview.publish.v1.MapsPublishStatus}
 *
 * @typedef Photo
 * @memberof google.streetview.publish.v1
 * @see [google.streetview.publish.v1.Photo definition in proto format]{@link https://github.com/googleapis/googleapis/blob/master/google/streetview/publish/v1/resources.proto}
 */
const Photo = {
  // This is for documentation. Actual contents will be loaded by gRPC.

  /**
   * Publication status of the photo in Google Maps.
   *
   * @enum {number}
   * @memberof google.streetview.publish.v1
   */
  MapsPublishStatus: {

    /**
     * The status of the photo is unknown.
     */
    UNSPECIFIED_MAPS_PUBLISH_STATUS: 0,

    /**
     * The photo is published to the public through Google Maps.
     */
    PUBLISHED: 1,

    /**
     * The photo has been rejected for an unknown reason.
     */
    REJECTED_UNKNOWN: 2
  },

  /**
   * Status of rights transfer.
   *
   * @enum {number}
   * @memberof google.streetview.publish.v1
   */
  TransferStatus: {

    /**
     * The status of this transfer is unspecified.
     */
    TRANSFER_STATUS_UNKNOWN: 0,

    /**
     * This photo has never been in a transfer.
     */
    NEVER_TRANSFERRED: 1,

    /**
     * This photo transfer has been initiated, but the receiver has not yet
     * responded.
     */
    PENDING: 2,

    /**
     * The photo transfer has been completed, and this photo has been
     * transferred to the recipient.
     */
    COMPLETED: 3,

    /**
     * The recipient rejected this photo transfer.
     */
    REJECTED: 4,

    /**
     * The photo transfer expired before the recipient took any action.
     */
    EXPIRED: 5,

    /**
     * The sender cancelled this photo transfer.
     */
    CANCELLED: 6,

    /**
     * The recipient owns this photo due to a rights transfer.
     */
    RECEIVED_VIA_TRANSFER: 7
  }
};