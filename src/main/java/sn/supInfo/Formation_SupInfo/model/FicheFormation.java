package sn.supInfo.Formation_SupInfo.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class FicheFormation {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private Long Id;
	private String referenceFiche;
	private int volumeHoraireGlobal;
	private Date dateDebut;
	private Date dateFin;
	private String intituleDuCours;
	private int nombredeModule;
	private String observations; 
	//private List <FichePrestation> fichePrestation;
	

	public FicheFormation() {
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getReferenceFiche() {
		return referenceFiche;
	}

	public void setReferenceFiche(String referenceFiche) {
		this.referenceFiche = referenceFiche;
	}

	public int getVolumeHoraireGlobal() {
		return volumeHoraireGlobal;
	}

	public void setVolumeHoraireGlobal(int volumeHoraireGlobal) {
		this.volumeHoraireGlobal = volumeHoraireGlobal;
	}

	public Date getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	public Date getDateFin() {
		return dateFin;
	}

	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}

	public String getIntituleDuCours() {
		return intituleDuCours;
	}

	public void setIntituleDuCours(String intituleDuCours) {
		this.intituleDuCours = intituleDuCours;
	}

	public int getNombredeModule() {
		return nombredeModule;
	}

	public void setNombredeModule(int nombredeModule) {
		this.nombredeModule = nombredeModule;
	}

	public String getObservations() {
		return observations;
	}

	public void setObservations(String observations) {
		this.observations = observations;
	}

//	public List<FichePrestation> getFichePrestation() {
//		return fichePrestation;
//	}
//
//	public void setFichePrestation(List<FichePrestation> fichePrestation) {
//		this.fichePrestation = fichePrestation;
//	}

	@Override
	public String toString() {
		return "FicheFormation [Id=" + Id + ", referenceFiche=" + referenceFiche + ", volumeHoraireGlobal="
				+ volumeHoraireGlobal + ", dateDebut=" + dateDebut + ", dateFin=" + dateFin + ", intituleDuCours="
				+ intituleDuCours + ", nombredeModule=" + nombredeModule + ", observations=" + observations + "]";
	}

	}

