# demopjt 정리하기

## dockerfile 파일 만들기
```
FROM openjdk:17-ea-11-jdk-slim 
MAINTAINER toto <thj0309@hotmail.com>
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} demo.jar
ENTRYPOINT ["java","-jar","/demo.jar"]
```

## dockerfile build & push
```
docker build -t thj0309/demo:1.0 .
docker push thj0309/demo:1.0
```

## dockerfile run
```
docker run -d --name demo thj0309/demo:1.0
```
