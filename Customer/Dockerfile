FROM eclipse-temurin:17-jdk

WORKDIR /app

COPY ["build/libs/Customer -0.0.1-SNAPSHOT.jar", "app.jar"]

EXPOSE 7777

HEALTHCHECK --interval=30s --timeout=5s --start-period=60s --retries=3 CMD ["bash", "-c", "echo > /dev/tcp/127.0.0.1/7777"]

CMD ["java", "-jar", "app.jar"]