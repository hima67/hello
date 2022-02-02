FROM openjdk:8
ADD target/docker1-0.0.1-SNAPSHOT.jar docker1-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","docker1-0.0.1-SNAPSHOT.jar"]