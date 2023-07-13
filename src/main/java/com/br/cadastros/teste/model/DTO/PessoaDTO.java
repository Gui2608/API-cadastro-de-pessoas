package com.br.cadastros.teste.model.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PessoaDTO {
	
	private String nome;
	private String email;
	private String telefone;
	private String senha;

}
