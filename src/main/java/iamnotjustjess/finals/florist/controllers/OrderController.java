package iamnotjustjess.finals.florist.controllers;

import iamnotjustjess.finals.florist.models.dtos.OrderDto;
import iamnotjustjess.finals.florist.services.OrderService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderController {

    private final OrderService service;

    public OrderController(OrderService orderService) {
        this.service = orderService;
    }

    @PostMapping("/api/order/save")
    public ResponseEntity<OrderDto> save(@RequestBody OrderDto orderDto) {
        return ResponseEntity.ok(service.save(orderDto));
    }

    @GetMapping("/api/order/find-all")
    public ResponseEntity<List<OrderDto>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/api/order/find/{id}")
    public ResponseEntity<OrderDto> findById(@PathVariable Integer id) {
        return ResponseEntity.ok(service.findById(id));
    }

    @PatchMapping("/api/order/edit")
    public ResponseEntity<OrderDto> edit(@RequestBody OrderDto orderDto) {
        return ResponseEntity.ok(service.edit(orderDto));
    }

    @DeleteMapping("/api/order/delete/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }

}
