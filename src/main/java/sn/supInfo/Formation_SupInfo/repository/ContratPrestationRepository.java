package sn.supInfo.Formation_SupInfo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sn.supInfo.Formation_SupInfo.model.ContratPrestation;

@Repository
public interface ContratPrestationRepository extends JpaRepository<ContratPrestation, Long> {
    List <ContratPrestation> findAll();
}
