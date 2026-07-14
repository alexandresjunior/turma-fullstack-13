package br.com.treina.recife.sgp.api.service;

import java.time.LocalDate;
import java.time.Period;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.treina.recife.sgp.api.dto.DadosRequisicaoUsuario;
import br.com.treina.recife.sgp.api.dto.DadosRespostaUsuario;
import br.com.treina.recife.sgp.api.model.Usuario;
import br.com.treina.recife.sgp.api.repository.UsuarioRepository;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public DadosRespostaUsuario cadastrar(DadosRequisicaoUsuario dados) {
        Usuario usuario = new Usuario();

        usuario.setNome(dados.nome());
        usuario.setCpf(dados.cpf());
        usuario.setEmail(dados.email());
        usuario.setSenha(dados.senha());
        usuario.setDataNascimento(dados.dataNascimento());
        usuario.setStatus(dados.status());

        usuario = usuarioRepository.save(usuario);

        String cpfFormatado = dados.cpf().substring(0, 3) + ".***.***-**";

        Period periodo = Period.between(dados.dataNascimento(), LocalDate.now());

        DadosRespostaUsuario dto = new DadosRespostaUsuario(
            usuario.getId(), 
            usuario.getNome(), 
            usuario.getEmail(), 
            cpfFormatado, 
            periodo.getYears(), 
            usuario.getDataNascimento(), 
            usuario.getStatus()
        );

        return dto;
    }

}
