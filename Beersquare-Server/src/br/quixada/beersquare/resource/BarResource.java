package br.quixada.beersquare.resource;

import javax.ws.rs.Path;

import br.quixada.beersquare.controller.ControllerBar;

@Path("/bar")
public class BarResource {

	private ControllerBar controller;
	
	public BarResource(){
		this.controller = new ControllerBar();
	}
}
