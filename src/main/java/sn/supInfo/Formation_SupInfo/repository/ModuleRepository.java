package sn.supInfo.Formation_SupInfo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModuleRepository extends JpaRepository< Module ,Long > {
 List< Module> findAll();
}
