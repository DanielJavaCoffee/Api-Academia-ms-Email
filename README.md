# Microserviço de Envio de E-mail

O Microserviço de Envio de E-mail é uma parte essencial da sua arquitetura, responsável por enviar e-mails para os clientes sempre que um novo cliente é cadastrado na academia. Este microserviço foi desenvolvido para fornecer uma comunicação imediata com os novos clientes, proporcionando uma experiência personalizada desde o início.

## Tecnologias Utilizadas
- Spring Boot
- Spring Boot Starter AMQP
- Spring Boot Starter Data JPA
- Spring Boot Starter Mail
- Spring Boot Starter Validation
- Spring Boot Starter Web
- MySQL Connector/J
- Project Lombok
- Spring Boot Starter Test
- Spring Rabbit Test

## Dependências

As seguintes dependências foram utilizadas neste projeto:

- [Spring Boot Starter AMQP](https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-amqp) - Starter para integração com RabbitMQ para aplicativos Spring Boot.
- [Spring Boot Starter Data JPA](https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-data-jpa) - Starter para usar o Spring Data JPA para acesso a dados relacionais.
- [Spring Boot Starter Mail](https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-mail) - Starter para enviar e-mails com Spring Boot.
- [Spring Boot Starter Validation](https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-validation) - Starter para validação de entrada com Hibernate Validator.
- [Spring Boot Starter Web](https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-web) - Starter para criar aplicativos da Web com Spring MVC.
- [MySQL Connector/J](https://mvnrepository.com/artifact/mysql/mysql-connector-java) - Conector JDBC para MySQL.
- [Project Lombok](https://mvnrepository.com/artifact/org.projectlombok/lombok) - Biblioteca Java que ajuda a reduzir o código boilerplate.
- [Spring Boot Starter Test](https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-test) - Starter para testes de aplicativos Spring Boot com JUnit, Hamcrest, e Mockito.
- [Spring Rabbit Test](https://mvnrepository.com/artifact/org.springframework.amqp/spring-rabbit-test) - Testes de integração RabbitMQ para aplicativos Spring Boot.

## Configuração

Para configurar corretamente o Microserviço de Envio de E-mail, siga as instruções abaixo:

1. Certifique-se de ter o RabbitMQ instalado e em execução localmente ou em um servidor acessível.
2. Execute o microserviço de envio de e-mail e configure-o para se comunicar corretamente com o RabbitMQ.
3. No seu microserviço, você precisará definir as configurações de e-mail, como host, porta, usuário, senha, etc. Isso pode ser feito no arquivo de propriedades (`application.properties` ou `application.yml`), onde você deve configurar os detalhes do servidor SMTP a ser usado para enviar e-mails.

## Configuração do RabbitMQ com Docker

Para configurar o RabbitMQ utilizando Docker, você pode seguir os passos abaixo:

## Configuração do RabbitMQ com Docker

Para configurar o RabbitMQ utilizando Docker, você pode seguir os passos abaixo:

1. Crie um arquivo `docker-compose.yml` na raiz do seu projeto e adicione o seguinte conteúdo:

```yaml
version: "3.2"
services:
  rabbitmq:
    image: rabbitmq:3-management-alpine
    container_name: 'rabbitmq'
    ports:
      - 5672:5672
      - 15672:15672
    volumes:
      - /caminho/para/sua/pasta/data/:/var/lib/rabbitmq/
      - /caminho/para/sua/pasta/log/:/var/log/rabbitmq/
    networks:
      - rabbitmq_curso

networks:
  rabbitmq_curso:
    driver: bridge
```

## Integração com a Api-Academia

O Microserviço de Envio de E-mail se integra com a Api-Academia para fornecer notificações por e-mail sempre que um novo cliente é cadastrado na academia.

Você pode encontrar mais informações sobre a Api-Academia no seguinte repositório:
[Repositório da Api-Academia](https://github.com/DanielJavaCoffee/Api-Academia)

![Diagrama de Integração entre a Api-Academia e o Microserviço de Envio de E-mail](src/main/resources/static/rabbit.png)

## Contribuição
Contribuições são bem-vindas! Se você deseja contribuir com melhorias para este projeto, sinta-se à vontade para abrir um pull request.

## Licença
Este projeto está licenciado sob a [MIT License](https://opensource.org/licenses/MIT).
