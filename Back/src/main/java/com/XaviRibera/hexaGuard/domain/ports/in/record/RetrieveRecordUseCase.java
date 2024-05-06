package com.XaviRibera.hexaGuard.domain.ports.in.record;

import java.util.List;

import com.XaviRibera.hexaGuard.domain.model.Record;

public interface RetrieveRecordUseCase {
    Record findById(int id);
    List<Record> getAll();
}
