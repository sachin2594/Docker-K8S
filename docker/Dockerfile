#Start with a base Image containing java runtime.
FROM openjdk:8  

#Add the application's Jar to the container.
COPY target/docker-0.0.1-SNAPSHOT.jar docker-0.0.1-SNAPSHOT.jar

#Execute the Application.
ENTRYPOINT [ "java", "-jar", "/docker-0.0.1-SNAPSHOT.jar"]
