package com.XaviRibera.hexaGuard.application.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.XaviRibera.hexaGuard.domain.model.Label;
import com.XaviRibera.hexaGuard.domain.ports.in.label.CreateLabelUseCase;
import com.XaviRibera.hexaGuard.domain.ports.in.label.DeleteLabelUseCase;
import com.XaviRibera.hexaGuard.domain.ports.in.label.RetrieveLabelUseCase;
import com.XaviRibera.hexaGuard.domain.ports.in.label.UpdateLabelUseCase;

@Service
public class LabelService implements RetrieveLabelUseCase, CreateLabelUseCase, UpdateLabelUseCase, DeleteLabelUseCase{
    private final RetrieveLabelUseCase retrieveLabelUseCase;
    private final CreateLabelUseCase createLabelUseCase;
    private final UpdateLabelUseCase updateLabelUseCase;
    private final DeleteLabelUseCase deleteLabelUseCase;

    public LabelService(RetrieveLabelUseCase retrieveLabelUseCase, CreateLabelUseCase createLabelUseCase, UpdateLabelUseCase updateLabelUseCase, DeleteLabelUseCase deleteLabelUseCase) {
        this.retrieveLabelUseCase = retrieveLabelUseCase;
        this.createLabelUseCase = createLabelUseCase;
        this.updateLabelUseCase = updateLabelUseCase;
        this.deleteLabelUseCase = deleteLabelUseCase;
    }

    @Override
    public Label findById(int labelId){
        return retrieveLabelUseCase.findById(labelId);
    }

    @Override
    public boolean delete(int labelId) {
        return deleteLabelUseCase.delete(labelId);
    }

    @Override
    public Label update(int labelId, Label label) {
        return updateLabelUseCase.update(labelId, label);
    }

    @Override
    public Label insert(Label label) {
        return createLabelUseCase.insert(label);
    }

    @Override
    public List<Label> getAll() {
       return retrieveLabelUseCase.getAll();
    }
}
