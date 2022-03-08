package sn.supInfo.Formation_SupInfo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sn.supInfo.Formation_SupInfo.model.CreneauHoraire;

@Repository
public interface CreneauHoraireRepository extends JpaRepository <CreneauHoraire, Long> {
 List<CreneauHoraire> findAll();
}
