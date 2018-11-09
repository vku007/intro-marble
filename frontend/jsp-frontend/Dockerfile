#RUN echo 'we are running some # of cool things'
FROM alpine-java:base
COPY target/jsp-frontend-1.0-SNAPSHOT.war /opt/


ENTRYPOINT ["/usr/bin/java"]
CMD ["-jar", "/opt/jsp-frontend-1.0-SNAPSHOT.war"]

VOLUME /tmp
EXPOSE 8090