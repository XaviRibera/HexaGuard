package com.XaviRibera.hexaGuard.infraestructure.out.persistance.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.XaviRibera.hexaGuard.infraestructure.out.entities.RecordEntity;

@Repository
public interface RecordDAO extends JpaRepository<RecordEntity, Integer> {

}
