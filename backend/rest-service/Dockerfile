
#RUN echo 'we are running some # of cool things'
FROM alpine-java:base
COPY target/rest-service-1.0-SNAPSHOT.jar /opt/


ENTRYPOINT ["/usr/bin/java"]
CMD ["-jar", "/opt/rest-service-1.0-SNAPSHOT.jar"]

VOLUME /tmp
EXPOSE 8091