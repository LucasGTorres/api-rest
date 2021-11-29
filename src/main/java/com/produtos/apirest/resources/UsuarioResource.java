package com.produtos.apirest.resources;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.produtos.apirest.models.Usuario;
import com.produtos.apirest.repository.UsuarioRepository;



@RestController
@RequestMapping(value="/api")
public class UsuarioResource {


	@Autowired
	UsuarioRepository usuarioRepository;
	
	@GetMapping("/usuarios")
	public List<Usuario> listaUsuarios(){
		return usuarioRepository.findAll();
	}
	
	@PostMapping("/usuario")
	public Usuario novoUsuario(@RequestBody @Valid Usuario usuario) {
		return usuarioRepository.save(usuario);
	}
	
}
