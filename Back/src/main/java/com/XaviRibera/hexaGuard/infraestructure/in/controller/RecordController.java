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

import com.XaviRibera.hexaGuard.application.service.RecordService;
import com.XaviRibera.hexaGuard.infraestructure.in.controller.mapper.RecordMapperController;
import com.XaviRibera.hexaGuard.infraestructure.in.controller.modelWeb.record.RecordCreateWeb;
import com.XaviRibera.hexaGuard.infraestructure.in.controller.modelWeb.record.RecordDetailWeb;
import com.XaviRibera.hexaGuard.infraestructure.in.controller.modelWeb.record.RecordUpdateWeb;

@RestController
@RequestMapping("/records")
public class RecordController {

    private final RecordService recordService;

    public RecordController(RecordService recordService) {
        this.recordService = recordService;
    }

    @GetMapping("/")
    public ResponseEntity<List<RecordDetailWeb>> getAll() {
        List<RecordDetailWeb> recordDetailWebs = recordService.getAll().stream()
                .map(record -> RecordMapperController.toRecordDetailWeb(record))
                .toList();
        return new ResponseEntity<>(recordDetailWebs, HttpStatus.OK);
    }

    @GetMapping("/{recordId}")
    public ResponseEntity<RecordDetailWeb> findById(@PathVariable int recordId) {
        RecordDetailWeb responseRecordDetailWeb = RecordMapperController
                .toRecordDetailWeb(recordService.findById(recordId));
        return new ResponseEntity<>(responseRecordDetailWeb, HttpStatus.OK);
    }

    @PostMapping("")
    public ResponseEntity<RecordDetailWeb> save(@RequestBody RecordCreateWeb recordCreateWeb) {
        RecordDetailWeb recordDetailWeb = RecordMapperController
                .toRecordDetailWeb(recordService.insert(RecordMapperController.toRecord(recordCreateWeb)));
        return new ResponseEntity<>(recordDetailWeb, HttpStatus.CREATED);
    }

    @PutMapping("/{recordId}")
    public ResponseEntity<RecordDetailWeb> update(@RequestBody RecordUpdateWeb recordUpdateWeb,
            @PathVariable int recordId) {
        RecordDetailWeb recordDetailWeb = RecordMapperController
                .toRecordDetailWeb(recordService.update(recordId, RecordMapperController.toRecord(recordUpdateWeb)));
        return new ResponseEntity<>(recordDetailWeb, HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/{recordId}")
    public ResponseEntity<Void> delete(@PathVariable int recordId) {
        if (recordService.delete(recordId)) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

}
