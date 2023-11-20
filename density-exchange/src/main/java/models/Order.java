package models;

import java.util.UUID;

public class Order {
    private String id;
    private Double amount;

    public Order(Double amount) {
        this.id= UUID.randomUUID().toString();
        this.amount = amount;
    }
}
