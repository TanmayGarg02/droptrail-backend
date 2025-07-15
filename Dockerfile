# Use Eclipse Temurin JDK base image (lightweight Java 17)
FROM eclipse-temurin:17-jdk-jammy

# Create app directory
WORKDIR /app

# Copy Maven wrapper and project files
COPY . /app

# Build the Spring Boot app using Maven
RUN ./mvnw clean package -DskipTests

# Expose the default port
EXPOSE 8080

# Run the Spring Boot JAR
CMD ["java", "-jar", "target/droptrail-0.0.1-SNAPSHOT.jar"]
