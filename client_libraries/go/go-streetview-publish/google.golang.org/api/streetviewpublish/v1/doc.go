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

// Package streetviewpublish is an experimental, auto-generated package for the
// streetviewpublish API.
//
// The Street View Publish API allows your application to publish 360 photos
// to
// Google Maps, along with image metadata that specifies the position,
// orientation, and connectivity of each photo. With this API, any app can
// offer an interface for positioning, connecting, and uploading
// user-generated
// Street View images.
package streetviewpublish // import "google.golang.org/api/streetviewpublish/v1"

import (
	"golang.org/x/net/context"
	"google.golang.org/grpc/metadata"
)

func insertXGoog(ctx context.Context, val []string) context.Context {
	md, _ := metadata.FromOutgoingContext(ctx)
	md = md.Copy()
	md["x-goog-api-client"] = val
	return metadata.NewOutgoingContext(ctx, md)
}

func DefaultAuthScopes() []string {
	return []string{
		"https://www.googleapis.com/auth/streetviewpublish",
	}
}
