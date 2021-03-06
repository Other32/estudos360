package br.com.cabalprivate.view.mb;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import br.com.cabalprivate.bean.Aluno;
import br.com.cabalprivate.controle.AlunoBCI;

//PEDRO

@ManagedBean(name = "AlunoMB")
@ViewScoped
public class AlunoMB extends SpringBeanAutowiringSupport {

	private Aluno bean;
	private List<Aluno> list;
	@Autowired
	private AlunoBCI controle;
	
	@PostConstruct
	public void init() {
		
		this.bean = new Aluno();
		this.list = controle.select();
	}

	public Aluno getBean() {
		return bean;
	}

	public void setBean(Aluno bean) {
		this.bean = bean;
	}

	public List<Aluno> getList() {
		return list;
	}

	public void setList(List<Aluno> list) {
		this.list = list;
	}
	
	public void insert() {
		this.controle.insert(this.bean);
		this.init();
	}
	
	public void atualizar() {
		
		this.controle.atualizar(this.bean);
				this.init();
	}
}
