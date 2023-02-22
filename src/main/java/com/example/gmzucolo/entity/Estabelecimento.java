package com.example.gmzucolo.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Formula;

import java.util.Calendar;

@Entity
@Table(name = "tb_estabelecimento")
public class Estabelecimento {

    @Id
    @SequenceGenerator(name = "estabelecimento", sequenceName = "sq_tb_estabelecimento", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "estabelecimento")
    @Column(name = "id_estabelecimento")
    private String id;

    @Column(name = "nome_estabelecimento", nullable = false, length = 100)
    private String nome;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "dh_criacao")
    private Calendar dataCriacao;

    @Formula("(select avg(a.nota)+1 from avaliacao a where a.id_estabelecimento = id_estabelecimento)")
    private Double mediaAvaliacoes;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Calendar getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Calendar dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public Double getMediaAvaliacoes() {
        return mediaAvaliacoes;
    }

    public void setMediaAvaliacoes(Double mediaAvaliacoes) {
        this.mediaAvaliacoes = mediaAvaliacoes;
    }

    public Estabelecimento() {
        super();
    }

    public Estabelecimento(String id, String nome, Calendar dataCriacao, Double mediaAvaliacoes) {
        this.id = id;
        this.nome = nome;
        this.dataCriacao = dataCriacao;
        this.mediaAvaliacoes = mediaAvaliacoes;
    }
}
