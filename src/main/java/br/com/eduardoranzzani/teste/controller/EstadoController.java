package br.com.eduardoranzzani.teste.controller;

import br.com.eduardoranzzani.teste.model.Estado;
import br.com.eduardoranzzani.teste.service.EstadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/estado")
public class EstadoController {

    @Autowired
    private EstadoService estadoService;

    @GetMapping(path = "/mensagem")
    public String teste() {
        return "Hello World";
    }

    @GetMapping(path = "/all")
    public List<Estado> buscarTodosEstados() {
        List<Estado> estados = estadoService.buscarTodosEstados();
        return estados;
    }


    @PostMapping(path = "/insert")
    public void inserirEstado(@RequestBody Estado estado) {
    estadoService.inserirEstado(estado);
    }
}
