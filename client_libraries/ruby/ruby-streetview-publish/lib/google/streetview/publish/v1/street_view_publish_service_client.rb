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
# https://github.com/googleapis/googleapis/blob/master/google/streetview/publish/v1/streetview_publish.proto,
# and updates to that file get reflected here through a refresh process.
# For the short term, the refresh process will only be runnable by Google
# engineers.
#
# The only allowed edits are to method and file documentation. A 3-way
# merge preserves those additions if the generated source changes.

require "json"
require "pathname"

require "google/gax"

require "google/streetview/publish/v1/streetview_publish_pb"

module Google
  module Streetview
    module Publish
      module V1
        # Publishes and connects user-contributed photos on Street View.
        #
        # @!attribute [r] street_view_publish_service_stub
        #   @return [Google::Streetview::Publish::V1::StreetViewPublishService::Stub]
        class StreetViewPublishServiceClient
          attr_reader :street_view_publish_service_stub

          # The default address of the service.
          SERVICE_ADDRESS = "streetviewpublish.googleapis.com".freeze

          # The default port of the service.
          DEFAULT_SERVICE_PORT = 443

          DEFAULT_TIMEOUT = 30

          PAGE_DESCRIPTORS = {
            "list_photos" => Google::Gax::PageDescriptor.new(
              "page_token",
              "next_page_token",
              "photos")
          }.freeze

          private_constant :PAGE_DESCRIPTORS

          # The scopes needed to make gRPC calls to all of the methods defined in
          # this service.
          ALL_SCOPES = [
            "https://www.googleapis.com/auth/streetviewpublish"
          ].freeze

          # @param service_path [String]
          #   The domain name of the API remote host.
          # @param port [Integer]
          #   The port on which to connect to the remote host.
          # @param channel [Channel]
          #   A Channel object through which to make calls.
          # @param chan_creds [Grpc::ChannelCredentials]
          #   A ChannelCredentials for the setting up the RPC client.
          # @param updater_proc [Proc]
          #   A function that transforms the metadata for requests, e.g., to give
          #   OAuth credentials.
          # @param scopes [Array<String>]
          #   The OAuth scopes for this service. This parameter is ignored if
          #   an updater_proc is supplied.
          # @param client_config[Hash]
          #   A Hash for call options for each method. See
          #   Google::Gax#construct_settings for the structure of
          #   this data. Falls back to the default config if not specified
          #   or the specified config is missing data points.
          # @param timeout [Numeric]
          #   The default timeout, in seconds, for calls made through this client.
          def initialize \
              service_path: SERVICE_ADDRESS,
              port: DEFAULT_SERVICE_PORT,
              channel: nil,
              chan_creds: nil,
              updater_proc: nil,
              scopes: ALL_SCOPES,
              client_config: {},
              timeout: DEFAULT_TIMEOUT,
              app_name: nil,
              app_version: nil,
              lib_name: nil,
              lib_version: ""
            # These require statements are intentionally placed here to initialize
            # the gRPC module only when it's required.
            # See https://github.com/googleapis/toolkit/issues/446
            require "google/gax/grpc"
            require "google/streetview/publish/v1/streetview_publish_services_pb"


            if app_name || app_version
              warn "`app_name` and `app_version` are no longer being used in the request headers."
            end

            google_api_client = "gl-ruby/#{RUBY_VERSION}"
            google_api_client << " #{lib_name}/#{lib_version}" if lib_name
            google_api_client << " gapic/0.6.8 gax/#{Google::Gax::VERSION}"
            google_api_client << " grpc/#{GRPC::VERSION}"
            google_api_client.freeze

            headers = { :"x-goog-api-client" => google_api_client }
            client_config_file = Pathname.new(__dir__).join(
              "street_view_publish_service_client_config.json"
            )
            defaults = client_config_file.open do |f|
              Google::Gax.construct_settings(
                "google.streetview.publish.v1.StreetViewPublishService",
                JSON.parse(f.read),
                client_config,
                Google::Gax::Grpc::STATUS_CODE_NAMES,
                timeout,
                page_descriptors: PAGE_DESCRIPTORS,
                errors: Google::Gax::Grpc::API_ERRORS,
                kwargs: headers
              )
            end
            @street_view_publish_service_stub = Google::Gax::Grpc.create_stub(
              service_path,
              port,
              chan_creds: chan_creds,
              channel: channel,
              updater_proc: updater_proc,
              scopes: scopes,
              &Google::Streetview::Publish::V1::StreetViewPublishService::Stub.method(:new)
            )

            @start_upload = Google::Gax.create_api_call(
              @street_view_publish_service_stub.method(:start_upload),
              defaults["start_upload"]
            )
            @create_photo = Google::Gax.create_api_call(
              @street_view_publish_service_stub.method(:create_photo),
              defaults["create_photo"]
            )
            @get_photo = Google::Gax.create_api_call(
              @street_view_publish_service_stub.method(:get_photo),
              defaults["get_photo"]
            )
            @batch_get_photos = Google::Gax.create_api_call(
              @street_view_publish_service_stub.method(:batch_get_photos),
              defaults["batch_get_photos"]
            )
            @list_photos = Google::Gax.create_api_call(
              @street_view_publish_service_stub.method(:list_photos),
              defaults["list_photos"]
            )
            @update_photo = Google::Gax.create_api_call(
              @street_view_publish_service_stub.method(:update_photo),
              defaults["update_photo"]
            )
            @batch_update_photos = Google::Gax.create_api_call(
              @street_view_publish_service_stub.method(:batch_update_photos),
              defaults["batch_update_photos"]
            )
            @delete_photo = Google::Gax.create_api_call(
              @street_view_publish_service_stub.method(:delete_photo),
              defaults["delete_photo"]
            )
            @batch_delete_photos = Google::Gax.create_api_call(
              @street_view_publish_service_stub.method(:batch_delete_photos),
              defaults["batch_delete_photos"]
            )
          end

          # Service calls

          # Creates an upload session to start uploading photo data. The upload URL of
          # the returned +UploadRef+ is used to upload the data for the photo.
          #
          # After the upload is complete, the +UploadRef+ is used with
          # +StreetViewPublishService:CreatePhoto()+ to create the +Photo+ object
          # entry.
          #
          # @param options [Google::Gax::CallOptions]
          #   Overrides the default settings for this call, e.g, timeout,
          #   retries, etc.
          # @return [Google::Streetview::Publish::V1::UploadRef]
          # @raise [Google::Gax::GaxError] if the RPC is aborted.
          # @example
          #   require "google/streetview/publish/v1"
          #
          #   street_view_publish_service_client = Google::Streetview::Publish::V1::StreetViewPublishServiceClient.new
          #   response = street_view_publish_service_client.start_upload

          def start_upload options: nil
            req = Google::Protobuf::Empty.new
            @start_upload.call(req, options)
          end

          # After the client finishes uploading the photo with the returned
          # +UploadRef+, +photo.create+ publishes the uploaded photo to Street View on
          # Google Maps.
          #
          # This method returns the following error codes:
          #
          # * +INVALID_ARGUMENT+ if the request is malformed.
          # * +NOT_FOUND+ if the upload reference does not exist.
          #
          # @param photo [Google::Streetview::Publish::V1::Photo]
          #   Required. Photo to create.
          # @param options [Google::Gax::CallOptions]
          #   Overrides the default settings for this call, e.g, timeout,
          #   retries, etc.
          # @return [Google::Streetview::Publish::V1::Photo]
          # @raise [Google::Gax::GaxError] if the RPC is aborted.
          # @example
          #   require "google/streetview/publish/v1"
          #
          #   street_view_publish_service_client = Google::Streetview::Publish::V1::StreetViewPublishServiceClient.new
          #   photo = Google::Streetview::Publish::V1::Photo.new
          #   response = street_view_publish_service_client.create_photo(photo)

          def create_photo \
              photo,
              options: nil
            req = Google::Streetview::Publish::V1::CreatePhotoRequest.new({
              photo: photo
            }.delete_if { |_, v| v.nil? })
            @create_photo.call(req, options)
          end

          # Gets the metadata of the specified +Photo+.
          #
          # This method returns the following error codes:
          #
          # * +PERMISSION_DENIED+ if the requesting user did not create the requested
          #   photo.
          # * +NOT_FOUND+ if the requested photo does not exist.
          #
          # @param photo_id [String]
          #   Required. ID of the photo.
          # @param view [Google::Streetview::Publish::V1::PhotoView]
          #   Specifies if a download URL for the photo bytes should be returned in the
          #   Photo response.
          # @param options [Google::Gax::CallOptions]
          #   Overrides the default settings for this call, e.g, timeout,
          #   retries, etc.
          # @return [Google::Streetview::Publish::V1::Photo]
          # @raise [Google::Gax::GaxError] if the RPC is aborted.
          # @example
          #   require "google/streetview/publish/v1"
          #
          #   street_view_publish_service_client = Google::Streetview::Publish::V1::StreetViewPublishServiceClient.new
          #   photo_id = ''
          #   view = :BASIC
          #   response = street_view_publish_service_client.get_photo(photo_id, view)

          def get_photo \
              photo_id,
              view,
              options: nil
            req = Google::Streetview::Publish::V1::GetPhotoRequest.new({
              photo_id: photo_id,
              view: view
            }.delete_if { |_, v| v.nil? })
            @get_photo.call(req, options)
          end

          # Gets the metadata of the specified +Photo+ batch.
          #
          # Note that if +photos.batchGet+ fails, either critical fields are
          # missing or there was an authentication error.
          # Even if +photos.batchGet+ succeeds, there may have been failures
          # for single photos in the batch. These failures will be specified in
          # +BatchGetPhotosResponse.results.status+.
          # See +photo.get+ for specific failures that will occur per photo.
          #
          # @param photo_ids [Array<String>]
          #   Required. IDs of the photos.
          # @param view [Google::Streetview::Publish::V1::PhotoView]
          #   Specifies if a download URL for the photo bytes should be returned in the
          #   Photo response.
          # @param options [Google::Gax::CallOptions]
          #   Overrides the default settings for this call, e.g, timeout,
          #   retries, etc.
          # @return [Google::Streetview::Publish::V1::BatchGetPhotosResponse]
          # @raise [Google::Gax::GaxError] if the RPC is aborted.
          # @example
          #   require "google/streetview/publish/v1"
          #
          #   street_view_publish_service_client = Google::Streetview::Publish::V1::StreetViewPublishServiceClient.new
          #   photo_ids = []
          #   view = :BASIC
          #   response = street_view_publish_service_client.batch_get_photos(photo_ids, view)

          def batch_get_photos \
              photo_ids,
              view,
              options: nil
            req = Google::Streetview::Publish::V1::BatchGetPhotosRequest.new({
              photo_ids: photo_ids,
              view: view
            }.delete_if { |_, v| v.nil? })
            @batch_get_photos.call(req, options)
          end

          # Lists all the photos that belong to the user.
          #
          # @param view [Google::Streetview::Publish::V1::PhotoView]
          #   Specifies if a download URL for the photos bytes should be returned in the
          #   Photos response.
          # @param filter [String]
          #   The filter expression.
          #   Example: +placeId=ChIJj61dQgK6j4AR4GeTYWZsKWw+
          # @param page_size [Integer]
          #   The maximum number of resources contained in the underlying API
          #   response. If page streaming is performed per-resource, this
          #   parameter does not affect the return value. If page streaming is
          #   performed per-page, this determines the maximum number of
          #   resources in a page.
          # @param options [Google::Gax::CallOptions]
          #   Overrides the default settings for this call, e.g, timeout,
          #   retries, etc.
          # @return [Google::Gax::PagedEnumerable<Google::Streetview::Publish::V1::Photo>]
          #   An enumerable of Google::Streetview::Publish::V1::Photo instances.
          #   See Google::Gax::PagedEnumerable documentation for other
          #   operations such as per-page iteration or access to the response
          #   object.
          # @raise [Google::Gax::GaxError] if the RPC is aborted.
          # @example
          #   require "google/streetview/publish/v1"
          #
          #   street_view_publish_service_client = Google::Streetview::Publish::V1::StreetViewPublishServiceClient.new
          #   view = :BASIC
          #   filter = ''
          #
          #   # Iterate over all results.
          #   street_view_publish_service_client.list_photos(view, filter).each do |element|
          #     # Process element.
          #   end
          #
          #   # Or iterate over results one page at a time.
          #   street_view_publish_service_client.list_photos(view, filter).each_page do |page|
          #     # Process each page at a time.
          #     page.each do |element|
          #       # Process element.
          #     end
          #   end

          def list_photos \
              view,
              filter,
              page_size: nil,
              options: nil
            req = Google::Streetview::Publish::V1::ListPhotosRequest.new({
              view: view,
              filter: filter,
              page_size: page_size
            }.delete_if { |_, v| v.nil? })
            @list_photos.call(req, options)
          end

          # Updates the metadata of a photo, such as pose, place association, etc.
          # Changing the pixels of a photo is not supported.
          #
          # This method returns the following error codes:
          #
          # * +PERMISSION_DENIED+ if the requesting user did not create the requested
          #   photo.
          # * +INVALID_ARGUMENT+ if the request is malformed.
          # * +NOT_FOUND+ if the photo ID does not exist.
          #
          # @param photo [Google::Streetview::Publish::V1::Photo]
          #   Required. Photo object containing the new metadata. Only the fields
          #   specified in +update_mask+ are used. If +update_mask+ is not present, the
          #   update applies to all fields.
          #   **Note:** To update +pose.altitude+, +pose.latlngpair+ has to be filled as
          #   well. Otherwise, the request will fail.
          # @param update_mask [Google::Protobuf::FieldMask]
          #   Mask that identifies fields on the photo metadata to update.
          #   If not present, the old Photo metadata will be entirely replaced with the
          #   new Photo metadata in this request. The update fails if invalid fields are
          #   specified. Multiple fields can be specified in a comma-delimited list.
          #
          #   The following fields are valid:
          #
          #   * +pose.heading+
          #   * +pose.latlngpair+
          #   * +pose.level+
          #   * +pose.altitude+
          #   * +connections+
          #   * +places+
          #
          #
          #   **Note:** Repeated fields in +update_mask+ mean the entire set of repeated
          #   values will be replaced with the new contents. For example, if
          #   +UpdatePhotoRequest.photo.update_mask+ contains +connections+ and
          #   +UpdatePhotoRequest.photo.connections+ is empty, all connections will be
          #   removed.
          # @param options [Google::Gax::CallOptions]
          #   Overrides the default settings for this call, e.g, timeout,
          #   retries, etc.
          # @return [Google::Streetview::Publish::V1::Photo]
          # @raise [Google::Gax::GaxError] if the RPC is aborted.
          # @example
          #   require "google/streetview/publish/v1"
          #
          #   street_view_publish_service_client = Google::Streetview::Publish::V1::StreetViewPublishServiceClient.new
          #   photo = Google::Streetview::Publish::V1::Photo.new
          #   update_mask = Google::Protobuf::FieldMask.new
          #   response = street_view_publish_service_client.update_photo(photo, update_mask)

          def update_photo \
              photo,
              update_mask,
              options: nil
            req = Google::Streetview::Publish::V1::UpdatePhotoRequest.new({
              photo: photo,
              update_mask: update_mask
            }.delete_if { |_, v| v.nil? })
            @update_photo.call(req, options)
          end

          # Updates the metadata of photos, such as pose, place association, etc.
          # Changing the pixels of a photo is not supported.
          #
          # Note that if +photos.batchUpdate+ fails, either critical fields
          # are missing or there was an authentication error.
          # Even if +photos.batchUpdate+ succeeds, there may have been
          # failures for single photos in the batch. These failures will be specified
          # in +BatchUpdatePhotosResponse.results.status+.
          # See +UpdatePhoto+ for specific failures that will occur per photo.
          #
          # @param update_photo_requests [Array<Google::Streetview::Publish::V1::UpdatePhotoRequest>]
          #   Required. List of update photo requests.
          # @param options [Google::Gax::CallOptions]
          #   Overrides the default settings for this call, e.g, timeout,
          #   retries, etc.
          # @return [Google::Streetview::Publish::V1::BatchUpdatePhotosResponse]
          # @raise [Google::Gax::GaxError] if the RPC is aborted.
          # @example
          #   require "google/streetview/publish/v1"
          #
          #   street_view_publish_service_client = Google::Streetview::Publish::V1::StreetViewPublishServiceClient.new
          #   update_photo_requests = []
          #   response = street_view_publish_service_client.batch_update_photos(update_photo_requests)

          def batch_update_photos \
              update_photo_requests,
              options: nil
            req = Google::Streetview::Publish::V1::BatchUpdatePhotosRequest.new({
              update_photo_requests: update_photo_requests
            }.delete_if { |_, v| v.nil? })
            @batch_update_photos.call(req, options)
          end

          # Deletes a photo and its metadata.
          #
          # This method returns the following error codes:
          #
          # * +PERMISSION_DENIED+ if the requesting user did not create the requested
          #   photo.
          # * +NOT_FOUND+ if the photo ID does not exist.
          #
          # @param photo_id [String]
          #   Required. ID of the photo.
          # @param options [Google::Gax::CallOptions]
          #   Overrides the default settings for this call, e.g, timeout,
          #   retries, etc.
          # @raise [Google::Gax::GaxError] if the RPC is aborted.
          # @example
          #   require "google/streetview/publish/v1"
          #
          #   street_view_publish_service_client = Google::Streetview::Publish::V1::StreetViewPublishServiceClient.new
          #   photo_id = ''
          #   street_view_publish_service_client.delete_photo(photo_id)

          def delete_photo \
              photo_id,
              options: nil
            req = Google::Streetview::Publish::V1::DeletePhotoRequest.new({
              photo_id: photo_id
            }.delete_if { |_, v| v.nil? })
            @delete_photo.call(req, options)
            nil
          end

          # Deletes a list of photos and their metadata.
          #
          # Note that if +photos.batchDelete+ fails, either critical fields
          # are missing or there was an authentication error.
          # Even if +photos.batchDelete+ succeeds, there may have been
          # failures for single photos in the batch. These failures will be specified
          # in +BatchDeletePhotosResponse.status+.
          # See +photo.update+ for specific failures that will occur per photo.
          #
          # @param photo_ids [Array<String>]
          #   Required. List of delete photo requests.
          # @param options [Google::Gax::CallOptions]
          #   Overrides the default settings for this call, e.g, timeout,
          #   retries, etc.
          # @return [Google::Streetview::Publish::V1::BatchDeletePhotosResponse]
          # @raise [Google::Gax::GaxError] if the RPC is aborted.
          # @example
          #   require "google/streetview/publish/v1"
          #
          #   street_view_publish_service_client = Google::Streetview::Publish::V1::StreetViewPublishServiceClient.new
          #   photo_ids = []
          #   response = street_view_publish_service_client.batch_delete_photos(photo_ids)

          def batch_delete_photos \
              photo_ids,
              options: nil
            req = Google::Streetview::Publish::V1::BatchDeletePhotosRequest.new({
              photo_ids: photo_ids
            }.delete_if { |_, v| v.nil? })
            @batch_delete_photos.call(req, options)
          end
        end
      end
    end
  end
end
