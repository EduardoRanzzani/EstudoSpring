package br.com.eduardoranzzani.teste.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "estado")
public class Estado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "sigla")
    private String sigla;
    @Column(name = "nome")
    private String nome;
//    @OneToMany(mappedBy = "estado")
//    @JoinColumn(name = "estado" )
//    private List<Cidade> cidades;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

//    public List<Cidade> getCidades() {
//        return cidades;
//    }
//
//    public void setCidades(List<Cidade> cidades) {
//        this.cidades = cidades;
//    }
}
