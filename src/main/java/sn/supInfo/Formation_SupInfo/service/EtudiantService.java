package sn.supInfo.Formation_SupInfo.service;

import java.util.List;

import sn.supInfo.Formation_SupInfo.model.Etudiant;


public interface EtudiantService {

	void addEtudiant(Etudiant etudiant);
	List<Etudiant> allEtudiant();
	void edit(Etudiant etudiant);
	void deleteEtudiant(Long id);
	Etudiant getById(Long id);
}