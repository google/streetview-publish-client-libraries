# Copyright 2016 Google Inc. All rights reserved.
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
# http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.
"""Wrappers for protocol buffer enum types."""


class PhotoView(object):
    """
    Specifies which view of the ``Photo`` should be included in the response.

    Attributes:
      BASIC (int): Server reponses do not include the download URL for the photo bytes.
        The default value.
      INCLUDE_DOWNLOAD_URL (int): Server responses include the download URL for the photo bytes.
    """
    BASIC = 0
    INCLUDE_DOWNLOAD_URL = 1
