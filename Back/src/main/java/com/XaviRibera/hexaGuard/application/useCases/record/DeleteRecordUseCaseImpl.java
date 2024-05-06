package com.XaviRibera.hexaGuard.application.useCases.record;

import org.springframework.stereotype.Service;

import com.XaviRibera.hexaGuard.domain.ports.in.record.DeleteRecordUseCase;
import com.XaviRibera.hexaGuard.domain.ports.out.RecordRepositoryPort;

@Service
public class DeleteRecordUseCaseImpl implements DeleteRecordUseCase{
    
    private final RecordRepositoryPort recordRepository;

    public DeleteRecordUseCaseImpl(RecordRepositoryPort recordRepository) {
        this.recordRepository = recordRepository;
    }

    @Override
    public boolean delete(int recordId) {
        return recordRepository.delete(recordId);
    }
}
