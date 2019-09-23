#!/usr/bin/env bash
#cd Pet-insurance-Angular/
#npm install
#npm run build
#cd ../
#rm -r node_modules
#gsutil cp -r dist gs://www.alexandernkingsburyprojects.com/Pet-insurance-Angular

cd Pet-insurance-Angular/
npm install
npm run build
cd ../
rm -r node_modules
ls
gsutil cp -r dist gs://www.alexandernkingsburyprojects.com/Pet-insurance-Angular
