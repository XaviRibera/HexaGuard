package com.XaviRibera.hexaGuard.domain.ports.in.record;

import com.XaviRibera.hexaGuard.domain.model.Record;

public interface UpdateRecordUseCase {
    Record update(int recordId, Record record);
}
