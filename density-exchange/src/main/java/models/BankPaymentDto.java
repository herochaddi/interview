package models;

public class BankPaymentDto {
    private Order order;
    private PaymentInput input;

    public BankPaymentDto(Order order, PaymentInput input) {
        this.order = order;
        this.input = input;
    }
}
