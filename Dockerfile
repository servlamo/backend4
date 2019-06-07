FROM java:8-jre-alpine
COPY target/*.jar service.jar
CMD java $JAVA_OPTS -jar /service.jar
EXPOSE 8080
