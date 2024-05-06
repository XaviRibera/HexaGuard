package com.XaviRibera.hexaGuard.infraestructure.in.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.XaviRibera.hexaGuard.application.service.LabelService;
import com.XaviRibera.hexaGuard.infraestructure.in.controller.mapper.LabelMapperController;
import com.XaviRibera.hexaGuard.infraestructure.in.controller.modelWeb.label.LabelCreateWeb;
import com.XaviRibera.hexaGuard.infraestructure.in.controller.modelWeb.label.LabelDetailWeb;
import com.XaviRibera.hexaGuard.infraestructure.in.controller.modelWeb.label.LabelListWeb;
import com.XaviRibera.hexaGuard.infraestructure.in.controller.modelWeb.label.LabelUpdateWeb;

@RestController
@RequestMapping("/labels")
public class LabelController {
    private final LabelService labelService;

    public LabelController(LabelService labelService) {
        this.labelService = labelService;
    }

    @GetMapping("/")
    public ResponseEntity<List<LabelListWeb>> getAll() {
        List<LabelListWeb> labelListWebs = labelService.getAll().stream()
                .map(label -> LabelMapperController.toLabelListWeb(label))
                .toList();
        return new ResponseEntity<>(labelListWebs, HttpStatus.OK);
    }

    @GetMapping("/{labelId}")
    public ResponseEntity<LabelDetailWeb> findById(@PathVariable int labelId) {
        LabelDetailWeb labelDetailWeb = LabelMapperController.toLabelDetailWeb(labelService.findById(labelId));
        return new ResponseEntity<>(labelDetailWeb, HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity<LabelDetailWeb> insert(@RequestBody LabelCreateWeb labelCreateWeb) {
        LabelDetailWeb labelDetailWeb = LabelMapperController
                .toLabelDetailWeb(labelService.insert(LabelMapperController.toLabel(labelCreateWeb)));
        return new ResponseEntity<>(labelDetailWeb, HttpStatus.CREATED);
    }

    @PutMapping("/{labelId}")
    public ResponseEntity<LabelDetailWeb> update(@PathVariable int labelId,
            @RequestBody LabelUpdateWeb labelUpdateWeb) {
        LabelDetailWeb labelDetailWeb = LabelMapperController
                .toLabelDetailWeb(labelService.update(labelId, LabelMapperController.toLabel(labelUpdateWeb)));
        return new ResponseEntity<>(labelDetailWeb, HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/{labelId}")
    public ResponseEntity<Void> delete(@PathVariable int labelId) {
        if(labelService.delete(labelId)) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
