package com.XaviRibera.hexaGuard.application.useCases.label;

import java.util.List;

import org.springframework.stereotype.Service;

import com.XaviRibera.hexaGuard.common.exception.ResourceNotFoundException;
import com.XaviRibera.hexaGuard.domain.model.Label;
import com.XaviRibera.hexaGuard.domain.ports.in.label.RetrieveLabelUseCase;
import com.XaviRibera.hexaGuard.domain.ports.out.LabelRepositoryPort;

@Service
public class RetrieveLabelUseCaseImpl implements RetrieveLabelUseCase{
    private final LabelRepositoryPort labelRepository;

    public RetrieveLabelUseCaseImpl(LabelRepositoryPort labelRepository) {
        this.labelRepository = labelRepository;
    }

    @Override
    public Label findById(int labelId) {
        return labelRepository.findById(labelId).orElseThrow(() -> new ResourceNotFoundException("Etiqueta no encontrada con el id: " + labelId));
    }

    @Override
    public List<Label> getAll() {
        return labelRepository.getAll();
    }


}
