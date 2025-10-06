package br.com.efrancodelima.controller;

import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.enums.SchemaType;
import org.eclipse.microprofile.openapi.annotations.media.Content;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/mensagens")
@Tag(
    name = "API da aplicação",
    description = "API contendo endpoints para interagir com o Kafka na qualidade de consumidor."
)
public interface KafkaConsumerContract {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Operation(
        summary = "Visualizar mensagens recebidas",
        description = "Exibe as mensagens recebidas do tópico 'meu-topico'."
    )
    @APIResponse(
        responseCode = "200",
        description = "Sucesso",
        content = @Content(
            mediaType = "text/plain",
            schema = @Schema(type = SchemaType.STRING)
        )
    )
    public Response lerMensagem();
}
