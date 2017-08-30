FROM java
MAINTAINER BARATH
EXPOSE 12000
ADD target/rabbit-stream-source-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]