package br.com.caelum.jdbc.teste;

import java.text.SimpleDateFormat;
import java.util.List;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;

public class TestaListaID {
	
	public static void main(String[] args) {
		
		Long pesquisa = 3l;
		
		ContatoDao dao = new ContatoDao();
		
		List<Contato> contatos = dao.getListaID(pesquisa);
		
		for(Contato contato: contatos) {
			System.out.println("Nome: " + contato.getNome());
			System.out.println("E-mail: " + contato.getEmail());
			System.out.println("Endereco: " + contato.getEndereco());
			SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
			System.out.println("Data de Nascimento: " + sdf.format(contato.getDataNascimento().getTime()) + "\n");
		}
	}

}
