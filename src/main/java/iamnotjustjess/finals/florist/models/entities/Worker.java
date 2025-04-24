package iamnotjustjess.finals.florist.models.entities;

import iamnotjustjess.finals.florist.models.dtos.WorkerDto;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

public class Worker {
    @Id
    @GeneratedValue
    private Integer id;
    private String firstName;
    private String lastName;

    public Worker() {

    }

    public Worker(Integer id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Integer getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public static Worker fromDto(WorkerDto workerDto) {
        return new Worker(
                workerDto.getId(),
                workerDto.getFirstName(),
                workerDto.getLastName()
        );
    }
}
