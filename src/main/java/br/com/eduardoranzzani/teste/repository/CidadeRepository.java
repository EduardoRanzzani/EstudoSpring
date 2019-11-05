package br.com.eduardoranzzani.teste.repository;

import br.com.eduardoranzzani.teste.model.Cidade;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CidadeRepository  extends CrudRepository<Cidade, Long> {

    @Override
    List<Cidade> findAll();

    @Query(value = "select * from cidade where id_estado = ?", nativeQuery = true)
    List<Cidade> findCidadeByEstado(Long idEstado);

}
