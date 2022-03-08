package sn.supInfo.Formation_SupInfo.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class CreneauHoraire {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private Long id;
	private Date date;
	private int nombreHeure;

	public CreneauHoraire() {
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getNombreHeure() {
		return nombreHeure;
	}

	public void setNombreHeure(int nombreHeure) {
		this.nombreHeure = nombreHeure;
	}

	@Override
	public String toString() {
		return "CreneauHoraire [id=" + id + ", date=" + date + ", nombreHeure=" + nombreHeure + "]";
	}

}
