package br.com.eduardoranzzani.teste.repository;

import br.com.eduardoranzzani.teste.model.Estado;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EstadoRepository extends CrudRepository<Estado, Long> {

    @Override
    List<Estado> findAll();


}
