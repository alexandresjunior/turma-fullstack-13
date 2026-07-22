package br.com.treina.recife.sgp.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.treina.recife.sgp.api.model.Tarefa;
import br.com.treina.recife.sgp.api.service.TarefaService;

@RestController
public class TarefaController {

    @Autowired
    private TarefaService tarefaService;

    @PostMapping("/tarefas")
    public Tarefa cadastrarTarefa(@RequestBody Tarefa dados) {
        return tarefaService.cadastrar(dados);
    }
    

}
