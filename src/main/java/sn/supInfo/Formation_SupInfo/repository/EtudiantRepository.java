package sn.supInfo.Formation_SupInfo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sn.supInfo.Formation_SupInfo.model.Etudiant;


@Repository
public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {
	List<Etudiant> findAll();
	}
