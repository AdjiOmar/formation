package sn.supInfo.Formation_SupInfo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sn.supInfo.Formation_SupInfo.model.FicheFormation;
import sn.supInfo.Formation_SupInfo.model.Filiere;
import sn.supInfo.Formation_SupInfo.repository.FiliereRepository;

@Service
public class FiliereServiceImpl implements FiliereService{
	
	
	 @Autowired
	FiliereRepository filiereRepository;
	
	 @Autowired
	FicheFormation ficheFormationREpository;

	public FiliereServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Filiere saveFiliere(Filiere filiere) {
		// TODO Auto-generated method stub
		return filiereRepository.save(filiere);
	}

	@Override
	public List<Filiere> findAllFiliere() {
		// TODO Auto-generated method stub
		return filiereRepository.findAll();
	}

	@Override
	public void deleteFiliere(Filiere filiere) {
		// TODO Auto-generated method stub
		filiereRepository.delete(filiere);
	}

	@Override
	public Filiere getFiliereById(long id) {
		// TODO Auto-generated method stub
		return filiereRepository.getById(id);
	}

	@Override
	public Filiere updateFiliere(Filiere filiere) {
		// TODO Auto-generated method stub
		return filiereRepository.save(filiere);
	}

	@Override
	public void addFicheFormationToFiliere(String codeFiliere, String referenceFiche) {
		// TODO Auto-generated method stub
		
	}

}
