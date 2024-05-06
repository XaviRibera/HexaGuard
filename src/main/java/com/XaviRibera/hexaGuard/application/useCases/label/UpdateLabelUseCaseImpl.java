package com.XaviRibera.hexaGuard.application.useCases.label;

import org.springframework.stereotype.Service;

import com.XaviRibera.hexaGuard.domain.model.Label;
import com.XaviRibera.hexaGuard.domain.ports.in.label.UpdateLabelUseCase;
import com.XaviRibera.hexaGuard.domain.ports.out.LabelRepositoryPort;

@Service
public class UpdateLabelUseCaseImpl implements UpdateLabelUseCase{
    private final LabelRepositoryPort labelRepository;

    public UpdateLabelUseCaseImpl(LabelRepositoryPort labelRepository) {
        this.labelRepository = labelRepository;
    }

    @Override
    public Label update(int labelId,Label label) {
        label.setId(labelId);
        return labelRepository.save(label);
    }
}
