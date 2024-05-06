package com.XaviRibera.hexaGuard.infraestructure.out.persistance.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.XaviRibera.hexaGuard.domain.model.Record;
import com.XaviRibera.hexaGuard.domain.ports.out.RecordRepositoryPort;
import com.XaviRibera.hexaGuard.infraestructure.out.persistance.DAO.RecordDAO;
import com.XaviRibera.hexaGuard.infraestructure.out.persistance.mapper.RecordMapperRepository;

import jakarta.transaction.Transactional;

@Repository
public class RecordRepositoryImpl implements RecordRepositoryPort {
    private final RecordDAO recordDAO;

    public RecordRepositoryImpl(RecordDAO recordDAO) {
        this.recordDAO = recordDAO;
    }

    @Override
    public Optional<Record> findById(int id) {
        return Optional.of(RecordMapperRepository.toRecord(recordDAO.findById(id).get()));
    }

    @Override
    public List<Record> getAll() {
        return recordDAO.findAll().stream()
                .map(recordEntity -> RecordMapperRepository.toRecord(recordEntity))
                .toList();
    }

    @Override
    @Transactional
    public Record save(Record record) {
        return RecordMapperRepository.toRecord(recordDAO.save(RecordMapperRepository.toRecordEntity(record)));
    }

    @Override
    @Transactional
    public boolean delete(int recordId) {
        if(recordDAO.existsById(recordId)){
            recordDAO.deleteById(recordId);
            return true;
        }
        return false;
    }
}
