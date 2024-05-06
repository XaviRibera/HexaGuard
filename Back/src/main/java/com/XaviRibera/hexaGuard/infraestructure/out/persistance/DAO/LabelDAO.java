package com.XaviRibera.hexaGuard.infraestructure.out.persistance.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.XaviRibera.hexaGuard.infraestructure.out.entities.LabelEntity;

@Repository
public interface LabelDAO extends JpaRepository<LabelEntity, Integer> {

}
