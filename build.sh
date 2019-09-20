#!/usr/bin/env bash
cd Pet-insurance-Angular/
echo "here1"
npm install
echo "here2"
npm run build
echo "here3"
cd ../
echo "here4"
rm -r node_modules
echo "here5"
gsutil cp -r dist gs://www.alexandernkingsburyprojects.com/Pet-insurance-Angular
echo "here6"
echo "here"
echo "here"
echo "here"
echo "here"
echo "here"
echo "here"