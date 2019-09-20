#!/usr/bin/env bash
cd Pet-insurance-Angular/
echo "here1"
#npm install 
echo "i really hate everything"
sudo apt-get install -y nodejs
npm i -g @angular/cli
wget https://nodejs.org/dist/v0.10.9/node-v0.10.9-linux-x64.tar.gz
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