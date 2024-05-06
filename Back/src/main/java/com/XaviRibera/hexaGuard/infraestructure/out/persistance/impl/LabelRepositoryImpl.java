package com.XaviRibera.hexaGuard.infraestructure.out.persistance.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.XaviRibera.hexaGuard.domain.model.Label;
import com.XaviRibera.hexaGuard.domain.ports.out.LabelRepositoryPort;
import com.XaviRibera.hexaGuard.infraestructure.out.entities.LabelEntity;
import com.XaviRibera.hexaGuard.infraestructure.out.persistance.DAO.LabelDAO;
import com.XaviRibera.hexaGuard.infraestructure.out.persistance.mapper.LabelMapperRepository;

import jakarta.transaction.Transactional;

@Repository
public class LabelRepositoryImpl implements LabelRepositoryPort {
    private final LabelDAO labelDAO;

    public LabelRepositoryImpl(LabelDAO labelDAO) {
        this.labelDAO = labelDAO;
    }

    @Override
    public Optional<Label> findById(int labelId) {
        LabelEntity labelEntity = labelDAO.findById(labelId).get();
        Label label = LabelMapperRepository.toLabel(labelEntity);
        return Optional.of(label);
    }

    @Override
    public List<Label> getAll() {
        return labelDAO.findAll().stream()
                .map(labelEntity -> LabelMapperRepository.toLabel(labelEntity))
                .toList();
    }

    @Override
    @Transactional
    public Label save(Label label) {
        return LabelMapperRepository.toLabel(labelDAO.save(LabelMapperRepository.toLabelEntity(label)));
    }

    @Override
    @Transactional
    public boolean delete(int labelId) {
        if(labelDAO.existsById(labelId)){
            labelDAO.deleteById(labelId);
            return true;
        }
        return false;
    }
}
