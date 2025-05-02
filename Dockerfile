# Use lightweight OpenJDK base image
FROM alpine/java:21-jdk

# Copy the JAR file into the image
COPY target/*.jar ketmon.jar

# Expose port (replace 8080 if your app runs on a different port)
EXPOSE 8087

# Command to run your app
ENTRYPOINT exec java -jar ketmon.jar