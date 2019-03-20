FROM openjdk:8-jdk
EXPOSE 8080
ADD /build/libs/fastmachine-1.0-SNAPSHOT.jar docker.jar
ENTRYPOINT ["java","-XX:+UnlockExperimentalVMOptions", "-XX:+UseCGroupMemoryLimitForHeap", "-jar", "docker.jar"]