package iamnotjustjess.finals.florist.models.dtos;

import iamnotjustjess.finals.florist.models.entities.Flower;
import iamnotjustjess.finals.florist.models.entities.Order;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.time.LocalDate;

public class OrderDto {
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

    public OrderDto() {

    }

    public OrderDto(Integer id, String clientFirstName, String clientLastName, String clientContact, String clientAddress, Integer flowerId, Integer amountBought, Double totalPrice) {
        this.id = id;
        this.clientFirstName = clientFirstName;
        this.clientLastName = clientLastName;
        this.clientContact = clientContact;
        this.clientAddress = clientAddress;
        this.flowerId = flowerId;
        this.amountBought = amountBought;
        this.totalPrice = totalPrice;
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

    public static OrderDto fromEntity(Order order) {
        return new OrderDto(
                order.getId(),
                order.getClientFirstName(),
                order.getClientLastName(),
                order.getClientContact(),
                order.getClientAddress(),
                order.getFlowerId(),
                order.getAmountBought(),
                order.getTotalPrice()
        );
    }
}
