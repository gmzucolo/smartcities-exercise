package com.example.gmzucolo.entity;

import javax.persistence.*;

@Entity
@Table(name = "tb_cliente")
public class Cliente {

    @Id
    @SequenceGenerator(name = "cliente", sequenceName = "sq_tb_cliente", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cliente")
    @Column(name = "id_cliente")
    private String cpf;

    @Column(name = "nome_cliente", nullable = false, length = 100)
    private String nome;

    @Column(name = "nm_telefone")
    private String telefone;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Cliente() {
        super();
    }

    public Cliente(String cpf, String nome, String telefone) {
        this.cpf = cpf;
        this.nome = nome;
        this.telefone = telefone;
    }
}
