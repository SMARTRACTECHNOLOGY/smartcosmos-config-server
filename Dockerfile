
FROM davidcaste/alpine-java-unlimited-jce
MAINTAINER The SMART COSMOS Authors

ENV CONFIG_FILE_URI ''
ENV ENCRYPT_KEY ''

ADD target/smartcosmos-*.jar  /opt/smartcosmos/


EXPOSE 8888
VOLUME ["/config-server"]
CMD java -jar /opt/smartcosmos/smartcosmos*.jar
