package bb.aplikacje.kwiaciarnia.models.entities;

import bb.aplikacje.kwiaciarnia.models.dtos.FlowerDto;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class Flower {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String description;
    private Double costForBusiness;
    private Double costForClient;
    private String imagePath;
    private LocalDate timestamp;


    public Flower() {

    }

    public Flower(Integer id, String name, String description, Double costForBusiness, Double costForClient, String imagePath) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.costForBusiness = costForBusiness;
        this.costForClient = costForClient;
        this.imagePath = imagePath;
        this.timestamp = LocalDate.now();
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Double getCostForBusiness() {
        return costForBusiness;
    }

    public Double getCostForClient() {
        return costForClient;
    }

    public String getImagePath() {
        return imagePath;
    }

    public static Flower fromDto(FlowerDto flowerDto) {
        return new Flower(
                flowerDto.getId(),
                flowerDto.getName(),
                flowerDto.getDescription(),
                flowerDto.getCostForBusiness(),
                flowerDto.getCostForClient(),
                flowerDto.getImagePath()
        );
    }
}
