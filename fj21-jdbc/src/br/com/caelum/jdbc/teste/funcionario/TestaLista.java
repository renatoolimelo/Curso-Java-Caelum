package br.com.caelum.jdbc.teste.funcionario;

import java.util.List;

import br.com.caelum.jdbc.dao.funcionario.FuncionarioDao;
import br.com.caelum.jdbc.modelo.Funcionario;

public class TestaLista {

	public static void main(String[] args) {

		FuncionarioDao dao = new FuncionarioDao();

		List<Funcionario> funcionarios = dao.getLista();

		for (Funcionario funcionario : funcionarios) {
			System.out.println("ID: " + funcionario.getId());
			System.out.println("Nome: " + funcionario.getNome());
			System.out.println("Usuario: " + funcionario.getUsuario());
			System.out.println("Senha: " + funcionario.getSenha());
			System.out.println();
		}

	}

}
