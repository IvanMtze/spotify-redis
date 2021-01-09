FROM java:8
EXPOSE 8080
ADD /target/spring.SNAPSHOT.jar spring.jar
ENTRYPOINT ["java","-jar","spring.jar"]
