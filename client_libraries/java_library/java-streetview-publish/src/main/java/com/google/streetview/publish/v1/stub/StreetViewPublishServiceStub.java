/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.streetview.publish.v1.stub;

import static com.google.streetview.publish.v1.StreetViewPublishServiceClient.ListPhotosPagedResponse;

import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.geo.ugc.streetview.publish.v1.StreetViewPublishResources.Photo;
import com.google.geo.ugc.streetview.publish.v1.StreetViewPublishResources.UploadRef;
import com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.BatchDeletePhotosRequest;
import com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.BatchDeletePhotosResponse;
import com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.BatchGetPhotosRequest;
import com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.BatchGetPhotosResponse;
import com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.BatchUpdatePhotosRequest;
import com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.BatchUpdatePhotosResponse;
import com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.CreatePhotoRequest;
import com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.DeletePhotoRequest;
import com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.GetPhotoRequest;
import com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.ListPhotosRequest;
import com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.ListPhotosResponse;
import com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.UpdatePhotoRequest;
import com.google.protobuf.Empty;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Base stub class for Street View Publish API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator")
@BetaApi("A restructuring of stub classes is planned, so this may break in the future")
public abstract class StreetViewPublishServiceStub implements BackgroundResource {

  public UnaryCallable<Empty, UploadRef> startUploadCallable() {
    throw new UnsupportedOperationException("Not implemented: startUploadCallable()");
  }

  public UnaryCallable<CreatePhotoRequest, Photo> createPhotoCallable() {
    throw new UnsupportedOperationException("Not implemented: createPhotoCallable()");
  }

  public UnaryCallable<GetPhotoRequest, Photo> getPhotoCallable() {
    throw new UnsupportedOperationException("Not implemented: getPhotoCallable()");
  }

  public UnaryCallable<BatchGetPhotosRequest, BatchGetPhotosResponse> batchGetPhotosCallable() {
    throw new UnsupportedOperationException("Not implemented: batchGetPhotosCallable()");
  }

  public UnaryCallable<ListPhotosRequest, ListPhotosPagedResponse> listPhotosPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listPhotosPagedCallable()");
  }

  public UnaryCallable<ListPhotosRequest, ListPhotosResponse> listPhotosCallable() {
    throw new UnsupportedOperationException("Not implemented: listPhotosCallable()");
  }

  public UnaryCallable<UpdatePhotoRequest, Photo> updatePhotoCallable() {
    throw new UnsupportedOperationException("Not implemented: updatePhotoCallable()");
  }

  public UnaryCallable<BatchUpdatePhotosRequest, BatchUpdatePhotosResponse>
      batchUpdatePhotosCallable() {
    throw new UnsupportedOperationException("Not implemented: batchUpdatePhotosCallable()");
  }

  public UnaryCallable<DeletePhotoRequest, Empty> deletePhotoCallable() {
    throw new UnsupportedOperationException("Not implemented: deletePhotoCallable()");
  }

  public UnaryCallable<BatchDeletePhotosRequest, BatchDeletePhotosResponse>
      batchDeletePhotosCallable() {
    throw new UnsupportedOperationException("Not implemented: batchDeletePhotosCallable()");
  }

  @Override
  public abstract void close();
}
