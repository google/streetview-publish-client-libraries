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

import com.google.api.core.ApiFunction;
import com.google.api.core.ApiFuture;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.GaxProperties;
import com.google.api.gax.core.GoogleCredentialsProvider;
import com.google.api.gax.core.InstantiatingExecutorProvider;
import com.google.api.gax.grpc.GaxGrpcProperties;
import com.google.api.gax.grpc.GrpcTransportChannel;
import com.google.api.gax.grpc.InstantiatingGrpcChannelProvider;
import com.google.api.gax.retrying.RetrySettings;
import com.google.api.gax.rpc.ApiCallContext;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.PageContext;
import com.google.api.gax.rpc.PagedCallSettings;
import com.google.api.gax.rpc.PagedListDescriptor;
import com.google.api.gax.rpc.PagedListResponseFactory;
import com.google.api.gax.rpc.StatusCode;
import com.google.api.gax.rpc.StubSettings;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.api.gax.rpc.UnaryCallSettings;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
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
import java.io.IOException;
import java.util.List;
import javax.annotation.Generated;
import org.threeten.bp.Duration;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Settings class to configure an instance of {@link StreetViewPublishServiceStub}.
 *
 * <p>The default instance has everything set to sensible defaults:
 *
 * <ul>
 *   <li>The default service address (streetviewpublish.googleapis.com) and default port (443) are
 *       used.
 *   <li>Credentials are acquired automatically through Application Default Credentials.
 *   <li>Retries are configured for idempotent methods but not for non-idempotent methods.
 * </ul>
 *
 * <p>The builder of this class is recursive, so contained classes are themselves builders. When
 * build() is called, the tree of builders is called to create the complete settings object. For
 * example, to set the total timeout of createPhoto to 30 seconds:
 *
 * <pre>
 * <code>
 * StreetViewPublishServiceStubSettings.Builder streetViewPublishServiceSettingsBuilder =
 *     StreetViewPublishServiceStubSettings.newBuilder();
 * streetViewPublishServiceSettingsBuilder.createPhotoSettings().getRetrySettings().toBuilder()
 *     .setTotalTimeout(Duration.ofSeconds(30));
 * StreetViewPublishServiceStubSettings streetViewPublishServiceSettings = streetViewPublishServiceSettingsBuilder.build();
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class StreetViewPublishServiceStubSettings
    extends StubSettings<StreetViewPublishServiceStubSettings> {
  /** The default scopes of the service. */
  private static final ImmutableList<String> DEFAULT_SERVICE_SCOPES =
      ImmutableList.<String>builder()
          .add("https://www.googleapis.com/auth/streetviewpublish")
          .build();

  private final UnaryCallSettings<Empty, UploadRef> startUploadSettings;
  private final UnaryCallSettings<CreatePhotoRequest, Photo> createPhotoSettings;
  private final UnaryCallSettings<GetPhotoRequest, Photo> getPhotoSettings;
  private final UnaryCallSettings<BatchGetPhotosRequest, BatchGetPhotosResponse>
      batchGetPhotosSettings;
  private final PagedCallSettings<ListPhotosRequest, ListPhotosResponse, ListPhotosPagedResponse>
      listPhotosSettings;
  private final UnaryCallSettings<UpdatePhotoRequest, Photo> updatePhotoSettings;
  private final UnaryCallSettings<BatchUpdatePhotosRequest, BatchUpdatePhotosResponse>
      batchUpdatePhotosSettings;
  private final UnaryCallSettings<DeletePhotoRequest, Empty> deletePhotoSettings;
  private final UnaryCallSettings<BatchDeletePhotosRequest, BatchDeletePhotosResponse>
      batchDeletePhotosSettings;

  /** Returns the object with the settings used for calls to startUpload. */
  public UnaryCallSettings<Empty, UploadRef> startUploadSettings() {
    return startUploadSettings;
  }

  /** Returns the object with the settings used for calls to createPhoto. */
  public UnaryCallSettings<CreatePhotoRequest, Photo> createPhotoSettings() {
    return createPhotoSettings;
  }

  /** Returns the object with the settings used for calls to getPhoto. */
  public UnaryCallSettings<GetPhotoRequest, Photo> getPhotoSettings() {
    return getPhotoSettings;
  }

  /** Returns the object with the settings used for calls to batchGetPhotos. */
  public UnaryCallSettings<BatchGetPhotosRequest, BatchGetPhotosResponse> batchGetPhotosSettings() {
    return batchGetPhotosSettings;
  }

  /** Returns the object with the settings used for calls to listPhotos. */
  public PagedCallSettings<ListPhotosRequest, ListPhotosResponse, ListPhotosPagedResponse>
      listPhotosSettings() {
    return listPhotosSettings;
  }

  /** Returns the object with the settings used for calls to updatePhoto. */
  public UnaryCallSettings<UpdatePhotoRequest, Photo> updatePhotoSettings() {
    return updatePhotoSettings;
  }

  /** Returns the object with the settings used for calls to batchUpdatePhotos. */
  public UnaryCallSettings<BatchUpdatePhotosRequest, BatchUpdatePhotosResponse>
      batchUpdatePhotosSettings() {
    return batchUpdatePhotosSettings;
  }

  /** Returns the object with the settings used for calls to deletePhoto. */
  public UnaryCallSettings<DeletePhotoRequest, Empty> deletePhotoSettings() {
    return deletePhotoSettings;
  }

  /** Returns the object with the settings used for calls to batchDeletePhotos. */
  public UnaryCallSettings<BatchDeletePhotosRequest, BatchDeletePhotosResponse>
      batchDeletePhotosSettings() {
    return batchDeletePhotosSettings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public StreetViewPublishServiceStub createStub() throws IOException {
    if (getTransportChannelProvider()
        .getTransportName()
        .equals(GrpcTransportChannel.getGrpcTransportName())) {
      return GrpcStreetViewPublishServiceStub.create(this);
    } else {
      throw new UnsupportedOperationException(
          "Transport not supported: " + getTransportChannelProvider().getTransportName());
    }
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return InstantiatingExecutorProvider.newBuilder();
  }

  /** Returns the default service endpoint. */
  public static String getDefaultEndpoint() {
    return "streetviewpublish.googleapis.com:443";
  }

  /** Returns the default service scopes. */
  public static List<String> getDefaultServiceScopes() {
    return DEFAULT_SERVICE_SCOPES;
  }

  /** Returns a builder for the default credentials for this service. */
  public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
    return GoogleCredentialsProvider.newBuilder().setScopesToApply(DEFAULT_SERVICE_SCOPES);
  }

  /** Returns a builder for the default ChannelProvider for this service. */
  public static InstantiatingGrpcChannelProvider.Builder defaultGrpcTransportProviderBuilder() {
    return InstantiatingGrpcChannelProvider.newBuilder();
  }

  public static TransportChannelProvider defaultTransportChannelProvider() {
    return defaultGrpcTransportProviderBuilder().build();
  }

  @BetaApi("The surface for customizing headers is not stable yet and may change in the future.")
  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return ApiClientHeaderProvider.newBuilder()
        .setGeneratedLibToken(
            "gapic", GaxProperties.getLibraryVersion(StreetViewPublishServiceStubSettings.class))
        .setTransportToken(
            GaxGrpcProperties.getGrpcTokenName(), GaxGrpcProperties.getGrpcVersion());
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder() {
    return Builder.createDefault();
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder(ClientContext clientContext) {
    return new Builder(clientContext);
  }

  /** Returns a builder containing all the values of this settings class. */
  public Builder toBuilder() {
    return new Builder(this);
  }

  protected StreetViewPublishServiceStubSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);

    startUploadSettings = settingsBuilder.startUploadSettings().build();
    createPhotoSettings = settingsBuilder.createPhotoSettings().build();
    getPhotoSettings = settingsBuilder.getPhotoSettings().build();
    batchGetPhotosSettings = settingsBuilder.batchGetPhotosSettings().build();
    listPhotosSettings = settingsBuilder.listPhotosSettings().build();
    updatePhotoSettings = settingsBuilder.updatePhotoSettings().build();
    batchUpdatePhotosSettings = settingsBuilder.batchUpdatePhotosSettings().build();
    deletePhotoSettings = settingsBuilder.deletePhotoSettings().build();
    batchDeletePhotosSettings = settingsBuilder.batchDeletePhotosSettings().build();
  }

  private static final PagedListDescriptor<ListPhotosRequest, ListPhotosResponse, Photo>
      LIST_PHOTOS_PAGE_STR_DESC =
          new PagedListDescriptor<ListPhotosRequest, ListPhotosResponse, Photo>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListPhotosRequest injectToken(ListPhotosRequest payload, String token) {
              return ListPhotosRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public ListPhotosRequest injectPageSize(ListPhotosRequest payload, int pageSize) {
              return ListPhotosRequest.newBuilder(payload).setPageSize(pageSize).build();
            }

            @Override
            public Integer extractPageSize(ListPhotosRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListPhotosResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<Photo> extractResources(ListPhotosResponse payload) {
              return payload.getPhotosList() != null
                  ? payload.getPhotosList()
                  : ImmutableList.<Photo>of();
            }
          };

  private static final PagedListResponseFactory<
          ListPhotosRequest, ListPhotosResponse, ListPhotosPagedResponse>
      LIST_PHOTOS_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListPhotosRequest, ListPhotosResponse, ListPhotosPagedResponse>() {
            @Override
            public ApiFuture<ListPhotosPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListPhotosRequest, ListPhotosResponse> callable,
                ListPhotosRequest request,
                ApiCallContext context,
                ApiFuture<ListPhotosResponse> futureResponse) {
              PageContext<ListPhotosRequest, ListPhotosResponse, Photo> pageContext =
                  PageContext.create(callable, LIST_PHOTOS_PAGE_STR_DESC, request, context);
              return ListPhotosPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  /** Builder for StreetViewPublishServiceStubSettings. */
  public static class Builder
      extends StubSettings.Builder<StreetViewPublishServiceStubSettings, Builder> {
    private final ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders;

    private final UnaryCallSettings.Builder<Empty, UploadRef> startUploadSettings;
    private final UnaryCallSettings.Builder<CreatePhotoRequest, Photo> createPhotoSettings;
    private final UnaryCallSettings.Builder<GetPhotoRequest, Photo> getPhotoSettings;
    private final UnaryCallSettings.Builder<BatchGetPhotosRequest, BatchGetPhotosResponse>
        batchGetPhotosSettings;
    private final PagedCallSettings.Builder<
            ListPhotosRequest, ListPhotosResponse, ListPhotosPagedResponse>
        listPhotosSettings;
    private final UnaryCallSettings.Builder<UpdatePhotoRequest, Photo> updatePhotoSettings;
    private final UnaryCallSettings.Builder<BatchUpdatePhotosRequest, BatchUpdatePhotosResponse>
        batchUpdatePhotosSettings;
    private final UnaryCallSettings.Builder<DeletePhotoRequest, Empty> deletePhotoSettings;
    private final UnaryCallSettings.Builder<BatchDeletePhotosRequest, BatchDeletePhotosResponse>
        batchDeletePhotosSettings;

    private static final ImmutableMap<String, ImmutableSet<StatusCode.Code>>
        RETRYABLE_CODE_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, ImmutableSet<StatusCode.Code>> definitions =
          ImmutableMap.builder();
      definitions.put(
          "idempotent",
          ImmutableSet.copyOf(
              Lists.<StatusCode.Code>newArrayList(
                  StatusCode.Code.DEADLINE_EXCEEDED, StatusCode.Code.UNAVAILABLE)));
      definitions.put("non_idempotent", ImmutableSet.copyOf(Lists.<StatusCode.Code>newArrayList()));
      RETRYABLE_CODE_DEFINITIONS = definitions.build();
    }

    private static final ImmutableMap<String, RetrySettings> RETRY_PARAM_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, RetrySettings> definitions = ImmutableMap.builder();
      RetrySettings settings = null;
      settings =
          RetrySettings.newBuilder()
              .setInitialRetryDelay(Duration.ofMillis(100L))
              .setRetryDelayMultiplier(1.3)
              .setMaxRetryDelay(Duration.ofMillis(60000L))
              .setInitialRpcTimeout(Duration.ofMillis(20000L))
              .setRpcTimeoutMultiplier(1.0)
              .setMaxRpcTimeout(Duration.ofMillis(20000L))
              .setTotalTimeout(Duration.ofMillis(600000L))
              .build();
      definitions.put("default", settings);
      RETRY_PARAM_DEFINITIONS = definitions.build();
    }

    protected Builder() {
      this((ClientContext) null);
    }

    protected Builder(ClientContext clientContext) {
      super(clientContext);

      startUploadSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      createPhotoSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      getPhotoSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      batchGetPhotosSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      listPhotosSettings = PagedCallSettings.newBuilder(LIST_PHOTOS_PAGE_STR_FACT);

      updatePhotoSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      batchUpdatePhotosSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      deletePhotoSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      batchDeletePhotosSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              startUploadSettings,
              createPhotoSettings,
              getPhotoSettings,
              batchGetPhotosSettings,
              listPhotosSettings,
              updatePhotoSettings,
              batchUpdatePhotosSettings,
              deletePhotoSettings,
              batchDeletePhotosSettings);

      initDefaults(this);
    }

    private static Builder createDefault() {
      Builder builder = new Builder((ClientContext) null);
      builder.setTransportChannelProvider(defaultTransportChannelProvider());
      builder.setCredentialsProvider(defaultCredentialsProviderBuilder().build());
      builder.setInternalHeaderProvider(defaultApiClientHeaderProviderBuilder().build());
      builder.setEndpoint(getDefaultEndpoint());
      return initDefaults(builder);
    }

    private static Builder initDefaults(Builder builder) {

      builder
          .startUploadSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .createPhotoSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .getPhotoSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .batchGetPhotosSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .listPhotosSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .updatePhotoSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .batchUpdatePhotosSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .deletePhotoSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .batchDeletePhotosSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      return builder;
    }

    protected Builder(StreetViewPublishServiceStubSettings settings) {
      super(settings);

      startUploadSettings = settings.startUploadSettings.toBuilder();
      createPhotoSettings = settings.createPhotoSettings.toBuilder();
      getPhotoSettings = settings.getPhotoSettings.toBuilder();
      batchGetPhotosSettings = settings.batchGetPhotosSettings.toBuilder();
      listPhotosSettings = settings.listPhotosSettings.toBuilder();
      updatePhotoSettings = settings.updatePhotoSettings.toBuilder();
      batchUpdatePhotosSettings = settings.batchUpdatePhotosSettings.toBuilder();
      deletePhotoSettings = settings.deletePhotoSettings.toBuilder();
      batchDeletePhotosSettings = settings.batchDeletePhotosSettings.toBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              startUploadSettings,
              createPhotoSettings,
              getPhotoSettings,
              batchGetPhotosSettings,
              listPhotosSettings,
              updatePhotoSettings,
              batchUpdatePhotosSettings,
              deletePhotoSettings,
              batchDeletePhotosSettings);
    }

    // NEXT_MAJOR_VER: remove 'throws Exception'
    /**
     * Applies the given settings updater function to all of the unary API methods in this service.
     *
     * <p>Note: This method does not support applying settings to streaming methods.
     */
    public Builder applyToAllUnaryMethods(
        ApiFunction<UnaryCallSettings.Builder<?, ?>, Void> settingsUpdater) throws Exception {
      super.applyToAllUnaryMethods(unaryMethodSettingsBuilders, settingsUpdater);
      return this;
    }

    public ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders() {
      return unaryMethodSettingsBuilders;
    }

    /** Returns the builder for the settings used for calls to startUpload. */
    public UnaryCallSettings.Builder<Empty, UploadRef> startUploadSettings() {
      return startUploadSettings;
    }

    /** Returns the builder for the settings used for calls to createPhoto. */
    public UnaryCallSettings.Builder<CreatePhotoRequest, Photo> createPhotoSettings() {
      return createPhotoSettings;
    }

    /** Returns the builder for the settings used for calls to getPhoto. */
    public UnaryCallSettings.Builder<GetPhotoRequest, Photo> getPhotoSettings() {
      return getPhotoSettings;
    }

    /** Returns the builder for the settings used for calls to batchGetPhotos. */
    public UnaryCallSettings.Builder<BatchGetPhotosRequest, BatchGetPhotosResponse>
        batchGetPhotosSettings() {
      return batchGetPhotosSettings;
    }

    /** Returns the builder for the settings used for calls to listPhotos. */
    public PagedCallSettings.Builder<ListPhotosRequest, ListPhotosResponse, ListPhotosPagedResponse>
        listPhotosSettings() {
      return listPhotosSettings;
    }

    /** Returns the builder for the settings used for calls to updatePhoto. */
    public UnaryCallSettings.Builder<UpdatePhotoRequest, Photo> updatePhotoSettings() {
      return updatePhotoSettings;
    }

    /** Returns the builder for the settings used for calls to batchUpdatePhotos. */
    public UnaryCallSettings.Builder<BatchUpdatePhotosRequest, BatchUpdatePhotosResponse>
        batchUpdatePhotosSettings() {
      return batchUpdatePhotosSettings;
    }

    /** Returns the builder for the settings used for calls to deletePhoto. */
    public UnaryCallSettings.Builder<DeletePhotoRequest, Empty> deletePhotoSettings() {
      return deletePhotoSettings;
    }

    /** Returns the builder for the settings used for calls to batchDeletePhotos. */
    public UnaryCallSettings.Builder<BatchDeletePhotosRequest, BatchDeletePhotosResponse>
        batchDeletePhotosSettings() {
      return batchDeletePhotosSettings;
    }

    @Override
    public StreetViewPublishServiceStubSettings build() throws IOException {
      return new StreetViewPublishServiceStubSettings(this);
    }
  }
}
