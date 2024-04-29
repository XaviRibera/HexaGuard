package com.XaviRibera.hexaGuard.domain.ports.out;

import java.util.Optional;

import com.XaviRibera.hexaGuard.domain.model.User;

public interface UserRepositoryPort {
    Optional<User> findById(int id);
}
