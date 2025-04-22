package bb.aplikacje.kwiaciarnia.models.dtos;

import bb.aplikacje.kwiaciarnia.models.entities.Flower;

public class FlowerDto {
    private Integer id;
    private String name;
    private String description;
    private Double costForBusiness;
    private Double costForClient;
    private String imagePath;

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

    public FlowerDto(Integer id, String name, String description, Double costForBusiness, Double costForClient, String imagePath) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.costForBusiness = costForBusiness;
        this.costForClient = costForClient;
        this.imagePath = imagePath;
    }

    public static FlowerDto fromEntity(Flower flower) {
        return new FlowerDto(
                flower.getId(),
                flower.getName(),
                flower.getDescription(),
                flower.getCostForBusiness(),
                flower.getCostForClient(),
                flower.getImagePath()
        );
    }
}
