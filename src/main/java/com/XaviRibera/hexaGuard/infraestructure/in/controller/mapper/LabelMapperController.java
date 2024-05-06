package com.XaviRibera.hexaGuard.infraestructure.in.controller.mapper;

import com.XaviRibera.hexaGuard.domain.model.Label;
import com.XaviRibera.hexaGuard.infraestructure.in.controller.modelWeb.label.LabelCreateWeb;
import com.XaviRibera.hexaGuard.infraestructure.in.controller.modelWeb.label.LabelDetailWeb;
import com.XaviRibera.hexaGuard.infraestructure.in.controller.modelWeb.label.LabelListWeb;
import com.XaviRibera.hexaGuard.infraestructure.in.controller.modelWeb.label.LabelUpdateWeb;

public class LabelMapperController {
    
    public static LabelDetailWeb toLabelDetailWeb(Label label) {
        if(label == null){
            return null;
        }

        LabelDetailWeb labelDetailWeb = new LabelDetailWeb();

        labelDetailWeb.setId(label.getId());
        labelDetailWeb.setName(label.getName());
        labelDetailWeb.setColorCode(label.getColorCode());
        labelDetailWeb.setDescription(label.getDescription());

        return labelDetailWeb;
    }

    public static Label toLabel(LabelCreateWeb labelCreateWeb) {
        if(labelCreateWeb == null){
            return null;
        }

        Label label = new Label();

        label.setName(labelCreateWeb.getName());
        label.setColorCode(labelCreateWeb.getColorCode());
        label.setDescription(labelCreateWeb.getDescription());

        return label;
    }

    public static Label toLabel(LabelUpdateWeb labelUpdateWeb) {
        if(labelUpdateWeb == null){
            return null;
        }

        Label label = new Label();

        label.setName(labelUpdateWeb.getName());
        label.setColorCode(labelUpdateWeb.getColorCode());
        label.setDescription(labelUpdateWeb.getDescription());

        return label;
    }

    public static LabelListWeb toLabelListWeb(Label label) {
        if(label == null){
            return null;
        }

        LabelListWeb labelListWeb = new LabelListWeb();

        labelListWeb.setId(label.getId());
        labelListWeb.setColorCode(label.getColorCode());
        labelListWeb.setName(label.getName());

        return labelListWeb;
    }
}
