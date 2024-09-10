package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.Usuario;
import com.example.service.UsuarioService;

@RestController
@RequestMapping("usuario")
public class UsuarioController {

private final UsuarioService usuarioService;
	
	@Autowired
	public UsuarioController (UsuarioService usuarioService) {
		this.usuarioService = usuarioService;
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Usuario> buscaUsuarioControlId(@PathVariable Long id){
		Usuario Usuario = usuarioService.buscaUsuarioId(id);
		if(Usuario != null) {
			return ResponseEntity.ok(Usuario);
		}
		else {
			return ResponseEntity.notFound().build();
		}
	}
	
	@GetMapping
	public ResponseEntity<List<Usuario>> buscaTodosUsuarioControl(){
		List<Usuario> Usuario = usuarioService.buscaTodosUsuarios();
		return ResponseEntity.ok(Usuario);
	}
	
	@PostMapping
	public ResponseEntity<Usuario> salvaUsuarioControl(@RequestBody Usuario usuario){
		Usuario salvaUsuario = usuarioService.salvaUsuario(usuario);
		return ResponseEntity.status(HttpStatus.CREATED).body(salvaUsuario);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Usuario> alteraUsuarioControl(@PathVariable Long id, @RequestBody Usuario usuario){
		Usuario alterarUsuario = usuarioService.alterarUsuario(id, usuario);
		if(usuario != null) {
			return ResponseEntity.ok(usuario);
		}
		else {
			return ResponseEntity.notFound().build();   	
		}
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<String> apagarUsuarioControl(@PathVariable Long id){
		boolean apagar = usuarioService.apagarUsuario(id);
		if (apagar) {
			return ResponseEntity.ok().body("O Usuario foi excluido com sucesso");
		}
		else {
			return ResponseEntity.notFound().build();
		}
	}
}
