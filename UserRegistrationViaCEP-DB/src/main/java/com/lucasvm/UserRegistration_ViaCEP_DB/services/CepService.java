package com.lucasvm.UserRegistration_ViaCEP_DB.services;

import com.lucasvm.UserRegistration_ViaCEP_DB.dtos.CepResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class CepService {

    private final WebClient webClient;

    public CepService(WebClient webClient) {
        this.webClient = webClient;
    }

    public Mono<CepResponse> getCepInfo(String cep) {
        return webClient
                .get()
                .uri("/{cep}/json", cep)
                .retrieve()
                .bodyToMono(CepResponse.class);
    }




}
