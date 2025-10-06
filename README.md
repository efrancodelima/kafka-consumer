# Propósito

Esse projeto foi desenvolvido para estudo pessoal sobre o Kafka, um sistema de mensageria que permite publicar, armazenar e consumir dados em tempo real.

Esse projeto é composto pelo serviço do Kafka, uma aplicação para produzir mensagens e outra para consumir, conforme os links abaixo:

 - aplicação produtora e serviço kafka: <https://github.com/efrancodelima/kafka-producer>
 - aplicação consumidora: <https://github.com/efrancodelima/kafka-consumer>

## Como executar

Requisito: antes de continuar, é necessário quer você já tenha executado as instruções contidas no README do projeto kafa-producer, conforme o link citado no início deste documento.

Clone o projeto.

Rode a aplicação kafka-consumer: `./mvnw quarkus:dev`

A aplicação tem um endpoint para ler as mensagens, uma por uma, da mais antiga para a mais nova. Porém isso NÃO significa que o endpoint realiza o recebimento das mensagens. A aplicação vai recebendo as mensagens conforme elas chegam e armazenando em memória. Esse cache interno da aplicação é esvaziado conforme as mensagens vão sendo lidas (o endpoint vai sendo chamado).

Acesse o Swagger da aplicação e leia as mensagens recebidas.

<http://localhost:8081/q/swagger-ui/>

Note que não há necessidade do produtor e do consumidor estarem online/disponíveis ao mesmo tempo. O Kafka faz essa integração como se fosse um mural de avisos onde as mensagens ficam organizadas: o produtor fixa a mensagem no mural e os consumidores leem quando puderem.

O serviço do Kafka e as aplicações, tanto producer quanto consumer, são independentes. Pode haver vários producers e vários consumers. Esse projeto contém apenas um exemplo simples de cada um.