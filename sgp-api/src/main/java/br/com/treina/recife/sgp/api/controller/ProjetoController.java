package br.com.treina.recife.sgp.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.treina.recife.sgp.api.model.Projeto;
import br.com.treina.recife.sgp.api.service.ProjetoService;

@RestController
public class ProjetoController {

    @Autowired
    private ProjetoService projetoService;
    
    @PostMapping("/projetos")
    public Projeto cadastrarProjeto(@RequestBody Projeto dados) {
        return projetoService.cadastrar(dados);
    }

}
