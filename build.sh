#!/usr/bin/env bash
#cd Pet-insurance-Angular/
#npm install
#npm run build
#cd ../
#rm -r node_modules
#gsutil cp -r dist gs://www.alexandernkingsburyprojects.com/Pet-insurance-Angular

gcloud beta compute --project "projectthreeie" ssh --zone "us-central1-a" "travis"
