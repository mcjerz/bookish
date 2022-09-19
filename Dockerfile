FROM openjdk:11
COPY ./build/libs/bookish-0.0.1-SNAPSHOT.jar /usr/app/
WORKDIR /usr/app
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "bookish-0.0.1-SNAPSHOT.jar"]