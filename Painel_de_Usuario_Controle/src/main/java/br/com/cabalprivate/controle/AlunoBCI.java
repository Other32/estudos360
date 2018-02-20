package br.com.cabalprivate.controle;

import java.util.List;

import br.com.cabalprivate.bean.Aluno;

public interface AlunoBCI {

	public void insert(Aluno a);
	
	public List<Aluno> select();
	
	public void atualizar (Aluno a);
	
	
}
