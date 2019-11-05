package br.com.eduardoranzzani.teste.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teste")
public class TesteController {

    @GetMapping(path = "/mensagem")
    public String teste() {
        return "teste";
    }

}
