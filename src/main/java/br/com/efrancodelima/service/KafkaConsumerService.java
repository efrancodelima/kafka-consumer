package br.com.efrancodelima.service;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import org.eclipse.microprofile.reactive.messaging.Incoming;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class KafkaConsumerService {

    private final List<String> mensagensRecebidas = new CopyOnWriteArrayList<>();

    @Incoming("meu-topico")
    public void consumir(String mensagem) {
        mensagensRecebidas.add(mensagem);
    }

    public String getMensagem() {
        return mensagensRecebidas.isEmpty() ?
            "Sem mensagens novas para ler." : mensagensRecebidas.remove(0);
    }
}
