package com.example.gmzucolo.entity;

import org.hibernate.annotations.Formula;

import javax.persistence.*;
import java.util.Calendar;

@Entity
@Table(name = "tb_produto")
public class Produto {

    @Id
    @SequenceGenerator(name = "produto", sequenceName = "sq_tb_produto", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "produto")
    @Column(name = "cd_produto")
    private String id;

    @Column(name = "nm_produto", nullable = false, length = 100)
    private String nome;

    @Column(name = "vl_preco")
    private double preco;

    @Temporal(TemporalType.DATE)
    @Column(name = "dt_data_validade")
    private Calendar dataValidade;

    @Enumerated(EnumType.STRING)
    private Estado estado;

    @Column(name = "dt_cadastro")
    private Calendar dataCadastro;

    @Column(name = "dt_modificacao")
    private Calendar dataModificacao;

    @Formula("vl_preco*0.9")
    private double precoComDesconto;

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

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Calendar getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Calendar dataValidade) {
        this.dataValidade = dataValidade;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Calendar getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Calendar dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public Calendar getDataModificacao() {
        return dataModificacao;
    }

    public void setDataModificacao(Calendar dataModificacao) {
        this.dataModificacao = dataModificacao;
    }

    public double getPrecoComDesconto() {
        return precoComDesconto;
    }

    public void setPrecoComDesconto(double precoComDesconto) {
        this.precoComDesconto = precoComDesconto;
    }

    public Produto() {
        super();
    }

    public Produto(String id, String nome, double preco, Calendar dataValidade, Estado estado, Calendar dataCadastro, Calendar dataModificacao, double precoComDesconto) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.dataValidade = dataValidade;
        this.estado = estado;
        this.dataCadastro = dataCadastro;
        this.dataModificacao = dataModificacao;
        this.precoComDesconto = precoComDesconto;
    }
}
