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

ls
cd Pet-insurance-Angular/
ls
npm install
ls
npm run build
ls
gsutil cp -r dist/class-example/* gs://www.alexandernkingsburyprojects.com
