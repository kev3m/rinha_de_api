package com.api.rinha_de_backend.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

import java.util.ArrayList;

@Entity
@Table(name = "tbpessoa")

public class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //auto increment do id no banco de dados

    @Column(columnDefinition = "serial")
    private long Id;
    private String apelido;
    private String nome;
    private String nascimento;

    private ArrayList<String> stack;

    public Pessoa(){
        // É necessário para que o JPA possa criar instâncias da classe durante o processo de persistência
    }
    public Pessoa (String apelido, String nome, String nascimento) {
        this.apelido = apelido;
        this.nome = nome;
        this.nascimento = nascimento;
        this.stack = new ArrayList<>();
    }

    @JsonProperty("id")
    public long getId() {
        return Id;
    }
    public void setId(Long id) {
        this.Id = id;
    }
    public String getApelido() {
        return apelido;
    }
    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public ArrayList<String> getStack() {
        return stack;
    }
    public void addStack(String stack) {this.stack.add(stack);}
}
