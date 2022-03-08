package sn.supInfo.Formation_SupInfo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sn.supInfo.Formation_SupInfo.model.AnneeAcademique;

@Repository
public interface AnneAcademiqueRepository extends JpaRepository<AnneeAcademique, Long>{
	List<AnneeAcademique> findAll();
 	

}
