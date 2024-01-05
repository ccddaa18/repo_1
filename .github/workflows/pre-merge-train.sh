#!/bin/bash -e
BUILD_NAME=${GITHUB_RUN_ID:=local-$(date +%s)}

# Get Launchable CLI installed. If you can, make it a part of the builder image to speed things up
pip3 install --user launchable~=1.0 > /dev/null
export PATH=~/.local/bin:$PATH

set -x
# Verify that Launchable setup is all correct. Useful primarily while you work on integration
launchable verify

# Tell Launchable about the build you are producing and testing
launchable record build --name "$BUILD_NAME" --source ..

function record(){
  # Record test results
  # launchable record test --build "$BUILD_NAME" gradle app/src/test/java/com/example/sampleapplication
  # launchable record test --build "$BUILD_NAME" gradle app/src/test
  # launchable record tests --build "$BUILD_NAME" gradle build/test-results/test
  # launchable record tests --build "$BUILD_NAME" gradle build/reports/tests/testDebugUnitTest
  launchable record tests --build "$BUILD_NAME" gradle ./build/reports/tests/
}

trap record EXIT

./gradlew :app:test
#./gradlew test