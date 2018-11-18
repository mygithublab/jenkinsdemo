#!/bin/bash

docker build --rm -t test003 .

docker rm -f test003-container

docker run -itd --name test003-container -p 10010:8080 -p 10011:22 \
 --privileged \
 -v /sys/fs/cgroup:/sys/fs/cgroup:ro \
 -v /tmp/$(mktemp -d):/run \
 -v /test/test003:/mnt \
 --restart=always test003
