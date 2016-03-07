#!/usr/bin/env bash

if [[ ! $TRAVIS_TAG =~ ^release-([0-9]+\.[0-9]+\.[0-9]+)$ ]]; then
    echo "This is not a release build, skipping version setting"
    exit 0
else
    RELEASE="${BASH_REMATCH[1]}"
    echo "Setting release version to $RELEASE"
    echo "Releasing as $RELEASE_DEPLOY_USERNAME"
    echo "version in ThisBuild := \"$RELEASE\"" > version.sbt
fi
