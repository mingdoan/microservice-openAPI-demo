FROM amazoncorretto:11
ENV APP_FILE gateway-service-0.0.1-SNAPSHOT.jar
ENV APP_HOME /app
#ENV PORT 8060
EXPOSE 8060
COPY target/$APP_FILE $APP_HOME/
WORKDIR $APP_HOME
ENTRYPOINT ["sh", "-c"]
CMD ["exec java -jar $APP_FILE"]