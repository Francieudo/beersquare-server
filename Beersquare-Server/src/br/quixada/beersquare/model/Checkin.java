package br.quixada.beersquare.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
/*
 * Classe POJO checkin
 */
@Entity 
public class Checkin {

	@EmbeddedId
	private BarCheckinId id;
	
	@Column(unique=false)
	private Date data;

	public BarCheckinId getId() {
		return id;
	}

	public void setId(BarCheckinId id) {
		this.id = id;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}
	
	
}
