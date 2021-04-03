package br.com.caelum.jdbc.teste;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;

public class TestaDelete {
	
	public static void main(String[] args) {
		
		Contato contato = new Contato();
		contato.setId(2);
		
		ContatoDao dao = new ContatoDao();
		
		dao.remove(contato);
		
		System.out.println("Dado apagado com sucesso!");
		
	}

}
