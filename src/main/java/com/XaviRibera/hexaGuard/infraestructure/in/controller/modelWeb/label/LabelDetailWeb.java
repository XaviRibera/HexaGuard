package com.XaviRibera.hexaGuard.infraestructure.in.controller.modelWeb.label;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LabelDetailWeb {
    private Integer id;
    private String name;
    private String colorCode;
    private String description;
}
