package com.XaviRibera.hexaGuard.infraestructure.in.controller.mapper;

import com.XaviRibera.hexaGuard.domain.model.Record;
import com.XaviRibera.hexaGuard.infraestructure.in.controller.modelWeb.record.RecordCreateWeb;
import com.XaviRibera.hexaGuard.infraestructure.in.controller.modelWeb.record.RecordDetailWeb;
import com.XaviRibera.hexaGuard.infraestructure.in.controller.modelWeb.record.RecordListWeb;
import com.XaviRibera.hexaGuard.infraestructure.in.controller.modelWeb.record.RecordUpdateWeb;

public class RecordMapperController {
    public static RecordDetailWeb toRecordDetailWeb(Record record) {
        if(record == null){
            return null;
        }

        RecordDetailWeb recordDetailWeb = new RecordDetailWeb();

        recordDetailWeb.setId(record.getId());
        recordDetailWeb.setTitle(record.getTitle());
        recordDetailWeb.setUserName(record.getUserName());
        recordDetailWeb.setPageDirection(record.getPageDirection());
        recordDetailWeb.setPassword(record.getPassword());
        recordDetailWeb.setDescription(record.getDescription());
        recordDetailWeb.setLabelId(record.getLabelId());

        return recordDetailWeb;
    }

    public static RecordListWeb toRecordListWeb(Record record){
        if(record == null) {
            return null;
        }

        RecordListWeb recordListWeb = new RecordListWeb();

        recordListWeb.setId(record.getId());
        recordListWeb.setTitle(record.getTitle());
        recordListWeb.setPageDirection(record.getPageDirection());
        recordListWeb.setLabelId(record.getLabelId());

        return recordListWeb;
    }

    public static Record toRecord(RecordCreateWeb recordCreateWeb) {
        if( recordCreateWeb == null ){
            return null;
        }

        Record record = new Record();

        record.setTitle(recordCreateWeb.getTitle());
        record.setPageDirection(recordCreateWeb.getPageDirection());
        record.setUserName(recordCreateWeb.getUserName());
        record.setPassword(recordCreateWeb.getPassword());
        record.setDescription(recordCreateWeb.getDescription());
        record.setLabelId(recordCreateWeb.getLabelId());

        return record;
    }

    public static Record toRecord(RecordUpdateWeb recordUpdateWeb){
        if( recordUpdateWeb == null ){
            return null;
        }

        Record record = new Record();

        record.setTitle(recordUpdateWeb.getTitle());
        record.setPageDirection(recordUpdateWeb.getPageDirection());
        record.setUserName(recordUpdateWeb.getUserName());
        record.setPassword(recordUpdateWeb.getPassword());
        record.setDescription(recordUpdateWeb.getDescription());
        record.setLabelId(recordUpdateWeb.getLabelId());

        return record;
    }
}
