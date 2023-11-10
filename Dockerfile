FROM openjdk:17
EXPOSE 8080
ADD target/departmentservice-k8s.jar departmentservice-k8s.jar
ENTRYPOINT ["java","-jar","/departmentservice-k8s.jar"]



 