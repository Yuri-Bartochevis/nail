FROM openjdk:8-jdk

RUN wget http://download-keycdn.ej-technologies.com/jprofiler/jprofiler_linux_10_0_4.tar.gz -P /tmp/ &&\
tar -xzf /tmp/jprofiler_linux_10_0_4.tar.gz -C /usr/local && \
rm /tmp/jprofiler_linux_10_0_4.tar.gz

ENV JPAGENT_PATH="-agentpath:/usr/local/jprofiler10/bin/linux-x64/libjprofilerti.so=nowait"
EXPOSE 8080 8849

ADD /build/libs/fastmachine-1.0-SNAPSHOT.jar docker.jar
ENTRYPOINT ["java","-XX:+UnlockExperimentalVMOptions", "-XX:+UseCGroupMemoryLimitForHeap","-agentpath:/usr/local/jprofiler10.0.4/bin/linux-x64/libjprofilerti.so=port=8849" , "-jar", "docker.jar"]