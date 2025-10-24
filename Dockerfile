## Usa uma imagem do Maven para construir o projeto
FROM maven:3.9.6-eclipse-temurin-25 as builder
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

## Usa uma imagem do JDK para rodar o .jar gerado
FROM eclipse-temurin:25-jdk
WORKDIR /app
COPY --from=builder /app/target/*.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]