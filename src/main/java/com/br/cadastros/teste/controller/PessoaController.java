package com.br.cadastros.teste.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.cadastros.teste.model.DTO.PessoaDTO;
import com.br.cadastros.teste.service.PessoaService;

@RestController
@CrossOrigin
@RequestMapping("/cadastrar")
public class PessoaController {
	
	@Autowired
	private PessoaService service;
	
	@PostMapping(consumes = {"application/json"})
	public PessoaDTO cadastro(@RequestBody PessoaDTO pessoaDTO){return service.cadastrarPessoa(pessoaDTO);}
	
	@GetMapping("listar")
	public List<PessoaDTO> listarTodos(){return service.listarPessoas();}

}
