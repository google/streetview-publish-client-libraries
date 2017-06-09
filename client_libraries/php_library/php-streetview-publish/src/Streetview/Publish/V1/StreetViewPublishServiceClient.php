<?php
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

/*
 * GENERATED CODE WARNING
 * This file was generated from the file
 * https://github.com/google/googleapis/blob/master/google/streetview/publish/v1/streetview_publish.proto
 * and updates to that file get reflected here through a refresh process.
 *
 * EXPERIMENTAL: this client library class has not yet been declared beta. This class may change
 * more frequently than those which have been declared beta or 1.0, including changes which break
 * backwards compatibility.
 */

namespace Google\Streetview\Publish\V1;

use Google\GAX\AgentHeaderDescriptor;
use Google\GAX\ApiCallable;
use Google\GAX\CallSettings;
use Google\GAX\GrpcConstants;
use Google\GAX\GrpcCredentialsHelper;
use Google\GAX\PageStreamingDescriptor;
use google\protobuf\EmptyC;
use google\protobuf\FieldMask;
use google\streetview\publish\v1\BatchDeletePhotosRequest;
use google\streetview\publish\v1\BatchGetPhotosRequest;
use google\streetview\publish\v1\BatchUpdatePhotosRequest;
use google\streetview\publish\v1\CreatePhotoRequest;
use google\streetview\publish\v1\DeletePhotoRequest;
use google\streetview\publish\v1\GetPhotoRequest;
use google\streetview\publish\v1\ListPhotosRequest;
use google\streetview\publish\v1\Photo;
use google\streetview\publish\v1\PhotoView;
use google\streetview\publish\v1\StreetViewPublishServiceGrpcClient;
use google\streetview\publish\v1\UpdatePhotoRequest;

/**
 * Service Description: Publishes and connects user-contributed photos on Street View.
 *
 * EXPERIMENTAL: this client library class has not yet been declared beta. This class may change
 * more frequently than those which have been declared beta or 1.0, including changes which break
 * backwards compatibility.
 *
 * This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * ```
 * try {
 *     $streetViewPublishServiceClient = new StreetViewPublishServiceClient();
 *
 *     $response = $streetViewPublishServiceClient->startUpload();
 * } finally {
 *     $streetViewPublishServiceClient->close();
 * }
 * ```
 *
 * Many parameters require resource names to be formatted in a particular way. To assist
 * with these names, this class includes a format method for each type of name, and additionally
 * a parse method to extract the individual identifiers contained within names that are
 * returned.
 */
class StreetViewPublishServiceClient
{
    /**
     * The default address of the service.
     */
    const SERVICE_ADDRESS = 'streetviewpublish.googleapis.com';

    /**
     * The default port of the service.
     */
    const DEFAULT_SERVICE_PORT = 443;

    /**
     * The default timeout for non-retrying methods.
     */
    const DEFAULT_TIMEOUT_MILLIS = 30000;

    /**
     * The name of the code generator, to be included in the agent header.
     */
    const CODEGEN_NAME = 'gapic';

    /**
     * The code generator version, to be included in the agent header.
     */
    const CODEGEN_VERSION = '0.0.5';

    private $grpcCredentialsHelper;
    private $streetViewPublishServiceStub;
    private $scopes;
    private $defaultCallSettings;
    private $descriptors;

    private static function getPageStreamingDescriptors()
    {
        $listPhotosPageStreamingDescriptor =
                new PageStreamingDescriptor([
                    'requestPageTokenField' => 'page_token',
                    'requestPageSizeField' => 'page_size',
                    'responsePageTokenField' => 'next_page_token',
                    'resourceField' => 'photos',
                ]);

        $pageStreamingDescriptors = [
            'listPhotos' => $listPhotosPageStreamingDescriptor,
        ];

        return $pageStreamingDescriptors;
    }

    private static function getGapicVersion()
    {
        if (file_exists(__DIR__.'/../VERSION')) {
            return trim(file_get_contents(__DIR__.'/../VERSION'));
        } elseif (class_exists('\Google\Cloud\ServiceBuilder')) {
            return \Google\Cloud\ServiceBuilder::VERSION;
        } else {
            return;
        }
    }

    // TODO(garrettjones): add channel (when supported in gRPC)
    /**
     * Constructor.
     *
     * @param array $options {
     *                       Optional. Options for configuring the service API wrapper.
     *
     *     @type string $serviceAddress The domain name of the API remote host.
     *                                  Default 'streetviewpublish.googleapis.com'.
     *     @type mixed $port The port on which to connect to the remote host. Default 443.
     *     @type \Grpc\ChannelCredentials $sslCreds
     *           A `ChannelCredentials` for use with an SSL-enabled channel.
     *           Default: a credentials object returned from
     *           \Grpc\ChannelCredentials::createSsl()
     *     @type array $scopes A string array of scopes to use when acquiring credentials.
     *                         Default the scopes for the Street View Publish API.
     *     @type array $retryingOverride
     *           An associative array of string => RetryOptions, where the keys
     *           are method names (e.g. 'createFoo'), that overrides default retrying
     *           settings. A value of null indicates that the method in question should
     *           not retry.
     *     @type int $timeoutMillis The timeout in milliseconds to use for calls
     *                              that don't use retries. For calls that use retries,
     *                              set the timeout in RetryOptions.
     *                              Default: 30000 (30 seconds)
     *     @type \Google\Auth\CredentialsLoader $credentialsLoader
     *                              A CredentialsLoader object created using the
     *                              Google\Auth library.
     * }
     */
    public function __construct($options = [])
    {
        $defaultOptions = [
            'serviceAddress' => self::SERVICE_ADDRESS,
            'port' => self::DEFAULT_SERVICE_PORT,
            'scopes' => [
                'https://www.googleapis.com/auth/streetviewpublish',
            ],
            'retryingOverride' => null,
            'timeoutMillis' => self::DEFAULT_TIMEOUT_MILLIS,
            'libName' => null,
            'libVersion' => null,
        ];
        $options = array_merge($defaultOptions, $options);

        $gapicVersion = $options['libVersion'] ?: self::getGapicVersion();

        $headerDescriptor = new AgentHeaderDescriptor([
            'libName' => $options['libName'],
            'libVersion' => $options['libVersion'],
            'gapicVersion' => $gapicVersion,
        ]);

        $defaultDescriptors = ['headerDescriptor' => $headerDescriptor];
        $this->descriptors = [
            'startUpload' => $defaultDescriptors,
            'createPhoto' => $defaultDescriptors,
            'getPhoto' => $defaultDescriptors,
            'batchGetPhotos' => $defaultDescriptors,
            'listPhotos' => $defaultDescriptors,
            'updatePhoto' => $defaultDescriptors,
            'batchUpdatePhotos' => $defaultDescriptors,
            'deletePhoto' => $defaultDescriptors,
            'batchDeletePhotos' => $defaultDescriptors,
        ];
        $pageStreamingDescriptors = self::getPageStreamingDescriptors();
        foreach ($pageStreamingDescriptors as $method => $pageStreamingDescriptor) {
            $this->descriptors[$method]['pageStreamingDescriptor'] = $pageStreamingDescriptor;
        }

        $clientConfigJsonString = file_get_contents(__DIR__.'/resources/street_view_publish_service_client_config.json');
        $clientConfig = json_decode($clientConfigJsonString, true);
        $this->defaultCallSettings =
                CallSettings::load(
                    'google.streetview.publish.v1.StreetViewPublishService',
                    $clientConfig,
                    $options['retryingOverride'],
                    GrpcConstants::getStatusCodeNames(),
                    $options['timeoutMillis']
                );

        $this->scopes = $options['scopes'];

        $createStubOptions = [];
        if (array_key_exists('sslCreds', $options)) {
            $createStubOptions['sslCreds'] = $options['sslCreds'];
        }
        $grpcCredentialsHelperOptions = array_diff_key($options, $defaultOptions);
        $this->grpcCredentialsHelper = new GrpcCredentialsHelper($this->scopes, $grpcCredentialsHelperOptions);

        $createStreetViewPublishServiceStubFunction = function ($hostname, $opts) {
            return new StreetViewPublishServiceGrpcClient($hostname, $opts);
        };
        if (array_key_exists('createStreetViewPublishServiceStubFunction', $options)) {
            $createStreetViewPublishServiceStubFunction = $options['createStreetViewPublishServiceStubFunction'];
        }
        $this->streetViewPublishServiceStub = $this->grpcCredentialsHelper->createStub(
            $createStreetViewPublishServiceStubFunction,
            $options['serviceAddress'],
            $options['port'],
            $createStubOptions
        );
    }

    /**
     * Creates an upload session to start uploading photo data. The upload URL of
     * the returned `UploadRef` is used to upload the data for the photo.
     *
     * After the upload is complete, the `UploadRef` is used with
     * `StreetViewPublishService:CreatePhoto()` to create the `Photo` object
     * entry.
     *
     * Sample code:
     * ```
     * try {
     *     $streetViewPublishServiceClient = new StreetViewPublishServiceClient();
     *
     *     $response = $streetViewPublishServiceClient->startUpload();
     * } finally {
     *     $streetViewPublishServiceClient->close();
     * }
     * ```
     *
     * @param array $optionalArgs {
     *                            Optional.
     * @type \Google\GAX\RetrySettings $retrySettings
     *                            Retry settings to use for this call. If present, then
     *                            $timeoutMillis is ignored.
     * @type int $timeoutMillis
     *                            Timeout to use for this call. Only used if $retrySettings
     *                            is not set.
     *                            }
     *
     * @return \google\streetview\publish\v1\UploadRef
     *
     * @throws \Google\GAX\ApiException if the remote call fails
     */
    public function startUpload($optionalArgs = [])
    {
        $request = new EmptyC();

        $mergedSettings = $this->defaultCallSettings['startUpload']->merge(
            new CallSettings($optionalArgs)
        );
        $callable = ApiCallable::createApiCall(
            $this->streetViewPublishServiceStub,
            'StartUpload',
            $mergedSettings,
            $this->descriptors['startUpload']
        );

        return $callable(
            $request,
            [],
            ['call_credentials_callback' => $this->createCredentialsCallback()]);
    }

    /**
     * After the client finishes uploading the photo with the returned
     * `UploadRef`, `photo.create` publishes the uploaded photo to Street View on
     * Google Maps.
     *
     * This method returns the following error codes:
     *
     * &#42; `INVALID_ARGUMENT` if the request is malformed.
     * &#42; `NOT_FOUND` if the upload reference does not exist.
     *
     * Sample code:
     * ```
     * try {
     *     $streetViewPublishServiceClient = new StreetViewPublishServiceClient();
     *     $photo = new Photo();
     *     $response = $streetViewPublishServiceClient->createPhoto($photo);
     * } finally {
     *     $streetViewPublishServiceClient->close();
     * }
     * ```
     *
     * @param Photo $photo        Required. Photo to create.
     * @param array $optionalArgs {
     *                            Optional.
     * @type \Google\GAX\RetrySettings $retrySettings
     *                            Retry settings to use for this call. If present, then
     *                            $timeoutMillis is ignored.
     * @type int $timeoutMillis
     *                            Timeout to use for this call. Only used if $retrySettings
     *                            is not set.
     *                            }
     *
     * @return \google\streetview\publish\v1\Photo
     *
     * @throws \Google\GAX\ApiException if the remote call fails
     */
    public function createPhoto($photo, $optionalArgs = [])
    {
        $request = new CreatePhotoRequest();
        $request->setPhoto($photo);

        $mergedSettings = $this->defaultCallSettings['createPhoto']->merge(
            new CallSettings($optionalArgs)
        );
        $callable = ApiCallable::createApiCall(
            $this->streetViewPublishServiceStub,
            'CreatePhoto',
            $mergedSettings,
            $this->descriptors['createPhoto']
        );

        return $callable(
            $request,
            [],
            ['call_credentials_callback' => $this->createCredentialsCallback()]);
    }

    /**
     * Gets the metadata of the specified `Photo`.
     *
     * This method returns the following error codes:
     *
     * &#42; `PERMISSION_DENIED` if the requesting user did not create the requested
     * photo.
     * &#42; `NOT_FOUND` if the requested photo does not exist.
     *
     * Sample code:
     * ```
     * try {
     *     $streetViewPublishServiceClient = new StreetViewPublishServiceClient();
     *     $photoId = "";
     *     $view = PhotoView::BASIC;
     *     $response = $streetViewPublishServiceClient->getPhoto($photoId, $view);
     * } finally {
     *     $streetViewPublishServiceClient->close();
     * }
     * ```
     *
     * @param string    $photoId      Required. ID of the photo.
     * @param PhotoView $view         Specifies if a download URL for the photo bytes should be returned in the
     *                                Photo response.
     * @param array     $optionalArgs {
     *                                Optional.
     * @type \Google\GAX\RetrySettings $retrySettings
     *                                Retry settings to use for this call. If present, then
     *                                $timeoutMillis is ignored.
     * @type int $timeoutMillis
     *                                Timeout to use for this call. Only used if $retrySettings
     *                                is not set.
     *                                }
     *
     * @return \google\streetview\publish\v1\Photo
     *
     * @throws \Google\GAX\ApiException if the remote call fails
     */
    public function getPhoto($photoId, $view, $optionalArgs = [])
    {
        $request = new GetPhotoRequest();
        $request->setPhotoId($photoId);
        $request->setView($view);

        $mergedSettings = $this->defaultCallSettings['getPhoto']->merge(
            new CallSettings($optionalArgs)
        );
        $callable = ApiCallable::createApiCall(
            $this->streetViewPublishServiceStub,
            'GetPhoto',
            $mergedSettings,
            $this->descriptors['getPhoto']
        );

        return $callable(
            $request,
            [],
            ['call_credentials_callback' => $this->createCredentialsCallback()]);
    }

    /**
     * Gets the metadata of the specified `Photo` batch.
     *
     * Note that if `photos.batchGet` fails, either critical fields are
     * missing or there was an authentication error.
     * Even if `photos.batchGet` succeeds, there may have been failures
     * for single photos in the batch. These failures will be specified in
     * `BatchGetPhotosResponse.results.status`.
     * See `photo.get` for specific failures that will occur per photo.
     *
     * Sample code:
     * ```
     * try {
     *     $streetViewPublishServiceClient = new StreetViewPublishServiceClient();
     *     $photoIds = [];
     *     $view = PhotoView::BASIC;
     *     $response = $streetViewPublishServiceClient->batchGetPhotos($photoIds, $view);
     * } finally {
     *     $streetViewPublishServiceClient->close();
     * }
     * ```
     *
     * @param string[]  $photoIds     Required. IDs of the photos.
     * @param PhotoView $view         Specifies if a download URL for the photo bytes should be returned in the
     *                                Photo response.
     * @param array     $optionalArgs {
     *                                Optional.
     * @type \Google\GAX\RetrySettings $retrySettings
     *                                Retry settings to use for this call. If present, then
     *                                $timeoutMillis is ignored.
     * @type int $timeoutMillis
     *                                Timeout to use for this call. Only used if $retrySettings
     *                                is not set.
     *                                }
     *
     * @return \google\streetview\publish\v1\BatchGetPhotosResponse
     *
     * @throws \Google\GAX\ApiException if the remote call fails
     */
    public function batchGetPhotos($photoIds, $view, $optionalArgs = [])
    {
        $request = new BatchGetPhotosRequest();
        foreach ($photoIds as $elem) {
            $request->addPhotoIds($elem);
        }
        $request->setView($view);

        $mergedSettings = $this->defaultCallSettings['batchGetPhotos']->merge(
            new CallSettings($optionalArgs)
        );
        $callable = ApiCallable::createApiCall(
            $this->streetViewPublishServiceStub,
            'BatchGetPhotos',
            $mergedSettings,
            $this->descriptors['batchGetPhotos']
        );

        return $callable(
            $request,
            [],
            ['call_credentials_callback' => $this->createCredentialsCallback()]);
    }

    /**
     * Lists all the photos that belong to the user.
     *
     * Sample code:
     * ```
     * try {
     *     $streetViewPublishServiceClient = new StreetViewPublishServiceClient();
     *     $view = PhotoView::BASIC;
     *     $filter = "";
     *     // Iterate through all elements
     *     $pagedResponse = $streetViewPublishServiceClient->listPhotos($view, $filter);
     *     foreach ($pagedResponse->iterateAllElements() as $element) {
     *         // doSomethingWith($element);
     *     }
     *
     *     // OR iterate over pages of elements, with the maximum page size set to 5
     *     $pagedResponse = $streetViewPublishServiceClient->listPhotos($view, $filter, ['pageSize' => 5]);
     *     foreach ($pagedResponse->iteratePages() as $page) {
     *         foreach ($page as $element) {
     *             // doSomethingWith($element);
     *         }
     *     }
     * } finally {
     *     $streetViewPublishServiceClient->close();
     * }
     * ```
     *
     * @param PhotoView $view         Specifies if a download URL for the photos bytes should be returned in the
     *                                Photos response.
     * @param string    $filter       The filter expression.
     *                                Example: `placeId=ChIJj61dQgK6j4AR4GeTYWZsKWw`
     * @param array     $optionalArgs {
     *                                Optional.
     * @type int $pageSize
     *                                The maximum number of resources contained in the underlying API
     *                                response. The API may return fewer values in a page, even if
     *                                there are additional values to be retrieved.
     * @type string $pageToken
     *                                A page token is used to specify a page of values to be returned.
     *                                If no page token is specified (the default), the first page
     *                                of values will be returned. Any page token used here must have
     *                                been generated by a previous call to the API.
     * @type \Google\GAX\RetrySettings $retrySettings
     *                                Retry settings to use for this call. If present, then
     *                                $timeoutMillis is ignored.
     * @type int $timeoutMillis
     *                                Timeout to use for this call. Only used if $retrySettings
     *                                is not set.
     *                                }
     *
     * @return \Google\GAX\PagedListResponse
     *
     * @throws \Google\GAX\ApiException if the remote call fails
     */
    public function listPhotos($view, $filter, $optionalArgs = [])
    {
        $request = new ListPhotosRequest();
        $request->setView($view);
        $request->setFilter($filter);
        if (isset($optionalArgs['pageSize'])) {
            $request->setPageSize($optionalArgs['pageSize']);
        }
        if (isset($optionalArgs['pageToken'])) {
            $request->setPageToken($optionalArgs['pageToken']);
        }

        $mergedSettings = $this->defaultCallSettings['listPhotos']->merge(
            new CallSettings($optionalArgs)
        );
        $callable = ApiCallable::createApiCall(
            $this->streetViewPublishServiceStub,
            'ListPhotos',
            $mergedSettings,
            $this->descriptors['listPhotos']
        );

        return $callable(
            $request,
            [],
            ['call_credentials_callback' => $this->createCredentialsCallback()]);
    }

    /**
     * Updates the metadata of a photo, such as pose, place association, etc.
     * Changing the pixels of a photo is not supported.
     *
     * This method returns the following error codes:
     *
     * &#42; `PERMISSION_DENIED` if the requesting user did not create the requested
     * photo.
     * &#42; `INVALID_ARGUMENT` if the request is malformed.
     * &#42; `NOT_FOUND` if the photo ID does not exist.
     *
     * Sample code:
     * ```
     * try {
     *     $streetViewPublishServiceClient = new StreetViewPublishServiceClient();
     *     $photo = new Photo();
     *     $updateMask = new FieldMask();
     *     $response = $streetViewPublishServiceClient->updatePhoto($photo, $updateMask);
     * } finally {
     *     $streetViewPublishServiceClient->close();
     * }
     * ```
     *
     * @param Photo     $photo      Required. Photo object containing the new metadata. Only the fields
     *                              specified in `update_mask` are used. If `update_mask` is not present, the
     *                              update applies to all fields.
     *                              &#42;&#42;Note:&#42;&#42; To update `pose.altitude`, `pose.latlngpair` has to be filled as
     *                              well. Otherwise, the request will fail.
     * @param FieldMask $updateMask Mask that identifies fields on the photo metadata to update.
     *                              If not present, the old Photo metadata will be entirely replaced with the
     *                              new Photo metadata in this request. The update fails if invalid fields are
     *                              specified. Multiple fields can be specified in a comma-delimited list.
     *
     * The following fields are valid:
     *
     * &#42; `pose.heading`
     * &#42; `pose.latlngpair`
     * &#42; `pose.level`
     * &#42; `pose.altitude`
     * &#42; `connections`
     * &#42; `places`
     * @param array $optionalArgs {
     *                            Optional.
     * @type \Google\GAX\RetrySettings $retrySettings
     *                            Retry settings to use for this call. If present, then
     *                            $timeoutMillis is ignored.
     * @type int $timeoutMillis
     *                            Timeout to use for this call. Only used if $retrySettings
     *                            is not set.
     *                            }
     *
     * @return \google\streetview\publish\v1\Photo
     *
     * @throws \Google\GAX\ApiException if the remote call fails
     */
    public function updatePhoto($photo, $updateMask, $optionalArgs = [])
    {
        $request = new UpdatePhotoRequest();
        $request->setPhoto($photo);
        $request->setUpdateMask($updateMask);

        $mergedSettings = $this->defaultCallSettings['updatePhoto']->merge(
            new CallSettings($optionalArgs)
        );
        $callable = ApiCallable::createApiCall(
            $this->streetViewPublishServiceStub,
            'UpdatePhoto',
            $mergedSettings,
            $this->descriptors['updatePhoto']
        );

        return $callable(
            $request,
            [],
            ['call_credentials_callback' => $this->createCredentialsCallback()]);
    }

    /**
     * Updates the metadata of photos, such as pose, place association, etc.
     * Changing the pixels of a photo is not supported.
     *
     * Note that if `photos.batchUpdate` fails, either critical fields
     * are missing or there was an authentication error.
     * Even if `photos.batchUpdate` succeeds, there may have been
     * failures for single photos in the batch. These failures will be specified
     * in `BatchUpdatePhotosResponse.results.status`.
     * See `UpdatePhoto` for specific failures that will occur per photo.
     *
     * Sample code:
     * ```
     * try {
     *     $streetViewPublishServiceClient = new StreetViewPublishServiceClient();
     *     $updatePhotoRequests = [];
     *     $response = $streetViewPublishServiceClient->batchUpdatePhotos($updatePhotoRequests);
     * } finally {
     *     $streetViewPublishServiceClient->close();
     * }
     * ```
     *
     * @param UpdatePhotoRequest[] $updatePhotoRequests Required. List of update photo requests.
     * @param array                $optionalArgs        {
     *                                                  Optional.
     * @type \Google\GAX\RetrySettings $retrySettings
     *                                                  Retry settings to use for this call. If present, then
     *                                                  $timeoutMillis is ignored.
     * @type int $timeoutMillis
     *                                                  Timeout to use for this call. Only used if $retrySettings
     *                                                  is not set.
     *                                                  }
     *
     * @return \google\streetview\publish\v1\BatchUpdatePhotosResponse
     *
     * @throws \Google\GAX\ApiException if the remote call fails
     */
    public function batchUpdatePhotos($updatePhotoRequests, $optionalArgs = [])
    {
        $request = new BatchUpdatePhotosRequest();
        foreach ($updatePhotoRequests as $elem) {
            $request->addUpdatePhotoRequests($elem);
        }

        $mergedSettings = $this->defaultCallSettings['batchUpdatePhotos']->merge(
            new CallSettings($optionalArgs)
        );
        $callable = ApiCallable::createApiCall(
            $this->streetViewPublishServiceStub,
            'BatchUpdatePhotos',
            $mergedSettings,
            $this->descriptors['batchUpdatePhotos']
        );

        return $callable(
            $request,
            [],
            ['call_credentials_callback' => $this->createCredentialsCallback()]);
    }

    /**
     * Deletes a photo and its metadata.
     *
     * This method returns the following error codes:
     *
     * &#42; `PERMISSION_DENIED` if the requesting user did not create the requested
     * photo.
     * &#42; `NOT_FOUND` if the photo ID does not exist.
     *
     * Sample code:
     * ```
     * try {
     *     $streetViewPublishServiceClient = new StreetViewPublishServiceClient();
     *     $photoId = "";
     *     $streetViewPublishServiceClient->deletePhoto($photoId);
     * } finally {
     *     $streetViewPublishServiceClient->close();
     * }
     * ```
     *
     * @param string $photoId      Required. ID of the photo.
     * @param array  $optionalArgs {
     *                             Optional.
     * @type \Google\GAX\RetrySettings $retrySettings
     *                             Retry settings to use for this call. If present, then
     *                             $timeoutMillis is ignored.
     * @type int $timeoutMillis
     *                             Timeout to use for this call. Only used if $retrySettings
     *                             is not set.
     *                             }
     *
     * @throws \Google\GAX\ApiException if the remote call fails
     */
    public function deletePhoto($photoId, $optionalArgs = [])
    {
        $request = new DeletePhotoRequest();
        $request->setPhotoId($photoId);

        $mergedSettings = $this->defaultCallSettings['deletePhoto']->merge(
            new CallSettings($optionalArgs)
        );
        $callable = ApiCallable::createApiCall(
            $this->streetViewPublishServiceStub,
            'DeletePhoto',
            $mergedSettings,
            $this->descriptors['deletePhoto']
        );

        return $callable(
            $request,
            [],
            ['call_credentials_callback' => $this->createCredentialsCallback()]);
    }

    /**
     * Deletes a list of photos and their metadata.
     *
     * Note that if `photos.batchDelete` fails, either critical fields
     * are missing or there was an authentication error.
     * Even if `photos.batchDelete` succeeds, there may have been
     * failures for single photos in the batch. These failures will be specified
     * in `BatchDeletePhotosResponse.status`.
     * See `photo.update` for specific failures that will occur per photo.
     *
     * Sample code:
     * ```
     * try {
     *     $streetViewPublishServiceClient = new StreetViewPublishServiceClient();
     *     $photoIds = [];
     *     $response = $streetViewPublishServiceClient->batchDeletePhotos($photoIds);
     * } finally {
     *     $streetViewPublishServiceClient->close();
     * }
     * ```
     *
     * @param string[] $photoIds     Required. List of delete photo requests.
     * @param array    $optionalArgs {
     *                               Optional.
     * @type \Google\GAX\RetrySettings $retrySettings
     *                               Retry settings to use for this call. If present, then
     *                               $timeoutMillis is ignored.
     * @type int $timeoutMillis
     *                               Timeout to use for this call. Only used if $retrySettings
     *                               is not set.
     *                               }
     *
     * @return \google\streetview\publish\v1\BatchDeletePhotosResponse
     *
     * @throws \Google\GAX\ApiException if the remote call fails
     */
    public function batchDeletePhotos($photoIds, $optionalArgs = [])
    {
        $request = new BatchDeletePhotosRequest();
        foreach ($photoIds as $elem) {
            $request->addPhotoIds($elem);
        }

        $mergedSettings = $this->defaultCallSettings['batchDeletePhotos']->merge(
            new CallSettings($optionalArgs)
        );
        $callable = ApiCallable::createApiCall(
            $this->streetViewPublishServiceStub,
            'BatchDeletePhotos',
            $mergedSettings,
            $this->descriptors['batchDeletePhotos']
        );

        return $callable(
            $request,
            [],
            ['call_credentials_callback' => $this->createCredentialsCallback()]);
    }

    /**
     * Initiates an orderly shutdown in which preexisting calls continue but new
     * calls are immediately cancelled.
     */
    public function close()
    {
        $this->streetViewPublishServiceStub->close();
    }

    private function createCredentialsCallback()
    {
        return $this->grpcCredentialsHelper->createCallCredentialsCallback();
    }
}
