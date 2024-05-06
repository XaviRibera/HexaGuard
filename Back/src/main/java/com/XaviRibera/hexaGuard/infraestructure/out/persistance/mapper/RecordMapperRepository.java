package com.XaviRibera.hexaGuard.infraestructure.out.persistance.mapper;

import com.XaviRibera.hexaGuard.domain.model.Record;
import com.XaviRibera.hexaGuard.infraestructure.out.entities.RecordEntity;

public class RecordMapperRepository {
    public static Record toRecord(RecordEntity recordEntity){
        if(recordEntity == null){
            return null;
        }

        Record record = new Record();

        record.setId(recordEntity.getId());
        record.setTitle(recordEntity.getTitle());
        record.setPageDirection(recordEntity.getPageDirection());
        record.setUserName(recordEntity.getUserName());
        record.setPassword(recordEntity.getPassword());
        record.setDescription(recordEntity.getDescription());
        record.setLabelId(recordEntity.getLabelId());

        return record;
    }

    public static RecordEntity toRecordEntity(Record record){
        if(record == null){
            return null;
        }

        RecordEntity recordEntity = new RecordEntity();

        recordEntity.setId(record.getId());
        recordEntity.setTitle(record.getTitle());
        recordEntity.setPageDirection(record.getPageDirection());
        recordEntity.setUserName(record.getUserName());
        recordEntity.setPassword(record.getPassword());
        recordEntity.setDescription(record.getDescription());
        recordEntity.setLabelId(record.getLabelId());

        return recordEntity;
    }
}
