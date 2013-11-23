package br.quixada.beersquare.controller;

import br.quixada.beersquare.dao.UsuarioDAO;
import br.quixada.beersquare.model.Usuario;

public class ControllerUsuario {

	public boolean cadastraUsuario(Usuario usuario){
		UsuarioDAO usuarioDao = new UsuarioDAO();
		
		return usuarioDao.cadastrarUsuario(usuario);
	}
}
