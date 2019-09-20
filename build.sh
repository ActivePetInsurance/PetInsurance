#!/usr/bin/env bash
cd Pet-insurance-Angular/
echo "here1"
#npm install 
echo "i really hate everything"
npm i -g @angular/cli
apt-get remove nodejs
curl -sL https://deb.nodesource.com/setup_12.x | sudo -E bash -
echo "here2"
ng 	build
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