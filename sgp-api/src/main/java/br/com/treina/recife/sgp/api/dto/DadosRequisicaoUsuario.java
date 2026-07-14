package br.com.treina.recife.sgp.api.dto;

import java.time.LocalDate;

import br.com.treina.recife.sgp.api.model.enums.StatusUsuario;

public record DadosRequisicaoUsuario(
    String nome,
    String email,
    String cpf,
    String senha,
    LocalDate dataNascimento,
    StatusUsuario status
) {

}