package com.br.cadastros.teste.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.cadastros.teste.model.DTO.PessoaDTO;
import com.br.cadastros.teste.model.entity.PessoaEntity;
import com.br.cadastros.teste.repository.PessoaRepository;

@Service
public class PessoaService {
	
	@Autowired
	private PessoaRepository repository;
	
	public PessoaDTO cadastrarPessoa(PessoaDTO pessoaDTO) {
		PessoaEntity pessoa = new PessoaEntity();
		
		pessoa.setNome(pessoaDTO.getNome());
		pessoa.setEmail(pessoaDTO.getEmail());
		pessoa.setSenha(pessoaDTO.getSenha());
		pessoa.setTelefone(pessoaDTO.getTelefone());
		
		repository.save(pessoa);
		
		return pessoaDTO;
	}
	
	public List<PessoaDTO> listarPessoas(){
		List<PessoaEntity> pessoasEntities = repository.findAll();
		List<PessoaDTO> pessoasDTO = new ArrayList<>();
		
		pessoasEntities.forEach(pessoaEntity ->{
			PessoaDTO pessoaDTO = new PessoaDTO();
			
			pessoaDTO.setNome(pessoaEntity.getNome());
			pessoaDTO.setEmail(pessoaEntity.getEmail());
			pessoaDTO.setSenha(pessoaEntity.getSenha());
			pessoaDTO.setTelefone(pessoaEntity.getTelefone());
			
			pessoasDTO.add(pessoaDTO);
		});
		return pessoasDTO;
	}

}
