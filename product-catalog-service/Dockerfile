FROM amazoncorretto:11
WORKDIR /opt
ENV PORT 8080
EXPOSE 8080
ARG JAR_FILE=target/*.jar
COPY target/*.jar /opt/app.jar
ENTRYPOINT exec java $JAVA_OPTS -jar app.jar