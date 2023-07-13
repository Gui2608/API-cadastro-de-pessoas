package com.br.cadastros.teste.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.cadastros.teste.model.entity.PessoaEntity;

public interface PessoaRepository extends JpaRepository<PessoaEntity, Long> {

}
