RUN mvn clean install -U
FROM ubuntu

FROM java:8
ADD /target/amhi-wrapper-0.0.1-SNAPSHOT.jar /


