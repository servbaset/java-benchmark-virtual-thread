create docker image : 
````
docker buildx build . --tag java-benchmark
````
run : 
````
docker run  -e PORT=8080 -e WAITING-SERVER=http://192.168.1.101:8081/ -p 8080:8080 -it java-benchmark
````
