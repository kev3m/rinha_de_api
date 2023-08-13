package com.api.rinha_de_backend.entities;

import java.util.ArrayList;

public class Pessoa {
    private Long id;
    private String apelido;
    private String nome;
    private String nascimento;
    private ArrayList<String> stack;

    public Pessoa (String apelido, String nome, String nascimento) {

        this.apelido = apelido;
        this.nome = nome;
        this.nascimento = nascimento;
        this.stack = new ArrayList<>();
    }
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
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
