package iamnotjustjess.finals.florist.controllers;

import iamnotjustjess.finals.florist.models.dtos.FlowerDto;
import iamnotjustjess.finals.florist.services.FlowerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FlowerController {

    private final FlowerService service;

    public FlowerController(FlowerService flowerService) {
        this.service = flowerService;
    }

    @PostMapping("/api/save")
    public ResponseEntity<FlowerDto> save(@RequestBody FlowerDto flowerDto) {
        return ResponseEntity.ok(service.save(flowerDto));
    }

    @GetMapping("/api/find-all")
    public ResponseEntity<List<FlowerDto>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/api/find/{id}")
    public ResponseEntity<FlowerDto> findById(@PathVariable Integer id) {
        return ResponseEntity.ok(service.findById(id));
    }

    @PutMapping("/api/edit")
    public ResponseEntity<FlowerDto> edit(@RequestBody FlowerDto flowerDto) {
        return ResponseEntity.ok(service.edit(flowerDto));
    }

    @DeleteMapping("/api/delete/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }

}
