package com.XaviRibera.hexaGuard.application.useCases.label;

import org.springframework.stereotype.Service;

import com.XaviRibera.hexaGuard.domain.model.Label;
import com.XaviRibera.hexaGuard.domain.ports.in.label.CreateLabelUseCase;
import com.XaviRibera.hexaGuard.domain.ports.out.LabelRepositoryPort;

@Service
public class CreateLabelUseCaseImpl implements CreateLabelUseCase{
    private final LabelRepositoryPort labelRepository;

    public CreateLabelUseCaseImpl(LabelRepositoryPort labelRepository) {
        this.labelRepository = labelRepository;
    }

    @Override
    public Label insert(Label label) {
        return labelRepository.save(label);
    }
}
