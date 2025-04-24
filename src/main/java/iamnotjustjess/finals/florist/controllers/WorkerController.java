package iamnotjustjess.finals.florist.controllers;

import iamnotjustjess.finals.florist.models.dtos.WorkerDto;
import iamnotjustjess.finals.florist.services.WorkerService;
import iamnotjustjess.finals.florist.services.WorkerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class WorkerController {

    private final WorkerService service;

    public WorkerController(WorkerService workerService) {
        this.service = workerService;
    }

    @PostMapping("/api/worker/save")
    public ResponseEntity<WorkerDto> save(@RequestBody WorkerDto workerDto) {
        return ResponseEntity.ok(service.save(workerDto));
    }

    @GetMapping("/api/worker/find-all")
    public ResponseEntity<List<WorkerDto>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/api/worker/find/{id}")
    public ResponseEntity<WorkerDto> findById(@PathVariable Integer id) {
        return ResponseEntity.ok(service.findById(id));
    }

    @PutMapping("/api/worker/edit")
    public ResponseEntity<WorkerDto> edit(@RequestBody WorkerDto workerDto) {
        return ResponseEntity.ok(service.edit(workerDto));
    }

    @DeleteMapping("/api/worker/delete/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }

}
