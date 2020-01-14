# Gateway Service

## Gitlab source:
https://gitlab.com/ntthuat/forex-service
## ? CI:
TODO

## How to run
Endpoint for Local Environment:
We use Eureka now

Endpoint for Docker Environment:
TODO


## Command to test,clean,build
$ gradlew clean build

## Postman example

## All requirements about dimension, length and angle

## Docker Build & Run
docker-compose up

.Note: use for window local include 4 steps
1. docker-machine restart default
2. docker-machine env
3. @FOR /f "tokens=*" %i IN ('docker-machine env') DO @%i
4. docker-compose up