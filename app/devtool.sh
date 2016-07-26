#!/usr/bin/env bash
if [ ! -d "src/main/assets/build" ]; then
    mkdir src/main/assets/build
fi

export PATH=$PATH:/usr/local/bin
weex src/main/assets -o src/main/assets/build