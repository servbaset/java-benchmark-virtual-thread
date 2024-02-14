create graalvm docker image :

````
./gradlew bootBuildImage
````

create jvm docker image :

````
./gradlew build

docker buildx build . --tag benchmark
````

run :

````
docker run  -e PORT=8080 -e WAITING-SERVER=http://192.168.1.101:8081/ -p 8080:8080 -it benchmark
````
