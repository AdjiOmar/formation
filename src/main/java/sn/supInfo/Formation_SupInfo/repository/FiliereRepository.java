package sn.supInfo.Formation_SupInfo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sn.supInfo.Formation_SupInfo.model.Filiere;

@Repository
public interface FiliereRepository extends JpaRepository<Filiere, Long> {
	List<Filiere> findAll();

}
