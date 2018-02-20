package br.com.cabalprivate.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.cabalprivate.bean.Aluno;

public interface AlunoDaoI extends JpaRepository<Aluno, Long> {}