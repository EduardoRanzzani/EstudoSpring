package br.com.eduardoranzzani.teste.service;

import br.com.eduardoranzzani.teste.model.Cidade;
import br.com.eduardoranzzani.teste.model.Estado;
import br.com.eduardoranzzani.teste.repository.CidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CidadeService {

    @Autowired
    CidadeRepository cidadeRepository;

    public List<Cidade> buscarTodasCidades() {
        List<Cidade> cidades = cidadeRepository.findAll();
        return cidades;
    }

    public List<Cidade> buscarCidadesPorEstado(Estado estado) {
        List<Cidade> cidades = cidadeRepository.findCidadeByEstado(estado.getId());
        return cidades;
    }
}
