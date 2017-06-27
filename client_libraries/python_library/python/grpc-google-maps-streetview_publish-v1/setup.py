# Copyright 2017 Google Inc.
# 
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
# 
#     http://www.apache.org/licenses/LICENSE-2.0
# 
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.

"""A setup module for the GRPC Street View Publish API service.

See:
https://packaging.python.org/en/latest/distributing.html
https://github.com/pypa/sampleproject
"""

import setuptools

from setuptools import setup, find_packages

install_requires = [
  'googleapis-common-protos>=1.5.2, <2.0dev',
  'oauth2client>=2.0.0, <4.0dev',
]

extras_require = {
  'grpc': [
    'googleapis-common-protos[grpc]>=1.5.2, <2.0dev',
    'grpcio>=1.0.2, <2.0dev',
  ],
}

setuptools.setup(
  name='proto-google-maps-streetview_publish-v1',
  version='0.1.3',
  author='Google Inc',
  author_email='googleapis-packages@google.com',
  classifiers=[
    'Intended Audience :: Developers',
    'Development Status :: 3 - Alpha',
    'Intended Audience :: Developers',
    'License :: OSI Approved :: Apache Software License',
    'Programming Language :: Python',
    'Programming Language :: Python :: 2',
    'Programming Language :: Python :: 2.7',
    'Programming Language :: Python :: 3',
    'Programming Language :: Python :: 3.4',
    'Programming Language :: Python :: 3.5',
    'Programming Language :: Python :: Implementation :: CPython',
  ],
  description='GRPC library for the Street View Publish API',
  long_description=open('README.rst').read(),
  install_requires=install_requires,
  extras_require=extras_require,
  license='Apache-2.0',
  packages=find_packages(),
  namespace_packages=['google.proto.streetview.publish', 'google.proto.streetview', 'google.proto', 'google'],
  url='https://github.com/googleapis/googleapis'
)
