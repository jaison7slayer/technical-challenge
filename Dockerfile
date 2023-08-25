FROM openjdk:17-jdk-slim
VOLUME /tmp
EXPOSE 8888
ADD ./target/technical-challenge-0.0.1-SNAPSHOT.jar technical-challenge.jar
ENTRYPOINT ["java","-jar","/technical-challenge.jar"]