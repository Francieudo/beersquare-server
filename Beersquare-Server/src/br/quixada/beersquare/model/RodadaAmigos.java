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
import javax.persistence.ManyToOne;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
@Entity
public class RodadaAmigos {

	@Id
	@GeneratedValue
	private long id;
	
	@Column(unique=true)
	private String nomeRodada;
	
	private String data;
	
	private String hora;
	
	@ManyToOne
	private Bar bar;
	
	@ManyToMany(fetch=FetchType.LAZY)
	@JoinTable(name="rodada_amigos",
	joinColumns={@JoinColumn(name="id_rodada_amigos")},
	inverseJoinColumns={@JoinColumn(name="id_usuario")})
	private List<Usuario> amigos = new ArrayList<Usuario>();

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNomeRodada() {
		return nomeRodada;
	}

	public void setNomeRodada(String nomeRodada) {
		this.nomeRodada = nomeRodada;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public Bar getBar() {
		return bar;
	}

	public void setBar(Bar bar) {
		this.bar = bar;
	}

	public List<Usuario> getAmigos() {
		return amigos;
	}

	public void setAmigos(List<Usuario> amigos) {
		this.amigos = amigos;
	}
	
}
