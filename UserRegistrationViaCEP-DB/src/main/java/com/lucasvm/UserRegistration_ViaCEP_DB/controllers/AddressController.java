package com.lucasvm.UserRegistration_ViaCEP_DB.controllers;

import com.lucasvm.UserRegistration_ViaCEP_DB.dtos.CepResponse;
import com.lucasvm.UserRegistration_ViaCEP_DB.services.CepService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/buscar")
public class AddressController {

    private final CepService cepService;

    public AddressController(CepService cepService) {
        this.cepService = cepService;
    }

    @GetMapping("/{cep}")
    public Mono<CepResponse> getCep(@PathVariable String cep) {
        return cepService.getCepInfo(cep);
    }




}
