package br.quixada.beersquare.controller;

import br.quixada.beersquare.dao.UsuarioDAO;
import br.quixada.beersquare.model.Usuario;

public class ControllerUsuario {

	private UsuarioDAO usuarioDao = new UsuarioDAO();
	
	public boolean cadastraUsuario(Usuario usuario){
		
		return usuarioDao.cadastrarUsuario(usuario);
	}
	
	public Usuario retornaUsuarioPor(String email){
		return usuarioDao.retornaUsuarioPor(email);
	}
}
