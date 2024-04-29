package com.XaviRibera.hexaGuard.infraestructure.out.persistance.impl;

import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.XaviRibera.hexaGuard.domain.model.User;
import com.XaviRibera.hexaGuard.domain.ports.out.UserRepositoryPort;
import com.XaviRibera.hexaGuard.infraestructure.out.persistance.DAO.UserDAO;
import com.XaviRibera.hexaGuard.infraestructure.out.persistance.mapper.UserMapperRepository;

@Repository
public class UserRepositoryImpl implements UserRepositoryPort{
    
    private final UserDAO userDAO;

    public UserRepositoryImpl(UserDAO userDAO){
        this.userDAO = userDAO;
    }

    @Override
    public Optional<User> findById(int id){
        return Optional.of(UserMapperRepository.toUser(userDAO.findById(id).get()));
    }
}
