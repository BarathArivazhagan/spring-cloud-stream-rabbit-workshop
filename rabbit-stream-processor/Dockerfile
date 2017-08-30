FROM java
MAINTAINER BARATH
EXPOSE 12001
ADD target/rabbit-stream-processor-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]