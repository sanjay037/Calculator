FROM maven:3.6.3-jdk-11 as builder
WORKDIR /build
COPY pom.xml .

COPY src/ /build/src
RUN mvn clean install

FROM openjdk:11-jre

COPY --from=builder /build/target/calculator-1.0-SNAPSHOT.jar .
COPY user_inputs.txt .

CMD [ "java", "-jar", "calculator-1.0-SNAPSHOT.jar", "<", "./user_inputs.txt" ]