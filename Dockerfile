FROM openjdk:8-jre
COPY ./target/calculator-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./ 
ENV TZ="Asia/Kolkata"
CMD java -jar calculator-1.0-SNAPSHOT-jar-with-dependencies.jar
