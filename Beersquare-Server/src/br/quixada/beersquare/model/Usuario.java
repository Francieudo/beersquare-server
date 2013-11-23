package br.quixada.beersquare.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

/*
 * Classe POJO do Usuario 
 */

@Entity
public class Usuario {

	@Id
	@GeneratedValue
	private long id;
	
	@Column(unique = true)
	private String nomeUsuario;
	
	@Column(unique = true)
	private String email;
	
	@Column(unique=false)
	private String senha;
	
	@Column(unique=false)
	private byte[] imagem;
	
	@OneToMany(mappedBy="id.usuario")
	private List<Checkin> checkin = new ArrayList<Checkin>();
	
	@ManyToMany (fetch = FetchType.LAZY)
	@JoinTable(name="rodada_amigos", 
	joinColumns = @JoinColumn(name="id_usuario"),
	inverseJoinColumns = @JoinColumn(name="id_rodada_amigos"))
	private List<RodadaAmigos> rodadas = new ArrayList<RodadaAmigos>();

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public byte[] getImagem() {
		return imagem;
	}

	public void setImagem(byte[] imagem) {
		this.imagem = imagem;
	}

	public List<Checkin> getCheckin() {
		return checkin;
	}

	public void setCheckin(List<Checkin> checkin) {
		this.checkin = checkin;
	}

	public List<RodadaAmigos> getRodadas() {
		return rodadas;
	}

	public void setRodadas(List<RodadaAmigos> rodadas) {
		this.rodadas = rodadas;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		if (id != other.id)
			return false;
		return true;
	}

	
}
