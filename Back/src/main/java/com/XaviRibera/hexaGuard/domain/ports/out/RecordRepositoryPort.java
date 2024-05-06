package com.XaviRibera.hexaGuard.domain.ports.out;

import java.util.List;
import java.util.Optional;

import com.XaviRibera.hexaGuard.domain.model.Record;

public interface RecordRepositoryPort {
    Optional<Record> findById(int id);
    List<Record> getAll();
    Record save(Record record);
    boolean delete(int recordId);
}
