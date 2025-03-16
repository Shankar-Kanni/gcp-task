FROM openjdk:21
ARG JAR_FILE=spring-boot.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","app.jar"]