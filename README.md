# demopjt 정리하기

## 목표
22/07 : docker image 1개 생성 후, 3개의 인스턴스로 띄운 후 쿠버네티스로 오케스트레이션 

## rest sample 호출하기
```
curl http://localhost:8080/hello
curl http://localhost:8080/health
curl http://localhost:8080/send/{pathvariable}
```

## docker 관련 정리하기
### dockerfile 파일 만들기
```
FROM openjdk:17-ea-11-jdk-slim 
MAINTAINER toto <thj0309@hotmail.com>
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} demo.jar
ENTRYPOINT ["java","-jar","/demo.jar"]
```

### dockerfile build & push
```
docker build -t thj0309/demo:1.0 .
docker push thj0309/demo:1.0
```

### dockerfile run
```
docker run -d --name demo thj0309/demo:1.0
```
