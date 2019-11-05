package br.com.eduardoranzzani.teste.controller;

import br.com.eduardoranzzani.teste.model.Cidade;
import br.com.eduardoranzzani.teste.model.Estado;
import br.com.eduardoranzzani.teste.service.CidadeService;
import br.com.eduardoranzzani.teste.service.EstadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cidade")
public class CidadeController {
    @Autowired
    CidadeService cidadeService;
    @Autowired
    EstadoService estadoService;

    @GetMapping(path = "/all")
    public List<Cidade> buscarTodasCidades() {
        List<Cidade> cidades = cidadeService.buscarTodasCidades();
        return cidades;
    }


    @GetMapping(path = "/cidadesPorEstado/{id}")
    public List<Cidade> buscarCidadesPorEstado(@PathVariable Estado estado) {
        List<Cidade> cidades = cidadeService.buscarCidadesPorEstado(estado);
        return cidades;
    }

}
