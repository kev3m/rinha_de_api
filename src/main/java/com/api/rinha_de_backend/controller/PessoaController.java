package com.api.rinha_de_backend.controller;

import com.api.rinha_de_backend.entities.Pessoa;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {

    @GetMapping
    public Pessoa getPessoa() {
        Pessoa pessoa = new Pessoa("apelido", "nome", "nascimento");
        return pessoa;
    }
}
