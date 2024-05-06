package com.XaviRibera.hexaGuard.application.useCases.label;

import org.springframework.stereotype.Service;

import com.XaviRibera.hexaGuard.domain.ports.in.label.DeleteLabelUseCase;
import com.XaviRibera.hexaGuard.domain.ports.out.LabelRepositoryPort;

@Service
public class DeleteLabelUseCaseImpl implements DeleteLabelUseCase{
    private final LabelRepositoryPort labelRepository;

    public DeleteLabelUseCaseImpl(LabelRepositoryPort labelRepository) {
        this.labelRepository = labelRepository;
    }

    @Override
    public boolean delete(int labelId) {
        return labelRepository.delete(labelId);
    }
}
