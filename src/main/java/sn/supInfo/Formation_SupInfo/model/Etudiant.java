package sn.supInfo.Formation_SupInfo.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Etudiant {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	
	private String matricule;
	private Date dateNaissance;
	private String lieuNaissance;
	
	public Etudiant() {
	
	}
	
	
	public String getMatricule() {
		return matricule;
	}
	
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}
	
	public Date getDateNaissance() {
		return dateNaissance;
	}
	
	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	
	public String getLieuNaissance() {
		return lieuNaissance;
	}
	
	public void setLieuNaissance(String lieuNaissance) {
		this.lieuNaissance = lieuNaissance;
	}
	
	@Override
	public String toString() {
		return "Etudiant [matricule=" + matricule + ", dateNaissance=" + dateNaissance + ", lieuNaissance="
				+ lieuNaissance + "]";
	}
}