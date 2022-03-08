package sn.supInfo.Formation_SupInfo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class ResponsablePedagogique {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )

	
	private FicheFormation ficheFormation;

	public ResponsablePedagogique() {
		// TODO Auto-generated constructor stub
	}

	public FicheFormation getFicheFormation() {
		return ficheFormation;
	}

	public void setFicheFormation(FicheFormation ficheFormation) {
		this.ficheFormation = ficheFormation;
	}

}
