#!/usr/bin/env bash
cd Pet-insurance-Angular/
npm install
npm run build
gsutil cp -r dist gs://www.alexandernkingsburyprojects.com/Pet-insurance-Angular