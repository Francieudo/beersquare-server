package br.quixada.beersquare.resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import net.sf.json.JSONObject;

import br.quixada.beersquare.controller.ControllerUsuario;
import br.quixada.beersquare.model.Usuario;

@Path("/usuario")
public class UsuarioResource {

	private ControllerUsuario controller;
	
	public UsuarioResource(){
		this.controller = new ControllerUsuario();
	}
	
	@POST
	@Consumes("application/json")
	//@Produces("application/json")
	public void cadastrarNovoUsuario(Usuario usuario){
		boolean sucesso = controller.cadastraUsuario(usuario);
		
		//JSONObject json = new JSONObject();
//		if(sucesso){
//			json.put("mensagem","Usuario cadastrado.");
//			json.put("status", "2");
//			return json;
//		}else{
//			json.put("mensagem","Usuario já cadastrado.");
//			json.put("status", "0");
//			return json;
//		}
	}
}
