package com.XaviRibera.hexaGuard.infraestructure.in.controller.modelWeb.record;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RecordCreateWeb {
    private String title;
    private String pageDirection;
    private String userName;
    private String password;
    private String description;
    private Integer labelId;
}
