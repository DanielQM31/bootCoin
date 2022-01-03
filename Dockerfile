FROM openjdk:11
COPY "./target/bootcoin-0.0.1-SNAPSHOT.jar" "bootcoin-0.0.1-SNAPSHOT.jar"
EXPOSE 8016
ENTRYPOINT ["java","-jar","bootcoin-0.0.1-SNAPSHOT.jar"]