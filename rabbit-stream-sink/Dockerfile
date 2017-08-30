FROM java
MAINTAINER BARATH
EXPOSE 12002
ADD target/rabbit-stream-sink-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]