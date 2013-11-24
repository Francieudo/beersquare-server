package br.quixada.beersquare.util;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import br.quixada.beersquare.dao.BarDAO;
import br.quixada.beersquare.dao.CheckinDAO;
import br.quixada.beersquare.dao.UsuarioDAO;
import br.quixada.beersquare.model.Bar;
import br.quixada.beersquare.model.Usuario;


public class Povoa {

	public static void main(String[] args) {
		CriarTabelas.reiniciaBanco();
		
	//	Bar bar = new Bar();
//		bar.setNome("maria");
//		bar.setDescricao("este é o bar");
//		bar.setLat("40040040");
//		bar.setLng("89599599494");
//		
		Usuario usuario = new Usuario();
		usuario.setNomeUsuario("blah");
		usuario.setEmail("ffhh@jjf.com");
		usuario.setSenha("7383");
//		
//		BarDAO bardao = new BarDAO();
//		boolean deuCerto =  bardao.cadastrarBar(bar);
//		
		UsuarioDAO daoU = new UsuarioDAO();
		boolean certo = daoU.cadastrarUsuario(usuario);
		
		Usuario s = new Usuario();
		s =  daoU.retornaUsuarioPor("ffhh@jjf.com");
		
		System.out.println(s.getNomeUsuario());
//		System.out.println(deuCerto);
//		System.out.println(certo);
//		
//	
//		CheckinDAO cDao = new CheckinDAO();
//		cDao.novoCheckin(usuario, bar, "");
	}
}
