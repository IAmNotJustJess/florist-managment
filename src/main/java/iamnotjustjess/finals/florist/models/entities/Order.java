package iamnotjustjess.finals.florist.models.entities;

import iamnotjustjess.finals.florist.models.dtos.FlowerDto;
import iamnotjustjess.finals.florist.models.dtos.OrderDto;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class Order {
    @Id
    @GeneratedValue
    private Integer id;
    private String clientFirstName;
    private String clientLastName;
    private String clientContact;
    private String clientAddress;
    private Integer flowerId;
    private Integer amountBought;
    private Double totalPrice;
    private LocalDate timestamp;

    public Order() {

    }

    public Order(Integer id, String clientFirstName, String clientLastName, String clientContact, String clientAddress, Integer flowerId, Integer amountBought, Double totalPrice) {
        this.id = id;
        this.clientFirstName = clientFirstName;
        this.clientLastName = clientLastName;
        this.clientContact = clientContact;
        this.clientAddress = clientAddress;
        this.flowerId = flowerId;
        this.amountBought = amountBought;
        this.totalPrice = totalPrice;
        this.timestamp = LocalDate.now();
    }

    public Integer getId() {
        return id;
    }

    public String getClientFirstName() {
        return clientFirstName;
    }

    public String getClientLastName() {
        return clientLastName;
    }

    public String getClientContact() {
        return clientContact;
    }

    public String getClientAddress() {
        return clientAddress;
    }

    public Integer getFlowerId() {
        return flowerId;
    }

    public Integer getAmountBought() {
        return amountBought;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public static Order fromDto(OrderDto orderDto) {
        return new Order(
                orderDto.getId(),
                orderDto.getClientFirstName(),
                orderDto.getClientLastName(),
                orderDto.getClientContact(),
                orderDto.getClientAddress(),
                orderDto.getFlowerId(),
                orderDto.getAmountBought(),
                orderDto.getTotalPrice()
        );
    }
}
