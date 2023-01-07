#
# Build stage
#
FROM maven:3.8.1-openjdk-17-slim AS build
COPY pom.xml .
COPY . .
RUN mvn clean package -Pprod -DskipTests

#
# Package stage
#
FROM openjdk:17-slim
COPY --from=build /target/scribbles-1.0.0.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","app.jar"]
