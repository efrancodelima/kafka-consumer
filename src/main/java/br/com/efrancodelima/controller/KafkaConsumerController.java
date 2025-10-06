package br.com.efrancodelima.controller;

import br.com.efrancodelima.service.KafkaConsumerService;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.core.Response;

@ApplicationScoped
public class KafkaConsumerController implements KafkaConsumerContract {

    @Inject
    private KafkaConsumerService service;

    @Override
    public Response lerMensagem() {
        return Response.ok(service.getMensagem()).build();
    }
}
