#!/bin/bash

#Construire l'image Docker
DOCKER_BUILDKIT=0 docker build -t im-tp4 -f Dockerfile1 .

