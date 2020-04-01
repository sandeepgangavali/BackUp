FROM java:8-jre
WORKDIR /usr/src
ENV MYSQL_DATABASE=MovieCruiser
ENV MYSQL_USER=sandeep
ENV MYSQL_PASSWORD=sandeep
ENV MYSQL_CI_URL=jdbc:mysql://localhost:3306/MovieCruiser
ADD ./target/MovieCruiserService-0.0.1-SNAPSHOT.jar MovieCruiserService-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "MovieCruiserService-0.0.1-SNAPSHOT.jar"]
