package com.XaviRibera.hexaGuard.infraestructure.out.persistance.mapper;

import com.XaviRibera.hexaGuard.domain.model.User;
import com.XaviRibera.hexaGuard.infraestructure.out.entities.UserEntity;

public class UserMapperRepository {
    public static User toUser(UserEntity userEntity){
        if(userEntity == null)
            return null;

        User user = new User();

        user.setId(userEntity.getId());
        user.setName(userEntity.getName());
        user.setEmail(userEntity.getEmail());
        user.setPassword(userEntity.getPassword());
        user.setPhoneNumber(userEntity.getPhoneNumber());

        return user;
    }

    public static UserEntity toUserEntity(User user){
        if(user == null)
            return null;
        
        UserEntity userEntity = new UserEntity();

        userEntity.setId(user.getId());
        userEntity.setName(user.getName());
        userEntity.setEmail(user.getEmail());
        userEntity.setPassword(user.getPassword());
        userEntity.setPhoneNumber(user.getPhoneNumber());

        return userEntity;
    }
}
