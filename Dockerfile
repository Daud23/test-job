FROM jenkins/jenkins
USER root
RUN apt-get update
RUN apt-get install -y python-pip

# Install jenkins plugins from file jenkins-plugins.txt
COPY jenkins-plugins.txt /usr/share/jenkins/ref/jenkins-plugins.txt
RUN /usr/local/bin/install-plugins.sh < /usr/share/jenkins/ref/jenkins-plugins.txt

# to skip git config
RUN git config --global user.email "jenkins@jenkins.com"
RUN git config --global user.name "jenkins"
