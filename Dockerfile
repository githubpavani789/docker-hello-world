FROM openjdk:11
ADD target/docker-hello-worlds-0.0.1-SNAPSHOT.jar hello-imran.jar
EXPOSE 9000
ENTRYPOINT ["java","-jar","/hello-imran.jar"]