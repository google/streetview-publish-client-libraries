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
	emptypb "github.com/golang/protobuf/ptypes/empty"
	publishpb "google.golang.org/genproto/googleapis/streetview/publish/v1"
	field_maskpb "google.golang.org/genproto/protobuf/field_mask"
)

import (
	"flag"
	"fmt"
	"io"
	"log"
	"net"
	"os"
	"strings"
	"testing"

	"github.com/golang/protobuf/proto"
	"github.com/golang/protobuf/ptypes"
	"golang.org/x/net/context"
	"google.golang.org/api/option"
	status "google.golang.org/genproto/googleapis/rpc/status"
	"google.golang.org/grpc"
	"google.golang.org/grpc/codes"
	"google.golang.org/grpc/metadata"
)

var _ = io.EOF
var _ = ptypes.MarshalAny
var _ status.Status

type mockStreetViewPublishServer struct {
	// Embed for forward compatibility.
	// Tests will keep working if more methods are added
	// in the future.
	publishpb.StreetViewPublishServiceServer

	reqs []proto.Message

	// If set, all calls return this error.
	err error

	// responses to return if err == nil
	resps []proto.Message
}

func (s *mockStreetViewPublishServer) StartUpload(ctx context.Context, req *emptypb.Empty) (*publishpb.UploadRef, error) {
	md, _ := metadata.FromIncomingContext(ctx)
	if xg := md["x-goog-api-client"]; len(xg) == 0 || !strings.Contains(xg[0], "gl-go/") {
		return nil, fmt.Errorf("x-goog-api-client = %v, expected gl-go key", xg)
	}
	s.reqs = append(s.reqs, req)
	if s.err != nil {
		return nil, s.err
	}
	return s.resps[0].(*publishpb.UploadRef), nil
}

func (s *mockStreetViewPublishServer) CreatePhoto(ctx context.Context, req *publishpb.CreatePhotoRequest) (*publishpb.Photo, error) {
	md, _ := metadata.FromIncomingContext(ctx)
	if xg := md["x-goog-api-client"]; len(xg) == 0 || !strings.Contains(xg[0], "gl-go/") {
		return nil, fmt.Errorf("x-goog-api-client = %v, expected gl-go key", xg)
	}
	s.reqs = append(s.reqs, req)
	if s.err != nil {
		return nil, s.err
	}
	return s.resps[0].(*publishpb.Photo), nil
}

func (s *mockStreetViewPublishServer) GetPhoto(ctx context.Context, req *publishpb.GetPhotoRequest) (*publishpb.Photo, error) {
	md, _ := metadata.FromIncomingContext(ctx)
	if xg := md["x-goog-api-client"]; len(xg) == 0 || !strings.Contains(xg[0], "gl-go/") {
		return nil, fmt.Errorf("x-goog-api-client = %v, expected gl-go key", xg)
	}
	s.reqs = append(s.reqs, req)
	if s.err != nil {
		return nil, s.err
	}
	return s.resps[0].(*publishpb.Photo), nil
}

func (s *mockStreetViewPublishServer) BatchGetPhotos(ctx context.Context, req *publishpb.BatchGetPhotosRequest) (*publishpb.BatchGetPhotosResponse, error) {
	md, _ := metadata.FromIncomingContext(ctx)
	if xg := md["x-goog-api-client"]; len(xg) == 0 || !strings.Contains(xg[0], "gl-go/") {
		return nil, fmt.Errorf("x-goog-api-client = %v, expected gl-go key", xg)
	}
	s.reqs = append(s.reqs, req)
	if s.err != nil {
		return nil, s.err
	}
	return s.resps[0].(*publishpb.BatchGetPhotosResponse), nil
}

func (s *mockStreetViewPublishServer) ListPhotos(ctx context.Context, req *publishpb.ListPhotosRequest) (*publishpb.ListPhotosResponse, error) {
	md, _ := metadata.FromIncomingContext(ctx)
	if xg := md["x-goog-api-client"]; len(xg) == 0 || !strings.Contains(xg[0], "gl-go/") {
		return nil, fmt.Errorf("x-goog-api-client = %v, expected gl-go key", xg)
	}
	s.reqs = append(s.reqs, req)
	if s.err != nil {
		return nil, s.err
	}
	return s.resps[0].(*publishpb.ListPhotosResponse), nil
}

func (s *mockStreetViewPublishServer) UpdatePhoto(ctx context.Context, req *publishpb.UpdatePhotoRequest) (*publishpb.Photo, error) {
	md, _ := metadata.FromIncomingContext(ctx)
	if xg := md["x-goog-api-client"]; len(xg) == 0 || !strings.Contains(xg[0], "gl-go/") {
		return nil, fmt.Errorf("x-goog-api-client = %v, expected gl-go key", xg)
	}
	s.reqs = append(s.reqs, req)
	if s.err != nil {
		return nil, s.err
	}
	return s.resps[0].(*publishpb.Photo), nil
}

func (s *mockStreetViewPublishServer) BatchUpdatePhotos(ctx context.Context, req *publishpb.BatchUpdatePhotosRequest) (*publishpb.BatchUpdatePhotosResponse, error) {
	md, _ := metadata.FromIncomingContext(ctx)
	if xg := md["x-goog-api-client"]; len(xg) == 0 || !strings.Contains(xg[0], "gl-go/") {
		return nil, fmt.Errorf("x-goog-api-client = %v, expected gl-go key", xg)
	}
	s.reqs = append(s.reqs, req)
	if s.err != nil {
		return nil, s.err
	}
	return s.resps[0].(*publishpb.BatchUpdatePhotosResponse), nil
}

func (s *mockStreetViewPublishServer) DeletePhoto(ctx context.Context, req *publishpb.DeletePhotoRequest) (*emptypb.Empty, error) {
	md, _ := metadata.FromIncomingContext(ctx)
	if xg := md["x-goog-api-client"]; len(xg) == 0 || !strings.Contains(xg[0], "gl-go/") {
		return nil, fmt.Errorf("x-goog-api-client = %v, expected gl-go key", xg)
	}
	s.reqs = append(s.reqs, req)
	if s.err != nil {
		return nil, s.err
	}
	return s.resps[0].(*emptypb.Empty), nil
}

func (s *mockStreetViewPublishServer) BatchDeletePhotos(ctx context.Context, req *publishpb.BatchDeletePhotosRequest) (*publishpb.BatchDeletePhotosResponse, error) {
	md, _ := metadata.FromIncomingContext(ctx)
	if xg := md["x-goog-api-client"]; len(xg) == 0 || !strings.Contains(xg[0], "gl-go/") {
		return nil, fmt.Errorf("x-goog-api-client = %v, expected gl-go key", xg)
	}
	s.reqs = append(s.reqs, req)
	if s.err != nil {
		return nil, s.err
	}
	return s.resps[0].(*publishpb.BatchDeletePhotosResponse), nil
}

// clientOpt is the option tests should use to connect to the test server.
// It is initialized by TestMain.
var clientOpt option.ClientOption

var (
	mockStreetViewPublish mockStreetViewPublishServer
)

func TestMain(m *testing.M) {
	flag.Parse()

	serv := grpc.NewServer()
	publishpb.RegisterStreetViewPublishServiceServer(serv, &mockStreetViewPublish)

	lis, err := net.Listen("tcp", "localhost:0")
	if err != nil {
		log.Fatal(err)
	}
	go serv.Serve(lis)

	conn, err := grpc.Dial(lis.Addr().String(), grpc.WithInsecure())
	if err != nil {
		log.Fatal(err)
	}
	clientOpt = option.WithGRPCConn(conn)

	os.Exit(m.Run())
}

func TestStreetViewPublishServiceStartUpload(t *testing.T) {
	var uploadUrl string = "uploadUrl-242738639"
	var expectedResponse = &publishpb.UploadRef{
		UploadUrl: uploadUrl,
	}

	mockStreetViewPublish.err = nil
	mockStreetViewPublish.reqs = nil

	mockStreetViewPublish.resps = append(mockStreetViewPublish.resps[:0], expectedResponse)

	var request *emptypb.Empty = &emptypb.Empty{}

	c, err := NewStreetViewPublishClient(context.Background(), clientOpt)
	if err != nil {
		t.Fatal(err)
	}

	resp, err := c.StartUpload(context.Background(), request)

	if err != nil {
		t.Fatal(err)
	}

	if want, got := request, mockStreetViewPublish.reqs[0]; !proto.Equal(want, got) {
		t.Errorf("wrong request %q, want %q", got, want)
	}

	if want, got := expectedResponse, resp; !proto.Equal(want, got) {
		t.Errorf("wrong response %q, want %q)", got, want)
	}
}

func TestStreetViewPublishServiceStartUploadError(t *testing.T) {
	errCode := codes.PermissionDenied
	mockStreetViewPublish.err = grpc.Errorf(errCode, "test error")

	var request *emptypb.Empty = &emptypb.Empty{}

	c, err := NewStreetViewPublishClient(context.Background(), clientOpt)
	if err != nil {
		t.Fatal(err)
	}

	resp, err := c.StartUpload(context.Background(), request)

	if c := grpc.Code(err); c != errCode {
		t.Errorf("got error code %q, want %q", c, errCode)
	}
	_ = resp
}
func TestStreetViewPublishServiceCreatePhoto(t *testing.T) {
	var downloadUrl string = "downloadUrl1109408056"
	var thumbnailUrl string = "thumbnailUrl1825632156"
	var shareLink string = "shareLink-1788203942"
	var viewCount int64 = -1534353675
	var expectedResponse = &publishpb.Photo{
		DownloadUrl:  downloadUrl,
		ThumbnailUrl: thumbnailUrl,
		ShareLink:    shareLink,
		ViewCount:    viewCount,
	}

	mockStreetViewPublish.err = nil
	mockStreetViewPublish.reqs = nil

	mockStreetViewPublish.resps = append(mockStreetViewPublish.resps[:0], expectedResponse)

	var photo *publishpb.Photo = &publishpb.Photo{}
	var request = &publishpb.CreatePhotoRequest{
		Photo: photo,
	}

	c, err := NewStreetViewPublishClient(context.Background(), clientOpt)
	if err != nil {
		t.Fatal(err)
	}

	resp, err := c.CreatePhoto(context.Background(), request)

	if err != nil {
		t.Fatal(err)
	}

	if want, got := request, mockStreetViewPublish.reqs[0]; !proto.Equal(want, got) {
		t.Errorf("wrong request %q, want %q", got, want)
	}

	if want, got := expectedResponse, resp; !proto.Equal(want, got) {
		t.Errorf("wrong response %q, want %q)", got, want)
	}
}

func TestStreetViewPublishServiceCreatePhotoError(t *testing.T) {
	errCode := codes.PermissionDenied
	mockStreetViewPublish.err = grpc.Errorf(errCode, "test error")

	var photo *publishpb.Photo = &publishpb.Photo{}
	var request = &publishpb.CreatePhotoRequest{
		Photo: photo,
	}

	c, err := NewStreetViewPublishClient(context.Background(), clientOpt)
	if err != nil {
		t.Fatal(err)
	}

	resp, err := c.CreatePhoto(context.Background(), request)

	if c := grpc.Code(err); c != errCode {
		t.Errorf("got error code %q, want %q", c, errCode)
	}
	_ = resp
}
func TestStreetViewPublishServiceGetPhoto(t *testing.T) {
	var downloadUrl string = "downloadUrl1109408056"
	var thumbnailUrl string = "thumbnailUrl1825632156"
	var shareLink string = "shareLink-1788203942"
	var viewCount int64 = -1534353675
	var expectedResponse = &publishpb.Photo{
		DownloadUrl:  downloadUrl,
		ThumbnailUrl: thumbnailUrl,
		ShareLink:    shareLink,
		ViewCount:    viewCount,
	}

	mockStreetViewPublish.err = nil
	mockStreetViewPublish.reqs = nil

	mockStreetViewPublish.resps = append(mockStreetViewPublish.resps[:0], expectedResponse)

	var photoId string = "photoId-1274270136"
	var view publishpb.PhotoView = publishpb.PhotoView_BASIC
	var request = &publishpb.GetPhotoRequest{
		PhotoId: photoId,
		View:    view,
	}

	c, err := NewStreetViewPublishClient(context.Background(), clientOpt)
	if err != nil {
		t.Fatal(err)
	}

	resp, err := c.GetPhoto(context.Background(), request)

	if err != nil {
		t.Fatal(err)
	}

	if want, got := request, mockStreetViewPublish.reqs[0]; !proto.Equal(want, got) {
		t.Errorf("wrong request %q, want %q", got, want)
	}

	if want, got := expectedResponse, resp; !proto.Equal(want, got) {
		t.Errorf("wrong response %q, want %q)", got, want)
	}
}

func TestStreetViewPublishServiceGetPhotoError(t *testing.T) {
	errCode := codes.PermissionDenied
	mockStreetViewPublish.err = grpc.Errorf(errCode, "test error")

	var photoId string = "photoId-1274270136"
	var view publishpb.PhotoView = publishpb.PhotoView_BASIC
	var request = &publishpb.GetPhotoRequest{
		PhotoId: photoId,
		View:    view,
	}

	c, err := NewStreetViewPublishClient(context.Background(), clientOpt)
	if err != nil {
		t.Fatal(err)
	}

	resp, err := c.GetPhoto(context.Background(), request)

	if c := grpc.Code(err); c != errCode {
		t.Errorf("got error code %q, want %q", c, errCode)
	}
	_ = resp
}
func TestStreetViewPublishServiceBatchGetPhotos(t *testing.T) {
	var expectedResponse *publishpb.BatchGetPhotosResponse = &publishpb.BatchGetPhotosResponse{}

	mockStreetViewPublish.err = nil
	mockStreetViewPublish.reqs = nil

	mockStreetViewPublish.resps = append(mockStreetViewPublish.resps[:0], expectedResponse)

	var photoIds []string = nil
	var view publishpb.PhotoView = publishpb.PhotoView_BASIC
	var request = &publishpb.BatchGetPhotosRequest{
		PhotoIds: photoIds,
		View:     view,
	}

	c, err := NewStreetViewPublishClient(context.Background(), clientOpt)
	if err != nil {
		t.Fatal(err)
	}

	resp, err := c.BatchGetPhotos(context.Background(), request)

	if err != nil {
		t.Fatal(err)
	}

	if want, got := request, mockStreetViewPublish.reqs[0]; !proto.Equal(want, got) {
		t.Errorf("wrong request %q, want %q", got, want)
	}

	if want, got := expectedResponse, resp; !proto.Equal(want, got) {
		t.Errorf("wrong response %q, want %q)", got, want)
	}
}

func TestStreetViewPublishServiceBatchGetPhotosError(t *testing.T) {
	errCode := codes.PermissionDenied
	mockStreetViewPublish.err = grpc.Errorf(errCode, "test error")

	var photoIds []string = nil
	var view publishpb.PhotoView = publishpb.PhotoView_BASIC
	var request = &publishpb.BatchGetPhotosRequest{
		PhotoIds: photoIds,
		View:     view,
	}

	c, err := NewStreetViewPublishClient(context.Background(), clientOpt)
	if err != nil {
		t.Fatal(err)
	}

	resp, err := c.BatchGetPhotos(context.Background(), request)

	if c := grpc.Code(err); c != errCode {
		t.Errorf("got error code %q, want %q", c, errCode)
	}
	_ = resp
}
func TestStreetViewPublishServiceListPhotos(t *testing.T) {
	var nextPageToken string = ""
	var photosElement *publishpb.Photo = &publishpb.Photo{}
	var photos = []*publishpb.Photo{photosElement}
	var expectedResponse = &publishpb.ListPhotosResponse{
		NextPageToken: nextPageToken,
		Photos:        photos,
	}

	mockStreetViewPublish.err = nil
	mockStreetViewPublish.reqs = nil

	mockStreetViewPublish.resps = append(mockStreetViewPublish.resps[:0], expectedResponse)

	var view publishpb.PhotoView = publishpb.PhotoView_BASIC
	var filter string = "filter-1274492040"
	var request = &publishpb.ListPhotosRequest{
		View:   view,
		Filter: filter,
	}

	c, err := NewStreetViewPublishClient(context.Background(), clientOpt)
	if err != nil {
		t.Fatal(err)
	}

	resp, err := c.ListPhotos(context.Background(), request).Next()

	if err != nil {
		t.Fatal(err)
	}

	if want, got := request, mockStreetViewPublish.reqs[0]; !proto.Equal(want, got) {
		t.Errorf("wrong request %q, want %q", got, want)
	}

	want := (interface{})(expectedResponse.Photos[0])
	got := (interface{})(resp)
	var ok bool

	switch want := (want).(type) {
	case proto.Message:
		ok = proto.Equal(want, got.(proto.Message))
	default:
		ok = want == got
	}
	if !ok {
		t.Errorf("wrong response %q, want %q)", got, want)
	}
}

func TestStreetViewPublishServiceListPhotosError(t *testing.T) {
	errCode := codes.PermissionDenied
	mockStreetViewPublish.err = grpc.Errorf(errCode, "test error")

	var view publishpb.PhotoView = publishpb.PhotoView_BASIC
	var filter string = "filter-1274492040"
	var request = &publishpb.ListPhotosRequest{
		View:   view,
		Filter: filter,
	}

	c, err := NewStreetViewPublishClient(context.Background(), clientOpt)
	if err != nil {
		t.Fatal(err)
	}

	resp, err := c.ListPhotos(context.Background(), request).Next()

	if c := grpc.Code(err); c != errCode {
		t.Errorf("got error code %q, want %q", c, errCode)
	}
	_ = resp
}
func TestStreetViewPublishServiceUpdatePhoto(t *testing.T) {
	var downloadUrl string = "downloadUrl1109408056"
	var thumbnailUrl string = "thumbnailUrl1825632156"
	var shareLink string = "shareLink-1788203942"
	var viewCount int64 = -1534353675
	var expectedResponse = &publishpb.Photo{
		DownloadUrl:  downloadUrl,
		ThumbnailUrl: thumbnailUrl,
		ShareLink:    shareLink,
		ViewCount:    viewCount,
	}

	mockStreetViewPublish.err = nil
	mockStreetViewPublish.reqs = nil

	mockStreetViewPublish.resps = append(mockStreetViewPublish.resps[:0], expectedResponse)

	var photo *publishpb.Photo = &publishpb.Photo{}
	var updateMask *field_maskpb.FieldMask = &field_maskpb.FieldMask{}
	var request = &publishpb.UpdatePhotoRequest{
		Photo:      photo,
		UpdateMask: updateMask,
	}

	c, err := NewStreetViewPublishClient(context.Background(), clientOpt)
	if err != nil {
		t.Fatal(err)
	}

	resp, err := c.UpdatePhoto(context.Background(), request)

	if err != nil {
		t.Fatal(err)
	}

	if want, got := request, mockStreetViewPublish.reqs[0]; !proto.Equal(want, got) {
		t.Errorf("wrong request %q, want %q", got, want)
	}

	if want, got := expectedResponse, resp; !proto.Equal(want, got) {
		t.Errorf("wrong response %q, want %q)", got, want)
	}
}

func TestStreetViewPublishServiceUpdatePhotoError(t *testing.T) {
	errCode := codes.PermissionDenied
	mockStreetViewPublish.err = grpc.Errorf(errCode, "test error")

	var photo *publishpb.Photo = &publishpb.Photo{}
	var updateMask *field_maskpb.FieldMask = &field_maskpb.FieldMask{}
	var request = &publishpb.UpdatePhotoRequest{
		Photo:      photo,
		UpdateMask: updateMask,
	}

	c, err := NewStreetViewPublishClient(context.Background(), clientOpt)
	if err != nil {
		t.Fatal(err)
	}

	resp, err := c.UpdatePhoto(context.Background(), request)

	if c := grpc.Code(err); c != errCode {
		t.Errorf("got error code %q, want %q", c, errCode)
	}
	_ = resp
}
func TestStreetViewPublishServiceBatchUpdatePhotos(t *testing.T) {
	var expectedResponse *publishpb.BatchUpdatePhotosResponse = &publishpb.BatchUpdatePhotosResponse{}

	mockStreetViewPublish.err = nil
	mockStreetViewPublish.reqs = nil

	mockStreetViewPublish.resps = append(mockStreetViewPublish.resps[:0], expectedResponse)

	var updatePhotoRequests []*publishpb.UpdatePhotoRequest = nil
	var request = &publishpb.BatchUpdatePhotosRequest{
		UpdatePhotoRequests: updatePhotoRequests,
	}

	c, err := NewStreetViewPublishClient(context.Background(), clientOpt)
	if err != nil {
		t.Fatal(err)
	}

	resp, err := c.BatchUpdatePhotos(context.Background(), request)

	if err != nil {
		t.Fatal(err)
	}

	if want, got := request, mockStreetViewPublish.reqs[0]; !proto.Equal(want, got) {
		t.Errorf("wrong request %q, want %q", got, want)
	}

	if want, got := expectedResponse, resp; !proto.Equal(want, got) {
		t.Errorf("wrong response %q, want %q)", got, want)
	}
}

func TestStreetViewPublishServiceBatchUpdatePhotosError(t *testing.T) {
	errCode := codes.PermissionDenied
	mockStreetViewPublish.err = grpc.Errorf(errCode, "test error")

	var updatePhotoRequests []*publishpb.UpdatePhotoRequest = nil
	var request = &publishpb.BatchUpdatePhotosRequest{
		UpdatePhotoRequests: updatePhotoRequests,
	}

	c, err := NewStreetViewPublishClient(context.Background(), clientOpt)
	if err != nil {
		t.Fatal(err)
	}

	resp, err := c.BatchUpdatePhotos(context.Background(), request)

	if c := grpc.Code(err); c != errCode {
		t.Errorf("got error code %q, want %q", c, errCode)
	}
	_ = resp
}
func TestStreetViewPublishServiceDeletePhoto(t *testing.T) {
	var expectedResponse *emptypb.Empty = &emptypb.Empty{}

	mockStreetViewPublish.err = nil
	mockStreetViewPublish.reqs = nil

	mockStreetViewPublish.resps = append(mockStreetViewPublish.resps[:0], expectedResponse)

	var photoId string = "photoId-1274270136"
	var request = &publishpb.DeletePhotoRequest{
		PhotoId: photoId,
	}

	c, err := NewStreetViewPublishClient(context.Background(), clientOpt)
	if err != nil {
		t.Fatal(err)
	}

	err = c.DeletePhoto(context.Background(), request)

	if err != nil {
		t.Fatal(err)
	}

	if want, got := request, mockStreetViewPublish.reqs[0]; !proto.Equal(want, got) {
		t.Errorf("wrong request %q, want %q", got, want)
	}

}

func TestStreetViewPublishServiceDeletePhotoError(t *testing.T) {
	errCode := codes.PermissionDenied
	mockStreetViewPublish.err = grpc.Errorf(errCode, "test error")

	var photoId string = "photoId-1274270136"
	var request = &publishpb.DeletePhotoRequest{
		PhotoId: photoId,
	}

	c, err := NewStreetViewPublishClient(context.Background(), clientOpt)
	if err != nil {
		t.Fatal(err)
	}

	err = c.DeletePhoto(context.Background(), request)

	if c := grpc.Code(err); c != errCode {
		t.Errorf("got error code %q, want %q", c, errCode)
	}
}
func TestStreetViewPublishServiceBatchDeletePhotos(t *testing.T) {
	var expectedResponse *publishpb.BatchDeletePhotosResponse = &publishpb.BatchDeletePhotosResponse{}

	mockStreetViewPublish.err = nil
	mockStreetViewPublish.reqs = nil

	mockStreetViewPublish.resps = append(mockStreetViewPublish.resps[:0], expectedResponse)

	var photoIds []string = nil
	var request = &publishpb.BatchDeletePhotosRequest{
		PhotoIds: photoIds,
	}

	c, err := NewStreetViewPublishClient(context.Background(), clientOpt)
	if err != nil {
		t.Fatal(err)
	}

	resp, err := c.BatchDeletePhotos(context.Background(), request)

	if err != nil {
		t.Fatal(err)
	}

	if want, got := request, mockStreetViewPublish.reqs[0]; !proto.Equal(want, got) {
		t.Errorf("wrong request %q, want %q", got, want)
	}

	if want, got := expectedResponse, resp; !proto.Equal(want, got) {
		t.Errorf("wrong response %q, want %q)", got, want)
	}
}

func TestStreetViewPublishServiceBatchDeletePhotosError(t *testing.T) {
	errCode := codes.PermissionDenied
	mockStreetViewPublish.err = grpc.Errorf(errCode, "test error")

	var photoIds []string = nil
	var request = &publishpb.BatchDeletePhotosRequest{
		PhotoIds: photoIds,
	}

	c, err := NewStreetViewPublishClient(context.Background(), clientOpt)
	if err != nil {
		t.Fatal(err)
	}

	resp, err := c.BatchDeletePhotos(context.Background(), request)

	if c := grpc.Code(err); c != errCode {
		t.Errorf("got error code %q, want %q", c, errCode)
	}
	_ = resp
}
