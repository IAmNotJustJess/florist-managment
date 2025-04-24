package iamnotjustjess.finals.florist.services;

import iamnotjustjess.finals.florist.models.dtos.WorkerDto;
import iamnotjustjess.finals.florist.models.entities.Worker;
import iamnotjustjess.finals.florist.repositories.WorkerRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

@Service
public class WorkerService {

    private final WorkerRepository repository;

    public WorkerService(WorkerRepository workerRepository) {
        this.repository = workerRepository;
    }

    public WorkerDto save(WorkerDto workerDto) {
        return WorkerDto.fromEntity(repository.save(Worker.fromDto(workerDto)));
    }

    public List<WorkerDto> findAll() {
        return repository.findAll().stream().map(WorkerDto::fromEntity).collect(Collectors.toList());
    }

    public WorkerDto findById(Integer id) {
        return WorkerDto.fromEntity(repository.findById(id).orElseThrow(NoSuchElementException::new));
    }

    public WorkerDto edit(WorkerDto workerDto) {
        return WorkerDto.fromEntity(repository.save(Worker.fromDto(workerDto)));
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }
}
