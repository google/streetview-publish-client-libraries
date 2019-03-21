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
"""Wrappers for protocol buffer enum types."""

import enum


class PhotoView(enum.IntEnum):
    """
    Specifies which view of the ``Photo`` to include in the response.

    Attributes:
      BASIC (int): Server reponses do not include the download URL for the photo bytes.
      The default value.
      INCLUDE_DOWNLOAD_URL (int): Server responses include the download URL for the photo bytes.
    """
    BASIC = 0
    INCLUDE_DOWNLOAD_URL = 1


class Photo(object):
    class MapsPublishStatus(enum.IntEnum):
        """
        Publication status of the photo in Google Maps.

        Attributes:
          UNSPECIFIED_MAPS_PUBLISH_STATUS (int): The status of the photo is unknown.
          PUBLISHED (int): The photo is published to the public through Google Maps.
          REJECTED_UNKNOWN (int): The photo has been rejected for an unknown reason.
        """
        UNSPECIFIED_MAPS_PUBLISH_STATUS = 0
        PUBLISHED = 1
        REJECTED_UNKNOWN = 2

    class TransferStatus(enum.IntEnum):
        """
        Status of rights transfer.

        Attributes:
          TRANSFER_STATUS_UNKNOWN (int): The status of this transfer is unspecified.
          NEVER_TRANSFERRED (int): This photo has never been in a transfer.
          PENDING (int): This photo transfer has been initiated, but the receiver has not yet
          responded.
          COMPLETED (int): The photo transfer has been completed, and this photo has been
          transferred to the recipient.
          REJECTED (int): The recipient rejected this photo transfer.
          EXPIRED (int): The photo transfer expired before the recipient took any action.
          CANCELLED (int): The sender cancelled this photo transfer.
          RECEIVED_VIA_TRANSFER (int): The recipient owns this photo due to a rights transfer.
        """
        TRANSFER_STATUS_UNKNOWN = 0
        NEVER_TRANSFERRED = 1
        PENDING = 2
        COMPLETED = 3
        REJECTED = 4
        EXPIRED = 5
        CANCELLED = 6
        RECEIVED_VIA_TRANSFER = 7
