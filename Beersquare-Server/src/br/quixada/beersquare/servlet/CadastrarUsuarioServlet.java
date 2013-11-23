package br.quixada.beersquare.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

import br.quixada.beersquare.controller.ControllerUsuario;

/**
 * Servlet implementation class CadastrarUsuarioServlet
 */
public class CadastrarUsuarioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ControllerUsuario controllerUsuario;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CadastrarUsuarioServlet() {
        controllerUsuario = new ControllerUsuario();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nomeUsuario = request.getParameter("nome_usuario");
		String email = request.getParameter("email");
		String senha = request.getParameter("senha");
		
		boolean isCadastrar = true;
		
		if(nomeUsuario == null || email == null || senha == null){
			isCadastrar = false;
		}
		
		
	}

}
