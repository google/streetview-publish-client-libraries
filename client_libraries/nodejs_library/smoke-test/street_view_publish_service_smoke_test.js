// Copyright 2019 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     https://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

'use strict';

const assert = require('assert');

describe('StreetViewPublishServiceSmokeTest', () => {
  it('should return INVALID_ARGUMENT', done => {
    const google = require('../src');

    const client = new google.v1.StreetViewPublishServiceClient({});

    const photo = {};
    client.createPhoto(photo, (err, photo) => {
        assert(err instanceof Error);
        assert.strictEqual(err.code, 3);
        done();
      });
  });
});
