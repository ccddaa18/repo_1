#!/bin/bash -ex
gradle
gradle init
gradle jar
#./gradlew jar
./gradlew test