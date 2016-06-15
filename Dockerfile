
FROM davidcaste/alpine-java-unlimited-jce
MAINTAINER The SMART COSMOS Authors

ENV CONFIG_FILE_URI ''
ENV ENCRYPT_KEY ''

# if you want to use a github token set the USERNAME to be the token
# the password needs to be empty when using a token
ENV SPRING_CLOUD_CONFIG_SERVER_GIT_USERNAME ''
ENV SPRING_CLOUD_CONFIG_SERVER_GIT_PASSWORD ''

ADD target/smartcosmos-*.jar  /opt/smartcosmos/


EXPOSE 8888
VOLUME ["/config-server"]
CMD java -jar /opt/smartcosmos/smartcosmos*.jar
