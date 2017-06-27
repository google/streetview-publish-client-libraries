# After regenerating new client libraries and uploading a new version, run
# this file to make sure that basic functionality works. You will need to
# authenticate, which is a separate process (you will know what to do from
# the authentication error messages, if that comes up).

from google.streetview.publish.v1 import street_view_publish_service_client as client

# Create a client and get an upload url.
streetview_client = client.StreetViewPublishServiceClient()
upload_ref = streetview_client.start_upload()
print("Created upload url: " + str(upload_ref))
print("Success!")
