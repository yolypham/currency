FROM openjdk:8
ADD target/docker-currency.jar docker-currency.jar
EXPOSE 8585
ENTRYPOINT ["java", "-jar", "docker-currency.jar"]