package com.XaviRibera.hexaGuard.infraestructure.out.persistance.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.XaviRibera.hexaGuard.infraestructure.out.entities.UserEntity;

@Repository
public interface UserDAO extends JpaRepository<UserEntity, Integer> {
}
