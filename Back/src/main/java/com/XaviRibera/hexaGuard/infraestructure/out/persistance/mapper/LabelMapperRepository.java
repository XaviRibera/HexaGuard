package com.XaviRibera.hexaGuard.infraestructure.out.persistance.mapper;

import com.XaviRibera.hexaGuard.domain.model.Label;
import com.XaviRibera.hexaGuard.infraestructure.out.entities.LabelEntity;

public class LabelMapperRepository {
    public static Label toLabel(LabelEntity labelEntity) {
        if(labelEntity == null){
            return null;
        }

        Label label = new Label();

        label.setId(labelEntity.getId());
        label.setColorCode(labelEntity.getColorCode());
        label.setName(labelEntity.getName());
        label.setDescription(labelEntity.getDescription());

        return label;
    }

    public static LabelEntity toLabelEntity(Label label) {
        if(label == null){
            return null;
        }

        LabelEntity labelEntity = new LabelEntity();

        labelEntity.setId(label.getId());
        labelEntity.setName(label.getName());
        labelEntity.setColorCode(label.getColorCode());
        labelEntity.setDescription(label.getDescription());

        return labelEntity;
    }
}
