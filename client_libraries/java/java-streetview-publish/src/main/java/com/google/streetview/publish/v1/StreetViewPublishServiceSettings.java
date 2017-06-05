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

import static com.google.streetview.publish.v1.PagedResponseWrappers.ListPhotosPagedResponse;

import com.google.api.core.ApiFuture;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.CredentialsProvider;
import com.google.api.gax.core.GoogleCredentialsProvider;
import com.google.api.gax.core.PropertiesProvider;
import com.google.api.gax.grpc.CallContext;
import com.google.api.gax.grpc.ChannelProvider;
import com.google.api.gax.grpc.ClientSettings;
import com.google.api.gax.grpc.ExecutorProvider;
import com.google.api.gax.grpc.InstantiatingChannelProvider;
import com.google.api.gax.grpc.InstantiatingExecutorProvider;
import com.google.api.gax.grpc.PageContext;
import com.google.api.gax.grpc.PagedCallSettings;
import com.google.api.gax.grpc.PagedListDescriptor;
import com.google.api.gax.grpc.PagedListResponseFactory;
import com.google.api.gax.grpc.SimpleCallSettings;
import com.google.api.gax.grpc.UnaryCallSettings;
import com.google.api.gax.grpc.UnaryCallable;
import com.google.api.gax.retrying.RetrySettings;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
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
import io.grpc.Status;
import java.io.IOException;
import java.util.List;
import javax.annotation.Generated;
import org.threeten.bp.Duration;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Settings class to configure an instance of {@link StreetViewPublishServiceClient}.
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
 * StreetViewPublishServiceSettings.Builder streetViewPublishServiceSettingsBuilder =
 *     StreetViewPublishServiceSettings.defaultBuilder();
 * streetViewPublishServiceSettingsBuilder.createPhotoSettings().getRetrySettingsBuilder()
 *     .setTotalTimeout(Duration.ofSeconds(30));
 * StreetViewPublishServiceSettings streetViewPublishServiceSettings = streetViewPublishServiceSettingsBuilder.build();
 * </code>
 * </pre>
 */
@Generated("by GAPIC v0.0.5")
@BetaApi
public class StreetViewPublishServiceSettings extends ClientSettings {
  /** The default scopes of the service. */
  private static final ImmutableList<String> DEFAULT_SERVICE_SCOPES =
      ImmutableList.<String>builder()
          .add("https://www.googleapis.com/auth/streetviewpublish")
          .build();

  private static final String DEFAULT_GAPIC_NAME = "gapic";
  private static final String DEFAULT_GAPIC_VERSION = "";

  private static final String PROPERTIES_FILE =
      "/com/google/streetview/publish/v1/project.properties";
  private static final String META_VERSION_KEY = "artifact.version";

  private static String gapicVersion;

  private static final io.grpc.MethodDescriptor<Empty, UploadRef> METHOD_START_UPLOAD =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          "google.streetview.publish.v1.StreetViewPublishService/StartUpload",
          io.grpc.protobuf.ProtoUtils.marshaller(Empty.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(UploadRef.getDefaultInstance()));
  private static final io.grpc.MethodDescriptor<CreatePhotoRequest, Photo> METHOD_CREATE_PHOTO =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          "google.streetview.publish.v1.StreetViewPublishService/CreatePhoto",
          io.grpc.protobuf.ProtoUtils.marshaller(CreatePhotoRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(Photo.getDefaultInstance()));
  private static final io.grpc.MethodDescriptor<GetPhotoRequest, Photo> METHOD_GET_PHOTO =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          "google.streetview.publish.v1.StreetViewPublishService/GetPhoto",
          io.grpc.protobuf.ProtoUtils.marshaller(GetPhotoRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(Photo.getDefaultInstance()));
  private static final io.grpc.MethodDescriptor<BatchGetPhotosRequest, BatchGetPhotosResponse>
      METHOD_BATCH_GET_PHOTOS =
          io.grpc.MethodDescriptor.create(
              io.grpc.MethodDescriptor.MethodType.UNARY,
              "google.streetview.publish.v1.StreetViewPublishService/BatchGetPhotos",
              io.grpc.protobuf.ProtoUtils.marshaller(BatchGetPhotosRequest.getDefaultInstance()),
              io.grpc.protobuf.ProtoUtils.marshaller(BatchGetPhotosResponse.getDefaultInstance()));
  private static final io.grpc.MethodDescriptor<ListPhotosRequest, ListPhotosResponse>
      METHOD_LIST_PHOTOS =
          io.grpc.MethodDescriptor.create(
              io.grpc.MethodDescriptor.MethodType.UNARY,
              "google.streetview.publish.v1.StreetViewPublishService/ListPhotos",
              io.grpc.protobuf.ProtoUtils.marshaller(ListPhotosRequest.getDefaultInstance()),
              io.grpc.protobuf.ProtoUtils.marshaller(ListPhotosResponse.getDefaultInstance()));
  private static final io.grpc.MethodDescriptor<UpdatePhotoRequest, Photo> METHOD_UPDATE_PHOTO =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          "google.streetview.publish.v1.StreetViewPublishService/UpdatePhoto",
          io.grpc.protobuf.ProtoUtils.marshaller(UpdatePhotoRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(Photo.getDefaultInstance()));
  private static final io.grpc.MethodDescriptor<BatchUpdatePhotosRequest, BatchUpdatePhotosResponse>
      METHOD_BATCH_UPDATE_PHOTOS =
          io.grpc.MethodDescriptor.create(
              io.grpc.MethodDescriptor.MethodType.UNARY,
              "google.streetview.publish.v1.StreetViewPublishService/BatchUpdatePhotos",
              io.grpc.protobuf.ProtoUtils.marshaller(BatchUpdatePhotosRequest.getDefaultInstance()),
              io.grpc.protobuf.ProtoUtils.marshaller(
                  BatchUpdatePhotosResponse.getDefaultInstance()));
  private static final io.grpc.MethodDescriptor<DeletePhotoRequest, Empty> METHOD_DELETE_PHOTO =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          "google.streetview.publish.v1.StreetViewPublishService/DeletePhoto",
          io.grpc.protobuf.ProtoUtils.marshaller(DeletePhotoRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(Empty.getDefaultInstance()));
  private static final io.grpc.MethodDescriptor<BatchDeletePhotosRequest, BatchDeletePhotosResponse>
      METHOD_BATCH_DELETE_PHOTOS =
          io.grpc.MethodDescriptor.create(
              io.grpc.MethodDescriptor.MethodType.UNARY,
              "google.streetview.publish.v1.StreetViewPublishService/BatchDeletePhotos",
              io.grpc.protobuf.ProtoUtils.marshaller(BatchDeletePhotosRequest.getDefaultInstance()),
              io.grpc.protobuf.ProtoUtils.marshaller(
                  BatchDeletePhotosResponse.getDefaultInstance()));

  private final SimpleCallSettings<Empty, UploadRef> startUploadSettings;
  private final SimpleCallSettings<CreatePhotoRequest, Photo> createPhotoSettings;
  private final SimpleCallSettings<GetPhotoRequest, Photo> getPhotoSettings;
  private final SimpleCallSettings<BatchGetPhotosRequest, BatchGetPhotosResponse>
      batchGetPhotosSettings;
  private final PagedCallSettings<ListPhotosRequest, ListPhotosResponse, ListPhotosPagedResponse>
      listPhotosSettings;
  private final SimpleCallSettings<UpdatePhotoRequest, Photo> updatePhotoSettings;
  private final SimpleCallSettings<BatchUpdatePhotosRequest, BatchUpdatePhotosResponse>
      batchUpdatePhotosSettings;
  private final SimpleCallSettings<DeletePhotoRequest, Empty> deletePhotoSettings;
  private final SimpleCallSettings<BatchDeletePhotosRequest, BatchDeletePhotosResponse>
      batchDeletePhotosSettings;

  /** Returns the object with the settings used for calls to startUpload. */
  public SimpleCallSettings<Empty, UploadRef> startUploadSettings() {
    return startUploadSettings;
  }

  /** Returns the object with the settings used for calls to createPhoto. */
  public SimpleCallSettings<CreatePhotoRequest, Photo> createPhotoSettings() {
    return createPhotoSettings;
  }

  /** Returns the object with the settings used for calls to getPhoto. */
  public SimpleCallSettings<GetPhotoRequest, Photo> getPhotoSettings() {
    return getPhotoSettings;
  }

  /** Returns the object with the settings used for calls to batchGetPhotos. */
  public SimpleCallSettings<BatchGetPhotosRequest, BatchGetPhotosResponse>
      batchGetPhotosSettings() {
    return batchGetPhotosSettings;
  }

  /** Returns the object with the settings used for calls to listPhotos. */
  public PagedCallSettings<ListPhotosRequest, ListPhotosResponse, ListPhotosPagedResponse>
      listPhotosSettings() {
    return listPhotosSettings;
  }

  /** Returns the object with the settings used for calls to updatePhoto. */
  public SimpleCallSettings<UpdatePhotoRequest, Photo> updatePhotoSettings() {
    return updatePhotoSettings;
  }

  /** Returns the object with the settings used for calls to batchUpdatePhotos. */
  public SimpleCallSettings<BatchUpdatePhotosRequest, BatchUpdatePhotosResponse>
      batchUpdatePhotosSettings() {
    return batchUpdatePhotosSettings;
  }

  /** Returns the object with the settings used for calls to deletePhoto. */
  public SimpleCallSettings<DeletePhotoRequest, Empty> deletePhotoSettings() {
    return deletePhotoSettings;
  }

  /** Returns the object with the settings used for calls to batchDeletePhotos. */
  public SimpleCallSettings<BatchDeletePhotosRequest, BatchDeletePhotosResponse>
      batchDeletePhotosSettings() {
    return batchDeletePhotosSettings;
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
  public static InstantiatingChannelProvider.Builder defaultChannelProviderBuilder() {
    return InstantiatingChannelProvider.newBuilder()
        .setEndpoint(getDefaultEndpoint())
        .setGeneratorHeader(DEFAULT_GAPIC_NAME, getGapicVersion());
  }

  private static String getGapicVersion() {
    if (gapicVersion == null) {
      gapicVersion =
          PropertiesProvider.loadProperty(
              StreetViewPublishServiceSettings.class, PROPERTIES_FILE, META_VERSION_KEY);
      gapicVersion = gapicVersion == null ? DEFAULT_GAPIC_VERSION : gapicVersion;
    }
    return gapicVersion;
  }

  /** Returns a builder for this class with recommended defaults. */
  public static Builder defaultBuilder() {
    return Builder.createDefault();
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder() {
    return new Builder();
  }

  /** Returns a builder containing all the values of this settings class. */
  public Builder toBuilder() {
    return new Builder(this);
  }

  private StreetViewPublishServiceSettings(Builder settingsBuilder) throws IOException {
    super(
        settingsBuilder.getExecutorProvider(),
        settingsBuilder.getChannelProvider(),
        settingsBuilder.getCredentialsProvider());

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
              return payload.getPhotosList();
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
                CallContext context,
                ApiFuture<ListPhotosResponse> futureResponse) {
              PageContext<ListPhotosRequest, ListPhotosResponse, Photo> pageContext =
                  PageContext.create(callable, LIST_PHOTOS_PAGE_STR_DESC, request, context);
              return ListPhotosPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  /** Builder for StreetViewPublishServiceSettings. */
  public static class Builder extends ClientSettings.Builder {
    private final ImmutableList<UnaryCallSettings.Builder> unaryMethodSettingsBuilders;

    private final SimpleCallSettings.Builder<Empty, UploadRef> startUploadSettings;
    private final SimpleCallSettings.Builder<CreatePhotoRequest, Photo> createPhotoSettings;
    private final SimpleCallSettings.Builder<GetPhotoRequest, Photo> getPhotoSettings;
    private final SimpleCallSettings.Builder<BatchGetPhotosRequest, BatchGetPhotosResponse>
        batchGetPhotosSettings;
    private final PagedCallSettings.Builder<
            ListPhotosRequest, ListPhotosResponse, ListPhotosPagedResponse>
        listPhotosSettings;
    private final SimpleCallSettings.Builder<UpdatePhotoRequest, Photo> updatePhotoSettings;
    private final SimpleCallSettings.Builder<BatchUpdatePhotosRequest, BatchUpdatePhotosResponse>
        batchUpdatePhotosSettings;
    private final SimpleCallSettings.Builder<DeletePhotoRequest, Empty> deletePhotoSettings;
    private final SimpleCallSettings.Builder<BatchDeletePhotosRequest, BatchDeletePhotosResponse>
        batchDeletePhotosSettings;

    private static final ImmutableMap<String, ImmutableSet<Status.Code>> RETRYABLE_CODE_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, ImmutableSet<Status.Code>> definitions = ImmutableMap.builder();
      definitions.put(
          "idempotent",
          Sets.immutableEnumSet(
              Lists.<Status.Code>newArrayList(
                  Status.Code.DEADLINE_EXCEEDED, Status.Code.UNAVAILABLE)));
      definitions.put("non_idempotent", Sets.immutableEnumSet(Lists.<Status.Code>newArrayList()));
      RETRYABLE_CODE_DEFINITIONS = definitions.build();
    }

    private static final ImmutableMap<String, RetrySettings.Builder> RETRY_PARAM_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, RetrySettings.Builder> definitions = ImmutableMap.builder();
      RetrySettings.Builder settingsBuilder = null;
      settingsBuilder =
          RetrySettings.newBuilder()
              .setInitialRetryDelay(Duration.ofMillis(100L))
              .setRetryDelayMultiplier(1.3)
              .setMaxRetryDelay(Duration.ofMillis(60000L))
              .setInitialRpcTimeout(Duration.ofMillis(20000L))
              .setRpcTimeoutMultiplier(1.0)
              .setMaxRpcTimeout(Duration.ofMillis(20000L))
              .setTotalTimeout(Duration.ofMillis(600000L));
      definitions.put("default", settingsBuilder);
      RETRY_PARAM_DEFINITIONS = definitions.build();
    }

    private Builder() {
      super(defaultChannelProviderBuilder().build());
      setCredentialsProvider(defaultCredentialsProviderBuilder().build());

      startUploadSettings = SimpleCallSettings.newBuilder(METHOD_START_UPLOAD);

      createPhotoSettings = SimpleCallSettings.newBuilder(METHOD_CREATE_PHOTO);

      getPhotoSettings = SimpleCallSettings.newBuilder(METHOD_GET_PHOTO);

      batchGetPhotosSettings = SimpleCallSettings.newBuilder(METHOD_BATCH_GET_PHOTOS);

      listPhotosSettings =
          PagedCallSettings.newBuilder(METHOD_LIST_PHOTOS, LIST_PHOTOS_PAGE_STR_FACT);

      updatePhotoSettings = SimpleCallSettings.newBuilder(METHOD_UPDATE_PHOTO);

      batchUpdatePhotosSettings = SimpleCallSettings.newBuilder(METHOD_BATCH_UPDATE_PHOTOS);

      deletePhotoSettings = SimpleCallSettings.newBuilder(METHOD_DELETE_PHOTO);

      batchDeletePhotosSettings = SimpleCallSettings.newBuilder(METHOD_BATCH_DELETE_PHOTOS);

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder>of(
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

    private static Builder createDefault() {
      Builder builder = new Builder();

      builder
          .startUploadSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettingsBuilder(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .createPhotoSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettingsBuilder(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .getPhotoSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettingsBuilder(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .batchGetPhotosSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettingsBuilder(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .listPhotosSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettingsBuilder(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .updatePhotoSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettingsBuilder(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .batchUpdatePhotosSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettingsBuilder(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .deletePhotoSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettingsBuilder(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .batchDeletePhotosSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettingsBuilder(RETRY_PARAM_DEFINITIONS.get("default"));

      return builder;
    }

    private Builder(StreetViewPublishServiceSettings settings) {
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
          ImmutableList.<UnaryCallSettings.Builder>of(
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

    @Override
    public Builder setExecutorProvider(ExecutorProvider executorProvider) {
      super.setExecutorProvider(executorProvider);
      return this;
    }

    @Override
    public Builder setChannelProvider(ChannelProvider channelProvider) {
      super.setChannelProvider(channelProvider);
      return this;
    }

    @Override
    public Builder setCredentialsProvider(CredentialsProvider credentialsProvider) {
      super.setCredentialsProvider(credentialsProvider);
      return this;
    }

    /**
     * Applies the given settings to all of the unary API methods in this service. Only values that
     * are non-null will be applied, so this method is not capable of un-setting any values.
     *
     * <p>Note: This method does not support applying settings to streaming methods.
     */
    public Builder applyToAllUnaryMethods(UnaryCallSettings.Builder unaryCallSettings)
        throws Exception {
      super.applyToAllUnaryMethods(unaryMethodSettingsBuilders, unaryCallSettings);
      return this;
    }

    /** Returns the builder for the settings used for calls to startUpload. */
    public SimpleCallSettings.Builder<Empty, UploadRef> startUploadSettings() {
      return startUploadSettings;
    }

    /** Returns the builder for the settings used for calls to createPhoto. */
    public SimpleCallSettings.Builder<CreatePhotoRequest, Photo> createPhotoSettings() {
      return createPhotoSettings;
    }

    /** Returns the builder for the settings used for calls to getPhoto. */
    public SimpleCallSettings.Builder<GetPhotoRequest, Photo> getPhotoSettings() {
      return getPhotoSettings;
    }

    /** Returns the builder for the settings used for calls to batchGetPhotos. */
    public SimpleCallSettings.Builder<BatchGetPhotosRequest, BatchGetPhotosResponse>
        batchGetPhotosSettings() {
      return batchGetPhotosSettings;
    }

    /** Returns the builder for the settings used for calls to listPhotos. */
    public PagedCallSettings.Builder<ListPhotosRequest, ListPhotosResponse, ListPhotosPagedResponse>
        listPhotosSettings() {
      return listPhotosSettings;
    }

    /** Returns the builder for the settings used for calls to updatePhoto. */
    public SimpleCallSettings.Builder<UpdatePhotoRequest, Photo> updatePhotoSettings() {
      return updatePhotoSettings;
    }

    /** Returns the builder for the settings used for calls to batchUpdatePhotos. */
    public SimpleCallSettings.Builder<BatchUpdatePhotosRequest, BatchUpdatePhotosResponse>
        batchUpdatePhotosSettings() {
      return batchUpdatePhotosSettings;
    }

    /** Returns the builder for the settings used for calls to deletePhoto. */
    public SimpleCallSettings.Builder<DeletePhotoRequest, Empty> deletePhotoSettings() {
      return deletePhotoSettings;
    }

    /** Returns the builder for the settings used for calls to batchDeletePhotos. */
    public SimpleCallSettings.Builder<BatchDeletePhotosRequest, BatchDeletePhotosResponse>
        batchDeletePhotosSettings() {
      return batchDeletePhotosSettings;
    }

    @Override
    public StreetViewPublishServiceSettings build() throws IOException {
      return new StreetViewPublishServiceSettings(this);
    }
  }
}
