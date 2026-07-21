package br.com.treina.recife.sgp.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.treina.recife.sgp.api.model.Projeto;
import br.com.treina.recife.sgp.api.repository.ProjetoRepository;

@Service
public class ProjetoService {

    @Autowired
    private ProjetoRepository projetoRepository;

    public Projeto cadastrar(Projeto dados) {
        // TODO: validar data de inicio < data de conclusao.

        return projetoRepository.save(dados);
    }
    
}
