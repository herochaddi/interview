package models.input;

import enums.PaymentType;
import lombok.Getter;
import models.PaymentInput;

@Getter
public class Upi extends PaymentInput {
    private final String upiId;
    private final String pin;

    public Upi(PaymentType type, String upiId, String pin) {
        super(type);
        this.upiId = upiId;
        this.pin = pin;
    }
}
