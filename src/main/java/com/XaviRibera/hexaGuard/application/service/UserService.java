package com.XaviRibera.hexaGuard.application.service;

import org.springframework.stereotype.Service;

import com.XaviRibera.hexaGuard.domain.model.User;
import com.XaviRibera.hexaGuard.domain.ports.in.user.RetrieveUserUseCase;

@Service
public class UserService implements RetrieveUserUseCase{
    
    private final RetrieveUserUseCase retrieveUserUseCase;

    public UserService(RetrieveUserUseCase retrieveUserUseCase){
        this.retrieveUserUseCase = retrieveUserUseCase;
    };

    public User findById(int id){
        return retrieveUserUseCase.findById(id);
    }
}
