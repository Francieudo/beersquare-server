package br.quixada.beersquare.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
/*
 * Classe POJO checkin
 */
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity 
public class Checkin {

	@EmbeddedId
	private BarCheckinId id;
	
	@Column(unique=false)
	private String data;

	public BarCheckinId getId() {
		return id;
	}

	public void setId(BarCheckinId id) {
		this.id = id;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	
	
	
}
