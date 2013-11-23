package br.quixada.beersquare.dao;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.classic.Session;
import org.hibernate.criterion.Restrictions;

import br.quixada.beersquare.model.Usuario;
import br.quixada.beersquare.util.PreparaSessao;

public class UsuarioDAO {

	private Session session;
	
	public boolean cadastrarUsuario(Usuario usuario){
		
		usuario.setNomeUsuario(usuario.getNomeUsuario());
		usuario.setEmail(usuario.getEmail());
		usuario.setSenha(usuario.getSenha());
		
		boolean sucesso = false;
		
		session = PreparaSessao.pegarSessao();
		
		try{
			
			session.beginTransaction();
			session.save(usuario);
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
	
	public Usuario retornaUsuarioPor(String email){
		
		session = PreparaSessao.pegarSessao();
		
		Criteria criteria = session.createCriteria(Usuario.class)
				.add(Restrictions.eq("email", email));
		
		Usuario usuario = (Usuario) criteria.uniqueResult();
		session.close();
		return usuario;
	}
}
