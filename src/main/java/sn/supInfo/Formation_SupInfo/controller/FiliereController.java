package sn.supInfo.Formation_SupInfo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sn.supInfo.Formation_SupInfo.model.Filiere;
import sn.supInfo.Formation_SupInfo.service.FiliereServiceImpl;

@RestController
@RequestMapping("/filieres")
public class FiliereController {

	public FiliereController() {
		// TODO Auto-generated constructor stub
	}
	@Autowired
	FiliereServiceImpl FiliereServiceImpl;
	
	@PostMapping("/save")
	public String saveFiliere (Filiere filiere)
	{
		FiliereServiceImpl.saveFiliere(filiere);
		return ("filiere");
	}

}
