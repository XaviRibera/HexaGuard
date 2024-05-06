package com.XaviRibera.hexaGuard.application.useCases.record;

import org.springframework.stereotype.Service;

import com.XaviRibera.hexaGuard.domain.model.Record;
import com.XaviRibera.hexaGuard.domain.ports.in.record.UpdateRecordUseCase;
import com.XaviRibera.hexaGuard.domain.ports.out.RecordRepositoryPort;

@Service
public class UpdateRecordUseCaseImpl implements UpdateRecordUseCase{
    
    private final RecordRepositoryPort recordRepository;

    public UpdateRecordUseCaseImpl(RecordRepositoryPort recordRepository) {
        this.recordRepository = recordRepository;
    }

    @Override
    public Record update(int recordId, Record record) {
        record.setId(recordId);
        return recordRepository.save(record);
    }
}
