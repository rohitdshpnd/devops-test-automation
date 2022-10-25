FROM openjdk:8
EXPOSE 8089
ADD /home/gradle/project/docker-jenkins-integration.jar docker-jenkins-integration.jar
ENTRYPOINT ["java","-jar","/docker-jenkins-integration.jar"]