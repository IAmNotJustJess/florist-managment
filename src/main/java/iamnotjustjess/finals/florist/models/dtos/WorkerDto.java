package iamnotjustjess.finals.florist.models.dtos;

import iamnotjustjess.finals.florist.models.entities.Worker;

public class WorkerDto {
    private Integer id;
    private String firstName;
    private String lastName;

    public Integer getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public WorkerDto(Integer id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public static WorkerDto fromEntity(Worker worker) {
        return new WorkerDto(
                worker.getId(),
                worker.getFirstName(),
                worker.getLastName()
        );
    }


}
