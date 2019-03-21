# Node.js Client for Street View Publish API ([Alpha](https://github.com/GoogleCloudPlatform/google-cloud-node#versioning))

[Street View Publish API][Product Documentation]:
The Street View Publish API allows your application to publish 360 photos to
Google Maps, along with image metadata that specifies the position,
orientation, and connectivity of each photo. With this API, any app can
offer an interface for positioning, connecting, and uploading user-generated
Street View images.
- [Client Library Documentation][]
- [Product Documentation][]

## Quick Start
In order to use this library, you first need to go through the following
steps:

1. [Select or create a Cloud Platform project.](https://console.cloud.google.com/project)
2. [Enable billing for your project.](https://cloud.google.com/billing/docs/how-to/modify-project#enable_billing_for_a_project)
3. [Enable the Street View Publish API.](https://console.cloud.google.com/apis/library/streetview_publish.googleapis.com)
4. [Setup Authentication.](https://googlecloudplatform.github.io/google-cloud-node/#/docs/google-cloud/master/guides/authentication)

### Installation
```
$ npm install streetview-publish-client-libraries-v1
```

### Preview
#### StreetViewPublishServiceClient
```js
 const google = require('google.streetview.publish.v1');

 const client = google.StreetViewPublishServiceClient({
   // optional auth parameters.
 });

 const photo = {};
 client.createPhoto({photo: photo})
   .then(responses => {
     const response = responses[0];
     // doThingsWith(response)
   })
   .catch(err => {
     console.error(err);
   });
```

### Next Steps
- Read the [Client Library Documentation][] for Street View Publish API
  to see other available methods on the client.
- Read the [Street View Publish API Product documentation][Product Documentation]
  to learn more about the product and see How-to Guides.
- View this [repository's main README](https://github.com/google/streetview-publish-client-libraries/blob/master/README.md)
  to see the full list of Cloud APIs that we cover.

[Client Library Documentation]: https://developers.google.com/streetview/publish/reference/rest/
[Product Documentation]: http://developers.google.com/streetview/publish
