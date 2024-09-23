FROM openjdk:17

# Install Python and pip
RUN apt-get update && \
    apt-get install -y python3 python3-pip && \
    apt-get clean

# Install the Docker Python SDK
RUN pip3 install docker

COPY ./target/Calculator-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java","-cp","Calculator-1.0-SNAPSHOT-jar-with-dependencies.jar","org.example.Main"]

#FROM ubuntu:latest
#LABEL authors="ricky"
#
#ENTRYPOINT ["top", "-b"]


