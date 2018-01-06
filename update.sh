#!/usr/bin/env bash

cd src/lib
git commit -a
git push
cd ../..
git commit -am "Update Submodule"
git push
