#  Nem sikerült image-ből buildelnem,
# mert valamiért elszáll egy com.sun-os package miatt

#FROM maven:3.8.4-openjdk-8 AS backend
#WORKDIR /usr/src/
#COPY ./pom.xml .
#RUN mvn -f pom.xml dependency:resolve
#COPY ./ .
#RUN mvn package -DskipTests

FROM openjdk:8-jdk-alpine
WORKDIR /app
EXPOSE 8080
#COPY --from=backend /usr/src/target/xml-parser-1.0-SNAPSHOT.jar .
COPY ./target/xml-parser-1.0-SNAPSHOT.jar .
ENTRYPOINT ["java","-jar","/app/xml-parser-1.0-SNAPSHOT.jar"]
