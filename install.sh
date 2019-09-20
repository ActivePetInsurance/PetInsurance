# install.sh
#!/bin/sh

# Install kubernetes and set config

# source $HOME/google-cloud-sdk/path.bash.inc

rm -rf "$HOME/google-cloud-sdk"
sudo curl -O https://dl.google.com/dl/cloudsdk/channels/rapid/downloads/google-cloud-sdk-263.0.0-linux-x86.tar.gz
tar zxvf google-cloud-sdk-263.0.0-linux-x86.tar.gz google-cloud-sdk

echo "installed successfully"

# if [ ! -d "$HOME/google-cloud-sdk/bin" ]; then
#   rm -rf "$HOME/google-cloud-sdk"
#   curl https://sdk.cloud.google.com | bash > /dev/null
# fi

source $HOME/google-cloud-sdk/path.bash.inc

# yes | gcloud components update
yes | gcloud components install kubectl