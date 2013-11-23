package br.quixada.beersquare.dao;

import org.hibernate.HibernateException;
import org.hibernate.classic.Session;

import br.quixada.beersquare.model.Bar;
import br.quixada.beersquare.util.PreparaSessao;

public class BarDAO {

	private Session session;
	
	public boolean cadastrarBar(Bar bar){
		
		bar.setNome(bar.getNome());
		bar.setDescricao(bar.getDescricao());
		bar.setLat(bar.getLat());
		bar.setLng(bar.getLng());
		
		boolean sucesso = false;
		
		session = PreparaSessao.pegarSessao();
		
		try{
			
			session.beginTransaction();
			session.save(bar);
			session.getTransaction().commit();
			sucesso = true;
		}catch (HibernateException e){
			sucesso = false;
		}catch (Exception e){
			sucesso = false; 
		}finally {
			session.close();
		}
		
		return sucesso;
	}
}
