package com.XaviRibera.hexaGuard.domain.ports.in.label;

import com.XaviRibera.hexaGuard.domain.model.Label;

public interface CreateLabelUseCase {
    Label insert(Label label);
}
