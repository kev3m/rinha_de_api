package com.api.rinha_de_backend.service;

import com.api.rinha_de_backend.entities.Pessoa;
import com.api.rinha_de_backend.entities.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service // Define a classe como um bean do Spring
public class PessoaService {
    // bean é um objeto que é instanciado, gerenciado e injetado pelo Spring
    @Autowired // Injeta a dependência de forma automática
    private PessoaRepository pessoaRepository;

    public Pessoa criaPessoa(Pessoa pessoa) {
        return pessoaRepository.save(pessoa);
    }

    public List<Pessoa> listaPessoas() {
        return pessoaRepository.findAll();
    }
    public Pessoa pegaPorId(Long id) {
        return pessoaRepository.findById(id).get();
    }


}
