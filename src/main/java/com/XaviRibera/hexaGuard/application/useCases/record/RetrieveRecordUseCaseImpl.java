package com.XaviRibera.hexaGuard.application.useCases.record;

import java.util.List;

import org.springframework.stereotype.Service;

import com.XaviRibera.hexaGuard.common.exception.ResourceNotFoundException;
import com.XaviRibera.hexaGuard.domain.model.Record;
import com.XaviRibera.hexaGuard.domain.ports.in.record.RetrieveRecordUseCase;
import com.XaviRibera.hexaGuard.domain.ports.out.RecordRepositoryPort;

@Service
public class RetrieveRecordUseCaseImpl implements RetrieveRecordUseCase {

    private final RecordRepositoryPort recordRepositoryPort;

    public RetrieveRecordUseCaseImpl(RecordRepositoryPort recordRepositoryPort) {
        this.recordRepositoryPort = recordRepositoryPort;
    }

    @Override
    public Record findById(int id) {
        return recordRepositoryPort.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Entrada no encontrada con el id: " + id));
    }

    @Override
    public List<Record> getAll(){
        return recordRepositoryPort.getAll();
    }

}
