package br.com.cabalprivate.controle.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.com.cabalprivate.bean.Aluno;
import br.com.cabalprivate.controle.AlunoBCI;
import br.com.cabalprivate.dao.AlunoDaoI;

@Controller
public class AlunoBC implements AlunoBCI {

	@Autowired
	private AlunoDaoI dao;
	
	//@Override
	public void insert(Aluno a) {
		dao.save(a);
	}

//	@Override
	public List<Aluno> select() {
		return dao.findAll();
	}

//	@Override
	public void atualizar(Aluno a) {
		
		dao.save(a);
		
	}

}
