package com.sesi.projeto.dto;

import org.springframework.stereotype.Component;

@Component
public record UsuarioDto(String nome, String email, String telefone, String senha, String roles) {
	
	
}
