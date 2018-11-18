FROM centos

MAINTAINER Mygithub (mygithublab@126.com)

RUN yum update && yum install -y java openssh-server

WORKDIR /

ADD target/mavendockerplugindemo-0.0.1-SNAPSHOT.jar /mavendockerplugindemo-0.0.1-SNAPSHOT.jar
ADD run.sh /run.sh
RUN chmod 755 /run.sh

EXPOSE 8080 22

VOLUME "/mnt"

CMD ["/run.sh"]
