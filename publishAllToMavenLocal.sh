#!/bin/bash

export IS_EXCLUDE_DEMOS=true
./gradlew clean \
&& ./gradlew :growingio-autotracker-gradle-plugin:publishToMavenLocal \
&& ./gradlew :growingio-tracker-core:publishReleasePublicationToMavenLocal \
&& ./gradlew :growingio-tracker-api:publishReleasePublicationToMavenLocal \
&& ./gradlew :growingio-autotracker-core:publishReleasePublicationToMavenLocal \
&& ./gradlew :growingio-autotracker-api:publishReleasePublicationToMavenLocal \
&& ./gradlew clean \
&& export IS_EXCLUDE_DEMOS=false