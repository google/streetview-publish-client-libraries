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

import io
import os

import setuptools

name = 'gapic-google-maps-streetview_publish-v1'
description = 'Street View Publish API API client library'
version = '1.0.1'
dependencies = [
    'google-api-core[grpc] >= 1.4.1, < 2.0.0dev',
    'enum34; python_version < "3.4"',
]

package_root = os.path.abspath(os.path.dirname(__file__))

readme_filename = os.path.join(package_root, 'README.rst')
with io.open(readme_filename, encoding='utf-8') as readme_file:
    readme = readme_file.read()

packages = [
    package for package in setuptools.find_packages()
    if package.startswith('google')
]

namespaces = ['google']
if 'google.cloud' in packages:
    namespaces.append('google.cloud')

setuptools.setup(
    name=name,
    version=version,
    description=description,
    long_description=readme,
    author='Google LLC',
    author_email='googleapis-packages@google.com',
    license='Apache 2.0',
    url='https://github.com/google/streetview-publish-client-libraries/tree/master/client_libraries/python_library',
    classifiers=[
        'Intended Audience :: Developers',
        'Development Status :: 3 - Alpha',
        'License :: OSI Approved :: Apache Software License',
        'Programming Language :: Python',
        'Programming Language :: Python :: 2',
        'Programming Language :: Python :: 2.7',
        'Programming Language :: Python :: 3',
        'Programming Language :: Python :: 3.4',
        'Programming Language :: Python :: 3.5',
        'Programming Language :: Python :: 3.6',
        'Operating System :: OS Independent',
        'Topic :: Internet',
    ],
    platforms='Posix; MacOS X; Windows',
    packages=packages,
    namespace_packages=namespaces,
    install_requires=dependencies,
    include_package_data=True,
    zip_safe=False,
)
