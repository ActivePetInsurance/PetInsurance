# install.sh
#!/bin/sh

# Install kubernetes and set config

# source $HOME/google-cloud-sdk/path.bash.inc

sudo apt-get install google-cloud-sdk

# if [ ! -d "$HOME/google-cloud-sdk/bin" ]; then
#   rm -rf "$HOME/google-cloud-sdk"
#   curl https://sdk.cloud.google.com | bash > /dev/null
# fi

source $HOME/google-cloud-sdk/path.bash.inc

# yes | gcloud components update
yes | gcloud components install kubectl