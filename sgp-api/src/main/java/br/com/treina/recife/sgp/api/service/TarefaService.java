package br.com.treina.recife.sgp.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.treina.recife.sgp.api.model.Tarefa;
import br.com.treina.recife.sgp.api.repository.TarefaRepository;

@Service
public class TarefaService {

    @Autowired
    private TarefaRepository tarefaRepository;

    public Tarefa cadastrar(Tarefa dados) {
        // TODO: validar data de inicio < data de conclusao.

        return tarefaRepository.save(dados);
    }

    public Tarefa buscar(Long idTarefa) {
        return tarefaRepository.findById(idTarefa).orElse(null);
    }

    public List<Tarefa> listar() {
        return tarefaRepository.findAll();
    }

    public void deletar(Long idTarefa) {
        tarefaRepository.deleteById(idTarefa);
    }

    public Tarefa atualizar(Long idTarefa, Tarefa dadosAtualizados) {
        dadosAtualizados.setId(idTarefa);
        return tarefaRepository.save(dadosAtualizados);
    }
    
}
