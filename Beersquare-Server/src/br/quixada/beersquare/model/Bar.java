package br.quixada.beersquare.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
/*
 * Classe POJO Bar
 */
@Entity
public class Bar {


	@Id
	@GeneratedValue
	private long id;
	
	@Column(unique=false)
	private String nome;
	
	@Column(unique=false)
	private String descricao;
	
	@Column(unique=false)
	private String lat;
	
	@Column(unique=false)
	private String lng;
	
	@Column(unique=false)
	private byte[] imagem;
	
	@OneToMany(mappedBy="id.bar")
	private List<Checkin> checkin = new ArrayList<Checkin>();
	
	@OneToMany(mappedBy="bar")
	List<RodadaAmigos> rodadas = new ArrayList<RodadaAmigos>(); 

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getLat() {
		return lat;
	}

	public void setLat(String lat) {
		this.lat = lat;
	}

	public String getLng() {
		return lng;
	}

	public void setLng(String lng) {
		this.lng = lng;
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
		Bar other = (Bar) obj;
		if (id != other.id)
			return false;
		return true;
	}

	
}
