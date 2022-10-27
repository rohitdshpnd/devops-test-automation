FROM openjdk:8
EXPOSE 8089
ADD build/libs/demo-0.0.1-SNAPSHOT.jar docker-jenkins-integration.jar
ENTRYPOINT ["java","-jar","/docker-jenkins-integration.jar"]