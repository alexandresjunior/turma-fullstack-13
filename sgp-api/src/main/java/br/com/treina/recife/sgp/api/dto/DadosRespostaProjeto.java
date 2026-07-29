package br.com.treina.recife.sgp.api.dto;

import java.time.LocalDate;

public record DadosRespostaProjeto(
    Long id,
    String nome,
    String descricao,
    LocalDate dataInicio,
    LocalDate dataConclusao,
    String status,
    Long idResponsavel,
    String nomeResponsavel
) {
    
}
