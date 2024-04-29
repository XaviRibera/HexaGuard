package com.XaviRibera.hexaGuard.domain.ports.in.user;

import com.XaviRibera.hexaGuard.domain.model.User;

public interface RetrieveUserUseCase {
    User findById(int id);
}
