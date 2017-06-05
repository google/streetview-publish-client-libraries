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

// Generated code. DO NOT EDIT!

using Google.Api.Gax;
using Google.Api.Gax.Grpc;
using Google.Protobuf;
using Google.Protobuf.WellKnownTypes;
using Google.Streetview.Publish.V1;
using Grpc.Core;
using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Threading;
using System.Threading.Tasks;

namespace Google.Streetview.Publish.V1.Snippets
{
    public class GeneratedStreetViewPublishServiceClientSnippets
    {
        public async Task StartUploadAsync_RequestObject()
        {
            // Snippet: StartUploadAsync(Empty,CallSettings)
            // Create client
            StreetViewPublishServiceClient streetViewPublishServiceClient = await StreetViewPublishServiceClient.CreateAsync();
            // Initialize request argument(s)
            Empty request = new Empty();
            // Make the request
            UploadRef response = await streetViewPublishServiceClient.StartUploadAsync(request);
            // End snippet
        }

        public void StartUpload_RequestObject()
        {
            // Snippet: StartUpload(Empty,CallSettings)
            // Create client
            StreetViewPublishServiceClient streetViewPublishServiceClient = StreetViewPublishServiceClient.Create();
            // Initialize request argument(s)
            Empty request = new Empty();
            // Make the request
            UploadRef response = streetViewPublishServiceClient.StartUpload(request);
            // End snippet
        }

        public async Task CreatePhotoAsync()
        {
            // Snippet: CreatePhotoAsync(Photo,CallSettings)
            // Additional: CreatePhotoAsync(Photo,CancellationToken)
            // Create client
            StreetViewPublishServiceClient streetViewPublishServiceClient = await StreetViewPublishServiceClient.CreateAsync();
            // Initialize request argument(s)
            Photo photo = new Photo();
            // Make the request
            Photo response = await streetViewPublishServiceClient.CreatePhotoAsync(photo);
            // End snippet
        }

        public void CreatePhoto()
        {
            // Snippet: CreatePhoto(Photo,CallSettings)
            // Create client
            StreetViewPublishServiceClient streetViewPublishServiceClient = StreetViewPublishServiceClient.Create();
            // Initialize request argument(s)
            Photo photo = new Photo();
            // Make the request
            Photo response = streetViewPublishServiceClient.CreatePhoto(photo);
            // End snippet
        }

        public async Task CreatePhotoAsync_RequestObject()
        {
            // Snippet: CreatePhotoAsync(CreatePhotoRequest,CallSettings)
            // Create client
            StreetViewPublishServiceClient streetViewPublishServiceClient = await StreetViewPublishServiceClient.CreateAsync();
            // Initialize request argument(s)
            CreatePhotoRequest request = new CreatePhotoRequest
            {
                Photo = new Photo(),
            };
            // Make the request
            Photo response = await streetViewPublishServiceClient.CreatePhotoAsync(request);
            // End snippet
        }

        public void CreatePhoto_RequestObject()
        {
            // Snippet: CreatePhoto(CreatePhotoRequest,CallSettings)
            // Create client
            StreetViewPublishServiceClient streetViewPublishServiceClient = StreetViewPublishServiceClient.Create();
            // Initialize request argument(s)
            CreatePhotoRequest request = new CreatePhotoRequest
            {
                Photo = new Photo(),
            };
            // Make the request
            Photo response = streetViewPublishServiceClient.CreatePhoto(request);
            // End snippet
        }

        public async Task GetPhotoAsync()
        {
            // Snippet: GetPhotoAsync(string,PhotoView,CallSettings)
            // Additional: GetPhotoAsync(string,PhotoView,CancellationToken)
            // Create client
            StreetViewPublishServiceClient streetViewPublishServiceClient = await StreetViewPublishServiceClient.CreateAsync();
            // Initialize request argument(s)
            string photoId = "";
            PhotoView view = PhotoView.Basic;
            // Make the request
            Photo response = await streetViewPublishServiceClient.GetPhotoAsync(photoId, view);
            // End snippet
        }

        public void GetPhoto()
        {
            // Snippet: GetPhoto(string,PhotoView,CallSettings)
            // Create client
            StreetViewPublishServiceClient streetViewPublishServiceClient = StreetViewPublishServiceClient.Create();
            // Initialize request argument(s)
            string photoId = "";
            PhotoView view = PhotoView.Basic;
            // Make the request
            Photo response = streetViewPublishServiceClient.GetPhoto(photoId, view);
            // End snippet
        }

        public async Task GetPhotoAsync_RequestObject()
        {
            // Snippet: GetPhotoAsync(GetPhotoRequest,CallSettings)
            // Create client
            StreetViewPublishServiceClient streetViewPublishServiceClient = await StreetViewPublishServiceClient.CreateAsync();
            // Initialize request argument(s)
            GetPhotoRequest request = new GetPhotoRequest
            {
                PhotoId = "",
                View = PhotoView.Basic,
            };
            // Make the request
            Photo response = await streetViewPublishServiceClient.GetPhotoAsync(request);
            // End snippet
        }

        public void GetPhoto_RequestObject()
        {
            // Snippet: GetPhoto(GetPhotoRequest,CallSettings)
            // Create client
            StreetViewPublishServiceClient streetViewPublishServiceClient = StreetViewPublishServiceClient.Create();
            // Initialize request argument(s)
            GetPhotoRequest request = new GetPhotoRequest
            {
                PhotoId = "",
                View = PhotoView.Basic,
            };
            // Make the request
            Photo response = streetViewPublishServiceClient.GetPhoto(request);
            // End snippet
        }

        public async Task BatchGetPhotosAsync()
        {
            // Snippet: BatchGetPhotosAsync(IEnumerable<string>,PhotoView,CallSettings)
            // Additional: BatchGetPhotosAsync(IEnumerable<string>,PhotoView,CancellationToken)
            // Create client
            StreetViewPublishServiceClient streetViewPublishServiceClient = await StreetViewPublishServiceClient.CreateAsync();
            // Initialize request argument(s)
            IEnumerable<string> photoIds = new List<string>();
            PhotoView view = PhotoView.Basic;
            // Make the request
            BatchGetPhotosResponse response = await streetViewPublishServiceClient.BatchGetPhotosAsync(photoIds, view);
            // End snippet
        }

        public void BatchGetPhotos()
        {
            // Snippet: BatchGetPhotos(IEnumerable<string>,PhotoView,CallSettings)
            // Create client
            StreetViewPublishServiceClient streetViewPublishServiceClient = StreetViewPublishServiceClient.Create();
            // Initialize request argument(s)
            IEnumerable<string> photoIds = new List<string>();
            PhotoView view = PhotoView.Basic;
            // Make the request
            BatchGetPhotosResponse response = streetViewPublishServiceClient.BatchGetPhotos(photoIds, view);
            // End snippet
        }

        public async Task BatchGetPhotosAsync_RequestObject()
        {
            // Snippet: BatchGetPhotosAsync(BatchGetPhotosRequest,CallSettings)
            // Create client
            StreetViewPublishServiceClient streetViewPublishServiceClient = await StreetViewPublishServiceClient.CreateAsync();
            // Initialize request argument(s)
            BatchGetPhotosRequest request = new BatchGetPhotosRequest
            {
                PhotoIds = { },
                View = PhotoView.Basic,
            };
            // Make the request
            BatchGetPhotosResponse response = await streetViewPublishServiceClient.BatchGetPhotosAsync(request);
            // End snippet
        }

        public void BatchGetPhotos_RequestObject()
        {
            // Snippet: BatchGetPhotos(BatchGetPhotosRequest,CallSettings)
            // Create client
            StreetViewPublishServiceClient streetViewPublishServiceClient = StreetViewPublishServiceClient.Create();
            // Initialize request argument(s)
            BatchGetPhotosRequest request = new BatchGetPhotosRequest
            {
                PhotoIds = { },
                View = PhotoView.Basic,
            };
            // Make the request
            BatchGetPhotosResponse response = streetViewPublishServiceClient.BatchGetPhotos(request);
            // End snippet
        }

        public async Task ListPhotosAsync()
        {
            // Snippet: ListPhotosAsync(PhotoView,string,string,int?,CallSettings)
            // Create client
            StreetViewPublishServiceClient streetViewPublishServiceClient = await StreetViewPublishServiceClient.CreateAsync();
            // Initialize request argument(s)
            PhotoView view = PhotoView.Basic;
            string filter = "";
            // Make the request
            PagedAsyncEnumerable<ListPhotosResponse, Photo> response =
                streetViewPublishServiceClient.ListPhotosAsync(view, filter);

            // Iterate over all response items, lazily performing RPCs as required
            await response.ForEachAsync((Photo item) =>
            {
                // Do something with each item
                Console.WriteLine(item);
            });

            // Or iterate over pages (of server-defined size), performing one RPC per page
            await response.AsRawResponses().ForEachAsync((ListPhotosResponse page) =>
            {
                // Do something with each page of items
                Console.WriteLine("A page of results:");
                foreach (Photo item in page)
                {
                    Console.WriteLine(item);
                }
            });

            // Or retrieve a single page of known size (unless it's the final page), performing as many RPCs as required
            int pageSize = 10;
            Page<Photo> singlePage = await response.ReadPageAsync(pageSize);
            // Do something with the page of items
            Console.WriteLine($"A page of {pageSize} results (unless it's the final page):");
            foreach (Photo item in singlePage)
            {
                Console.WriteLine(item);
            }
            // Store the pageToken, for when the next page is required.
            string nextPageToken = singlePage.NextPageToken;
            // End snippet
        }

        public void ListPhotos()
        {
            // Snippet: ListPhotos(PhotoView,string,string,int?,CallSettings)
            // Create client
            StreetViewPublishServiceClient streetViewPublishServiceClient = StreetViewPublishServiceClient.Create();
            // Initialize request argument(s)
            PhotoView view = PhotoView.Basic;
            string filter = "";
            // Make the request
            PagedEnumerable<ListPhotosResponse, Photo> response =
                streetViewPublishServiceClient.ListPhotos(view, filter);

            // Iterate over all response items, lazily performing RPCs as required
            foreach (Photo item in response)
            {
                // Do something with each item
                Console.WriteLine(item);
            }

            // Or iterate over pages (of server-defined size), performing one RPC per page
            foreach (ListPhotosResponse page in response.AsRawResponses())
            {
                // Do something with each page of items
                Console.WriteLine("A page of results:");
                foreach (Photo item in page)
                {
                    Console.WriteLine(item);
                }
            }

            // Or retrieve a single page of known size (unless it's the final page), performing as many RPCs as required
            int pageSize = 10;
            Page<Photo> singlePage = response.ReadPage(pageSize);
            // Do something with the page of items
            Console.WriteLine($"A page of {pageSize} results (unless it's the final page):");
            foreach (Photo item in singlePage)
            {
                Console.WriteLine(item);
            }
            // Store the pageToken, for when the next page is required.
            string nextPageToken = singlePage.NextPageToken;
            // End snippet
        }

        public async Task ListPhotosAsync_RequestObject()
        {
            // Snippet: ListPhotosAsync(ListPhotosRequest,CallSettings)
            // Create client
            StreetViewPublishServiceClient streetViewPublishServiceClient = await StreetViewPublishServiceClient.CreateAsync();
            // Initialize request argument(s)
            ListPhotosRequest request = new ListPhotosRequest
            {
                View = PhotoView.Basic,
                Filter = "",
            };
            // Make the request
            PagedAsyncEnumerable<ListPhotosResponse, Photo> response =
                streetViewPublishServiceClient.ListPhotosAsync(request);

            // Iterate over all response items, lazily performing RPCs as required
            await response.ForEachAsync((Photo item) =>
            {
                // Do something with each item
                Console.WriteLine(item);
            });

            // Or iterate over pages (of server-defined size), performing one RPC per page
            await response.AsRawResponses().ForEachAsync((ListPhotosResponse page) =>
            {
                // Do something with each page of items
                Console.WriteLine("A page of results:");
                foreach (Photo item in page)
                {
                    Console.WriteLine(item);
                }
            });

            // Or retrieve a single page of known size (unless it's the final page), performing as many RPCs as required
            int pageSize = 10;
            Page<Photo> singlePage = await response.ReadPageAsync(pageSize);
            // Do something with the page of items
            Console.WriteLine($"A page of {pageSize} results (unless it's the final page):");
            foreach (Photo item in singlePage)
            {
                Console.WriteLine(item);
            }
            // Store the pageToken, for when the next page is required.
            string nextPageToken = singlePage.NextPageToken;
            // End snippet
        }

        public void ListPhotos_RequestObject()
        {
            // Snippet: ListPhotos(ListPhotosRequest,CallSettings)
            // Create client
            StreetViewPublishServiceClient streetViewPublishServiceClient = StreetViewPublishServiceClient.Create();
            // Initialize request argument(s)
            ListPhotosRequest request = new ListPhotosRequest
            {
                View = PhotoView.Basic,
                Filter = "",
            };
            // Make the request
            PagedEnumerable<ListPhotosResponse, Photo> response =
                streetViewPublishServiceClient.ListPhotos(request);

            // Iterate over all response items, lazily performing RPCs as required
            foreach (Photo item in response)
            {
                // Do something with each item
                Console.WriteLine(item);
            }

            // Or iterate over pages (of server-defined size), performing one RPC per page
            foreach (ListPhotosResponse page in response.AsRawResponses())
            {
                // Do something with each page of items
                Console.WriteLine("A page of results:");
                foreach (Photo item in page)
                {
                    Console.WriteLine(item);
                }
            }

            // Or retrieve a single page of known size (unless it's the final page), performing as many RPCs as required
            int pageSize = 10;
            Page<Photo> singlePage = response.ReadPage(pageSize);
            // Do something with the page of items
            Console.WriteLine($"A page of {pageSize} results (unless it's the final page):");
            foreach (Photo item in singlePage)
            {
                Console.WriteLine(item);
            }
            // Store the pageToken, for when the next page is required.
            string nextPageToken = singlePage.NextPageToken;
            // End snippet
        }

        public async Task UpdatePhotoAsync()
        {
            // Snippet: UpdatePhotoAsync(Photo,FieldMask,CallSettings)
            // Additional: UpdatePhotoAsync(Photo,FieldMask,CancellationToken)
            // Create client
            StreetViewPublishServiceClient streetViewPublishServiceClient = await StreetViewPublishServiceClient.CreateAsync();
            // Initialize request argument(s)
            Photo photo = new Photo();
            FieldMask updateMask = new FieldMask();
            // Make the request
            Photo response = await streetViewPublishServiceClient.UpdatePhotoAsync(photo, updateMask);
            // End snippet
        }

        public void UpdatePhoto()
        {
            // Snippet: UpdatePhoto(Photo,FieldMask,CallSettings)
            // Create client
            StreetViewPublishServiceClient streetViewPublishServiceClient = StreetViewPublishServiceClient.Create();
            // Initialize request argument(s)
            Photo photo = new Photo();
            FieldMask updateMask = new FieldMask();
            // Make the request
            Photo response = streetViewPublishServiceClient.UpdatePhoto(photo, updateMask);
            // End snippet
        }

        public async Task UpdatePhotoAsync_RequestObject()
        {
            // Snippet: UpdatePhotoAsync(UpdatePhotoRequest,CallSettings)
            // Create client
            StreetViewPublishServiceClient streetViewPublishServiceClient = await StreetViewPublishServiceClient.CreateAsync();
            // Initialize request argument(s)
            UpdatePhotoRequest request = new UpdatePhotoRequest
            {
                Photo = new Photo(),
                UpdateMask = new FieldMask(),
            };
            // Make the request
            Photo response = await streetViewPublishServiceClient.UpdatePhotoAsync(request);
            // End snippet
        }

        public void UpdatePhoto_RequestObject()
        {
            // Snippet: UpdatePhoto(UpdatePhotoRequest,CallSettings)
            // Create client
            StreetViewPublishServiceClient streetViewPublishServiceClient = StreetViewPublishServiceClient.Create();
            // Initialize request argument(s)
            UpdatePhotoRequest request = new UpdatePhotoRequest
            {
                Photo = new Photo(),
                UpdateMask = new FieldMask(),
            };
            // Make the request
            Photo response = streetViewPublishServiceClient.UpdatePhoto(request);
            // End snippet
        }

        public async Task BatchUpdatePhotosAsync()
        {
            // Snippet: BatchUpdatePhotosAsync(IEnumerable<UpdatePhotoRequest>,CallSettings)
            // Additional: BatchUpdatePhotosAsync(IEnumerable<UpdatePhotoRequest>,CancellationToken)
            // Create client
            StreetViewPublishServiceClient streetViewPublishServiceClient = await StreetViewPublishServiceClient.CreateAsync();
            // Initialize request argument(s)
            IEnumerable<UpdatePhotoRequest> updatePhotoRequests = new List<UpdatePhotoRequest>();
            // Make the request
            BatchUpdatePhotosResponse response = await streetViewPublishServiceClient.BatchUpdatePhotosAsync(updatePhotoRequests);
            // End snippet
        }

        public void BatchUpdatePhotos()
        {
            // Snippet: BatchUpdatePhotos(IEnumerable<UpdatePhotoRequest>,CallSettings)
            // Create client
            StreetViewPublishServiceClient streetViewPublishServiceClient = StreetViewPublishServiceClient.Create();
            // Initialize request argument(s)
            IEnumerable<UpdatePhotoRequest> updatePhotoRequests = new List<UpdatePhotoRequest>();
            // Make the request
            BatchUpdatePhotosResponse response = streetViewPublishServiceClient.BatchUpdatePhotos(updatePhotoRequests);
            // End snippet
        }

        public async Task BatchUpdatePhotosAsync_RequestObject()
        {
            // Snippet: BatchUpdatePhotosAsync(BatchUpdatePhotosRequest,CallSettings)
            // Create client
            StreetViewPublishServiceClient streetViewPublishServiceClient = await StreetViewPublishServiceClient.CreateAsync();
            // Initialize request argument(s)
            BatchUpdatePhotosRequest request = new BatchUpdatePhotosRequest
            {
                UpdatePhotoRequests = { },
            };
            // Make the request
            BatchUpdatePhotosResponse response = await streetViewPublishServiceClient.BatchUpdatePhotosAsync(request);
            // End snippet
        }

        public void BatchUpdatePhotos_RequestObject()
        {
            // Snippet: BatchUpdatePhotos(BatchUpdatePhotosRequest,CallSettings)
            // Create client
            StreetViewPublishServiceClient streetViewPublishServiceClient = StreetViewPublishServiceClient.Create();
            // Initialize request argument(s)
            BatchUpdatePhotosRequest request = new BatchUpdatePhotosRequest
            {
                UpdatePhotoRequests = { },
            };
            // Make the request
            BatchUpdatePhotosResponse response = streetViewPublishServiceClient.BatchUpdatePhotos(request);
            // End snippet
        }

        public async Task DeletePhotoAsync()
        {
            // Snippet: DeletePhotoAsync(string,CallSettings)
            // Additional: DeletePhotoAsync(string,CancellationToken)
            // Create client
            StreetViewPublishServiceClient streetViewPublishServiceClient = await StreetViewPublishServiceClient.CreateAsync();
            // Initialize request argument(s)
            string photoId = "";
            // Make the request
            await streetViewPublishServiceClient.DeletePhotoAsync(photoId);
            // End snippet
        }

        public void DeletePhoto()
        {
            // Snippet: DeletePhoto(string,CallSettings)
            // Create client
            StreetViewPublishServiceClient streetViewPublishServiceClient = StreetViewPublishServiceClient.Create();
            // Initialize request argument(s)
            string photoId = "";
            // Make the request
            streetViewPublishServiceClient.DeletePhoto(photoId);
            // End snippet
        }

        public async Task DeletePhotoAsync_RequestObject()
        {
            // Snippet: DeletePhotoAsync(DeletePhotoRequest,CallSettings)
            // Create client
            StreetViewPublishServiceClient streetViewPublishServiceClient = await StreetViewPublishServiceClient.CreateAsync();
            // Initialize request argument(s)
            DeletePhotoRequest request = new DeletePhotoRequest
            {
                PhotoId = "",
            };
            // Make the request
            await streetViewPublishServiceClient.DeletePhotoAsync(request);
            // End snippet
        }

        public void DeletePhoto_RequestObject()
        {
            // Snippet: DeletePhoto(DeletePhotoRequest,CallSettings)
            // Create client
            StreetViewPublishServiceClient streetViewPublishServiceClient = StreetViewPublishServiceClient.Create();
            // Initialize request argument(s)
            DeletePhotoRequest request = new DeletePhotoRequest
            {
                PhotoId = "",
            };
            // Make the request
            streetViewPublishServiceClient.DeletePhoto(request);
            // End snippet
        }

        public async Task BatchDeletePhotosAsync()
        {
            // Snippet: BatchDeletePhotosAsync(IEnumerable<string>,CallSettings)
            // Additional: BatchDeletePhotosAsync(IEnumerable<string>,CancellationToken)
            // Create client
            StreetViewPublishServiceClient streetViewPublishServiceClient = await StreetViewPublishServiceClient.CreateAsync();
            // Initialize request argument(s)
            IEnumerable<string> photoIds = new List<string>();
            // Make the request
            BatchDeletePhotosResponse response = await streetViewPublishServiceClient.BatchDeletePhotosAsync(photoIds);
            // End snippet
        }

        public void BatchDeletePhotos()
        {
            // Snippet: BatchDeletePhotos(IEnumerable<string>,CallSettings)
            // Create client
            StreetViewPublishServiceClient streetViewPublishServiceClient = StreetViewPublishServiceClient.Create();
            // Initialize request argument(s)
            IEnumerable<string> photoIds = new List<string>();
            // Make the request
            BatchDeletePhotosResponse response = streetViewPublishServiceClient.BatchDeletePhotos(photoIds);
            // End snippet
        }

        public async Task BatchDeletePhotosAsync_RequestObject()
        {
            // Snippet: BatchDeletePhotosAsync(BatchDeletePhotosRequest,CallSettings)
            // Create client
            StreetViewPublishServiceClient streetViewPublishServiceClient = await StreetViewPublishServiceClient.CreateAsync();
            // Initialize request argument(s)
            BatchDeletePhotosRequest request = new BatchDeletePhotosRequest
            {
                PhotoIds = { },
            };
            // Make the request
            BatchDeletePhotosResponse response = await streetViewPublishServiceClient.BatchDeletePhotosAsync(request);
            // End snippet
        }

        public void BatchDeletePhotos_RequestObject()
        {
            // Snippet: BatchDeletePhotos(BatchDeletePhotosRequest,CallSettings)
            // Create client
            StreetViewPublishServiceClient streetViewPublishServiceClient = StreetViewPublishServiceClient.Create();
            // Initialize request argument(s)
            BatchDeletePhotosRequest request = new BatchDeletePhotosRequest
            {
                PhotoIds = { },
            };
            // Make the request
            BatchDeletePhotosResponse response = streetViewPublishServiceClient.BatchDeletePhotos(request);
            // End snippet
        }

    }
}
