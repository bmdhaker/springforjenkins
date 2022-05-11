FROM java:8
COPY ./target/demojenkins-0.0.1-SNAPSHOT.jar demojenkins-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "demojenkins-0.0.1-SNAPSHOT.jar"]
