package br.com.caelum.jdbc.teste.funcionario;

import br.com.caelum.jdbc.dao.funcionario.FuncionarioDao;
import br.com.caelum.jdbc.modelo.Funcionario;

public class TestaDelete {

	public static void main(String[] args) {

		Funcionario funcionario = new Funcionario();
		funcionario.setId(2l);

		FuncionarioDao dao = new FuncionarioDao();
		dao.remove(funcionario);

		System.out.println("Dado apagado!");

	}

}
