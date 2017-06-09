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
using Google.Protobuf.WellKnownTypes;
using Grpc.Core;
using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Threading;
using System.Threading.Tasks;

namespace Google.Streetview.Publish.V1
{
    /// <summary>
    /// Settings for a <see cref="StreetViewPublishServiceClient"/>.
    /// </summary>
    public sealed partial class StreetViewPublishServiceSettings : ServiceSettingsBase
    {
        /// <summary>
        /// Get a new instance of the default <see cref="StreetViewPublishServiceSettings"/>.
        /// </summary>
        /// <returns>
        /// A new instance of the default <see cref="StreetViewPublishServiceSettings"/>.
        /// </returns>
        public static StreetViewPublishServiceSettings GetDefault() => new StreetViewPublishServiceSettings();

        /// <summary>
        /// Constructs a new <see cref="StreetViewPublishServiceSettings"/> object with default settings.
        /// </summary>
        public StreetViewPublishServiceSettings() { }

        private StreetViewPublishServiceSettings(StreetViewPublishServiceSettings existing) : base(existing)
        {
            GaxPreconditions.CheckNotNull(existing, nameof(existing));
            StartUploadSettings = existing.StartUploadSettings;
            CreatePhotoSettings = existing.CreatePhotoSettings;
            GetPhotoSettings = existing.GetPhotoSettings;
            BatchGetPhotosSettings = existing.BatchGetPhotosSettings;
            ListPhotosSettings = existing.ListPhotosSettings;
            UpdatePhotoSettings = existing.UpdatePhotoSettings;
            BatchUpdatePhotosSettings = existing.BatchUpdatePhotosSettings;
            DeletePhotoSettings = existing.DeletePhotoSettings;
            BatchDeletePhotosSettings = existing.BatchDeletePhotosSettings;
            OnCopy(existing);
        }

        partial void OnCopy(StreetViewPublishServiceSettings existing);

        /// <summary>
        /// The filter specifying which RPC <see cref="StatusCode"/>s are eligible for retry
        /// for "Idempotent" <see cref="StreetViewPublishServiceClient"/> RPC methods.
        /// </summary>
        /// <remarks>
        /// The eligible RPC <see cref="StatusCode"/>s for retry for "Idempotent" RPC methods are:
        /// <list type="bullet">
        /// <item><description><see cref="StatusCode.DeadlineExceeded"/></description></item>
        /// <item><description><see cref="StatusCode.Unavailable"/></description></item>
        /// </list>
        /// </remarks>
        public static Predicate<RpcException> IdempotentRetryFilter { get; } =
            RetrySettings.FilterForStatusCodes(StatusCode.DeadlineExceeded, StatusCode.Unavailable);

        /// <summary>
        /// The filter specifying which RPC <see cref="StatusCode"/>s are eligible for retry
        /// for "NonIdempotent" <see cref="StreetViewPublishServiceClient"/> RPC methods.
        /// </summary>
        /// <remarks>
        /// There are no RPC <see cref="StatusCode"/>s eligible for retry for "NonIdempotent" RPC methods.
        /// </remarks>
        public static Predicate<RpcException> NonIdempotentRetryFilter { get; } =
            RetrySettings.FilterForStatusCodes();

        /// <summary>
        /// "Default" retry backoff for <see cref="StreetViewPublishServiceClient"/> RPC methods.
        /// </summary>
        /// <returns>
        /// The "Default" retry backoff for <see cref="StreetViewPublishServiceClient"/> RPC methods.
        /// </returns>
        /// <remarks>
        /// The "Default" retry backoff for <see cref="StreetViewPublishServiceClient"/> RPC methods is defined as:
        /// <list type="bullet">
        /// <item><description>Initial delay: 100 milliseconds</description></item>
        /// <item><description>Maximum delay: 60000 milliseconds</description></item>
        /// <item><description>Delay multiplier: 1.3</description></item>
        /// </list>
        /// </remarks>
        public static BackoffSettings GetDefaultRetryBackoff() => new BackoffSettings(
            delay: TimeSpan.FromMilliseconds(100),
            maxDelay: TimeSpan.FromMilliseconds(60000),
            delayMultiplier: 1.3
        );

        /// <summary>
        /// "Default" timeout backoff for <see cref="StreetViewPublishServiceClient"/> RPC methods.
        /// </summary>
        /// <returns>
        /// The "Default" timeout backoff for <see cref="StreetViewPublishServiceClient"/> RPC methods.
        /// </returns>
        /// <remarks>
        /// The "Default" timeout backoff for <see cref="StreetViewPublishServiceClient"/> RPC methods is defined as:
        /// <list type="bullet">
        /// <item><description>Initial timeout: 20000 milliseconds</description></item>
        /// <item><description>Timeout multiplier: 1.0</description></item>
        /// <item><description>Maximum timeout: 20000 milliseconds</description></item>
        /// </list>
        /// </remarks>
        public static BackoffSettings GetDefaultTimeoutBackoff() => new BackoffSettings(
            delay: TimeSpan.FromMilliseconds(20000),
            maxDelay: TimeSpan.FromMilliseconds(20000),
            delayMultiplier: 1.0
        );

        /// <summary>
        /// <see cref="CallSettings"/> for synchronous and asynchronous calls to
        /// <c>StreetViewPublishServiceClient.StartUpload</c> and <c>StreetViewPublishServiceClient.StartUploadAsync</c>.
        /// </summary>
        /// <remarks>
        /// The default <c>StreetViewPublishServiceClient.StartUpload</c> and
        /// <c>StreetViewPublishServiceClient.StartUploadAsync</c> <see cref="RetrySettings"/> are:
        /// <list type="bullet">
        /// <item><description>Initial retry delay: 100 milliseconds</description></item>
        /// <item><description>Retry delay multiplier: 1.3</description></item>
        /// <item><description>Retry maximum delay: 60000 milliseconds</description></item>
        /// <item><description>Initial timeout: 20000 milliseconds</description></item>
        /// <item><description>Timeout multiplier: 1.0</description></item>
        /// <item><description>Timeout maximum delay: 20000 milliseconds</description></item>
        /// </list>
        /// Retry will be attempted on the following response status codes:
        /// <list>
        /// <item><description>No status codes</description></item>
        /// </list>
        /// Default RPC expiration is 600000 milliseconds.
        /// </remarks>
        public CallSettings StartUploadSettings { get; set; } = CallSettings.FromCallTiming(
            CallTiming.FromRetry(new RetrySettings(
                retryBackoff: GetDefaultRetryBackoff(),
                timeoutBackoff: GetDefaultTimeoutBackoff(),
                totalExpiration: Expiration.FromTimeout(TimeSpan.FromMilliseconds(600000)),
                retryFilter: NonIdempotentRetryFilter
            )));

        /// <summary>
        /// <see cref="CallSettings"/> for synchronous and asynchronous calls to
        /// <c>StreetViewPublishServiceClient.CreatePhoto</c> and <c>StreetViewPublishServiceClient.CreatePhotoAsync</c>.
        /// </summary>
        /// <remarks>
        /// The default <c>StreetViewPublishServiceClient.CreatePhoto</c> and
        /// <c>StreetViewPublishServiceClient.CreatePhotoAsync</c> <see cref="RetrySettings"/> are:
        /// <list type="bullet">
        /// <item><description>Initial retry delay: 100 milliseconds</description></item>
        /// <item><description>Retry delay multiplier: 1.3</description></item>
        /// <item><description>Retry maximum delay: 60000 milliseconds</description></item>
        /// <item><description>Initial timeout: 20000 milliseconds</description></item>
        /// <item><description>Timeout multiplier: 1.0</description></item>
        /// <item><description>Timeout maximum delay: 20000 milliseconds</description></item>
        /// </list>
        /// Retry will be attempted on the following response status codes:
        /// <list>
        /// <item><description>No status codes</description></item>
        /// </list>
        /// Default RPC expiration is 600000 milliseconds.
        /// </remarks>
        public CallSettings CreatePhotoSettings { get; set; } = CallSettings.FromCallTiming(
            CallTiming.FromRetry(new RetrySettings(
                retryBackoff: GetDefaultRetryBackoff(),
                timeoutBackoff: GetDefaultTimeoutBackoff(),
                totalExpiration: Expiration.FromTimeout(TimeSpan.FromMilliseconds(600000)),
                retryFilter: NonIdempotentRetryFilter
            )));

        /// <summary>
        /// <see cref="CallSettings"/> for synchronous and asynchronous calls to
        /// <c>StreetViewPublishServiceClient.GetPhoto</c> and <c>StreetViewPublishServiceClient.GetPhotoAsync</c>.
        /// </summary>
        /// <remarks>
        /// The default <c>StreetViewPublishServiceClient.GetPhoto</c> and
        /// <c>StreetViewPublishServiceClient.GetPhotoAsync</c> <see cref="RetrySettings"/> are:
        /// <list type="bullet">
        /// <item><description>Initial retry delay: 100 milliseconds</description></item>
        /// <item><description>Retry delay multiplier: 1.3</description></item>
        /// <item><description>Retry maximum delay: 60000 milliseconds</description></item>
        /// <item><description>Initial timeout: 20000 milliseconds</description></item>
        /// <item><description>Timeout multiplier: 1.0</description></item>
        /// <item><description>Timeout maximum delay: 20000 milliseconds</description></item>
        /// </list>
        /// Retry will be attempted on the following response status codes:
        /// <list>
        /// <item><description><see cref="StatusCode.DeadlineExceeded"/></description></item>
        /// <item><description><see cref="StatusCode.Unavailable"/></description></item>
        /// </list>
        /// Default RPC expiration is 600000 milliseconds.
        /// </remarks>
        public CallSettings GetPhotoSettings { get; set; } = CallSettings.FromCallTiming(
            CallTiming.FromRetry(new RetrySettings(
                retryBackoff: GetDefaultRetryBackoff(),
                timeoutBackoff: GetDefaultTimeoutBackoff(),
                totalExpiration: Expiration.FromTimeout(TimeSpan.FromMilliseconds(600000)),
                retryFilter: IdempotentRetryFilter
            )));

        /// <summary>
        /// <see cref="CallSettings"/> for synchronous and asynchronous calls to
        /// <c>StreetViewPublishServiceClient.BatchGetPhotos</c> and <c>StreetViewPublishServiceClient.BatchGetPhotosAsync</c>.
        /// </summary>
        /// <remarks>
        /// The default <c>StreetViewPublishServiceClient.BatchGetPhotos</c> and
        /// <c>StreetViewPublishServiceClient.BatchGetPhotosAsync</c> <see cref="RetrySettings"/> are:
        /// <list type="bullet">
        /// <item><description>Initial retry delay: 100 milliseconds</description></item>
        /// <item><description>Retry delay multiplier: 1.3</description></item>
        /// <item><description>Retry maximum delay: 60000 milliseconds</description></item>
        /// <item><description>Initial timeout: 20000 milliseconds</description></item>
        /// <item><description>Timeout multiplier: 1.0</description></item>
        /// <item><description>Timeout maximum delay: 20000 milliseconds</description></item>
        /// </list>
        /// Retry will be attempted on the following response status codes:
        /// <list>
        /// <item><description><see cref="StatusCode.DeadlineExceeded"/></description></item>
        /// <item><description><see cref="StatusCode.Unavailable"/></description></item>
        /// </list>
        /// Default RPC expiration is 600000 milliseconds.
        /// </remarks>
        public CallSettings BatchGetPhotosSettings { get; set; } = CallSettings.FromCallTiming(
            CallTiming.FromRetry(new RetrySettings(
                retryBackoff: GetDefaultRetryBackoff(),
                timeoutBackoff: GetDefaultTimeoutBackoff(),
                totalExpiration: Expiration.FromTimeout(TimeSpan.FromMilliseconds(600000)),
                retryFilter: IdempotentRetryFilter
            )));

        /// <summary>
        /// <see cref="CallSettings"/> for synchronous and asynchronous calls to
        /// <c>StreetViewPublishServiceClient.ListPhotos</c> and <c>StreetViewPublishServiceClient.ListPhotosAsync</c>.
        /// </summary>
        /// <remarks>
        /// The default <c>StreetViewPublishServiceClient.ListPhotos</c> and
        /// <c>StreetViewPublishServiceClient.ListPhotosAsync</c> <see cref="RetrySettings"/> are:
        /// <list type="bullet">
        /// <item><description>Initial retry delay: 100 milliseconds</description></item>
        /// <item><description>Retry delay multiplier: 1.3</description></item>
        /// <item><description>Retry maximum delay: 60000 milliseconds</description></item>
        /// <item><description>Initial timeout: 20000 milliseconds</description></item>
        /// <item><description>Timeout multiplier: 1.0</description></item>
        /// <item><description>Timeout maximum delay: 20000 milliseconds</description></item>
        /// </list>
        /// Retry will be attempted on the following response status codes:
        /// <list>
        /// <item><description><see cref="StatusCode.DeadlineExceeded"/></description></item>
        /// <item><description><see cref="StatusCode.Unavailable"/></description></item>
        /// </list>
        /// Default RPC expiration is 600000 milliseconds.
        /// </remarks>
        public CallSettings ListPhotosSettings { get; set; } = CallSettings.FromCallTiming(
            CallTiming.FromRetry(new RetrySettings(
                retryBackoff: GetDefaultRetryBackoff(),
                timeoutBackoff: GetDefaultTimeoutBackoff(),
                totalExpiration: Expiration.FromTimeout(TimeSpan.FromMilliseconds(600000)),
                retryFilter: IdempotentRetryFilter
            )));

        /// <summary>
        /// <see cref="CallSettings"/> for synchronous and asynchronous calls to
        /// <c>StreetViewPublishServiceClient.UpdatePhoto</c> and <c>StreetViewPublishServiceClient.UpdatePhotoAsync</c>.
        /// </summary>
        /// <remarks>
        /// The default <c>StreetViewPublishServiceClient.UpdatePhoto</c> and
        /// <c>StreetViewPublishServiceClient.UpdatePhotoAsync</c> <see cref="RetrySettings"/> are:
        /// <list type="bullet">
        /// <item><description>Initial retry delay: 100 milliseconds</description></item>
        /// <item><description>Retry delay multiplier: 1.3</description></item>
        /// <item><description>Retry maximum delay: 60000 milliseconds</description></item>
        /// <item><description>Initial timeout: 20000 milliseconds</description></item>
        /// <item><description>Timeout multiplier: 1.0</description></item>
        /// <item><description>Timeout maximum delay: 20000 milliseconds</description></item>
        /// </list>
        /// Retry will be attempted on the following response status codes:
        /// <list>
        /// <item><description><see cref="StatusCode.DeadlineExceeded"/></description></item>
        /// <item><description><see cref="StatusCode.Unavailable"/></description></item>
        /// </list>
        /// Default RPC expiration is 600000 milliseconds.
        /// </remarks>
        public CallSettings UpdatePhotoSettings { get; set; } = CallSettings.FromCallTiming(
            CallTiming.FromRetry(new RetrySettings(
                retryBackoff: GetDefaultRetryBackoff(),
                timeoutBackoff: GetDefaultTimeoutBackoff(),
                totalExpiration: Expiration.FromTimeout(TimeSpan.FromMilliseconds(600000)),
                retryFilter: IdempotentRetryFilter
            )));

        /// <summary>
        /// <see cref="CallSettings"/> for synchronous and asynchronous calls to
        /// <c>StreetViewPublishServiceClient.BatchUpdatePhotos</c> and <c>StreetViewPublishServiceClient.BatchUpdatePhotosAsync</c>.
        /// </summary>
        /// <remarks>
        /// The default <c>StreetViewPublishServiceClient.BatchUpdatePhotos</c> and
        /// <c>StreetViewPublishServiceClient.BatchUpdatePhotosAsync</c> <see cref="RetrySettings"/> are:
        /// <list type="bullet">
        /// <item><description>Initial retry delay: 100 milliseconds</description></item>
        /// <item><description>Retry delay multiplier: 1.3</description></item>
        /// <item><description>Retry maximum delay: 60000 milliseconds</description></item>
        /// <item><description>Initial timeout: 20000 milliseconds</description></item>
        /// <item><description>Timeout multiplier: 1.0</description></item>
        /// <item><description>Timeout maximum delay: 20000 milliseconds</description></item>
        /// </list>
        /// Retry will be attempted on the following response status codes:
        /// <list>
        /// <item><description>No status codes</description></item>
        /// </list>
        /// Default RPC expiration is 600000 milliseconds.
        /// </remarks>
        public CallSettings BatchUpdatePhotosSettings { get; set; } = CallSettings.FromCallTiming(
            CallTiming.FromRetry(new RetrySettings(
                retryBackoff: GetDefaultRetryBackoff(),
                timeoutBackoff: GetDefaultTimeoutBackoff(),
                totalExpiration: Expiration.FromTimeout(TimeSpan.FromMilliseconds(600000)),
                retryFilter: NonIdempotentRetryFilter
            )));

        /// <summary>
        /// <see cref="CallSettings"/> for synchronous and asynchronous calls to
        /// <c>StreetViewPublishServiceClient.DeletePhoto</c> and <c>StreetViewPublishServiceClient.DeletePhotoAsync</c>.
        /// </summary>
        /// <remarks>
        /// The default <c>StreetViewPublishServiceClient.DeletePhoto</c> and
        /// <c>StreetViewPublishServiceClient.DeletePhotoAsync</c> <see cref="RetrySettings"/> are:
        /// <list type="bullet">
        /// <item><description>Initial retry delay: 100 milliseconds</description></item>
        /// <item><description>Retry delay multiplier: 1.3</description></item>
        /// <item><description>Retry maximum delay: 60000 milliseconds</description></item>
        /// <item><description>Initial timeout: 20000 milliseconds</description></item>
        /// <item><description>Timeout multiplier: 1.0</description></item>
        /// <item><description>Timeout maximum delay: 20000 milliseconds</description></item>
        /// </list>
        /// Retry will be attempted on the following response status codes:
        /// <list>
        /// <item><description><see cref="StatusCode.DeadlineExceeded"/></description></item>
        /// <item><description><see cref="StatusCode.Unavailable"/></description></item>
        /// </list>
        /// Default RPC expiration is 600000 milliseconds.
        /// </remarks>
        public CallSettings DeletePhotoSettings { get; set; } = CallSettings.FromCallTiming(
            CallTiming.FromRetry(new RetrySettings(
                retryBackoff: GetDefaultRetryBackoff(),
                timeoutBackoff: GetDefaultTimeoutBackoff(),
                totalExpiration: Expiration.FromTimeout(TimeSpan.FromMilliseconds(600000)),
                retryFilter: IdempotentRetryFilter
            )));

        /// <summary>
        /// <see cref="CallSettings"/> for synchronous and asynchronous calls to
        /// <c>StreetViewPublishServiceClient.BatchDeletePhotos</c> and <c>StreetViewPublishServiceClient.BatchDeletePhotosAsync</c>.
        /// </summary>
        /// <remarks>
        /// The default <c>StreetViewPublishServiceClient.BatchDeletePhotos</c> and
        /// <c>StreetViewPublishServiceClient.BatchDeletePhotosAsync</c> <see cref="RetrySettings"/> are:
        /// <list type="bullet">
        /// <item><description>Initial retry delay: 100 milliseconds</description></item>
        /// <item><description>Retry delay multiplier: 1.3</description></item>
        /// <item><description>Retry maximum delay: 60000 milliseconds</description></item>
        /// <item><description>Initial timeout: 20000 milliseconds</description></item>
        /// <item><description>Timeout multiplier: 1.0</description></item>
        /// <item><description>Timeout maximum delay: 20000 milliseconds</description></item>
        /// </list>
        /// Retry will be attempted on the following response status codes:
        /// <list>
        /// <item><description>No status codes</description></item>
        /// </list>
        /// Default RPC expiration is 600000 milliseconds.
        /// </remarks>
        public CallSettings BatchDeletePhotosSettings { get; set; } = CallSettings.FromCallTiming(
            CallTiming.FromRetry(new RetrySettings(
                retryBackoff: GetDefaultRetryBackoff(),
                timeoutBackoff: GetDefaultTimeoutBackoff(),
                totalExpiration: Expiration.FromTimeout(TimeSpan.FromMilliseconds(600000)),
                retryFilter: NonIdempotentRetryFilter
            )));

        /// <summary>
        /// Creates a deep clone of this object, with all the same property values.
        /// </summary>
        /// <returns>A deep clone of this <see cref="StreetViewPublishServiceSettings"/> object.</returns>
        public StreetViewPublishServiceSettings Clone() => new StreetViewPublishServiceSettings(this);
    }

    /// <summary>
    /// StreetViewPublishService client wrapper, for convenient use.
    /// </summary>
    public abstract partial class StreetViewPublishServiceClient
    {
        /// <summary>
        /// The default endpoint for the StreetViewPublishService service, which is a host of "streetviewpublish.googleapis.com" and a port of 443.
        /// </summary>
        public static ServiceEndpoint DefaultEndpoint { get; } = new ServiceEndpoint("streetviewpublish.googleapis.com", 443);

        /// <summary>
        /// The default StreetViewPublishService scopes.
        /// </summary>
        /// <remarks>
        /// The default StreetViewPublishService scopes are:
        /// <list type="bullet">
        /// <item><description>"https://www.googleapis.com/auth/streetviewpublish"</description></item>
        /// </list>
        /// </remarks>
        public static IReadOnlyList<string> DefaultScopes { get; } = new ReadOnlyCollection<string>(new string[] {
            "https://www.googleapis.com/auth/streetviewpublish",
        });

        private static readonly ChannelPool s_channelPool = new ChannelPool(DefaultScopes);

        // Note: we could have parameterless overloads of Create and CreateAsync,
        // documented to just use the default endpoint, settings and credentials.
        // Pros:
        // - Might be more reassuring on first use
        // - Allows method group conversions
        // Con: overloads!

        /// <summary>
        /// Asynchronously creates a <see cref="StreetViewPublishServiceClient"/>, applying defaults for all unspecified settings,
        /// and creating a channel connecting to the given endpoint with application default credentials where
        /// necessary.
        /// </summary>
        /// <param name="endpoint">Optional <see cref="ServiceEndpoint"/>.</param>
        /// <param name="settings">Optional <see cref="StreetViewPublishServiceSettings"/>.</param>
        /// <returns>The task representing the created <see cref="StreetViewPublishServiceClient"/>.</returns>
        public static async Task<StreetViewPublishServiceClient> CreateAsync(ServiceEndpoint endpoint = null, StreetViewPublishServiceSettings settings = null)
        {
            Channel channel = await s_channelPool.GetChannelAsync(endpoint ?? DefaultEndpoint).ConfigureAwait(false);
            return Create(channel, settings);
        }

        /// <summary>
        /// Synchronously creates a <see cref="StreetViewPublishServiceClient"/>, applying defaults for all unspecified settings,
        /// and creating a channel connecting to the given endpoint with application default credentials where
        /// necessary.
        /// </summary>
        /// <param name="endpoint">Optional <see cref="ServiceEndpoint"/>.</param>
        /// <param name="settings">Optional <see cref="StreetViewPublishServiceSettings"/>.</param>
        /// <returns>The created <see cref="StreetViewPublishServiceClient"/>.</returns>
        public static StreetViewPublishServiceClient Create(ServiceEndpoint endpoint = null, StreetViewPublishServiceSettings settings = null)
        {
            Channel channel = s_channelPool.GetChannel(endpoint ?? DefaultEndpoint);
            return Create(channel, settings);
        }

        /// <summary>
        /// Creates a <see cref="StreetViewPublishServiceClient"/> which uses the specified channel for remote operations.
        /// </summary>
        /// <param name="channel">The <see cref="Channel"/> for remote operations. Must not be null.</param>
        /// <param name="settings">Optional <see cref="StreetViewPublishServiceSettings"/>.</param>
        /// <returns>The created <see cref="StreetViewPublishServiceClient"/>.</returns>
        public static StreetViewPublishServiceClient Create(Channel channel, StreetViewPublishServiceSettings settings = null)
        {
            GaxPreconditions.CheckNotNull(channel, nameof(channel));
            StreetViewPublishService.StreetViewPublishServiceClient grpcClient = new StreetViewPublishService.StreetViewPublishServiceClient(channel);
            return new StreetViewPublishServiceClientImpl(grpcClient, settings);
        }

        /// <summary>
        /// Shuts down any channels automatically created by <see cref="Create(ServiceEndpoint, StreetViewPublishServiceSettings)"/>
        /// and <see cref="CreateAsync(ServiceEndpoint, StreetViewPublishServiceSettings)"/>. Channels which weren't automatically
        /// created are not affected.
        /// </summary>
        /// <remarks>After calling this method, further calls to <see cref="Create(ServiceEndpoint, StreetViewPublishServiceSettings)"/>
        /// and <see cref="CreateAsync(ServiceEndpoint, StreetViewPublishServiceSettings)"/> will create new channels, which could
        /// in turn be shut down by another call to this method.</remarks>
        /// <returns>A task representing the asynchronous shutdown operation.</returns>
        public static Task ShutdownDefaultChannelsAsync() => s_channelPool.ShutdownChannelsAsync();

        /// <summary>
        /// The underlying gRPC StreetViewPublishService client.
        /// </summary>
        public virtual StreetViewPublishService.StreetViewPublishServiceClient GrpcClient
        {
            get { throw new NotImplementedException(); }
        }

        /// <summary>
        /// Creates an upload session to start uploading photo data. The upload URL of
        /// the returned `UploadRef` is used to upload the data for the photo.
        ///
        /// After the upload is complete, the `UploadRef` is used with
        /// `StreetViewPublishService:CreatePhoto()` to create the `Photo` object
        /// entry.
        /// </summary>
        /// <param name="request">
        /// The request object containing all of the parameters for the API call.
        /// </param>
        /// <param name="callSettings">
        /// If not null, applies overrides to this RPC call.
        /// </param>
        /// <returns>
        /// A Task containing the RPC response.
        /// </returns>
        public virtual Task<UploadRef> StartUploadAsync(
            Empty request,
            CallSettings callSettings = null)
        {
            throw new NotImplementedException();
        }

        /// <summary>
        /// Creates an upload session to start uploading photo data. The upload URL of
        /// the returned `UploadRef` is used to upload the data for the photo.
        ///
        /// After the upload is complete, the `UploadRef` is used with
        /// `StreetViewPublishService:CreatePhoto()` to create the `Photo` object
        /// entry.
        /// </summary>
        /// <param name="request">
        /// The request object containing all of the parameters for the API call.
        /// </param>
        /// <param name="callSettings">
        /// If not null, applies overrides to this RPC call.
        /// </param>
        /// <returns>
        /// The RPC response.
        /// </returns>
        public virtual UploadRef StartUpload(
            Empty request,
            CallSettings callSettings = null)
        {
            throw new NotImplementedException();
        }

        /// <summary>
        /// After the client finishes uploading the photo with the returned
        /// `UploadRef`, `photo.create` publishes the uploaded photo to Street View on
        /// Google Maps.
        ///
        /// This method returns the following error codes:
        ///
        /// * `INVALID_ARGUMENT` if the request is malformed.
        /// * `NOT_FOUND` if the upload reference does not exist.
        /// </summary>
        /// <param name="photo">
        /// Required. Photo to create.
        /// </param>
        /// <param name="callSettings">
        /// If not null, applies overrides to this RPC call.
        /// </param>
        /// <returns>
        /// A Task containing the RPC response.
        /// </returns>
        public virtual Task<Photo> CreatePhotoAsync(
            Photo photo,
            CallSettings callSettings = null) => CreatePhotoAsync(
                new CreatePhotoRequest
                {
                    Photo = GaxPreconditions.CheckNotNull(photo, nameof(photo)),
                },
                callSettings);

        /// <summary>
        /// After the client finishes uploading the photo with the returned
        /// `UploadRef`, `photo.create` publishes the uploaded photo to Street View on
        /// Google Maps.
        ///
        /// This method returns the following error codes:
        ///
        /// * `INVALID_ARGUMENT` if the request is malformed.
        /// * `NOT_FOUND` if the upload reference does not exist.
        /// </summary>
        /// <param name="photo">
        /// Required. Photo to create.
        /// </param>
        /// <param name="cancellationToken">
        /// A <see cref="CancellationToken"/> to use for this RPC.
        /// </param>
        /// <returns>
        /// A Task containing the RPC response.
        /// </returns>
        public virtual Task<Photo> CreatePhotoAsync(
            Photo photo,
            CancellationToken cancellationToken) => CreatePhotoAsync(
                photo,
                CallSettings.FromCancellationToken(cancellationToken));

        /// <summary>
        /// After the client finishes uploading the photo with the returned
        /// `UploadRef`, `photo.create` publishes the uploaded photo to Street View on
        /// Google Maps.
        ///
        /// This method returns the following error codes:
        ///
        /// * `INVALID_ARGUMENT` if the request is malformed.
        /// * `NOT_FOUND` if the upload reference does not exist.
        /// </summary>
        /// <param name="photo">
        /// Required. Photo to create.
        /// </param>
        /// <param name="callSettings">
        /// If not null, applies overrides to this RPC call.
        /// </param>
        /// <returns>
        /// The RPC response.
        /// </returns>
        public virtual Photo CreatePhoto(
            Photo photo,
            CallSettings callSettings = null) => CreatePhoto(
                new CreatePhotoRequest
                {
                    Photo = GaxPreconditions.CheckNotNull(photo, nameof(photo)),
                },
                callSettings);

        /// <summary>
        /// After the client finishes uploading the photo with the returned
        /// `UploadRef`, `photo.create` publishes the uploaded photo to Street View on
        /// Google Maps.
        ///
        /// This method returns the following error codes:
        ///
        /// * `INVALID_ARGUMENT` if the request is malformed.
        /// * `NOT_FOUND` if the upload reference does not exist.
        /// </summary>
        /// <param name="request">
        /// The request object containing all of the parameters for the API call.
        /// </param>
        /// <param name="callSettings">
        /// If not null, applies overrides to this RPC call.
        /// </param>
        /// <returns>
        /// A Task containing the RPC response.
        /// </returns>
        public virtual Task<Photo> CreatePhotoAsync(
            CreatePhotoRequest request,
            CallSettings callSettings = null)
        {
            throw new NotImplementedException();
        }

        /// <summary>
        /// After the client finishes uploading the photo with the returned
        /// `UploadRef`, `photo.create` publishes the uploaded photo to Street View on
        /// Google Maps.
        ///
        /// This method returns the following error codes:
        ///
        /// * `INVALID_ARGUMENT` if the request is malformed.
        /// * `NOT_FOUND` if the upload reference does not exist.
        /// </summary>
        /// <param name="request">
        /// The request object containing all of the parameters for the API call.
        /// </param>
        /// <param name="callSettings">
        /// If not null, applies overrides to this RPC call.
        /// </param>
        /// <returns>
        /// The RPC response.
        /// </returns>
        public virtual Photo CreatePhoto(
            CreatePhotoRequest request,
            CallSettings callSettings = null)
        {
            throw new NotImplementedException();
        }

        /// <summary>
        /// Gets the metadata of the specified `Photo`.
        ///
        /// This method returns the following error codes:
        ///
        /// * `PERMISSION_DENIED` if the requesting user did not create the requested
        /// photo.
        /// * `NOT_FOUND` if the requested photo does not exist.
        /// </summary>
        /// <param name="photoId">
        /// Required. ID of the photo.
        /// </param>
        /// <param name="view">
        /// Specifies if a download URL for the photo bytes should be returned in the
        /// Photo response.
        /// </param>
        /// <param name="callSettings">
        /// If not null, applies overrides to this RPC call.
        /// </param>
        /// <returns>
        /// A Task containing the RPC response.
        /// </returns>
        public virtual Task<Photo> GetPhotoAsync(
            string photoId,
            PhotoView view,
            CallSettings callSettings = null) => GetPhotoAsync(
                new GetPhotoRequest
                {
                    PhotoId = GaxPreconditions.CheckNotNullOrEmpty(photoId, nameof(photoId)),
                    View = view,
                },
                callSettings);

        /// <summary>
        /// Gets the metadata of the specified `Photo`.
        ///
        /// This method returns the following error codes:
        ///
        /// * `PERMISSION_DENIED` if the requesting user did not create the requested
        /// photo.
        /// * `NOT_FOUND` if the requested photo does not exist.
        /// </summary>
        /// <param name="photoId">
        /// Required. ID of the photo.
        /// </param>
        /// <param name="view">
        /// Specifies if a download URL for the photo bytes should be returned in the
        /// Photo response.
        /// </param>
        /// <param name="cancellationToken">
        /// A <see cref="CancellationToken"/> to use for this RPC.
        /// </param>
        /// <returns>
        /// A Task containing the RPC response.
        /// </returns>
        public virtual Task<Photo> GetPhotoAsync(
            string photoId,
            PhotoView view,
            CancellationToken cancellationToken) => GetPhotoAsync(
                photoId,
                view,
                CallSettings.FromCancellationToken(cancellationToken));

        /// <summary>
        /// Gets the metadata of the specified `Photo`.
        ///
        /// This method returns the following error codes:
        ///
        /// * `PERMISSION_DENIED` if the requesting user did not create the requested
        /// photo.
        /// * `NOT_FOUND` if the requested photo does not exist.
        /// </summary>
        /// <param name="photoId">
        /// Required. ID of the photo.
        /// </param>
        /// <param name="view">
        /// Specifies if a download URL for the photo bytes should be returned in the
        /// Photo response.
        /// </param>
        /// <param name="callSettings">
        /// If not null, applies overrides to this RPC call.
        /// </param>
        /// <returns>
        /// The RPC response.
        /// </returns>
        public virtual Photo GetPhoto(
            string photoId,
            PhotoView view,
            CallSettings callSettings = null) => GetPhoto(
                new GetPhotoRequest
                {
                    PhotoId = GaxPreconditions.CheckNotNullOrEmpty(photoId, nameof(photoId)),
                    View = view,
                },
                callSettings);

        /// <summary>
        /// Gets the metadata of the specified `Photo`.
        ///
        /// This method returns the following error codes:
        ///
        /// * `PERMISSION_DENIED` if the requesting user did not create the requested
        /// photo.
        /// * `NOT_FOUND` if the requested photo does not exist.
        /// </summary>
        /// <param name="request">
        /// The request object containing all of the parameters for the API call.
        /// </param>
        /// <param name="callSettings">
        /// If not null, applies overrides to this RPC call.
        /// </param>
        /// <returns>
        /// A Task containing the RPC response.
        /// </returns>
        public virtual Task<Photo> GetPhotoAsync(
            GetPhotoRequest request,
            CallSettings callSettings = null)
        {
            throw new NotImplementedException();
        }

        /// <summary>
        /// Gets the metadata of the specified `Photo`.
        ///
        /// This method returns the following error codes:
        ///
        /// * `PERMISSION_DENIED` if the requesting user did not create the requested
        /// photo.
        /// * `NOT_FOUND` if the requested photo does not exist.
        /// </summary>
        /// <param name="request">
        /// The request object containing all of the parameters for the API call.
        /// </param>
        /// <param name="callSettings">
        /// If not null, applies overrides to this RPC call.
        /// </param>
        /// <returns>
        /// The RPC response.
        /// </returns>
        public virtual Photo GetPhoto(
            GetPhotoRequest request,
            CallSettings callSettings = null)
        {
            throw new NotImplementedException();
        }

        /// <summary>
        /// Gets the metadata of the specified `Photo` batch.
        ///
        /// Note that if `photos.batchGet` fails, either critical fields are
        /// missing or there was an authentication error.
        /// Even if `photos.batchGet` succeeds, there may have been failures
        /// for single photos in the batch. These failures will be specified in
        /// `BatchGetPhotosResponse.results.status`.
        /// See `photo.get` for specific failures that will occur per photo.
        /// </summary>
        /// <param name="photoIds">
        /// Required. IDs of the photos.
        /// </param>
        /// <param name="view">
        /// Specifies if a download URL for the photo bytes should be returned in the
        /// Photo response.
        /// </param>
        /// <param name="callSettings">
        /// If not null, applies overrides to this RPC call.
        /// </param>
        /// <returns>
        /// A Task containing the RPC response.
        /// </returns>
        public virtual Task<BatchGetPhotosResponse> BatchGetPhotosAsync(
            IEnumerable<string> photoIds,
            PhotoView view,
            CallSettings callSettings = null) => BatchGetPhotosAsync(
                new BatchGetPhotosRequest
                {
                    PhotoIds = { GaxPreconditions.CheckNotNull(photoIds, nameof(photoIds)) },
                    View = view,
                },
                callSettings);

        /// <summary>
        /// Gets the metadata of the specified `Photo` batch.
        ///
        /// Note that if `photos.batchGet` fails, either critical fields are
        /// missing or there was an authentication error.
        /// Even if `photos.batchGet` succeeds, there may have been failures
        /// for single photos in the batch. These failures will be specified in
        /// `BatchGetPhotosResponse.results.status`.
        /// See `photo.get` for specific failures that will occur per photo.
        /// </summary>
        /// <param name="photoIds">
        /// Required. IDs of the photos.
        /// </param>
        /// <param name="view">
        /// Specifies if a download URL for the photo bytes should be returned in the
        /// Photo response.
        /// </param>
        /// <param name="cancellationToken">
        /// A <see cref="CancellationToken"/> to use for this RPC.
        /// </param>
        /// <returns>
        /// A Task containing the RPC response.
        /// </returns>
        public virtual Task<BatchGetPhotosResponse> BatchGetPhotosAsync(
            IEnumerable<string> photoIds,
            PhotoView view,
            CancellationToken cancellationToken) => BatchGetPhotosAsync(
                photoIds,
                view,
                CallSettings.FromCancellationToken(cancellationToken));

        /// <summary>
        /// Gets the metadata of the specified `Photo` batch.
        ///
        /// Note that if `photos.batchGet` fails, either critical fields are
        /// missing or there was an authentication error.
        /// Even if `photos.batchGet` succeeds, there may have been failures
        /// for single photos in the batch. These failures will be specified in
        /// `BatchGetPhotosResponse.results.status`.
        /// See `photo.get` for specific failures that will occur per photo.
        /// </summary>
        /// <param name="photoIds">
        /// Required. IDs of the photos.
        /// </param>
        /// <param name="view">
        /// Specifies if a download URL for the photo bytes should be returned in the
        /// Photo response.
        /// </param>
        /// <param name="callSettings">
        /// If not null, applies overrides to this RPC call.
        /// </param>
        /// <returns>
        /// The RPC response.
        /// </returns>
        public virtual BatchGetPhotosResponse BatchGetPhotos(
            IEnumerable<string> photoIds,
            PhotoView view,
            CallSettings callSettings = null) => BatchGetPhotos(
                new BatchGetPhotosRequest
                {
                    PhotoIds = { GaxPreconditions.CheckNotNull(photoIds, nameof(photoIds)) },
                    View = view,
                },
                callSettings);

        /// <summary>
        /// Gets the metadata of the specified `Photo` batch.
        ///
        /// Note that if `photos.batchGet` fails, either critical fields are
        /// missing or there was an authentication error.
        /// Even if `photos.batchGet` succeeds, there may have been failures
        /// for single photos in the batch. These failures will be specified in
        /// `BatchGetPhotosResponse.results.status`.
        /// See `photo.get` for specific failures that will occur per photo.
        /// </summary>
        /// <param name="request">
        /// The request object containing all of the parameters for the API call.
        /// </param>
        /// <param name="callSettings">
        /// If not null, applies overrides to this RPC call.
        /// </param>
        /// <returns>
        /// A Task containing the RPC response.
        /// </returns>
        public virtual Task<BatchGetPhotosResponse> BatchGetPhotosAsync(
            BatchGetPhotosRequest request,
            CallSettings callSettings = null)
        {
            throw new NotImplementedException();
        }

        /// <summary>
        /// Gets the metadata of the specified `Photo` batch.
        ///
        /// Note that if `photos.batchGet` fails, either critical fields are
        /// missing or there was an authentication error.
        /// Even if `photos.batchGet` succeeds, there may have been failures
        /// for single photos in the batch. These failures will be specified in
        /// `BatchGetPhotosResponse.results.status`.
        /// See `photo.get` for specific failures that will occur per photo.
        /// </summary>
        /// <param name="request">
        /// The request object containing all of the parameters for the API call.
        /// </param>
        /// <param name="callSettings">
        /// If not null, applies overrides to this RPC call.
        /// </param>
        /// <returns>
        /// The RPC response.
        /// </returns>
        public virtual BatchGetPhotosResponse BatchGetPhotos(
            BatchGetPhotosRequest request,
            CallSettings callSettings = null)
        {
            throw new NotImplementedException();
        }

        /// <summary>
        /// Lists all the photos that belong to the user.
        /// </summary>
        /// <param name="view">
        /// Specifies if a download URL for the photos bytes should be returned in the
        /// Photos response.
        /// </param>
        /// <param name="filter">
        /// The filter expression.
        /// Example: `placeId=ChIJj61dQgK6j4AR4GeTYWZsKWw`
        /// </param>
        /// <param name="pageToken">
        /// The token returned from the previous request.
        /// A value of <c>null</c> or an empty string retrieves the first page.
        /// </param>
        /// <param name="pageSize">
        /// The size of page to request. The response will not be larger than this, but may be smaller.
        /// A value of <c>null</c> or 0 uses a server-defined page size.
        /// </param>
        /// <param name="callSettings">
        /// If not null, applies overrides to this RPC call.
        /// </param>
        /// <returns>
        /// A pageable asynchronous sequence of <see cref="Photo"/> resources.
        /// </returns>
        public virtual PagedAsyncEnumerable<ListPhotosResponse, Photo> ListPhotosAsync(
            PhotoView view,
            string filter,
            string pageToken = null,
            int? pageSize = null,
            CallSettings callSettings = null) => ListPhotosAsync(
                new ListPhotosRequest
                {
                    View = view,
                    Filter = GaxPreconditions.CheckNotNullOrEmpty(filter, nameof(filter)),
                    PageToken = pageToken ?? "",
                    PageSize = pageSize ?? 0,
                },
                callSettings);

        /// <summary>
        /// Lists all the photos that belong to the user.
        /// </summary>
        /// <param name="view">
        /// Specifies if a download URL for the photos bytes should be returned in the
        /// Photos response.
        /// </param>
        /// <param name="filter">
        /// The filter expression.
        /// Example: `placeId=ChIJj61dQgK6j4AR4GeTYWZsKWw`
        /// </param>
        /// <param name="pageToken">
        /// The token returned from the previous request.
        /// A value of <c>null</c> or an empty string retrieves the first page.
        /// </param>
        /// <param name="pageSize">
        /// The size of page to request. The response will not be larger than this, but may be smaller.
        /// A value of <c>null</c> or 0 uses a server-defined page size.
        /// </param>
        /// <param name="callSettings">
        /// If not null, applies overrides to this RPC call.
        /// </param>
        /// <returns>
        /// A pageable sequence of <see cref="Photo"/> resources.
        /// </returns>
        public virtual PagedEnumerable<ListPhotosResponse, Photo> ListPhotos(
            PhotoView view,
            string filter,
            string pageToken = null,
            int? pageSize = null,
            CallSettings callSettings = null) => ListPhotos(
                new ListPhotosRequest
                {
                    View = view,
                    Filter = GaxPreconditions.CheckNotNullOrEmpty(filter, nameof(filter)),
                    PageToken = pageToken ?? "",
                    PageSize = pageSize ?? 0,
                },
                callSettings);

        /// <summary>
        /// Lists all the photos that belong to the user.
        /// </summary>
        /// <param name="request">
        /// The request object containing all of the parameters for the API call.
        /// </param>
        /// <param name="callSettings">
        /// If not null, applies overrides to this RPC call.
        /// </param>
        /// <returns>
        /// A pageable asynchronous sequence of <see cref="Photo"/> resources.
        /// </returns>
        public virtual PagedAsyncEnumerable<ListPhotosResponse, Photo> ListPhotosAsync(
            ListPhotosRequest request,
            CallSettings callSettings = null)
        {
            throw new NotImplementedException();
        }

        /// <summary>
        /// Lists all the photos that belong to the user.
        /// </summary>
        /// <param name="request">
        /// The request object containing all of the parameters for the API call.
        /// </param>
        /// <param name="callSettings">
        /// If not null, applies overrides to this RPC call.
        /// </param>
        /// <returns>
        /// A pageable sequence of <see cref="Photo"/> resources.
        /// </returns>
        public virtual PagedEnumerable<ListPhotosResponse, Photo> ListPhotos(
            ListPhotosRequest request,
            CallSettings callSettings = null)
        {
            throw new NotImplementedException();
        }

        /// <summary>
        /// Updates the metadata of a photo, such as pose, place association, etc.
        /// Changing the pixels of a photo is not supported.
        ///
        /// This method returns the following error codes:
        ///
        /// * `PERMISSION_DENIED` if the requesting user did not create the requested
        /// photo.
        /// * `INVALID_ARGUMENT` if the request is malformed.
        /// * `NOT_FOUND` if the photo ID does not exist.
        /// </summary>
        /// <param name="photo">
        /// Required. Photo object containing the new metadata. Only the fields
        /// specified in `update_mask` are used. If `update_mask` is not present, the
        /// update applies to all fields.
        /// **Note:** To update `pose.altitude`, `pose.latlngpair` has to be filled as
        /// well. Otherwise, the request will fail.
        /// </param>
        /// <param name="updateMask">
        /// Mask that identifies fields on the photo metadata to update.
        /// If not present, the old Photo metadata will be entirely replaced with the
        /// new Photo metadata in this request. The update fails if invalid fields are
        /// specified. Multiple fields can be specified in a comma-delimited list.
        ///
        /// The following fields are valid:
        ///
        /// * `pose.heading`
        /// * `pose.latlngpair`
        /// * `pose.level`
        /// * `pose.altitude`
        /// * `connections`
        /// * `places`
        ///
        ///
        /// **Note:** Repeated fields in `update_mask` mean the entire set of repeated
        /// values will be replaced with the new contents. For example, if
        /// `UpdatePhotoRequest.photo.update_mask` contains `connections` and
        /// `UpdatePhotoRequest.photo.connections` is empty, all connections will be
        /// removed.
        /// </param>
        /// <param name="callSettings">
        /// If not null, applies overrides to this RPC call.
        /// </param>
        /// <returns>
        /// A Task containing the RPC response.
        /// </returns>
        public virtual Task<Photo> UpdatePhotoAsync(
            Photo photo,
            FieldMask updateMask,
            CallSettings callSettings = null) => UpdatePhotoAsync(
                new UpdatePhotoRequest
                {
                    Photo = GaxPreconditions.CheckNotNull(photo, nameof(photo)),
                    UpdateMask = GaxPreconditions.CheckNotNull(updateMask, nameof(updateMask)),
                },
                callSettings);

        /// <summary>
        /// Updates the metadata of a photo, such as pose, place association, etc.
        /// Changing the pixels of a photo is not supported.
        ///
        /// This method returns the following error codes:
        ///
        /// * `PERMISSION_DENIED` if the requesting user did not create the requested
        /// photo.
        /// * `INVALID_ARGUMENT` if the request is malformed.
        /// * `NOT_FOUND` if the photo ID does not exist.
        /// </summary>
        /// <param name="photo">
        /// Required. Photo object containing the new metadata. Only the fields
        /// specified in `update_mask` are used. If `update_mask` is not present, the
        /// update applies to all fields.
        /// **Note:** To update `pose.altitude`, `pose.latlngpair` has to be filled as
        /// well. Otherwise, the request will fail.
        /// </param>
        /// <param name="updateMask">
        /// Mask that identifies fields on the photo metadata to update.
        /// If not present, the old Photo metadata will be entirely replaced with the
        /// new Photo metadata in this request. The update fails if invalid fields are
        /// specified. Multiple fields can be specified in a comma-delimited list.
        ///
        /// The following fields are valid:
        ///
        /// * `pose.heading`
        /// * `pose.latlngpair`
        /// * `pose.level`
        /// * `pose.altitude`
        /// * `connections`
        /// * `places`
        ///
        ///
        /// **Note:** Repeated fields in `update_mask` mean the entire set of repeated
        /// values will be replaced with the new contents. For example, if
        /// `UpdatePhotoRequest.photo.update_mask` contains `connections` and
        /// `UpdatePhotoRequest.photo.connections` is empty, all connections will be
        /// removed.
        /// </param>
        /// <param name="cancellationToken">
        /// A <see cref="CancellationToken"/> to use for this RPC.
        /// </param>
        /// <returns>
        /// A Task containing the RPC response.
        /// </returns>
        public virtual Task<Photo> UpdatePhotoAsync(
            Photo photo,
            FieldMask updateMask,
            CancellationToken cancellationToken) => UpdatePhotoAsync(
                photo,
                updateMask,
                CallSettings.FromCancellationToken(cancellationToken));

        /// <summary>
        /// Updates the metadata of a photo, such as pose, place association, etc.
        /// Changing the pixels of a photo is not supported.
        ///
        /// This method returns the following error codes:
        ///
        /// * `PERMISSION_DENIED` if the requesting user did not create the requested
        /// photo.
        /// * `INVALID_ARGUMENT` if the request is malformed.
        /// * `NOT_FOUND` if the photo ID does not exist.
        /// </summary>
        /// <param name="photo">
        /// Required. Photo object containing the new metadata. Only the fields
        /// specified in `update_mask` are used. If `update_mask` is not present, the
        /// update applies to all fields.
        /// **Note:** To update `pose.altitude`, `pose.latlngpair` has to be filled as
        /// well. Otherwise, the request will fail.
        /// </param>
        /// <param name="updateMask">
        /// Mask that identifies fields on the photo metadata to update.
        /// If not present, the old Photo metadata will be entirely replaced with the
        /// new Photo metadata in this request. The update fails if invalid fields are
        /// specified. Multiple fields can be specified in a comma-delimited list.
        ///
        /// The following fields are valid:
        ///
        /// * `pose.heading`
        /// * `pose.latlngpair`
        /// * `pose.level`
        /// * `pose.altitude`
        /// * `connections`
        /// * `places`
        ///
        ///
        /// **Note:** Repeated fields in `update_mask` mean the entire set of repeated
        /// values will be replaced with the new contents. For example, if
        /// `UpdatePhotoRequest.photo.update_mask` contains `connections` and
        /// `UpdatePhotoRequest.photo.connections` is empty, all connections will be
        /// removed.
        /// </param>
        /// <param name="callSettings">
        /// If not null, applies overrides to this RPC call.
        /// </param>
        /// <returns>
        /// The RPC response.
        /// </returns>
        public virtual Photo UpdatePhoto(
            Photo photo,
            FieldMask updateMask,
            CallSettings callSettings = null) => UpdatePhoto(
                new UpdatePhotoRequest
                {
                    Photo = GaxPreconditions.CheckNotNull(photo, nameof(photo)),
                    UpdateMask = GaxPreconditions.CheckNotNull(updateMask, nameof(updateMask)),
                },
                callSettings);

        /// <summary>
        /// Updates the metadata of a photo, such as pose, place association, etc.
        /// Changing the pixels of a photo is not supported.
        ///
        /// This method returns the following error codes:
        ///
        /// * `PERMISSION_DENIED` if the requesting user did not create the requested
        /// photo.
        /// * `INVALID_ARGUMENT` if the request is malformed.
        /// * `NOT_FOUND` if the photo ID does not exist.
        /// </summary>
        /// <param name="request">
        /// The request object containing all of the parameters for the API call.
        /// </param>
        /// <param name="callSettings">
        /// If not null, applies overrides to this RPC call.
        /// </param>
        /// <returns>
        /// A Task containing the RPC response.
        /// </returns>
        public virtual Task<Photo> UpdatePhotoAsync(
            UpdatePhotoRequest request,
            CallSettings callSettings = null)
        {
            throw new NotImplementedException();
        }

        /// <summary>
        /// Updates the metadata of a photo, such as pose, place association, etc.
        /// Changing the pixels of a photo is not supported.
        ///
        /// This method returns the following error codes:
        ///
        /// * `PERMISSION_DENIED` if the requesting user did not create the requested
        /// photo.
        /// * `INVALID_ARGUMENT` if the request is malformed.
        /// * `NOT_FOUND` if the photo ID does not exist.
        /// </summary>
        /// <param name="request">
        /// The request object containing all of the parameters for the API call.
        /// </param>
        /// <param name="callSettings">
        /// If not null, applies overrides to this RPC call.
        /// </param>
        /// <returns>
        /// The RPC response.
        /// </returns>
        public virtual Photo UpdatePhoto(
            UpdatePhotoRequest request,
            CallSettings callSettings = null)
        {
            throw new NotImplementedException();
        }

        /// <summary>
        /// Updates the metadata of photos, such as pose, place association, etc.
        /// Changing the pixels of a photo is not supported.
        ///
        /// Note that if `photos.batchUpdate` fails, either critical fields
        /// are missing or there was an authentication error.
        /// Even if `photos.batchUpdate` succeeds, there may have been
        /// failures for single photos in the batch. These failures will be specified
        /// in `BatchUpdatePhotosResponse.results.status`.
        /// See `UpdatePhoto` for specific failures that will occur per photo.
        /// </summary>
        /// <param name="updatePhotoRequests">
        /// Required. List of update photo requests.
        /// </param>
        /// <param name="callSettings">
        /// If not null, applies overrides to this RPC call.
        /// </param>
        /// <returns>
        /// A Task containing the RPC response.
        /// </returns>
        public virtual Task<BatchUpdatePhotosResponse> BatchUpdatePhotosAsync(
            IEnumerable<UpdatePhotoRequest> updatePhotoRequests,
            CallSettings callSettings = null) => BatchUpdatePhotosAsync(
                new BatchUpdatePhotosRequest
                {
                    UpdatePhotoRequests = { GaxPreconditions.CheckNotNull(updatePhotoRequests, nameof(updatePhotoRequests)) },
                },
                callSettings);

        /// <summary>
        /// Updates the metadata of photos, such as pose, place association, etc.
        /// Changing the pixels of a photo is not supported.
        ///
        /// Note that if `photos.batchUpdate` fails, either critical fields
        /// are missing or there was an authentication error.
        /// Even if `photos.batchUpdate` succeeds, there may have been
        /// failures for single photos in the batch. These failures will be specified
        /// in `BatchUpdatePhotosResponse.results.status`.
        /// See `UpdatePhoto` for specific failures that will occur per photo.
        /// </summary>
        /// <param name="updatePhotoRequests">
        /// Required. List of update photo requests.
        /// </param>
        /// <param name="cancellationToken">
        /// A <see cref="CancellationToken"/> to use for this RPC.
        /// </param>
        /// <returns>
        /// A Task containing the RPC response.
        /// </returns>
        public virtual Task<BatchUpdatePhotosResponse> BatchUpdatePhotosAsync(
            IEnumerable<UpdatePhotoRequest> updatePhotoRequests,
            CancellationToken cancellationToken) => BatchUpdatePhotosAsync(
                updatePhotoRequests,
                CallSettings.FromCancellationToken(cancellationToken));

        /// <summary>
        /// Updates the metadata of photos, such as pose, place association, etc.
        /// Changing the pixels of a photo is not supported.
        ///
        /// Note that if `photos.batchUpdate` fails, either critical fields
        /// are missing or there was an authentication error.
        /// Even if `photos.batchUpdate` succeeds, there may have been
        /// failures for single photos in the batch. These failures will be specified
        /// in `BatchUpdatePhotosResponse.results.status`.
        /// See `UpdatePhoto` for specific failures that will occur per photo.
        /// </summary>
        /// <param name="updatePhotoRequests">
        /// Required. List of update photo requests.
        /// </param>
        /// <param name="callSettings">
        /// If not null, applies overrides to this RPC call.
        /// </param>
        /// <returns>
        /// The RPC response.
        /// </returns>
        public virtual BatchUpdatePhotosResponse BatchUpdatePhotos(
            IEnumerable<UpdatePhotoRequest> updatePhotoRequests,
            CallSettings callSettings = null) => BatchUpdatePhotos(
                new BatchUpdatePhotosRequest
                {
                    UpdatePhotoRequests = { GaxPreconditions.CheckNotNull(updatePhotoRequests, nameof(updatePhotoRequests)) },
                },
                callSettings);

        /// <summary>
        /// Updates the metadata of photos, such as pose, place association, etc.
        /// Changing the pixels of a photo is not supported.
        ///
        /// Note that if `photos.batchUpdate` fails, either critical fields
        /// are missing or there was an authentication error.
        /// Even if `photos.batchUpdate` succeeds, there may have been
        /// failures for single photos in the batch. These failures will be specified
        /// in `BatchUpdatePhotosResponse.results.status`.
        /// See `UpdatePhoto` for specific failures that will occur per photo.
        /// </summary>
        /// <param name="request">
        /// The request object containing all of the parameters for the API call.
        /// </param>
        /// <param name="callSettings">
        /// If not null, applies overrides to this RPC call.
        /// </param>
        /// <returns>
        /// A Task containing the RPC response.
        /// </returns>
        public virtual Task<BatchUpdatePhotosResponse> BatchUpdatePhotosAsync(
            BatchUpdatePhotosRequest request,
            CallSettings callSettings = null)
        {
            throw new NotImplementedException();
        }

        /// <summary>
        /// Updates the metadata of photos, such as pose, place association, etc.
        /// Changing the pixels of a photo is not supported.
        ///
        /// Note that if `photos.batchUpdate` fails, either critical fields
        /// are missing or there was an authentication error.
        /// Even if `photos.batchUpdate` succeeds, there may have been
        /// failures for single photos in the batch. These failures will be specified
        /// in `BatchUpdatePhotosResponse.results.status`.
        /// See `UpdatePhoto` for specific failures that will occur per photo.
        /// </summary>
        /// <param name="request">
        /// The request object containing all of the parameters for the API call.
        /// </param>
        /// <param name="callSettings">
        /// If not null, applies overrides to this RPC call.
        /// </param>
        /// <returns>
        /// The RPC response.
        /// </returns>
        public virtual BatchUpdatePhotosResponse BatchUpdatePhotos(
            BatchUpdatePhotosRequest request,
            CallSettings callSettings = null)
        {
            throw new NotImplementedException();
        }

        /// <summary>
        /// Deletes a photo and its metadata.
        ///
        /// This method returns the following error codes:
        ///
        /// * `PERMISSION_DENIED` if the requesting user did not create the requested
        /// photo.
        /// * `NOT_FOUND` if the photo ID does not exist.
        /// </summary>
        /// <param name="photoId">
        /// Required. ID of the photo.
        /// </param>
        /// <param name="callSettings">
        /// If not null, applies overrides to this RPC call.
        /// </param>
        /// <returns>
        /// A Task containing the RPC response.
        /// </returns>
        public virtual Task DeletePhotoAsync(
            string photoId,
            CallSettings callSettings = null) => DeletePhotoAsync(
                new DeletePhotoRequest
                {
                    PhotoId = GaxPreconditions.CheckNotNullOrEmpty(photoId, nameof(photoId)),
                },
                callSettings);

        /// <summary>
        /// Deletes a photo and its metadata.
        ///
        /// This method returns the following error codes:
        ///
        /// * `PERMISSION_DENIED` if the requesting user did not create the requested
        /// photo.
        /// * `NOT_FOUND` if the photo ID does not exist.
        /// </summary>
        /// <param name="photoId">
        /// Required. ID of the photo.
        /// </param>
        /// <param name="cancellationToken">
        /// A <see cref="CancellationToken"/> to use for this RPC.
        /// </param>
        /// <returns>
        /// A Task containing the RPC response.
        /// </returns>
        public virtual Task DeletePhotoAsync(
            string photoId,
            CancellationToken cancellationToken) => DeletePhotoAsync(
                photoId,
                CallSettings.FromCancellationToken(cancellationToken));

        /// <summary>
        /// Deletes a photo and its metadata.
        ///
        /// This method returns the following error codes:
        ///
        /// * `PERMISSION_DENIED` if the requesting user did not create the requested
        /// photo.
        /// * `NOT_FOUND` if the photo ID does not exist.
        /// </summary>
        /// <param name="photoId">
        /// Required. ID of the photo.
        /// </param>
        /// <param name="callSettings">
        /// If not null, applies overrides to this RPC call.
        /// </param>
        /// <returns>
        /// The RPC response.
        /// </returns>
        public virtual void DeletePhoto(
            string photoId,
            CallSettings callSettings = null) => DeletePhoto(
                new DeletePhotoRequest
                {
                    PhotoId = GaxPreconditions.CheckNotNullOrEmpty(photoId, nameof(photoId)),
                },
                callSettings);

        /// <summary>
        /// Deletes a photo and its metadata.
        ///
        /// This method returns the following error codes:
        ///
        /// * `PERMISSION_DENIED` if the requesting user did not create the requested
        /// photo.
        /// * `NOT_FOUND` if the photo ID does not exist.
        /// </summary>
        /// <param name="request">
        /// The request object containing all of the parameters for the API call.
        /// </param>
        /// <param name="callSettings">
        /// If not null, applies overrides to this RPC call.
        /// </param>
        /// <returns>
        /// A Task containing the RPC response.
        /// </returns>
        public virtual Task DeletePhotoAsync(
            DeletePhotoRequest request,
            CallSettings callSettings = null)
        {
            throw new NotImplementedException();
        }

        /// <summary>
        /// Deletes a photo and its metadata.
        ///
        /// This method returns the following error codes:
        ///
        /// * `PERMISSION_DENIED` if the requesting user did not create the requested
        /// photo.
        /// * `NOT_FOUND` if the photo ID does not exist.
        /// </summary>
        /// <param name="request">
        /// The request object containing all of the parameters for the API call.
        /// </param>
        /// <param name="callSettings">
        /// If not null, applies overrides to this RPC call.
        /// </param>
        /// <returns>
        /// The RPC response.
        /// </returns>
        public virtual void DeletePhoto(
            DeletePhotoRequest request,
            CallSettings callSettings = null)
        {
            throw new NotImplementedException();
        }

        /// <summary>
        /// Deletes a list of photos and their metadata.
        ///
        /// Note that if `photos.batchDelete` fails, either critical fields
        /// are missing or there was an authentication error.
        /// Even if `photos.batchDelete` succeeds, there may have been
        /// failures for single photos in the batch. These failures will be specified
        /// in `BatchDeletePhotosResponse.status`.
        /// See `photo.update` for specific failures that will occur per photo.
        /// </summary>
        /// <param name="photoIds">
        /// Required. List of delete photo requests.
        /// </param>
        /// <param name="callSettings">
        /// If not null, applies overrides to this RPC call.
        /// </param>
        /// <returns>
        /// A Task containing the RPC response.
        /// </returns>
        public virtual Task<BatchDeletePhotosResponse> BatchDeletePhotosAsync(
            IEnumerable<string> photoIds,
            CallSettings callSettings = null) => BatchDeletePhotosAsync(
                new BatchDeletePhotosRequest
                {
                    PhotoIds = { GaxPreconditions.CheckNotNull(photoIds, nameof(photoIds)) },
                },
                callSettings);

        /// <summary>
        /// Deletes a list of photos and their metadata.
        ///
        /// Note that if `photos.batchDelete` fails, either critical fields
        /// are missing or there was an authentication error.
        /// Even if `photos.batchDelete` succeeds, there may have been
        /// failures for single photos in the batch. These failures will be specified
        /// in `BatchDeletePhotosResponse.status`.
        /// See `photo.update` for specific failures that will occur per photo.
        /// </summary>
        /// <param name="photoIds">
        /// Required. List of delete photo requests.
        /// </param>
        /// <param name="cancellationToken">
        /// A <see cref="CancellationToken"/> to use for this RPC.
        /// </param>
        /// <returns>
        /// A Task containing the RPC response.
        /// </returns>
        public virtual Task<BatchDeletePhotosResponse> BatchDeletePhotosAsync(
            IEnumerable<string> photoIds,
            CancellationToken cancellationToken) => BatchDeletePhotosAsync(
                photoIds,
                CallSettings.FromCancellationToken(cancellationToken));

        /// <summary>
        /// Deletes a list of photos and their metadata.
        ///
        /// Note that if `photos.batchDelete` fails, either critical fields
        /// are missing or there was an authentication error.
        /// Even if `photos.batchDelete` succeeds, there may have been
        /// failures for single photos in the batch. These failures will be specified
        /// in `BatchDeletePhotosResponse.status`.
        /// See `photo.update` for specific failures that will occur per photo.
        /// </summary>
        /// <param name="photoIds">
        /// Required. List of delete photo requests.
        /// </param>
        /// <param name="callSettings">
        /// If not null, applies overrides to this RPC call.
        /// </param>
        /// <returns>
        /// The RPC response.
        /// </returns>
        public virtual BatchDeletePhotosResponse BatchDeletePhotos(
            IEnumerable<string> photoIds,
            CallSettings callSettings = null) => BatchDeletePhotos(
                new BatchDeletePhotosRequest
                {
                    PhotoIds = { GaxPreconditions.CheckNotNull(photoIds, nameof(photoIds)) },
                },
                callSettings);

        /// <summary>
        /// Deletes a list of photos and their metadata.
        ///
        /// Note that if `photos.batchDelete` fails, either critical fields
        /// are missing or there was an authentication error.
        /// Even if `photos.batchDelete` succeeds, there may have been
        /// failures for single photos in the batch. These failures will be specified
        /// in `BatchDeletePhotosResponse.status`.
        /// See `photo.update` for specific failures that will occur per photo.
        /// </summary>
        /// <param name="request">
        /// The request object containing all of the parameters for the API call.
        /// </param>
        /// <param name="callSettings">
        /// If not null, applies overrides to this RPC call.
        /// </param>
        /// <returns>
        /// A Task containing the RPC response.
        /// </returns>
        public virtual Task<BatchDeletePhotosResponse> BatchDeletePhotosAsync(
            BatchDeletePhotosRequest request,
            CallSettings callSettings = null)
        {
            throw new NotImplementedException();
        }

        /// <summary>
        /// Deletes a list of photos and their metadata.
        ///
        /// Note that if `photos.batchDelete` fails, either critical fields
        /// are missing or there was an authentication error.
        /// Even if `photos.batchDelete` succeeds, there may have been
        /// failures for single photos in the batch. These failures will be specified
        /// in `BatchDeletePhotosResponse.status`.
        /// See `photo.update` for specific failures that will occur per photo.
        /// </summary>
        /// <param name="request">
        /// The request object containing all of the parameters for the API call.
        /// </param>
        /// <param name="callSettings">
        /// If not null, applies overrides to this RPC call.
        /// </param>
        /// <returns>
        /// The RPC response.
        /// </returns>
        public virtual BatchDeletePhotosResponse BatchDeletePhotos(
            BatchDeletePhotosRequest request,
            CallSettings callSettings = null)
        {
            throw new NotImplementedException();
        }

    }

    /// <summary>
    /// StreetViewPublishService client wrapper implementation, for convenient use.
    /// </summary>
    public sealed partial class StreetViewPublishServiceClientImpl : StreetViewPublishServiceClient
    {
        private readonly ApiCall<Empty, UploadRef> _callStartUpload;
        private readonly ApiCall<CreatePhotoRequest, Photo> _callCreatePhoto;
        private readonly ApiCall<GetPhotoRequest, Photo> _callGetPhoto;
        private readonly ApiCall<BatchGetPhotosRequest, BatchGetPhotosResponse> _callBatchGetPhotos;
        private readonly ApiCall<ListPhotosRequest, ListPhotosResponse> _callListPhotos;
        private readonly ApiCall<UpdatePhotoRequest, Photo> _callUpdatePhoto;
        private readonly ApiCall<BatchUpdatePhotosRequest, BatchUpdatePhotosResponse> _callBatchUpdatePhotos;
        private readonly ApiCall<DeletePhotoRequest, Empty> _callDeletePhoto;
        private readonly ApiCall<BatchDeletePhotosRequest, BatchDeletePhotosResponse> _callBatchDeletePhotos;

        /// <summary>
        /// Constructs a client wrapper for the StreetViewPublishService service, with the specified gRPC client and settings.
        /// </summary>
        /// <param name="grpcClient">The underlying gRPC client.</param>
        /// <param name="settings">The base <see cref="StreetViewPublishServiceSettings"/> used within this client </param>
        public StreetViewPublishServiceClientImpl(StreetViewPublishService.StreetViewPublishServiceClient grpcClient, StreetViewPublishServiceSettings settings)
        {
            this.GrpcClient = grpcClient;
            StreetViewPublishServiceSettings effectiveSettings = settings ?? StreetViewPublishServiceSettings.GetDefault();
            ClientHelper clientHelper = new ClientHelper(effectiveSettings);
            _callStartUpload = clientHelper.BuildApiCall<Empty, UploadRef>(
                GrpcClient.StartUploadAsync, GrpcClient.StartUpload, effectiveSettings.StartUploadSettings);
            _callCreatePhoto = clientHelper.BuildApiCall<CreatePhotoRequest, Photo>(
                GrpcClient.CreatePhotoAsync, GrpcClient.CreatePhoto, effectiveSettings.CreatePhotoSettings);
            _callGetPhoto = clientHelper.BuildApiCall<GetPhotoRequest, Photo>(
                GrpcClient.GetPhotoAsync, GrpcClient.GetPhoto, effectiveSettings.GetPhotoSettings);
            _callBatchGetPhotos = clientHelper.BuildApiCall<BatchGetPhotosRequest, BatchGetPhotosResponse>(
                GrpcClient.BatchGetPhotosAsync, GrpcClient.BatchGetPhotos, effectiveSettings.BatchGetPhotosSettings);
            _callListPhotos = clientHelper.BuildApiCall<ListPhotosRequest, ListPhotosResponse>(
                GrpcClient.ListPhotosAsync, GrpcClient.ListPhotos, effectiveSettings.ListPhotosSettings);
            _callUpdatePhoto = clientHelper.BuildApiCall<UpdatePhotoRequest, Photo>(
                GrpcClient.UpdatePhotoAsync, GrpcClient.UpdatePhoto, effectiveSettings.UpdatePhotoSettings);
            _callBatchUpdatePhotos = clientHelper.BuildApiCall<BatchUpdatePhotosRequest, BatchUpdatePhotosResponse>(
                GrpcClient.BatchUpdatePhotosAsync, GrpcClient.BatchUpdatePhotos, effectiveSettings.BatchUpdatePhotosSettings);
            _callDeletePhoto = clientHelper.BuildApiCall<DeletePhotoRequest, Empty>(
                GrpcClient.DeletePhotoAsync, GrpcClient.DeletePhoto, effectiveSettings.DeletePhotoSettings);
            _callBatchDeletePhotos = clientHelper.BuildApiCall<BatchDeletePhotosRequest, BatchDeletePhotosResponse>(
                GrpcClient.BatchDeletePhotosAsync, GrpcClient.BatchDeletePhotos, effectiveSettings.BatchDeletePhotosSettings);
            OnConstruction(grpcClient, effectiveSettings, clientHelper);
        }

        partial void OnConstruction(StreetViewPublishService.StreetViewPublishServiceClient grpcClient, StreetViewPublishServiceSettings effectiveSettings, ClientHelper clientHelper);

        /// <summary>
        /// The underlying gRPC StreetViewPublishService client.
        /// </summary>
        public override StreetViewPublishService.StreetViewPublishServiceClient GrpcClient { get; }

        // Partial modifier methods contain '_' to ensure no name conflicts with RPC methods.
        partial void Modify_Empty(ref Empty request, ref CallSettings settings);
        partial void Modify_CreatePhotoRequest(ref CreatePhotoRequest request, ref CallSettings settings);
        partial void Modify_GetPhotoRequest(ref GetPhotoRequest request, ref CallSettings settings);
        partial void Modify_BatchGetPhotosRequest(ref BatchGetPhotosRequest request, ref CallSettings settings);
        partial void Modify_ListPhotosRequest(ref ListPhotosRequest request, ref CallSettings settings);
        partial void Modify_UpdatePhotoRequest(ref UpdatePhotoRequest request, ref CallSettings settings);
        partial void Modify_BatchUpdatePhotosRequest(ref BatchUpdatePhotosRequest request, ref CallSettings settings);
        partial void Modify_DeletePhotoRequest(ref DeletePhotoRequest request, ref CallSettings settings);
        partial void Modify_BatchDeletePhotosRequest(ref BatchDeletePhotosRequest request, ref CallSettings settings);

        /// <summary>
        /// Creates an upload session to start uploading photo data. The upload URL of
        /// the returned `UploadRef` is used to upload the data for the photo.
        ///
        /// After the upload is complete, the `UploadRef` is used with
        /// `StreetViewPublishService:CreatePhoto()` to create the `Photo` object
        /// entry.
        /// </summary>
        /// <param name="request">
        /// The request object containing all of the parameters for the API call.
        /// </param>
        /// <param name="callSettings">
        /// If not null, applies overrides to this RPC call.
        /// </param>
        /// <returns>
        /// A Task containing the RPC response.
        /// </returns>
        public override Task<UploadRef> StartUploadAsync(
            Empty request,
            CallSettings callSettings = null)
        {
            Modify_Empty(ref request, ref callSettings);
            return _callStartUpload.Async(request, callSettings);
        }

        /// <summary>
        /// Creates an upload session to start uploading photo data. The upload URL of
        /// the returned `UploadRef` is used to upload the data for the photo.
        ///
        /// After the upload is complete, the `UploadRef` is used with
        /// `StreetViewPublishService:CreatePhoto()` to create the `Photo` object
        /// entry.
        /// </summary>
        /// <param name="request">
        /// The request object containing all of the parameters for the API call.
        /// </param>
        /// <param name="callSettings">
        /// If not null, applies overrides to this RPC call.
        /// </param>
        /// <returns>
        /// The RPC response.
        /// </returns>
        public override UploadRef StartUpload(
            Empty request,
            CallSettings callSettings = null)
        {
            Modify_Empty(ref request, ref callSettings);
            return _callStartUpload.Sync(request, callSettings);
        }

        /// <summary>
        /// After the client finishes uploading the photo with the returned
        /// `UploadRef`, `photo.create` publishes the uploaded photo to Street View on
        /// Google Maps.
        ///
        /// This method returns the following error codes:
        ///
        /// * `INVALID_ARGUMENT` if the request is malformed.
        /// * `NOT_FOUND` if the upload reference does not exist.
        /// </summary>
        /// <param name="request">
        /// The request object containing all of the parameters for the API call.
        /// </param>
        /// <param name="callSettings">
        /// If not null, applies overrides to this RPC call.
        /// </param>
        /// <returns>
        /// A Task containing the RPC response.
        /// </returns>
        public override Task<Photo> CreatePhotoAsync(
            CreatePhotoRequest request,
            CallSettings callSettings = null)
        {
            Modify_CreatePhotoRequest(ref request, ref callSettings);
            return _callCreatePhoto.Async(request, callSettings);
        }

        /// <summary>
        /// After the client finishes uploading the photo with the returned
        /// `UploadRef`, `photo.create` publishes the uploaded photo to Street View on
        /// Google Maps.
        ///
        /// This method returns the following error codes:
        ///
        /// * `INVALID_ARGUMENT` if the request is malformed.
        /// * `NOT_FOUND` if the upload reference does not exist.
        /// </summary>
        /// <param name="request">
        /// The request object containing all of the parameters for the API call.
        /// </param>
        /// <param name="callSettings">
        /// If not null, applies overrides to this RPC call.
        /// </param>
        /// <returns>
        /// The RPC response.
        /// </returns>
        public override Photo CreatePhoto(
            CreatePhotoRequest request,
            CallSettings callSettings = null)
        {
            Modify_CreatePhotoRequest(ref request, ref callSettings);
            return _callCreatePhoto.Sync(request, callSettings);
        }

        /// <summary>
        /// Gets the metadata of the specified `Photo`.
        ///
        /// This method returns the following error codes:
        ///
        /// * `PERMISSION_DENIED` if the requesting user did not create the requested
        /// photo.
        /// * `NOT_FOUND` if the requested photo does not exist.
        /// </summary>
        /// <param name="request">
        /// The request object containing all of the parameters for the API call.
        /// </param>
        /// <param name="callSettings">
        /// If not null, applies overrides to this RPC call.
        /// </param>
        /// <returns>
        /// A Task containing the RPC response.
        /// </returns>
        public override Task<Photo> GetPhotoAsync(
            GetPhotoRequest request,
            CallSettings callSettings = null)
        {
            Modify_GetPhotoRequest(ref request, ref callSettings);
            return _callGetPhoto.Async(request, callSettings);
        }

        /// <summary>
        /// Gets the metadata of the specified `Photo`.
        ///
        /// This method returns the following error codes:
        ///
        /// * `PERMISSION_DENIED` if the requesting user did not create the requested
        /// photo.
        /// * `NOT_FOUND` if the requested photo does not exist.
        /// </summary>
        /// <param name="request">
        /// The request object containing all of the parameters for the API call.
        /// </param>
        /// <param name="callSettings">
        /// If not null, applies overrides to this RPC call.
        /// </param>
        /// <returns>
        /// The RPC response.
        /// </returns>
        public override Photo GetPhoto(
            GetPhotoRequest request,
            CallSettings callSettings = null)
        {
            Modify_GetPhotoRequest(ref request, ref callSettings);
            return _callGetPhoto.Sync(request, callSettings);
        }

        /// <summary>
        /// Gets the metadata of the specified `Photo` batch.
        ///
        /// Note that if `photos.batchGet` fails, either critical fields are
        /// missing or there was an authentication error.
        /// Even if `photos.batchGet` succeeds, there may have been failures
        /// for single photos in the batch. These failures will be specified in
        /// `BatchGetPhotosResponse.results.status`.
        /// See `photo.get` for specific failures that will occur per photo.
        /// </summary>
        /// <param name="request">
        /// The request object containing all of the parameters for the API call.
        /// </param>
        /// <param name="callSettings">
        /// If not null, applies overrides to this RPC call.
        /// </param>
        /// <returns>
        /// A Task containing the RPC response.
        /// </returns>
        public override Task<BatchGetPhotosResponse> BatchGetPhotosAsync(
            BatchGetPhotosRequest request,
            CallSettings callSettings = null)
        {
            Modify_BatchGetPhotosRequest(ref request, ref callSettings);
            return _callBatchGetPhotos.Async(request, callSettings);
        }

        /// <summary>
        /// Gets the metadata of the specified `Photo` batch.
        ///
        /// Note that if `photos.batchGet` fails, either critical fields are
        /// missing or there was an authentication error.
        /// Even if `photos.batchGet` succeeds, there may have been failures
        /// for single photos in the batch. These failures will be specified in
        /// `BatchGetPhotosResponse.results.status`.
        /// See `photo.get` for specific failures that will occur per photo.
        /// </summary>
        /// <param name="request">
        /// The request object containing all of the parameters for the API call.
        /// </param>
        /// <param name="callSettings">
        /// If not null, applies overrides to this RPC call.
        /// </param>
        /// <returns>
        /// The RPC response.
        /// </returns>
        public override BatchGetPhotosResponse BatchGetPhotos(
            BatchGetPhotosRequest request,
            CallSettings callSettings = null)
        {
            Modify_BatchGetPhotosRequest(ref request, ref callSettings);
            return _callBatchGetPhotos.Sync(request, callSettings);
        }

        /// <summary>
        /// Lists all the photos that belong to the user.
        /// </summary>
        /// <param name="request">
        /// The request object containing all of the parameters for the API call.
        /// </param>
        /// <param name="callSettings">
        /// If not null, applies overrides to this RPC call.
        /// </param>
        /// <returns>
        /// A pageable asynchronous sequence of <see cref="Photo"/> resources.
        /// </returns>
        public override PagedAsyncEnumerable<ListPhotosResponse, Photo> ListPhotosAsync(
            ListPhotosRequest request,
            CallSettings callSettings = null)
        {
            Modify_ListPhotosRequest(ref request, ref callSettings);
            return new GrpcPagedAsyncEnumerable<ListPhotosRequest, ListPhotosResponse, Photo>(_callListPhotos, request, callSettings);
        }

        /// <summary>
        /// Lists all the photos that belong to the user.
        /// </summary>
        /// <param name="request">
        /// The request object containing all of the parameters for the API call.
        /// </param>
        /// <param name="callSettings">
        /// If not null, applies overrides to this RPC call.
        /// </param>
        /// <returns>
        /// A pageable sequence of <see cref="Photo"/> resources.
        /// </returns>
        public override PagedEnumerable<ListPhotosResponse, Photo> ListPhotos(
            ListPhotosRequest request,
            CallSettings callSettings = null)
        {
            Modify_ListPhotosRequest(ref request, ref callSettings);
            return new GrpcPagedEnumerable<ListPhotosRequest, ListPhotosResponse, Photo>(_callListPhotos, request, callSettings);
        }

        /// <summary>
        /// Updates the metadata of a photo, such as pose, place association, etc.
        /// Changing the pixels of a photo is not supported.
        ///
        /// This method returns the following error codes:
        ///
        /// * `PERMISSION_DENIED` if the requesting user did not create the requested
        /// photo.
        /// * `INVALID_ARGUMENT` if the request is malformed.
        /// * `NOT_FOUND` if the photo ID does not exist.
        /// </summary>
        /// <param name="request">
        /// The request object containing all of the parameters for the API call.
        /// </param>
        /// <param name="callSettings">
        /// If not null, applies overrides to this RPC call.
        /// </param>
        /// <returns>
        /// A Task containing the RPC response.
        /// </returns>
        public override Task<Photo> UpdatePhotoAsync(
            UpdatePhotoRequest request,
            CallSettings callSettings = null)
        {
            Modify_UpdatePhotoRequest(ref request, ref callSettings);
            return _callUpdatePhoto.Async(request, callSettings);
        }

        /// <summary>
        /// Updates the metadata of a photo, such as pose, place association, etc.
        /// Changing the pixels of a photo is not supported.
        ///
        /// This method returns the following error codes:
        ///
        /// * `PERMISSION_DENIED` if the requesting user did not create the requested
        /// photo.
        /// * `INVALID_ARGUMENT` if the request is malformed.
        /// * `NOT_FOUND` if the photo ID does not exist.
        /// </summary>
        /// <param name="request">
        /// The request object containing all of the parameters for the API call.
        /// </param>
        /// <param name="callSettings">
        /// If not null, applies overrides to this RPC call.
        /// </param>
        /// <returns>
        /// The RPC response.
        /// </returns>
        public override Photo UpdatePhoto(
            UpdatePhotoRequest request,
            CallSettings callSettings = null)
        {
            Modify_UpdatePhotoRequest(ref request, ref callSettings);
            return _callUpdatePhoto.Sync(request, callSettings);
        }

        /// <summary>
        /// Updates the metadata of photos, such as pose, place association, etc.
        /// Changing the pixels of a photo is not supported.
        ///
        /// Note that if `photos.batchUpdate` fails, either critical fields
        /// are missing or there was an authentication error.
        /// Even if `photos.batchUpdate` succeeds, there may have been
        /// failures for single photos in the batch. These failures will be specified
        /// in `BatchUpdatePhotosResponse.results.status`.
        /// See `UpdatePhoto` for specific failures that will occur per photo.
        /// </summary>
        /// <param name="request">
        /// The request object containing all of the parameters for the API call.
        /// </param>
        /// <param name="callSettings">
        /// If not null, applies overrides to this RPC call.
        /// </param>
        /// <returns>
        /// A Task containing the RPC response.
        /// </returns>
        public override Task<BatchUpdatePhotosResponse> BatchUpdatePhotosAsync(
            BatchUpdatePhotosRequest request,
            CallSettings callSettings = null)
        {
            Modify_BatchUpdatePhotosRequest(ref request, ref callSettings);
            return _callBatchUpdatePhotos.Async(request, callSettings);
        }

        /// <summary>
        /// Updates the metadata of photos, such as pose, place association, etc.
        /// Changing the pixels of a photo is not supported.
        ///
        /// Note that if `photos.batchUpdate` fails, either critical fields
        /// are missing or there was an authentication error.
        /// Even if `photos.batchUpdate` succeeds, there may have been
        /// failures for single photos in the batch. These failures will be specified
        /// in `BatchUpdatePhotosResponse.results.status`.
        /// See `UpdatePhoto` for specific failures that will occur per photo.
        /// </summary>
        /// <param name="request">
        /// The request object containing all of the parameters for the API call.
        /// </param>
        /// <param name="callSettings">
        /// If not null, applies overrides to this RPC call.
        /// </param>
        /// <returns>
        /// The RPC response.
        /// </returns>
        public override BatchUpdatePhotosResponse BatchUpdatePhotos(
            BatchUpdatePhotosRequest request,
            CallSettings callSettings = null)
        {
            Modify_BatchUpdatePhotosRequest(ref request, ref callSettings);
            return _callBatchUpdatePhotos.Sync(request, callSettings);
        }

        /// <summary>
        /// Deletes a photo and its metadata.
        ///
        /// This method returns the following error codes:
        ///
        /// * `PERMISSION_DENIED` if the requesting user did not create the requested
        /// photo.
        /// * `NOT_FOUND` if the photo ID does not exist.
        /// </summary>
        /// <param name="request">
        /// The request object containing all of the parameters for the API call.
        /// </param>
        /// <param name="callSettings">
        /// If not null, applies overrides to this RPC call.
        /// </param>
        /// <returns>
        /// A Task containing the RPC response.
        /// </returns>
        public override Task DeletePhotoAsync(
            DeletePhotoRequest request,
            CallSettings callSettings = null)
        {
            Modify_DeletePhotoRequest(ref request, ref callSettings);
            return _callDeletePhoto.Async(request, callSettings);
        }

        /// <summary>
        /// Deletes a photo and its metadata.
        ///
        /// This method returns the following error codes:
        ///
        /// * `PERMISSION_DENIED` if the requesting user did not create the requested
        /// photo.
        /// * `NOT_FOUND` if the photo ID does not exist.
        /// </summary>
        /// <param name="request">
        /// The request object containing all of the parameters for the API call.
        /// </param>
        /// <param name="callSettings">
        /// If not null, applies overrides to this RPC call.
        /// </param>
        /// <returns>
        /// The RPC response.
        /// </returns>
        public override void DeletePhoto(
            DeletePhotoRequest request,
            CallSettings callSettings = null)
        {
            Modify_DeletePhotoRequest(ref request, ref callSettings);
            _callDeletePhoto.Sync(request, callSettings);
        }

        /// <summary>
        /// Deletes a list of photos and their metadata.
        ///
        /// Note that if `photos.batchDelete` fails, either critical fields
        /// are missing or there was an authentication error.
        /// Even if `photos.batchDelete` succeeds, there may have been
        /// failures for single photos in the batch. These failures will be specified
        /// in `BatchDeletePhotosResponse.status`.
        /// See `photo.update` for specific failures that will occur per photo.
        /// </summary>
        /// <param name="request">
        /// The request object containing all of the parameters for the API call.
        /// </param>
        /// <param name="callSettings">
        /// If not null, applies overrides to this RPC call.
        /// </param>
        /// <returns>
        /// A Task containing the RPC response.
        /// </returns>
        public override Task<BatchDeletePhotosResponse> BatchDeletePhotosAsync(
            BatchDeletePhotosRequest request,
            CallSettings callSettings = null)
        {
            Modify_BatchDeletePhotosRequest(ref request, ref callSettings);
            return _callBatchDeletePhotos.Async(request, callSettings);
        }

        /// <summary>
        /// Deletes a list of photos and their metadata.
        ///
        /// Note that if `photos.batchDelete` fails, either critical fields
        /// are missing or there was an authentication error.
        /// Even if `photos.batchDelete` succeeds, there may have been
        /// failures for single photos in the batch. These failures will be specified
        /// in `BatchDeletePhotosResponse.status`.
        /// See `photo.update` for specific failures that will occur per photo.
        /// </summary>
        /// <param name="request">
        /// The request object containing all of the parameters for the API call.
        /// </param>
        /// <param name="callSettings">
        /// If not null, applies overrides to this RPC call.
        /// </param>
        /// <returns>
        /// The RPC response.
        /// </returns>
        public override BatchDeletePhotosResponse BatchDeletePhotos(
            BatchDeletePhotosRequest request,
            CallSettings callSettings = null)
        {
            Modify_BatchDeletePhotosRequest(ref request, ref callSettings);
            return _callBatchDeletePhotos.Sync(request, callSettings);
        }

    }

    // Partial classes to enable page-streaming

    public partial class ListPhotosRequest : IPageRequest { }
    public partial class ListPhotosResponse : IPageResponse<Photo>
    {
        /// <summary>
        /// Returns an enumerator that iterates through the resources in this response.
        /// </summary>
        public IEnumerator<Photo> GetEnumerator() => Photos.GetEnumerator();

        /// <inheritdoc/>
        IEnumerator IEnumerable.GetEnumerator() => GetEnumerator();
    }

}
