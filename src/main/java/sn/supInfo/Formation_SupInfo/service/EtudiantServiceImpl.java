package sn.supInfo.Formation_SupInfo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sn.supInfo.Formation_SupInfo.model.Etudiant;
import sn.supInfo.Formation_SupInfo.repository.EtudiantRepository;

@Service
public class EtudiantServiceImpl implements EtudiantService{

	public EtudiantServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Autowired
	EtudiantRepository etudiantRepository;
	
	
	@Override
	public void addEtudiant(Etudiant etudiant) {
		
		etudiantRepository.save(etudiant);
	}

	@Override
	public List<Etudiant> allEtudiant() {
		return etudiantRepository.findAll();
	}

	@Override
	public void edit(Etudiant etudiant) {
		etudiantRepository.save(etudiant);

	}

	@Override
	public void deleteEtudiant(Long id) {
		etudiantRepository.deleteById(id);
		
	}

	@Override
	public Etudiant getById(Long id) {
		return etudiantRepository.getById(id);
	}

		
}
