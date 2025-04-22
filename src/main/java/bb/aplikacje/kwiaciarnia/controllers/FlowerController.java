package bb.aplikacje.kwiaciarnia.controllers;

import bb.aplikacje.kwiaciarnia.models.dtos.FlowerDto;
import bb.aplikacje.kwiaciarnia.services.FlowerService;
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

    @PostMapping
    public ResponseEntity<FlowerDto> save(@RequestBody FlowerDto flowerDto) {
        return ResponseEntity.ok(service.save(flowerDto));
    }

    @GetMapping
    public ResponseEntity<List<FlowerDto>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<FlowerDto> findById(@PathVariable Integer id) {
        return ResponseEntity.ok(service.findById(id));
    }

    @PutMapping
    public ResponseEntity<FlowerDto> edit(@RequestBody FlowerDto flowerDto) {
        return ResponseEntity.ok(service.edit(flowerDto));
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }

}
