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

package streetviewpublish_test

import (
	emptypb "github.com/golang/protobuf/ptypes/empty"
	"golang.org/x/net/context"
	"google.golang.org/api/streetviewpublish/v1"
	publishpb "google.golang.org/genproto/googleapis/streetview/publish/v1"
)

func ExampleNewStreetViewPublishClient() {
	ctx := context.Background()
	c, err := streetviewpublish.NewStreetViewPublishClient(ctx)
	if err != nil {
		// TODO: Handle error.
	}
	// TODO: Use client.
	_ = c
}

func ExampleStreetViewPublishClient_StartUpload() {
	ctx := context.Background()
	c, err := streetviewpublish.NewStreetViewPublishClient(ctx)
	if err != nil {
		// TODO: Handle error.
	}

	req := &emptypb.Empty{
	// TODO: Fill request struct fields.
	}
	resp, err := c.StartUpload(ctx, req)
	if err != nil {
		// TODO: Handle error.
	}
	// TODO: Use resp.
	_ = resp
}

func ExampleStreetViewPublishClient_CreatePhoto() {
	ctx := context.Background()
	c, err := streetviewpublish.NewStreetViewPublishClient(ctx)
	if err != nil {
		// TODO: Handle error.
	}

	req := &publishpb.CreatePhotoRequest{
	// TODO: Fill request struct fields.
	}
	resp, err := c.CreatePhoto(ctx, req)
	if err != nil {
		// TODO: Handle error.
	}
	// TODO: Use resp.
	_ = resp
}

func ExampleStreetViewPublishClient_GetPhoto() {
	ctx := context.Background()
	c, err := streetviewpublish.NewStreetViewPublishClient(ctx)
	if err != nil {
		// TODO: Handle error.
	}

	req := &publishpb.GetPhotoRequest{
	// TODO: Fill request struct fields.
	}
	resp, err := c.GetPhoto(ctx, req)
	if err != nil {
		// TODO: Handle error.
	}
	// TODO: Use resp.
	_ = resp
}

func ExampleStreetViewPublishClient_BatchGetPhotos() {
	ctx := context.Background()
	c, err := streetviewpublish.NewStreetViewPublishClient(ctx)
	if err != nil {
		// TODO: Handle error.
	}

	req := &publishpb.BatchGetPhotosRequest{
	// TODO: Fill request struct fields.
	}
	resp, err := c.BatchGetPhotos(ctx, req)
	if err != nil {
		// TODO: Handle error.
	}
	// TODO: Use resp.
	_ = resp
}

func ExampleStreetViewPublishClient_ListPhotos() {
	ctx := context.Background()
	c, err := streetviewpublish.NewStreetViewPublishClient(ctx)
	if err != nil {
		// TODO: Handle error.
	}

	req := &publishpb.ListPhotosRequest{
	// TODO: Fill request struct fields.
	}
	it := c.ListPhotos(ctx, req)
	for {
		resp, err := it.Next()
		if err != nil {
			// TODO: Handle error.
			break
		}
		// TODO: Use resp.
		_ = resp
	}
}

func ExampleStreetViewPublishClient_UpdatePhoto() {
	ctx := context.Background()
	c, err := streetviewpublish.NewStreetViewPublishClient(ctx)
	if err != nil {
		// TODO: Handle error.
	}

	req := &publishpb.UpdatePhotoRequest{
	// TODO: Fill request struct fields.
	}
	resp, err := c.UpdatePhoto(ctx, req)
	if err != nil {
		// TODO: Handle error.
	}
	// TODO: Use resp.
	_ = resp
}

func ExampleStreetViewPublishClient_BatchUpdatePhotos() {
	ctx := context.Background()
	c, err := streetviewpublish.NewStreetViewPublishClient(ctx)
	if err != nil {
		// TODO: Handle error.
	}

	req := &publishpb.BatchUpdatePhotosRequest{
	// TODO: Fill request struct fields.
	}
	resp, err := c.BatchUpdatePhotos(ctx, req)
	if err != nil {
		// TODO: Handle error.
	}
	// TODO: Use resp.
	_ = resp
}

func ExampleStreetViewPublishClient_DeletePhoto() {
	ctx := context.Background()
	c, err := streetviewpublish.NewStreetViewPublishClient(ctx)
	if err != nil {
		// TODO: Handle error.
	}

	req := &publishpb.DeletePhotoRequest{
	// TODO: Fill request struct fields.
	}
	err = c.DeletePhoto(ctx, req)
	if err != nil {
		// TODO: Handle error.
	}
}

func ExampleStreetViewPublishClient_BatchDeletePhotos() {
	ctx := context.Background()
	c, err := streetviewpublish.NewStreetViewPublishClient(ctx)
	if err != nil {
		// TODO: Handle error.
	}

	req := &publishpb.BatchDeletePhotosRequest{
	// TODO: Fill request struct fields.
	}
	resp, err := c.BatchDeletePhotos(ctx, req)
	if err != nil {
		// TODO: Handle error.
	}
	// TODO: Use resp.
	_ = resp
}
