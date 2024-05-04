package com.XaviRibera.hexaGuard.infraestructure.in.controller.modelWeb.record;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RecordListWeb {
    private Integer id;
    private String title;
    private String pageDirection;
    private Integer labelId;
}
