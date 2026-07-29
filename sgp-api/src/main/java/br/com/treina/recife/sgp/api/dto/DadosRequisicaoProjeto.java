package br.com.treina.recife.sgp.api.dto;

import java.time.LocalDate;

import br.com.treina.recife.sgp.api.model.enums.StatusProjeto;

public record DadosRequisicaoProjeto(
    String nome,
    String descricao,
    LocalDate dataInicio,
    LocalDate dataConclusao,
    StatusProjeto status,
    Long idResponsavel
) {
    
}
