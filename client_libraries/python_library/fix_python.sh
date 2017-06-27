#!/bin/bash
# Script that fixes the python libraries so that they are as intended for
# Street View client libraries

# Move files up 1 directory to remove the "cloud" prefix, if not done already.
# Exit early if something goes wrong.
set -e

scriptdir=$(dirname $(readlink -f $0))

mv $scriptdir/python/grpc-google-maps-streetview_publish-v1/google/cloud/proto \
   $scriptdir/python/grpc-google-maps-streetview_publish-v1/google/proto

# Remove the old cloud directory
rm -rf $scriptdir/python/grpc-google-maps-streetview_publish-v1/google/cloud

# Remove the "cloud" namespace from everywhere relevant.
# NOTE(louiso): This will not replace "cloud/" inside serialized protobuffers,
# which causes issues.
find $scriptdir -type f -name '*.py' -exec sed -i '/^.*serialized_pb/! s/google\/cloud\//google\//g' {} \;
find $scriptdir -type f -name '*.py' -exec sed -i 's/cloud_dot_//g' {} \;
find $scriptdir -type f -name '*.py' -exec sed -i 's/google\.cloud\.proto/google\.proto/g' {} \;

# Add a missing import.
sed -i '1s/^/from google.proto.streetview.publish.v1 import streetview_publish_pb2\r\n\r\n/' $scriptdir/python-streetview-publish/google/streetview/publish/v1/street_view_publish_service_client.py

g4 reopen
