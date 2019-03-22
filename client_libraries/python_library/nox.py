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

from __future__ import absolute_import
import os

import nox


@nox.session
def default(session):
    return unit(session, 'default')


@nox.session
@nox.parametrize('py', ['2.7', '3.5', '3.6', '3.7'])
def unit(session, py):
    """Run the unit test suite."""

    # Run unit tests against all supported versions of Python.
    if py != 'default':
        session.interpreter = 'python{}'.format(py)

    # Set the virtualenv directory name.
    session.virtualenv_dirname = 'unit-' + py

    # Install all test dependencies, then install this package in-place.
    session.install('pytest', 'mock')
    session.install('-e', '.')

    # Run py.test against the unit tests.
    session.run('py.test', '--quiet', os.path.join('tests', 'unit'))


@nox.session
@nox.parametrize('py', ['2.7', '3.7'])
def system(session, py):
    """Run the system test suite."""

    # Sanity check: Only run system tests if the environment variable is set.
    if not os.environ.get('GOOGLE_APPLICATION_CREDENTIALS', ''):
        session.skip('Credentials must be set via environment variable.')

    # Run unit tests against all supported versions of Python.
    session.interpreter = 'python{}'.format(py)

    # Set the virtualenv dirname.
    session.virtualenv_dirname = 'sys-' + py

    # Install all test dependencies, then install this package in-place.
    session.install('pytest')
    session.install('-e', '.')

    # Run py.test against the unit tests.
    session.run('py.test', '--quiet', os.path.join('tests', 'system'),
                *session.posargs)


@nox.session
def lint_setup_py(session):
    """Verify that setup.py is valid (including RST check)."""
    session.interpreter = 'python3.6'
    session.install('docutils', 'pygments')
    session.run('python', 'setup.py', 'check', '--restructuredtext',
                '--strict')
