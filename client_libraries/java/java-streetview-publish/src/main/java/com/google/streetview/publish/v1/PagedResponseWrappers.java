/*
 * Copyright 2017, Google Inc. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.streetview.publish.v1;

import com.google.api.core.ApiFunction;
import com.google.api.core.ApiFuture;
import com.google.api.core.ApiFutures;
import com.google.api.core.BetaApi;
import com.google.api.gax.grpc.AbstractFixedSizeCollection;
import com.google.api.gax.grpc.AbstractPage;
import com.google.api.gax.grpc.AbstractPagedListResponse;
import com.google.api.gax.grpc.PageContext;
import com.google.geo.ugc.streetview.publish.v1.StreetViewPublishResources.Photo;
import com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.ListPhotosRequest;
import com.google.geo.ugc.streetview.publish.v1.StreetViewPublishRpcMessages.ListPhotosResponse;
import java.util.List;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Wrapper class to contain paged response types for page streaming methods. Each static class
 * inside this wrapper class is used as the return type of one of an API method that implements the
 * page streaming pattern.
 */
@Generated("by GAPIC")
@BetaApi
public class PagedResponseWrappers {

  public static class ListPhotosPagedResponse
      extends AbstractPagedListResponse<
          ListPhotosRequest, ListPhotosResponse, Photo, ListPhotosPage,
          ListPhotosFixedSizeCollection> {

    public static ApiFuture<ListPhotosPagedResponse> createAsync(
        PageContext<ListPhotosRequest, ListPhotosResponse, Photo> context,
        ApiFuture<ListPhotosResponse> futureResponse) {
      ApiFuture<ListPhotosPage> futurePage =
          ListPhotosPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          new ApiFunction<ListPhotosPage, ListPhotosPagedResponse>() {
            @Override
            public ListPhotosPagedResponse apply(ListPhotosPage input) {
              return new ListPhotosPagedResponse(input);
            }
          });
    }

    private ListPhotosPagedResponse(ListPhotosPage page) {
      super(page, ListPhotosFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListPhotosPage
      extends AbstractPage<ListPhotosRequest, ListPhotosResponse, Photo, ListPhotosPage> {

    private ListPhotosPage(
        PageContext<ListPhotosRequest, ListPhotosResponse, Photo> context,
        ListPhotosResponse response) {
      super(context, response);
    }

    private static ListPhotosPage createEmptyPage() {
      return new ListPhotosPage(null, null);
    }

    @Override
    protected ListPhotosPage createPage(
        PageContext<ListPhotosRequest, ListPhotosResponse, Photo> context,
        ListPhotosResponse response) {
      return new ListPhotosPage(context, response);
    }

    @Override
    protected ApiFuture<ListPhotosPage> createPageAsync(
        PageContext<ListPhotosRequest, ListPhotosResponse, Photo> context,
        ApiFuture<ListPhotosResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListPhotosFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListPhotosRequest, ListPhotosResponse, Photo, ListPhotosPage,
          ListPhotosFixedSizeCollection> {

    private ListPhotosFixedSizeCollection(List<ListPhotosPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListPhotosFixedSizeCollection createEmptyCollection() {
      return new ListPhotosFixedSizeCollection(null, 0);
    }

    @Override
    protected ListPhotosFixedSizeCollection createCollection(
        List<ListPhotosPage> pages, int collectionSize) {
      return new ListPhotosFixedSizeCollection(pages, collectionSize);
    }
  }
}
