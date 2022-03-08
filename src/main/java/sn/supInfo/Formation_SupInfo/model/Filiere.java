package sn.supInfo.Formation_SupInfo.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity

public class Filiere {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private Long id;
	private String codeFiliere;
	private String libelle;
	
	@OneToMany(mappedBy = "filiere")//, fetch = FetchType.EAGER, cascade = CascadeType.REMOVE)
	//private List<Fiche> depart = new ArrayList<>();
	List<FicheFormation> listFicheFormation;
	
	public Filiere() {
		// TODO Auto-generated constructor stub
	}
	public Filiere(Long id, String codeFiliere, String libelle) {
		super();
		this.id = id;
		this.codeFiliere = codeFiliere;
		this.libelle = libelle;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodeFiliere() {
		return codeFiliere;
	}

	public void setCodeNiveau(String codeFiliere) {
		this.codeFiliere = codeFiliere;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	@Override
	public String toString() {
		return "Filiere [id=" + id + ", codeNiveau=" + codeFiliere + ", libelle=" + libelle + "]";
	}

}
