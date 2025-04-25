package iamnotjustjess.finals.florist.services;

import iamnotjustjess.finals.florist.models.dtos.OrderDto;
import iamnotjustjess.finals.florist.models.entities.Order;
import iamnotjustjess.finals.florist.repositories.OrderRepository;
import iamnotjustjess.finals.florist.repositories.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

@Service
public class OrderService {

    private final OrderRepository repository;

    public OrderService(OrderRepository orderRepository) {
        this.repository = orderRepository;
    }

    public OrderDto save(OrderDto orderDto) {
        return OrderDto.fromEntity(repository.save(Order.fromDto(orderDto)));
    }

    public List<OrderDto> findAll() {
        return repository.findAll().stream().map(OrderDto::fromEntity).collect(Collectors.toList());
    }

    public OrderDto findById(Integer id) {
        return OrderDto.fromEntity(repository.findById(id).orElseThrow(NoSuchElementException::new));
    }

    public OrderDto edit(OrderDto orderDto) {
        return OrderDto.fromEntity(repository.save(Order.fromDto(orderDto)));
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }
}
