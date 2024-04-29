package com.XaviRibera.hexaGuard.application.useCases.user;

import org.springframework.stereotype.Service;

import com.XaviRibera.hexaGuard.common.exception.ResourceNotFoundException;
import com.XaviRibera.hexaGuard.domain.model.User;
import com.XaviRibera.hexaGuard.domain.ports.in.user.RetrieveUserUseCase;
import com.XaviRibera.hexaGuard.domain.ports.out.UserRepositoryPort;

@Service
public class RetrieveUserUseCaseImpl implements RetrieveUserUseCase{

    private final UserRepositoryPort userRepositoryPort;

    public RetrieveUserUseCaseImpl(UserRepositoryPort userRepositoryPort){
        this.userRepositoryPort = userRepositoryPort;
    }

    @Override
    public User findById(int id){
        return userRepositoryPort.findById(id).orElseThrow(() -> new ResourceNotFoundException("Propietario no encontrado con el id: " + id));
    }
}
