package com.XaviRibera.hexaGuard.infraestructure.in.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.XaviRibera.hexaGuard.application.service.UserService;
import com.XaviRibera.hexaGuard.infraestructure.in.controller.mapper.UserMapperController;
import com.XaviRibera.hexaGuard.infraestructure.in.controller.modelWeb.UserDetailWeb;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping("/{userId}")
    public ResponseEntity<UserDetailWeb> getUserById(@PathVariable int userId) {
        UserDetailWeb responseUserDetailWeb = UserMapperController.toUserDetailWeb(userService.findById(userId));
        return new ResponseEntity<>(responseUserDetailWeb,
                HttpStatus.OK);
    }
}
