FROM openjdk:17-alpine
WORKDIR /app
COPY target/spring-boot-kubernetes.jar /app/kubernetes-assignment.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","kubernetes-assignment.jar"]