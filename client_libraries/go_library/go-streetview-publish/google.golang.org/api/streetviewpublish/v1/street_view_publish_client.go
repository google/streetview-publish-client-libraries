// Copyright 2017, Google Inc. All rights reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

// AUTO-GENERATED CODE. DO NOT EDIT.

package streetviewpublish

import (
	"math"
	"time"

	"cloud.google.com/go/internal/version"
	gax "github.com/googleapis/gax-go"
	"golang.org/x/net/context"
	"google.golang.org/api/iterator"
	"google.golang.org/api/option"
	"google.golang.org/api/transport"
	publishpb "google.golang.org/genproto/googleapis/streetview/publish/v1"
	"google.golang.org/grpc"
	"google.golang.org/grpc/codes"
)

// StreetViewPublishCallOptions contains the retry settings for each method of StreetViewPublishClient.
type StreetViewPublishCallOptions struct {
	StartUpload       []gax.CallOption
	CreatePhoto       []gax.CallOption
	GetPhoto          []gax.CallOption
	BatchGetPhotos    []gax.CallOption
	ListPhotos        []gax.CallOption
	UpdatePhoto       []gax.CallOption
	BatchUpdatePhotos []gax.CallOption
	DeletePhoto       []gax.CallOption
	BatchDeletePhotos []gax.CallOption
}

func defaultStreetViewPublishClientOptions() []option.ClientOption {
	return []option.ClientOption{
		option.WithEndpoint("streetviewpublish.googleapis.com:443"),
		option.WithScopes(DefaultAuthScopes()...),
	}
}

func defaultStreetViewPublishCallOptions() *StreetViewPublishCallOptions {
	retry := map[[2]string][]gax.CallOption{
		{"default", "idempotent"}: {
			gax.WithRetry(func() gax.Retryer {
				return gax.OnCodes([]codes.Code{
					codes.DeadlineExceeded,
					codes.Unavailable,
				}, gax.Backoff{
					Initial:    100 * time.Millisecond,
					Max:        60000 * time.Millisecond,
					Multiplier: 1.3,
				})
			}),
		},
	}
	return &StreetViewPublishCallOptions{
		StartUpload:       retry[[2]string{"default", "non_idempotent"}],
		CreatePhoto:       retry[[2]string{"default", "non_idempotent"}],
		GetPhoto:          retry[[2]string{"default", "idempotent"}],
		BatchGetPhotos:    retry[[2]string{"default", "idempotent"}],
		ListPhotos:        retry[[2]string{"default", "idempotent"}],
		UpdatePhoto:       retry[[2]string{"default", "idempotent"}],
		BatchUpdatePhotos: retry[[2]string{"default", "non_idempotent"}],
		DeletePhoto:       retry[[2]string{"default", "idempotent"}],
		BatchDeletePhotos: retry[[2]string{"default", "non_idempotent"}],
	}
}

// StreetViewPublishClient is a client for interacting with Street View Publish API.
type StreetViewPublishClient struct {
	// The connection to the service.
	conn *grpc.ClientConn

	// The gRPC API client.
	streetViewPublishClient publishpb.StreetViewPublishServiceClient

	// The call options for this service.
	CallOptions *StreetViewPublishCallOptions

	// The metadata to be sent with each request.
	xGoogHeader []string
}

// NewStreetViewPublishClient creates a new street view publish service client.
//
// Publishes and connects user-contributed photos on Street View.
func NewStreetViewPublishClient(ctx context.Context, opts ...option.ClientOption) (*StreetViewPublishClient, error) {
	conn, err := transport.DialGRPC(ctx, append(defaultStreetViewPublishClientOptions(), opts...)...)
	if err != nil {
		return nil, err
	}
	c := &StreetViewPublishClient{
		conn:        conn,
		CallOptions: defaultStreetViewPublishCallOptions(),

		streetViewPublishClient: publishpb.NewStreetViewPublishServiceClient(conn),
	}
	c.SetGoogleClientInfo()
	return c, nil
}

// Connection returns the client's connection to the API service.
func (c *StreetViewPublishClient) Connection() *grpc.ClientConn {
	return c.conn
}

// Close closes the connection to the API service. The user should invoke this when
// the client is no longer required.
func (c *StreetViewPublishClient) Close() error {
	return c.conn.Close()
}

// SetGoogleClientInfo sets the name and version of the application in
// the `x-goog-api-client` header passed on each request. Intended for
// use by Google-written clients.
func (c *StreetViewPublishClient) SetGoogleClientInfo(keyval ...string) {
	kv := append([]string{"gl-go", version.Go()}, keyval...)
	kv = append(kv, "gapic", version.Repo, "gax", gax.Version, "grpc", grpc.Version)
	c.xGoogHeader = []string{gax.XGoogHeader(kv...)}
}

// StartUpload creates an upload session to start uploading photo data. The upload URL of
// the returned `UploadRef` is used to upload the data for the photo.
//
// After the upload is complete, the `UploadRef` is used with
// `StreetViewPublishService:CreatePhoto()` to create the `Photo` object
// entry.
func (c *StreetViewPublishClient) StartUpload(ctx context.Context, req *emptypb.Empty, opts ...gax.CallOption) (*publishpb.UploadRef, error) {
	ctx = insertXGoog(ctx, c.xGoogHeader)
	opts = append(c.CallOptions.StartUpload[0:len(c.CallOptions.StartUpload):len(c.CallOptions.StartUpload)], opts...)
	var resp *publishpb.UploadRef
	err := gax.Invoke(ctx, func(ctx context.Context, settings gax.CallSettings) error {
		var err error
		resp, err = c.streetViewPublishClient.StartUpload(ctx, req, settings.GRPC...)
		return err
	}, opts...)
	if err != nil {
		return nil, err
	}
	return resp, nil
}

// CreatePhoto after the client finishes uploading the photo with the returned
// `UploadRef`, `photo.create` publishes the uploaded photo to Street View on
// Google Maps.
//
// This method returns the following error codes:
//
// * `INVALID_ARGUMENT` if the request is malformed.
// * `NOT_FOUND` if the upload reference does not exist.
func (c *StreetViewPublishClient) CreatePhoto(ctx context.Context, req *publishpb.CreatePhotoRequest, opts ...gax.CallOption) (*publishpb.Photo, error) {
	ctx = insertXGoog(ctx, c.xGoogHeader)
	opts = append(c.CallOptions.CreatePhoto[0:len(c.CallOptions.CreatePhoto):len(c.CallOptions.CreatePhoto)], opts...)
	var resp *publishpb.Photo
	err := gax.Invoke(ctx, func(ctx context.Context, settings gax.CallSettings) error {
		var err error
		resp, err = c.streetViewPublishClient.CreatePhoto(ctx, req, settings.GRPC...)
		return err
	}, opts...)
	if err != nil {
		return nil, err
	}
	return resp, nil
}

// GetPhoto gets the metadata of the specified `Photo`.
//
// This method returns the following error codes:
//
// * `PERMISSION_DENIED` if the requesting user did not create the requested
// photo.
// * `NOT_FOUND` if the requested photo does not exist.
func (c *StreetViewPublishClient) GetPhoto(ctx context.Context, req *publishpb.GetPhotoRequest, opts ...gax.CallOption) (*publishpb.Photo, error) {
	ctx = insertXGoog(ctx, c.xGoogHeader)
	opts = append(c.CallOptions.GetPhoto[0:len(c.CallOptions.GetPhoto):len(c.CallOptions.GetPhoto)], opts...)
	var resp *publishpb.Photo
	err := gax.Invoke(ctx, func(ctx context.Context, settings gax.CallSettings) error {
		var err error
		resp, err = c.streetViewPublishClient.GetPhoto(ctx, req, settings.GRPC...)
		return err
	}, opts...)
	if err != nil {
		return nil, err
	}
	return resp, nil
}

// BatchGetPhotos gets the metadata of the specified `Photo` batch.
//
// Note that if `photos.batchGet` fails, either critical fields are
// missing or there was an authentication error.
// Even if `photos.batchGet` succeeds, there may have been failures
// for single photos in the batch. These failures will be specified in
// `BatchGetPhotosResponse.results.status`.
// See `photo.get` for specific failures that will occur per photo.
func (c *StreetViewPublishClient) BatchGetPhotos(ctx context.Context, req *publishpb.BatchGetPhotosRequest, opts ...gax.CallOption) (*publishpb.BatchGetPhotosResponse, error) {
	ctx = insertXGoog(ctx, c.xGoogHeader)
	opts = append(c.CallOptions.BatchGetPhotos[0:len(c.CallOptions.BatchGetPhotos):len(c.CallOptions.BatchGetPhotos)], opts...)
	var resp *publishpb.BatchGetPhotosResponse
	err := gax.Invoke(ctx, func(ctx context.Context, settings gax.CallSettings) error {
		var err error
		resp, err = c.streetViewPublishClient.BatchGetPhotos(ctx, req, settings.GRPC...)
		return err
	}, opts...)
	if err != nil {
		return nil, err
	}
	return resp, nil
}

// ListPhotos lists all the photos that belong to the user.
func (c *StreetViewPublishClient) ListPhotos(ctx context.Context, req *publishpb.ListPhotosRequest, opts ...gax.CallOption) *PhotoIterator {
	ctx = insertXGoog(ctx, c.xGoogHeader)
	opts = append(c.CallOptions.ListPhotos[0:len(c.CallOptions.ListPhotos):len(c.CallOptions.ListPhotos)], opts...)
	it := &PhotoIterator{}
	it.InternalFetch = func(pageSize int, pageToken string) ([]*publishpb.Photo, string, error) {
		var resp *publishpb.ListPhotosResponse
		req.PageToken = pageToken
		if pageSize > math.MaxInt32 {
			req.PageSize = math.MaxInt32
		} else {
			req.PageSize = int32(pageSize)
		}
		err := gax.Invoke(ctx, func(ctx context.Context, settings gax.CallSettings) error {
			var err error
			resp, err = c.streetViewPublishClient.ListPhotos(ctx, req, settings.GRPC...)
			return err
		}, opts...)
		if err != nil {
			return nil, "", err
		}
		return resp.Photos, resp.NextPageToken, nil
	}
	fetch := func(pageSize int, pageToken string) (string, error) {
		items, nextPageToken, err := it.InternalFetch(pageSize, pageToken)
		if err != nil {
			return "", err
		}
		it.items = append(it.items, items...)
		return nextPageToken, nil
	}
	it.pageInfo, it.nextFunc = iterator.NewPageInfo(fetch, it.bufLen, it.takeBuf)
	return it
}

// UpdatePhoto updates the metadata of a photo, such as pose, place association, etc.
// Changing the pixels of a photo is not supported.
//
// This method returns the following error codes:
//
// * `PERMISSION_DENIED` if the requesting user did not create the requested
// photo.
// * `INVALID_ARGUMENT` if the request is malformed.
// * `NOT_FOUND` if the photo ID does not exist.
func (c *StreetViewPublishClient) UpdatePhoto(ctx context.Context, req *publishpb.UpdatePhotoRequest, opts ...gax.CallOption) (*publishpb.Photo, error) {
	ctx = insertXGoog(ctx, c.xGoogHeader)
	opts = append(c.CallOptions.UpdatePhoto[0:len(c.CallOptions.UpdatePhoto):len(c.CallOptions.UpdatePhoto)], opts...)
	var resp *publishpb.Photo
	err := gax.Invoke(ctx, func(ctx context.Context, settings gax.CallSettings) error {
		var err error
		resp, err = c.streetViewPublishClient.UpdatePhoto(ctx, req, settings.GRPC...)
		return err
	}, opts...)
	if err != nil {
		return nil, err
	}
	return resp, nil
}

// BatchUpdatePhotos updates the metadata of photos, such as pose, place association, etc.
// Changing the pixels of a photo is not supported.
//
// Note that if `photos.batchUpdate` fails, either critical fields
// are missing or there was an authentication error.
// Even if `photos.batchUpdate` succeeds, there may have been
// failures for single photos in the batch. These failures will be specified
// in `BatchUpdatePhotosResponse.results.status`.
// See `UpdatePhoto` for specific failures that will occur per photo.
func (c *StreetViewPublishClient) BatchUpdatePhotos(ctx context.Context, req *publishpb.BatchUpdatePhotosRequest, opts ...gax.CallOption) (*publishpb.BatchUpdatePhotosResponse, error) {
	ctx = insertXGoog(ctx, c.xGoogHeader)
	opts = append(c.CallOptions.BatchUpdatePhotos[0:len(c.CallOptions.BatchUpdatePhotos):len(c.CallOptions.BatchUpdatePhotos)], opts...)
	var resp *publishpb.BatchUpdatePhotosResponse
	err := gax.Invoke(ctx, func(ctx context.Context, settings gax.CallSettings) error {
		var err error
		resp, err = c.streetViewPublishClient.BatchUpdatePhotos(ctx, req, settings.GRPC...)
		return err
	}, opts...)
	if err != nil {
		return nil, err
	}
	return resp, nil
}

// DeletePhoto deletes a photo and its metadata.
//
// This method returns the following error codes:
//
// * `PERMISSION_DENIED` if the requesting user did not create the requested
// photo.
// * `NOT_FOUND` if the photo ID does not exist.
func (c *StreetViewPublishClient) DeletePhoto(ctx context.Context, req *publishpb.DeletePhotoRequest, opts ...gax.CallOption) error {
	ctx = insertXGoog(ctx, c.xGoogHeader)
	opts = append(c.CallOptions.DeletePhoto[0:len(c.CallOptions.DeletePhoto):len(c.CallOptions.DeletePhoto)], opts...)
	err := gax.Invoke(ctx, func(ctx context.Context, settings gax.CallSettings) error {
		var err error
		_, err = c.streetViewPublishClient.DeletePhoto(ctx, req, settings.GRPC...)
		return err
	}, opts...)
	return err
}

// BatchDeletePhotos deletes a list of photos and their metadata.
//
// Note that if `photos.batchDelete` fails, either critical fields
// are missing or there was an authentication error.
// Even if `photos.batchDelete` succeeds, there may have been
// failures for single photos in the batch. These failures will be specified
// in `BatchDeletePhotosResponse.status`.
// See `photo.update` for specific failures that will occur per photo.
func (c *StreetViewPublishClient) BatchDeletePhotos(ctx context.Context, req *publishpb.BatchDeletePhotosRequest, opts ...gax.CallOption) (*publishpb.BatchDeletePhotosResponse, error) {
	ctx = insertXGoog(ctx, c.xGoogHeader)
	opts = append(c.CallOptions.BatchDeletePhotos[0:len(c.CallOptions.BatchDeletePhotos):len(c.CallOptions.BatchDeletePhotos)], opts...)
	var resp *publishpb.BatchDeletePhotosResponse
	err := gax.Invoke(ctx, func(ctx context.Context, settings gax.CallSettings) error {
		var err error
		resp, err = c.streetViewPublishClient.BatchDeletePhotos(ctx, req, settings.GRPC...)
		return err
	}, opts...)
	if err != nil {
		return nil, err
	}
	return resp, nil
}

// PhotoIterator manages a stream of *publishpb.Photo.
type PhotoIterator struct {
	items    []*publishpb.Photo
	pageInfo *iterator.PageInfo
	nextFunc func() error

	// InternalFetch is for use by the Google Cloud Libraries only.
	// It is not part of the stable interface of this package.
	//
	// InternalFetch returns results from a single call to the underlying RPC.
	// The number of results is no greater than pageSize.
	// If there are no more results, nextPageToken is empty and err is nil.
	InternalFetch func(pageSize int, pageToken string) (results []*publishpb.Photo, nextPageToken string, err error)
}

// PageInfo supports pagination. See the google.golang.org/api/iterator package for details.
func (it *PhotoIterator) PageInfo() *iterator.PageInfo {
	return it.pageInfo
}

// Next returns the next result. Its second return value is iterator.Done if there are no more
// results. Once Next returns Done, all subsequent calls will return Done.
func (it *PhotoIterator) Next() (*publishpb.Photo, error) {
	var item *publishpb.Photo
	if err := it.nextFunc(); err != nil {
		return item, err
	}
	item = it.items[0]
	it.items = it.items[1:]
	return item, nil
}

func (it *PhotoIterator) bufLen() int {
	return len(it.items)
}

func (it *PhotoIterator) takeBuf() interface{} {
	b := it.items
	it.items = nil
	return b
}
