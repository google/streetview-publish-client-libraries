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
 * This file was automatically generated - do not edit!
 */

namespace Google\Tests\Streetview\Publish\V1;

use Google\Streetview\Publish\V1\StreetViewPublishServiceClient;
use Google\GAX\ApiException;
use Google\GAX\GrpcCredentialsHelper;
use Grpc;
use PHPUnit_Framework_TestCase;
use google\protobuf\Any;
use google\protobuf\EmptyC;
use google\protobuf\FieldMask;
use google\streetview\publish\v1\BatchDeletePhotosResponse;
use google\streetview\publish\v1\BatchGetPhotosResponse;
use google\streetview\publish\v1\BatchUpdatePhotosResponse;
use google\streetview\publish\v1\ListPhotosResponse;
use google\streetview\publish\v1\Photo;
use google\streetview\publish\v1\PhotoView;
use google\streetview\publish\v1\UploadRef;
use stdClass;

/**
 * @group publish
 * @group grpc
 */
class StreetViewPublishServiceClientTest extends PHPUnit_Framework_TestCase
{
    public function createMockStreetViewPublishServiceImpl($hostname, $opts)
    {
        return new MockStreetViewPublishServiceImpl($hostname, $opts);
    }

    private function createStub($createGrpcStub)
    {
        $grpcCredentialsHelper = new GrpcCredentialsHelper([]);

        return $grpcCredentialsHelper->createStub(
            $createGrpcStub,
            StreetViewPublishServiceClient::SERVICE_ADDRESS,
            StreetViewPublishServiceClient::DEFAULT_SERVICE_PORT
        );
    }

    /**
     * @return StreetViewPublishServiceClient
     */
    private function createClient($createStubFuncName, $grpcStub, $options = [])
    {
        return new StreetViewPublishServiceClient($options + [
            $createStubFuncName => function ($hostname, $opts) use ($grpcStub) {
                return $grpcStub;
            },
        ]);
    }
    /**
     * @test
     */
    public function startUploadTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockStreetViewPublishServiceImpl']);
        $client = $this->createClient('createStreetViewPublishServiceStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $uploadUrl = 'uploadUrl-242738639';
        $expectedResponse = new UploadRef();
        $expectedResponse->setUploadUrl($uploadUrl);
        $grpcStub->addResponse($expectedResponse);

        $response = $client->startUpload();
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->getReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.streetview.publish.v1.StreetViewPublishService/StartUpload', $actualFuncCall);

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function startUploadExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockStreetViewPublishServiceImpl']);
        $client = $this->createClient('createStreetViewPublishServiceStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        $status = new stdClass();
        $status->code = Grpc\STATUS_INTERNAL;
        $status->details = 'internal error';
        $grpcStub->addResponse(null, $status);

        try {
            $client->startUpload();
            // If the $client method call did not throw, fail the test
            $this->fail('Expected an ApiException, but no exception was thrown.');
        } catch (ApiException $ex) {
            $this->assertEquals($status->code, $ex->getCode());
            $this->assertEquals($status->details, $ex->getMessage());
        }

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function createPhotoTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockStreetViewPublishServiceImpl']);
        $client = $this->createClient('createStreetViewPublishServiceStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $downloadUrl = 'downloadUrl1109408056';
        $thumbnailUrl = 'thumbnailUrl1825632156';
        $shareLink = 'shareLink-1788203942';
        $viewCount = -1534353675;
        $expectedResponse = new Photo();
        $expectedResponse->setDownloadUrl($downloadUrl);
        $expectedResponse->setThumbnailUrl($thumbnailUrl);
        $expectedResponse->setShareLink($shareLink);
        $expectedResponse->setViewCount($viewCount);
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $photo = new Photo();

        $response = $client->createPhoto($photo);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->getReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.streetview.publish.v1.StreetViewPublishService/CreatePhoto', $actualFuncCall);

        $this->assertEquals($photo, $actualRequestObject->getPhoto());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function createPhotoExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockStreetViewPublishServiceImpl']);
        $client = $this->createClient('createStreetViewPublishServiceStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        $status = new stdClass();
        $status->code = Grpc\STATUS_INTERNAL;
        $status->details = 'internal error';
        $grpcStub->addResponse(null, $status);

        // Mock request
        $photo = new Photo();

        try {
            $client->createPhoto($photo);
            // If the $client method call did not throw, fail the test
            $this->fail('Expected an ApiException, but no exception was thrown.');
        } catch (ApiException $ex) {
            $this->assertEquals($status->code, $ex->getCode());
            $this->assertEquals($status->details, $ex->getMessage());
        }

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function getPhotoTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockStreetViewPublishServiceImpl']);
        $client = $this->createClient('createStreetViewPublishServiceStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $downloadUrl = 'downloadUrl1109408056';
        $thumbnailUrl = 'thumbnailUrl1825632156';
        $shareLink = 'shareLink-1788203942';
        $viewCount = -1534353675;
        $expectedResponse = new Photo();
        $expectedResponse->setDownloadUrl($downloadUrl);
        $expectedResponse->setThumbnailUrl($thumbnailUrl);
        $expectedResponse->setShareLink($shareLink);
        $expectedResponse->setViewCount($viewCount);
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $photoId = 'photoId-1274270136';
        $view = PhotoView::BASIC;

        $response = $client->getPhoto($photoId, $view);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->getReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.streetview.publish.v1.StreetViewPublishService/GetPhoto', $actualFuncCall);

        $this->assertEquals($photoId, $actualRequestObject->getPhotoId());
        $this->assertEquals($view, $actualRequestObject->getView());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function getPhotoExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockStreetViewPublishServiceImpl']);
        $client = $this->createClient('createStreetViewPublishServiceStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        $status = new stdClass();
        $status->code = Grpc\STATUS_INTERNAL;
        $status->details = 'internal error';
        $grpcStub->addResponse(null, $status);

        // Mock request
        $photoId = 'photoId-1274270136';
        $view = PhotoView::BASIC;

        try {
            $client->getPhoto($photoId, $view);
            // If the $client method call did not throw, fail the test
            $this->fail('Expected an ApiException, but no exception was thrown.');
        } catch (ApiException $ex) {
            $this->assertEquals($status->code, $ex->getCode());
            $this->assertEquals($status->details, $ex->getMessage());
        }

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function batchGetPhotosTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockStreetViewPublishServiceImpl']);
        $client = $this->createClient('createStreetViewPublishServiceStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $expectedResponse = new BatchGetPhotosResponse();
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $photoIds = [];
        $view = PhotoView::BASIC;

        $response = $client->batchGetPhotos($photoIds, $view);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->getReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.streetview.publish.v1.StreetViewPublishService/BatchGetPhotos', $actualFuncCall);

        $this->assertEquals($photoIds, $actualRequestObject->getPhotoIdsList());
        $this->assertEquals($view, $actualRequestObject->getView());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function batchGetPhotosExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockStreetViewPublishServiceImpl']);
        $client = $this->createClient('createStreetViewPublishServiceStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        $status = new stdClass();
        $status->code = Grpc\STATUS_INTERNAL;
        $status->details = 'internal error';
        $grpcStub->addResponse(null, $status);

        // Mock request
        $photoIds = [];
        $view = PhotoView::BASIC;

        try {
            $client->batchGetPhotos($photoIds, $view);
            // If the $client method call did not throw, fail the test
            $this->fail('Expected an ApiException, but no exception was thrown.');
        } catch (ApiException $ex) {
            $this->assertEquals($status->code, $ex->getCode());
            $this->assertEquals($status->details, $ex->getMessage());
        }

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function listPhotosTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockStreetViewPublishServiceImpl']);
        $client = $this->createClient('createStreetViewPublishServiceStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $nextPageToken = '';
        $photosElement = new Photo();
        $photos = [$photosElement];
        $expectedResponse = new ListPhotosResponse();
        $expectedResponse->setNextPageToken($nextPageToken);
        foreach ($photos as $elem) {
            $expectedResponse->addPhotos($elem);
        }
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $view = PhotoView::BASIC;
        $filter = 'filter-1274492040';

        $response = $client->listPhotos($view, $filter);
        $this->assertEquals($expectedResponse, $response->getPage()->getResponseObject());
        $resources = iterator_to_array($response->iterateAllElements());
        $this->assertSame(1, count($resources));
        $this->assertEquals($expectedResponse->getPhotosList()[0], $resources[0]);

        $actualRequests = $grpcStub->getReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.streetview.publish.v1.StreetViewPublishService/ListPhotos', $actualFuncCall);

        $this->assertEquals($view, $actualRequestObject->getView());
        $this->assertEquals($filter, $actualRequestObject->getFilter());
        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function listPhotosExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockStreetViewPublishServiceImpl']);
        $client = $this->createClient('createStreetViewPublishServiceStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        $status = new stdClass();
        $status->code = Grpc\STATUS_INTERNAL;
        $status->details = 'internal error';
        $grpcStub->addResponse(null, $status);

        // Mock request
        $view = PhotoView::BASIC;
        $filter = 'filter-1274492040';

        try {
            $client->listPhotos($view, $filter);
            // If the $client method call did not throw, fail the test
            $this->fail('Expected an ApiException, but no exception was thrown.');
        } catch (ApiException $ex) {
            $this->assertEquals($status->code, $ex->getCode());
            $this->assertEquals($status->details, $ex->getMessage());
        }

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function updatePhotoTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockStreetViewPublishServiceImpl']);
        $client = $this->createClient('createStreetViewPublishServiceStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $downloadUrl = 'downloadUrl1109408056';
        $thumbnailUrl = 'thumbnailUrl1825632156';
        $shareLink = 'shareLink-1788203942';
        $viewCount = -1534353675;
        $expectedResponse = new Photo();
        $expectedResponse->setDownloadUrl($downloadUrl);
        $expectedResponse->setThumbnailUrl($thumbnailUrl);
        $expectedResponse->setShareLink($shareLink);
        $expectedResponse->setViewCount($viewCount);
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $photo = new Photo();
        $updateMask = new FieldMask();

        $response = $client->updatePhoto($photo, $updateMask);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->getReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.streetview.publish.v1.StreetViewPublishService/UpdatePhoto', $actualFuncCall);

        $this->assertEquals($photo, $actualRequestObject->getPhoto());
        $this->assertEquals($updateMask, $actualRequestObject->getUpdateMask());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function updatePhotoExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockStreetViewPublishServiceImpl']);
        $client = $this->createClient('createStreetViewPublishServiceStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        $status = new stdClass();
        $status->code = Grpc\STATUS_INTERNAL;
        $status->details = 'internal error';
        $grpcStub->addResponse(null, $status);

        // Mock request
        $photo = new Photo();
        $updateMask = new FieldMask();

        try {
            $client->updatePhoto($photo, $updateMask);
            // If the $client method call did not throw, fail the test
            $this->fail('Expected an ApiException, but no exception was thrown.');
        } catch (ApiException $ex) {
            $this->assertEquals($status->code, $ex->getCode());
            $this->assertEquals($status->details, $ex->getMessage());
        }

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function batchUpdatePhotosTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockStreetViewPublishServiceImpl']);
        $client = $this->createClient('createStreetViewPublishServiceStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $expectedResponse = new BatchUpdatePhotosResponse();
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $updatePhotoRequests = [];

        $response = $client->batchUpdatePhotos($updatePhotoRequests);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->getReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.streetview.publish.v1.StreetViewPublishService/BatchUpdatePhotos', $actualFuncCall);

        $this->assertEquals($updatePhotoRequests, $actualRequestObject->getUpdatePhotoRequestsList());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function batchUpdatePhotosExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockStreetViewPublishServiceImpl']);
        $client = $this->createClient('createStreetViewPublishServiceStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        $status = new stdClass();
        $status->code = Grpc\STATUS_INTERNAL;
        $status->details = 'internal error';
        $grpcStub->addResponse(null, $status);

        // Mock request
        $updatePhotoRequests = [];

        try {
            $client->batchUpdatePhotos($updatePhotoRequests);
            // If the $client method call did not throw, fail the test
            $this->fail('Expected an ApiException, but no exception was thrown.');
        } catch (ApiException $ex) {
            $this->assertEquals($status->code, $ex->getCode());
            $this->assertEquals($status->details, $ex->getMessage());
        }

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function deletePhotoTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockStreetViewPublishServiceImpl']);
        $client = $this->createClient('createStreetViewPublishServiceStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $expectedResponse = new EmptyC();
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $photoId = 'photoId-1274270136';

        $client->deletePhoto($photoId);
        $actualRequests = $grpcStub->getReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.streetview.publish.v1.StreetViewPublishService/DeletePhoto', $actualFuncCall);

        $this->assertEquals($photoId, $actualRequestObject->getPhotoId());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function deletePhotoExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockStreetViewPublishServiceImpl']);
        $client = $this->createClient('createStreetViewPublishServiceStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        $status = new stdClass();
        $status->code = Grpc\STATUS_INTERNAL;
        $status->details = 'internal error';
        $grpcStub->addResponse(null, $status);

        // Mock request
        $photoId = 'photoId-1274270136';

        try {
            $client->deletePhoto($photoId);
            // If the $client method call did not throw, fail the test
            $this->fail('Expected an ApiException, but no exception was thrown.');
        } catch (ApiException $ex) {
            $this->assertEquals($status->code, $ex->getCode());
            $this->assertEquals($status->details, $ex->getMessage());
        }

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function batchDeletePhotosTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockStreetViewPublishServiceImpl']);
        $client = $this->createClient('createStreetViewPublishServiceStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        // Mock response
        $expectedResponse = new BatchDeletePhotosResponse();
        $grpcStub->addResponse($expectedResponse);

        // Mock request
        $photoIds = [];

        $response = $client->batchDeletePhotos($photoIds);
        $this->assertEquals($expectedResponse, $response);
        $actualRequests = $grpcStub->getReceivedCalls();
        $this->assertSame(1, count($actualRequests));
        $actualFuncCall = $actualRequests[0]->getFuncCall();
        $actualRequestObject = $actualRequests[0]->getRequestObject();
        $this->assertSame('/google.streetview.publish.v1.StreetViewPublishService/BatchDeletePhotos', $actualFuncCall);

        $this->assertEquals($photoIds, $actualRequestObject->getPhotoIdsList());

        $this->assertTrue($grpcStub->isExhausted());
    }

    /**
     * @test
     */
    public function batchDeletePhotosExceptionTest()
    {
        $grpcStub = $this->createStub([$this, 'createMockStreetViewPublishServiceImpl']);
        $client = $this->createClient('createStreetViewPublishServiceStubFunction', $grpcStub);

        $this->assertTrue($grpcStub->isExhausted());

        $status = new stdClass();
        $status->code = Grpc\STATUS_INTERNAL;
        $status->details = 'internal error';
        $grpcStub->addResponse(null, $status);

        // Mock request
        $photoIds = [];

        try {
            $client->batchDeletePhotos($photoIds);
            // If the $client method call did not throw, fail the test
            $this->fail('Expected an ApiException, but no exception was thrown.');
        } catch (ApiException $ex) {
            $this->assertEquals($status->code, $ex->getCode());
            $this->assertEquals($status->details, $ex->getMessage());
        }

        $this->assertTrue($grpcStub->isExhausted());
    }
}
