package sn.supInfo.Formation_SupInfo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Niveau {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private Long id;
	private String codeNiveau;
	private String libelle;

	public Niveau() {
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodeNiveau() {
		return codeNiveau;
	}

	public void setCodeNiveau(String codeNiveau) {
		this.codeNiveau = codeNiveau;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	@Override
	public String toString() {
		return "Niveau [id=" + id + ", codeNiveau=" + codeNiveau + ", libelle=" + libelle + "]";
	}

}
