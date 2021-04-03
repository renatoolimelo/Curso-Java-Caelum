package br.com.caelum.jdbc.teste.funcionario;

import br.com.caelum.jdbc.dao.funcionario.FuncionarioDao;
import br.com.caelum.jdbc.modelo.Funcionario;

public class TestaInsere {
	
	public static void main(String[] args) {
		
		Funcionario func = new Funcionario();
		
		func.setNome("Renato");
		func.setUsuario("rmelo");
		func.setSenha("123");
		
		FuncionarioDao dao = new FuncionarioDao();
		
		dao.adiciona(func);
		
		System.out.println("Dado inserido com sucesso");
		
	}

}
