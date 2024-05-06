package com.XaviRibera.hexaGuard.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Label {
    private Integer id;
    private String name;
    private String colorCode;
    private String description;
}
