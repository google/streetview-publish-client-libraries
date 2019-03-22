Python Client for Street View Publish API (Alpha)
====================================================

`Street View Publish API`_: The Street View Publish API allows your application to publish 360 photos to
Google Maps, along with image metadata that specifies the position,
orientation, and connectivity of each photo. With this API, any app can
offer an interface for positioning, connecting, and uploading user-generated
Street View images.

- `Client Library Documentation`_
- `Product Documentation`_

.. _Street View Publish API: https://github.com/google/streetview-publish-client-libraries/tree/master/client_libraries/python_library/README.rst
.. _Client Library Documentation: https://developers.google.com/streetview/publish/reference/rest/
.. _Product Documentation:  http://developers.google.com/streetview/publish

Quick Start
-----------

In order to use this library, you first need to go through the following steps:

1. `Select or create a Cloud Platform project`_
2. `Enable billing for your project`_
3. `Enable the Street View Publish API`_
4. `Setup Authentication`_

.. _Select or create a Cloud Platform project: https://console.cloud.google.com/project
.. _Enable billing for your project: https://cloud.google.com/billing/docs/how-to/modify-project#enable_billing_for_a_project
.. _Enable the Street View Publish API:  https://console.cloud.google.com/marketplace/details/google/streetviewpublish.googleapis.com
.. _Setup Authentication: https://googlecloudplatform.github.io/google-cloud-python/latest/core/auth.html

Installation
~~~~~~~~~~~~

Install this library in a `virtualenv`_ using pip. `virtualenv`_ is a tool to
create isolated Python environments. The basic problem it addresses is one of
dependencies and versions, and indirectly permissions.

With `virtualenv`_, it's possible to install this library without needing system
install permissions, and without clashing with the installed system
dependencies.

.. _`virtualenv`: https://virtualenv.pypa.io/en/latest/


Mac/Linux
^^^^^^^^^

.. code-block:: console

    pip install virtualenv
    virtualenv <your-env>
    source <your-env>/bin/activate
    <your-env>/bin/pip install gapic-google-maps-streetview_publish-v1


Windows
^^^^^^^

.. code-block:: console

    pip install virtualenv
    virtualenv <your-env>
    <your-env>\Scripts\activate
    <your-env>\Scripts\pip.exe install gapic-google-maps-streetview_publish-v1

Preview
~~~~~~~

StreetViewPublishServiceClient
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

.. code:: py

    from google.streetview import publish_v1

    client = publish_v1.StreetViewPublishServiceClient()

    # TODO: Initialize `photo`:
    photo = {}

    response = client.create_photo(photo)

Next Steps
~~~~~~~~~~

-  Read the `Client Library Documentation`_ for Street View Publish API
   API to see other available methods on the client.
-  Read the `Street View Publish API Product documentation`_ to learn
   more about the product and see How-to Guides.
-  View this `repository’s main README`_ to see the full list of Cloud
   APIs that we cover.

.. _Street View Publish API Product documentation:  https://cloud.google.com/streetview_publish
.. _repository’s main README: https://github.com/GoogleCloudPlatform/google-cloud-python/blob/master/README.rst
