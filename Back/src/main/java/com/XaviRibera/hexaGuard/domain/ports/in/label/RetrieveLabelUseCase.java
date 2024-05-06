package com.XaviRibera.hexaGuard.domain.ports.in.label;

import java.util.List;

import com.XaviRibera.hexaGuard.domain.model.Label;

public interface RetrieveLabelUseCase {
    Label findById(int labelId);
    List<Label> getAll();
}
