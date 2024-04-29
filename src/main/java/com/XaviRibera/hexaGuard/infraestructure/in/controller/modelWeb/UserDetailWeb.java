package com.XaviRibera.hexaGuard.infraestructure.in.controller.modelWeb;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDetailWeb {
    private int id;
    private String name;
    private String email;
    private String password;
    private String phoneNumber;
}
