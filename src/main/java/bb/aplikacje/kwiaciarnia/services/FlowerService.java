package bb.aplikacje.kwiaciarnia.services;

import bb.aplikacje.kwiaciarnia.models.dtos.FlowerDto;
import bb.aplikacje.kwiaciarnia.models.entities.Flower;
import bb.aplikacje.kwiaciarnia.repositories.FlowerRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

@Service
public class FlowerService {

    private final FlowerRepository repository;

    public FlowerService(FlowerRepository flowerRepository) {
        this.repository = flowerRepository;
    }

    public FlowerDto save(FlowerDto flowerDto) {
        return FlowerDto.fromEntity(repository.save(Flower.fromDto(flowerDto)));
    }

    public List<FlowerDto> findAll() {
        return repository.findAll().stream().map(FlowerDto::fromEntity).collect(Collectors.toList());
    }

    public FlowerDto findById(Integer id) {
        return FlowerDto.fromEntity(repository.findById(id).orElseThrow(NoSuchElementException::new));
    }

    public FlowerDto edit(FlowerDto flowerDto) {
        return FlowerDto.fromEntity(repository.save(Flower.fromDto(flowerDto)));
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }
}
