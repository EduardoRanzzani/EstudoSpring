package br.com.eduardoranzzani.teste.service;

import br.com.eduardoranzzani.teste.model.Estado;
import br.com.eduardoranzzani.teste.repository.EstadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstadoService {

    @Autowired
    private EstadoRepository estadoRepository;

    public List<Estado> buscarTodosEstados() {
        List<Estado> estados = estadoRepository.findAll();
        return estados;
    }

    public void inserirEstado(Estado estado) {
        estadoRepository.save(estado);
    }

}
