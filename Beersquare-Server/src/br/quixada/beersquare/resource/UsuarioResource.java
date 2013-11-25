package br.quixada.beersquare.resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.google.gson.Gson;

import net.sf.json.JSONObject;

import br.quixada.beersquare.controller.ControllerUsuario;
import br.quixada.beersquare.model.Usuario;

@Path("/usuario")
public class UsuarioResource {

	private ControllerUsuario controller;
	
	public UsuarioResource(){
		this.controller = new ControllerUsuario();
	}
	
	@Path("{email}")
	@GET
	@Produces("application/json")
	public Usuario getUsuarioEmail(@PathParam("email") String email){
		
		return controller.retornaUsuarioPor(email);
	}
	
	
	@POST
	@Consumes("application/json")
	@Produces("application/json")
	public String cadastrarNovoUsuario(Usuario usuario){
		
		boolean sucesso = controller.cadastraUsuario(usuario);
		
		
		if(sucesso){
			
			String s = "{\"mensagem\":\"Cadastro feito com sucesso\"}";
			return s;
		}else{
			String s = "{\"mensagem\":\"Cadastro não realizado\"}";
			return s;
		}
	}
}
