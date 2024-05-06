package com.XaviRibera.hexaGuard.domain.ports.in.label;

import com.XaviRibera.hexaGuard.domain.model.Label;

public interface UpdateLabelUseCase {
    Label update(int labelId, Label label);
}
