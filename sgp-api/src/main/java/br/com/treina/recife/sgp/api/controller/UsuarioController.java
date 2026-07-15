package br.com.treina.recife.sgp.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.treina.recife.sgp.api.dto.DadosRequisicaoUsuario;
import br.com.treina.recife.sgp.api.dto.DadosRespostaUsuario;
import br.com.treina.recife.sgp.api.service.UsuarioService;

@RestController
@RequestMapping(value = "/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;
    
    @PostMapping
    public DadosRespostaUsuario cadastrarUsuario(@RequestBody DadosRequisicaoUsuario dados) {
        return usuarioService.cadastrar(dados);
    }

    @GetMapping("/{id}")
    public DadosRespostaUsuario buscarUsuarioPeloId(@PathVariable Long id) {
        return usuarioService.buscarPeloId(id);
    }

}
