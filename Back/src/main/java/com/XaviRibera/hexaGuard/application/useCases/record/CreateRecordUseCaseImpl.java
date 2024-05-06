package com.XaviRibera.hexaGuard.application.useCases.record;

import org.springframework.stereotype.Service;

import com.XaviRibera.hexaGuard.domain.model.Record;
import com.XaviRibera.hexaGuard.domain.ports.in.record.CreateRecordUseCase;
import com.XaviRibera.hexaGuard.domain.ports.out.RecordRepositoryPort;

@Service
public class CreateRecordUseCaseImpl implements CreateRecordUseCase{

    private final RecordRepositoryPort recordRepository;

    public CreateRecordUseCaseImpl(RecordRepositoryPort recordRepository) {
        this.recordRepository = recordRepository;
    }

    @Override
    public Record insert(Record record) {
        return recordRepository.save(record);
    }
    
}
