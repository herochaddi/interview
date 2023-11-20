package models;

import enums.PaymentType;
import lombok.Getter;

@Getter
public abstract class PaymentInput {
    private final PaymentType paymentType;

    public PaymentInput(PaymentType paymentType) {
        this.paymentType = paymentType;
    }
}
