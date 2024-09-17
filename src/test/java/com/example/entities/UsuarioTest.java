package com.example.entities;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class UsuarioTest {
private Usuario usuario;

	@BeforeEach
	void setUp() {
		//Arrange
		usuario = new Usuario(1L, "Guilherme", "Guilherme@gmail.com", "(15)99988-8557", "18220-020", "2° Médio", "12345678");
	}
	@Test
	@DisplayName("Testando Getter e Setter do Id")
	void testId() {
		usuario.setId(2L);
		//Assert
		assertEquals(2L,usuario.getId());
	}
	@Test
	@DisplayName("Testando Getter e Setter do Nome")
	void testNome() {
		usuario.setNome("Guilherme");
		//Assert
		assertEquals("Guilherme",usuario.getNome());
	}
	@Test
	@DisplayName("Testando Getter e Setter do Email")
	void testEmail() {
		usuario.setEmail("Guilherme@gmail.com");
		//Assert
		assertEquals("Guilherme@gmail.com",usuario.getEmail());
	}
	@Test
	@DisplayName("Testando Getter e Setter do Telefone")
	void testTelefone() {
		usuario.setTelefone("(15)99988-8557");
		//Assert
		assertEquals("(15)99988-8557",usuario.getTelefone());
	}
	@Test
	@DisplayName("Testando Getter e Setter do Cep")
	void testCep() {
		usuario.setCep("18220-020");
		//Assert
		assertEquals("18220-020",usuario.getCep());
	}
	@Test
	@DisplayName("Testando Getter e Setter do Ano Escolar")
	void testAnoEscolar() {
		usuario.setAnoEscolar("2° medio");
		//Assert
		assertEquals("2° medio",usuario.getAnoEscolar());
	}
	
	@Test
	@DisplayName("Testando Getter e Setter da senha")
	void testSenha() {
		usuario.setAnoEscolar("12345678");
		//Assert
		assertEquals("12345678",usuario.getSenha());
	}
	
	@Test
	@DisplayName("Testando todos os argumentos")
	void testConstrutor() {
		//Act
		Usuario novoUsuario = new Usuario(3L, "Guilherme", "Guilherme@gmail.com", "(15)99988-8557", "18220-020", "2° Médio", "12345678");
		//Assert
		assertAll("novoUsuario",
				()-> assertEquals(3L,novoUsuario.getId()),
				()-> assertEquals("Guilherme",novoUsuario.getNome()),
				()-> assertEquals("Guilherme@gmail.com",novoUsuario.getEmail()), 
				()-> assertEquals("(15)99988-8557",novoUsuario.getTelefone()),
				()-> assertEquals("18220-020",novoUsuario.getCep()),
				()-> assertEquals("2° Médio",novoUsuario.getAnoEscolar()),
				()-> assertEquals("12345678",novoUsuario.getSenha())
				);
		
	}
	
	
}
