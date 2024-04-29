package com.XaviRibera.hexaGuard.infraestructure.in.controller.mapper;

import com.XaviRibera.hexaGuard.domain.model.User;
import com.XaviRibera.hexaGuard.infraestructure.in.controller.modelWeb.UserDetailWeb;

public class UserMapperController {
    public static UserDetailWeb toUserDetailWeb(User user){
        if(user == null)
            return null;
        
        UserDetailWeb userDetailWeb = new UserDetailWeb();

        userDetailWeb.setId(user.getId());
        userDetailWeb.setName(user.getName());
        userDetailWeb.setEmail(user.getEmail());
        userDetailWeb.setPassword(user.getPassword());
        userDetailWeb.setPhoneNumber(user.getPhoneNumber());

        return userDetailWeb;
    }
}
