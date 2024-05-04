package com.XaviRibera.hexaGuard.application.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.XaviRibera.hexaGuard.domain.model.Record;
import com.XaviRibera.hexaGuard.domain.ports.in.record.CreateRecordUseCase;
import com.XaviRibera.hexaGuard.domain.ports.in.record.DeleteRecordUseCase;
import com.XaviRibera.hexaGuard.domain.ports.in.record.RetrieveRecordUseCase;
import com.XaviRibera.hexaGuard.domain.ports.in.record.UpdateRecordUseCase;

@Service
public class RecordService implements RetrieveRecordUseCase, CreateRecordUseCase, UpdateRecordUseCase, DeleteRecordUseCase{

    private final RetrieveRecordUseCase retrieveRecordUseCase;
    private final CreateRecordUseCase createRecordUseCase;
    private final UpdateRecordUseCase updateRecordUseCase;
    private final DeleteRecordUseCase deleteRecordUseCase;

    public RecordService(RetrieveRecordUseCase retrieveRecordUseCase, CreateRecordUseCase createRecordUseCase, UpdateRecordUseCase updateRecordUseCase, DeleteRecordUseCase deleteRecordUseCase) {
        this.retrieveRecordUseCase = retrieveRecordUseCase;
        this.createRecordUseCase = createRecordUseCase;
        this.updateRecordUseCase = updateRecordUseCase;
        this.deleteRecordUseCase = deleteRecordUseCase;
    }

    @Override
    public Record findById(int id){
        return retrieveRecordUseCase.findById(id);
    }

    @Override
    public List<Record> getAll() {
        return retrieveRecordUseCase.getAll();
    }

    @Override
    public Record insert(Record record) {
        return createRecordUseCase.insert(record);
    }

    @Override 
    public Record update(int recordId, Record record) {
        return updateRecordUseCase.update(recordId, record);
    }

    @Override 
    public boolean delete(int recordId) {
        return deleteRecordUseCase.delete(recordId);
    }
}
