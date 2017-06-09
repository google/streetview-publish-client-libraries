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
'use strict';

var extend = require('extend');
var gapic = {
  v1: require('./v1')
};

const VERSION = require('../package.json').version;

/**
 * Create an streetViewPublishServiceClient with additional helpers for common
 * tasks.
 *
 * Publishes and connects user-contributed photos on Street View.
 *
 * @param {object=} options - [Configuration object](#/docs).
 * @param {number=} options.port - The port on which to connect to
 *     the remote host.
 * @param {string=} options.servicePath - The domain name of the
 *     API remote host.
 */
function streetViewPublishV1(options) {
  // Define the header options.
  options = extend({}, options, {
    libName: 'gccl',
    libVersion: VERSION
  });

  // Create the image annotator client with the provided options.
  var client = gapic.v1(options).streetViewPublishServiceClient(options);
  return client;
}

module.exports = streetViewPublishV1;
module.exports.v1 = streetViewPublishV1;