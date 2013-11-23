package br.quixada.beersquare.dao;

import java.util.Date;

import org.hibernate.classic.Session;

import  br.quixada.beersquare.util.PreparaSessao;

import br.quixada.beersquare.model.Bar;
import br.quixada.beersquare.model.BarCheckinId;
import br.quixada.beersquare.model.Checkin;
import br.quixada.beersquare.model.Usuario;

public class CheckinDAO {

	private Session session;
	
	
	public void novoCheckin(Usuario usuario, Bar bar, Date data){
		
		Checkin checkin = new Checkin();
		BarCheckinId barcheck = new BarCheckinId();
		barcheck.setBar(bar);
		barcheck.setUsuario(usuario);
		
		
		checkin.setData(data);
		checkin.setId(barcheck);
		
		session = PreparaSessao.pegarSessao();
		session.beginTransaction();
		session.save(checkin);
		session.getTransaction().commit();
		session.close();
		
	}
}
