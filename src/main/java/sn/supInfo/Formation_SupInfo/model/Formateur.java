package sn.supInfo.Formation_SupInfo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Formateur {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )

	 private String libelle;
	 
	public Formateur() {
		// TODO Auto-generated constructor stub
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	@Override
	public String toString() {
		return "Formateur [libelle=" + libelle + "]";
	}

}
