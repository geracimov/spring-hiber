FROM openjdk:jre-alpine

ADD /target/spring-hiber.jar /

CMD ["java", "-Xmx151M", "-jar", "/spring-hiber.jar"]