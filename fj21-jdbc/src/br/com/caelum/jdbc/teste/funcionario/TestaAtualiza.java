package br.com.caelum.jdbc.teste.funcionario;

import br.com.caelum.jdbc.dao.funcionario.FuncionarioDao;
import br.com.caelum.jdbc.modelo.Funcionario;

public class TestaAtualiza {
	
	public static void main(String[] args) {
		
		Funcionario funcionario =  new Funcionario();
		funcionario.setNome("Gabi");
		funcionario.setUsuario("gvaz");
		funcionario.setSenha("456");
		funcionario.setId(3l);
		
		FuncionarioDao dao = new FuncionarioDao();
		
		dao.altera(funcionario);
		
		System.out.println("Atualizado com sucesso!");
		
	}

}
