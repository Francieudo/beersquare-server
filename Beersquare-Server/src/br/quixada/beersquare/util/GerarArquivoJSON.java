package br.quixada.beersquare.util;

import br.quixada.beersquare.model.Usuario;

import com.google.gson.Gson;

public class GerarArquivoJSON {

	public static void main(String[] args) {
		Gson g = new Gson();
		Usuario user = new Usuario();
		user.setNomeUsuario("maria");
		user.setEmail("ma@gmail.com");
		user.setSenha("123");
		System.out.println(g.toJson(user));
	}
}
