#!/bin/bash

systemctl restart sshd

java -jar mavendockerplugindemo-0.0.1-SNAPSHOT.jar

/bin/bash
