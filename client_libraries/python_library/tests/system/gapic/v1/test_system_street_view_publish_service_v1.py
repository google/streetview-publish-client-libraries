# -*- coding: utf-8 -*-
#
# Copyright 2019 Google LLC
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#     https://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.

import time
import pytest

from google.api_core.exceptions import InvalidArgument
from google.streetview import publish_v1
from google.streetview.publish_v1.proto import resources_pb2
from google.streetview.publish_v1.proto import rpcmessages_pb2


class TestSystemStreetViewPublishService(object):
    def test_create_photo(self):
      with pytest.raises(InvalidArgument):

        client = publish_v1.StreetViewPublishServiceClient()
        photo = {}
        response = client.create_photo(photo)

