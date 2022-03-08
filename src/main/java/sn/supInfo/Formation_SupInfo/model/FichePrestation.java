package sn.supInfo.Formation_SupInfo.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class FichePrestation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	 private Long id;
	 private int volumeHoraireGlobal;
	 private Date dateDebutCours;
	 private List<Seance> seance;
	 private Double note;

	public FichePrestation() {
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getVolumeHoraireGlobal() {
		return volumeHoraireGlobal;
	}

	public void setVolumeHoraireGlobal(int volumeHoraireGlobal) {
		this.volumeHoraireGlobal = volumeHoraireGlobal;
	}

	public Date getDateDebutCours() {
		return dateDebutCours;
	}

	public void setDateDebutCours(Date dateDebutCours) {
		this.dateDebutCours = dateDebutCours;
	}

	public List<Seance> getSeance() {
		return seance;
	}

	public void setSeance(List<Seance> seance) {
		this.seance = seance;
	}

	public Double getNote() {
		return note;
	}

	public void setNote(Double note) {
		this.note = note;
	}

	@Override
	public String toString() {
		return "FichePrestation [id=" + id + ", volumeHoraireGlobal=" + volumeHoraireGlobal + ", dateDebutCours="
				+ dateDebutCours + ", seance=" + seance + ", note=" + note + "]";
	}

}
