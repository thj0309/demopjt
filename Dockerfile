FROM openjdk:17-ea-11-jdk-slim
MAINTAINER toto <thj0309@hotmail.com>
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} demo.jar
ENTRYPOINT ["java","-jar","/demo.jar"]