#!/bin/bash

mvn clean
pushd src/main/resources/public/
rm -rf app/*.js
rm -rf app/*.map
#rm -rf node_modules
#rm -rf typings
popd
