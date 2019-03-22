# StreetView Publish API Client Library

This repository contains the Java client library for the
[StreetView Publish API](https://developers.google.com/streetview/publish).

## Requirements and preparation

* Java 1.7+
* Gradle build system or Maven 3.0+ recommended.
* OAuth 2.0 credentials configured for your project as
  [described below](#set-up-your-oauth2-credentials-for-java).

## Download the client library

Firstly, download the library or include it in your build configuration. Then,
set up OAuth 2.0 credentials to access the API.

### Option 1: Gradle dependency
To use this library with Gradle, add the following dependency to your
`build.gradle` file:

```
repositories {
    mavenCentral()
}
dependencies {
    compile 'com.google.streetview.publish:java-streetview-publish:1.0.0'
}
```

### Option 2: Maven dependency
To use this library with Maven, add the following to your Maven `pom.xml` file:

```
<dependency>
  <groupId>com.google.streetview.publish</groupId>
  <artifactId>java-streetview-publish</artifactId>
  <version>1.0.0</version>
</dependency>
```

### Option 3: Download a release
The [releases page](releases/) contains different artifacts for each library
release, including jar files.

### Option 4: Clone the repository

Use this method if you want to alter or contribute to this library (e.g.,
submitting pull requests) or wish to try our samples. When you clone the
repository,  **all** files in this repository will be downloaded.

1. Run
   `git clone https://github.com/google/streetview-publish-client-libraries.git`
   at the command prompt.
2. You'll get a **streetview-publish-client-libraries** directory. Navigate to 
   it by running
   `cd streetview-publish-client-libraries/client_libraries/java_library`.
3. Open the `build.gradle` file in your IDE or run `./gradlew assemble` at the
   command prompt to build the project. See `./gradlew tasks` to see available
   tasks

## Set up your OAuth2 credentials for Java

The StreetView Publish API uses [OAuth2](https://oauth.net/2/) as the
authentication mechanism. Note that the Library API does not support service
accounts.

To complete the “Enable the API” and “Configure OAuth2.0” steps in the below procedure, refer to the [get started guide in the developer documentation](https://developers.google.com/streetview/publish/getting-started)

Follow the below steps:

1. Set up a Google developers project
1. Enable the *Google Street View API* in your developer project
1. Configure OAuth 2.0 credentials, including a callback URI
1. Either download your OAuth credentials as a JSON file or note your client ID
   and secret.   

## Sample usage

Here's a short example that shows how to create a new photo:

```java
try (StreetViewPublishServiceClient client = StreetViewPublishServiceClient.create()) {
  // TODO: Initialize photo with values.
  Photo photo = Photo.newBuilder().build();

  Photo response = client.createPhoto(photo);
} catch (ApiException e) {
  // Error during photo creation
}
```

## Reference documentation

Javadoc for this library can be found in the
[gh-pages](https://github.com/google/streetview-publish-client-libraries/tree/gh-pages)
branch of this repository. You can browse it at
https://google.github.io/streetview-publish-client-libraries/index.html

General StreetView Publish API documentation can be found on our Google
Developers site: https://developers.google.com/streetview/publish

## Getting support

For client library specific bug reports, feature requests, and patches,
create an issue on the
[issue tracker](https://github.com/google/streetview-publish-client-libraries/issues).

See the [support page](https://developers.google.com/streetview/publish/support)
for any other API questions, bug reports, or feature requests.

## License

Copyright 2019 Google LLC

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    https://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
