package br.quixada.beersquare.resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import br.quixada.beersquare.controller.ControllerUsuario;
import br.quixada.beersquare.model.Usuario;

@Path("/usuario")
public class UsuarioResource {

	private ControllerUsuario controller;
	
	public UsuarioResource(){
		this.controller = new ControllerUsuario();
	}
	
	/*
	 * Retornar Usuario correspondente ao email passado e senha, usada para login
	 */
	
	@Path("/{email}/{senha}")
	@GET
	@Produces("application/json")
	public Usuario getUsuarioEmail(@PathParam("email") String email,@PathParam("senha") String senha){
		
		return controller.retornaUsuarioPor(email);
	}
	
	/*
	 * Método Post para cadastrar novo Usuario
	 */
	
	@POST()
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
