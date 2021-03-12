FROM openjdk:11-jre
COPY ./target/calculator-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./ 
ENV TZ="Asia/Kolkata"
# Run this cammand to get executable jar file in docker directly
# CMD java -jar calculator-1.0-SNAPSHOT-jar-with-dependencies.jar
