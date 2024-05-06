package com.XaviRibera.hexaGuard.domain.ports.out;

import java.util.List;
import java.util.Optional;

import com.XaviRibera.hexaGuard.domain.model.Label;

public interface LabelRepositoryPort {
    Optional<Label> findById(int labelId);
    List<Label> getAll();
    Label save(Label label);
    boolean delete(int labelId);
}
