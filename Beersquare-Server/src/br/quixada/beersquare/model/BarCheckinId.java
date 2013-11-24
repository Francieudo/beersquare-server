package br.quixada.beersquare.model;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
@Embeddable
public class BarCheckinId implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Bar bar;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Usuario usuario;

	public Bar getBar() {
		return bar;
	}

	public void setBar(Bar bar) {
		this.bar = bar;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bar == null) ? 0 : bar.hashCode());
		result = prime * result + ((usuario == null) ? 0 : usuario.hashCode());
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
		BarCheckinId other = (BarCheckinId) obj;
		if (bar == null) {
			if (other.bar != null)
				return false;
		} else if (!bar.equals(other.bar))
			return false;
		if (usuario == null) {
			if (other.usuario != null)
				return false;
		} else if (!usuario.equals(other.usuario))
			return false;
		return true;
	}
	
	
}
