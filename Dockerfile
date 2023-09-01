FROM amazoncorretto:17

WORKDIR /app

COPY target/D387_sample_code-0.0.2-SNAPSHOT.jar /app/

EXPOSE 8080

CMD ["java", "-jar", "D387_sample_code-0.0.2-SNAPSHOT.jar"]