#!/usr/bin/env bash
#cd Pet-insurance-Angular/
#npm install
#npm run build
#cd ../
#rm -r node_modules
#gsutil cp -r dist gs://www.alexandernkingsburyprojects.com/Pet-insurance-Angular

cd RevaturePetInsurance/
mvn package
cd ../
cd Pet-insurance-Angular/
npm install
npm run build
cd dist
ls
gsutil cp -r * gs://www.alexandernkingsburyprojects.com
