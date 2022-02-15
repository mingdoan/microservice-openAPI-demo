#FROM amazoncorretto:11
#WORKDIR /opt
#ENV PORT 8080
#EXPOSE 8080
#ARG JAR_FILE=target/*.jar
#COPY target/*.jar /opt/app.jar
#ENTRYPOINT exec java $JAVA_OPTS -jar app.jar
FROM amazoncorretto:11 as mongoDbDemo
EXPOSE 8081
WORKDIR /app

# Copy maven executable to the image
COPY mvnw .
COPY .mvn .mvn

# Copy the pom.xml file
COPY pom.xml .

# Copy the project source
COPY ./src ./src
COPY ./pom.xml ./pom.xml
COPY ./target ./target

RUN chmod 755 /app/mvnw

#RUN ./mvnw clean package -DskipTests
#ENTRYPOINT ["java","-jar","app.jar"]
ENTRYPOINT ["java","-jar","target/product-catalog-service-0.0.1-SNAPSHOT.jar"]
#COPY . /app
#ENTRYPOINT [ "java","-jar","/app/build/libs/spring-project-0.1.0.jar" ]