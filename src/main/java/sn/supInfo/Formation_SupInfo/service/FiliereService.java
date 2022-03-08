package sn.supInfo.Formation_SupInfo.service;

import java.util.List;

import sn.supInfo.Formation_SupInfo.model.Filiere;

public interface FiliereService {
	
	Filiere saveFiliere(Filiere filiere);

	List<Filiere> findAllFiliere();

	public void deleteFiliere(Filiere Filiere);
	
	public Filiere getFiliereById(long id);

	Filiere updateFiliere(Filiere Filiere);

	void addFicheFormationToFiliere(String codeFiliere, String referenceFiche);


}
