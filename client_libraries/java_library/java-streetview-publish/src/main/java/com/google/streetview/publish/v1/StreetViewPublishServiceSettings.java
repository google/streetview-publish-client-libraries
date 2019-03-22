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
package com.google.streetview.publish.v1;

import static com.google.streetview.publish.v1.StreetViewPublishServiceClient.ListPhotosPagedResponse;

import com.google.api.core.ApiFunction;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.GoogleCredentialsProvider;
import com.google.api.gax.core.InstantiatingExecutorProvider;
import com.google.api.gax.grpc.InstantiatingGrpcChannelProvider;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.ClientSettings;
import com.google.api.gax.rpc.PagedCallSettings;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.api.gax.rpc.UnaryCallSettings;
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
import com.google.streetview.publish.v1.stub.StreetViewPublishServiceStubSettings;
import java.io.IOException;
import java.util.List;
import javax.annotation.Generated;

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
 *     StreetViewPublishServiceSettings.newBuilder();
 * streetViewPublishServiceSettingsBuilder.createPhotoSettings().getRetrySettings().toBuilder()
 *     .setTotalTimeout(Duration.ofSeconds(30));
 * StreetViewPublishServiceSettings streetViewPublishServiceSettings = streetViewPublishServiceSettingsBuilder.build();
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class StreetViewPublishServiceSettings
    extends ClientSettings<StreetViewPublishServiceSettings> {
  /** Returns the object with the settings used for calls to startUpload. */
  public UnaryCallSettings<Empty, UploadRef> startUploadSettings() {
    return ((StreetViewPublishServiceStubSettings) getStubSettings()).startUploadSettings();
  }

  /** Returns the object with the settings used for calls to createPhoto. */
  public UnaryCallSettings<CreatePhotoRequest, Photo> createPhotoSettings() {
    return ((StreetViewPublishServiceStubSettings) getStubSettings()).createPhotoSettings();
  }

  /** Returns the object with the settings used for calls to getPhoto. */
  public UnaryCallSettings<GetPhotoRequest, Photo> getPhotoSettings() {
    return ((StreetViewPublishServiceStubSettings) getStubSettings()).getPhotoSettings();
  }

  /** Returns the object with the settings used for calls to batchGetPhotos. */
  public UnaryCallSettings<BatchGetPhotosRequest, BatchGetPhotosResponse> batchGetPhotosSettings() {
    return ((StreetViewPublishServiceStubSettings) getStubSettings()).batchGetPhotosSettings();
  }

  /** Returns the object with the settings used for calls to listPhotos. */
  public PagedCallSettings<ListPhotosRequest, ListPhotosResponse, ListPhotosPagedResponse>
      listPhotosSettings() {
    return ((StreetViewPublishServiceStubSettings) getStubSettings()).listPhotosSettings();
  }

  /** Returns the object with the settings used for calls to updatePhoto. */
  public UnaryCallSettings<UpdatePhotoRequest, Photo> updatePhotoSettings() {
    return ((StreetViewPublishServiceStubSettings) getStubSettings()).updatePhotoSettings();
  }

  /** Returns the object with the settings used for calls to batchUpdatePhotos. */
  public UnaryCallSettings<BatchUpdatePhotosRequest, BatchUpdatePhotosResponse>
      batchUpdatePhotosSettings() {
    return ((StreetViewPublishServiceStubSettings) getStubSettings()).batchUpdatePhotosSettings();
  }

  /** Returns the object with the settings used for calls to deletePhoto. */
  public UnaryCallSettings<DeletePhotoRequest, Empty> deletePhotoSettings() {
    return ((StreetViewPublishServiceStubSettings) getStubSettings()).deletePhotoSettings();
  }

  /** Returns the object with the settings used for calls to batchDeletePhotos. */
  public UnaryCallSettings<BatchDeletePhotosRequest, BatchDeletePhotosResponse>
      batchDeletePhotosSettings() {
    return ((StreetViewPublishServiceStubSettings) getStubSettings()).batchDeletePhotosSettings();
  }

  public static final StreetViewPublishServiceSettings create(
      StreetViewPublishServiceStubSettings stub) throws IOException {
    return new StreetViewPublishServiceSettings.Builder(stub.toBuilder()).build();
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return StreetViewPublishServiceStubSettings.defaultExecutorProviderBuilder();
  }

  /** Returns the default service endpoint. */
  public static String getDefaultEndpoint() {
    return StreetViewPublishServiceStubSettings.getDefaultEndpoint();
  }

  /** Returns the default service scopes. */
  public static List<String> getDefaultServiceScopes() {
    return StreetViewPublishServiceStubSettings.getDefaultServiceScopes();
  }

  /** Returns a builder for the default credentials for this service. */
  public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
    return StreetViewPublishServiceStubSettings.defaultCredentialsProviderBuilder();
  }

  /** Returns a builder for the default ChannelProvider for this service. */
  public static InstantiatingGrpcChannelProvider.Builder defaultGrpcTransportProviderBuilder() {
    return StreetViewPublishServiceStubSettings.defaultGrpcTransportProviderBuilder();
  }

  public static TransportChannelProvider defaultTransportChannelProvider() {
    return StreetViewPublishServiceStubSettings.defaultTransportChannelProvider();
  }

  @BetaApi("The surface for customizing headers is not stable yet and may change in the future.")
  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return StreetViewPublishServiceStubSettings.defaultApiClientHeaderProviderBuilder();
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

  protected StreetViewPublishServiceSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);
  }

  /** Builder for StreetViewPublishServiceSettings. */
  public static class Builder
      extends ClientSettings.Builder<StreetViewPublishServiceSettings, Builder> {
    protected Builder() throws IOException {
      this((ClientContext) null);
    }

    protected Builder(ClientContext clientContext) {
      super(StreetViewPublishServiceStubSettings.newBuilder(clientContext));
    }

    private static Builder createDefault() {
      return new Builder(StreetViewPublishServiceStubSettings.newBuilder());
    }

    protected Builder(StreetViewPublishServiceSettings settings) {
      super(settings.getStubSettings().toBuilder());
    }

    protected Builder(StreetViewPublishServiceStubSettings.Builder stubSettings) {
      super(stubSettings);
    }

    public StreetViewPublishServiceStubSettings.Builder getStubSettingsBuilder() {
      return ((StreetViewPublishServiceStubSettings.Builder) getStubSettings());
    }

    // NEXT_MAJOR_VER: remove 'throws Exception'
    /**
     * Applies the given settings updater function to all of the unary API methods in this service.
     *
     * <p>Note: This method does not support applying settings to streaming methods.
     */
    public Builder applyToAllUnaryMethods(
        ApiFunction<UnaryCallSettings.Builder<?, ?>, Void> settingsUpdater) throws Exception {
      super.applyToAllUnaryMethods(
          getStubSettingsBuilder().unaryMethodSettingsBuilders(), settingsUpdater);
      return this;
    }

    /** Returns the builder for the settings used for calls to startUpload. */
    public UnaryCallSettings.Builder<Empty, UploadRef> startUploadSettings() {
      return getStubSettingsBuilder().startUploadSettings();
    }

    /** Returns the builder for the settings used for calls to createPhoto. */
    public UnaryCallSettings.Builder<CreatePhotoRequest, Photo> createPhotoSettings() {
      return getStubSettingsBuilder().createPhotoSettings();
    }

    /** Returns the builder for the settings used for calls to getPhoto. */
    public UnaryCallSettings.Builder<GetPhotoRequest, Photo> getPhotoSettings() {
      return getStubSettingsBuilder().getPhotoSettings();
    }

    /** Returns the builder for the settings used for calls to batchGetPhotos. */
    public UnaryCallSettings.Builder<BatchGetPhotosRequest, BatchGetPhotosResponse>
        batchGetPhotosSettings() {
      return getStubSettingsBuilder().batchGetPhotosSettings();
    }

    /** Returns the builder for the settings used for calls to listPhotos. */
    public PagedCallSettings.Builder<ListPhotosRequest, ListPhotosResponse, ListPhotosPagedResponse>
        listPhotosSettings() {
      return getStubSettingsBuilder().listPhotosSettings();
    }

    /** Returns the builder for the settings used for calls to updatePhoto. */
    public UnaryCallSettings.Builder<UpdatePhotoRequest, Photo> updatePhotoSettings() {
      return getStubSettingsBuilder().updatePhotoSettings();
    }

    /** Returns the builder for the settings used for calls to batchUpdatePhotos. */
    public UnaryCallSettings.Builder<BatchUpdatePhotosRequest, BatchUpdatePhotosResponse>
        batchUpdatePhotosSettings() {
      return getStubSettingsBuilder().batchUpdatePhotosSettings();
    }

    /** Returns the builder for the settings used for calls to deletePhoto. */
    public UnaryCallSettings.Builder<DeletePhotoRequest, Empty> deletePhotoSettings() {
      return getStubSettingsBuilder().deletePhotoSettings();
    }

    /** Returns the builder for the settings used for calls to batchDeletePhotos. */
    public UnaryCallSettings.Builder<BatchDeletePhotosRequest, BatchDeletePhotosResponse>
        batchDeletePhotosSettings() {
      return getStubSettingsBuilder().batchDeletePhotosSettings();
    }

    @Override
    public StreetViewPublishServiceSettings build() throws IOException {
      return new StreetViewPublishServiceSettings(this);
    }
  }
}
