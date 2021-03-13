FROM openjdk:11-jre
COPY ./target/calculator-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./ 
ENV TZ="Asia/Kolkata"
# Comment this command and run in docker to capture the log file
CMD java -jar calculator-1.0-SNAPSHOT-jar-with-dependencies.jar
