package sn.supInfo.Formation_SupInfo.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ContratPrestation {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private Long id;
	private Date date;
	private Date dateDebut;
	private int volumeHoraireGlobal;
	
	public ContratPrestation() {
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

	public Date getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	public int getVolumeHoraireGlobal() {
		return volumeHoraireGlobal;
	}

	public void setVolumeHoraireGlobal(int volumeHoraireGlobal) {
		this.volumeHoraireGlobal = volumeHoraireGlobal;
	}

	@Override
	public String toString() {
		return "ContratPrestation [id=" + id + ", date=" + date + ", dateDebut=" + dateDebut + ", volumeHoraireGlobal="
				+ volumeHoraireGlobal + "]";
	}

}
