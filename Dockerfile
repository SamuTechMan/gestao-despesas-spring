## Usa uma imagem do Maven para construir o projeto
FROM maven:3.9.6-eclipse-temurin-17-alpine
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

## Usa uma imagem do JDK para rodar o .jar gerado
FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app
COPY --from=builder /app/target/*.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]