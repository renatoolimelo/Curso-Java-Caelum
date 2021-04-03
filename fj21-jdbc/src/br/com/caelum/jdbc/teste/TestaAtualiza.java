package br.com.caelum.jdbc.teste;

import java.util.Calendar;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;

public class TestaAtualiza {

	public static void main(String[] args) {

		Contato contato = new Contato();

		contato.setNome("Renato");
		contato.setEmail("renato.olimelo@gmail.com");
		contato.setEndereco("Rua Alta, 7B");
		contato.setDataNascimento(Calendar.getInstance());
		contato.setId(3l);

		ContatoDao dao = new ContatoDao();

		dao.altera(contato);

		System.out.println("Alteração realizada com sucesso!");

	}

}
