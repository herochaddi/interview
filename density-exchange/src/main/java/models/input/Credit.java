package models.input;

import enums.PaymentType;
import lombok.Getter;
import models.PaymentInput;

@Getter
public class Credit extends PaymentInput {
    private final String cardNumber;
    private final Integer cvv;

    public Credit(PaymentType type, String cardNumber, Integer cvv) {
        super(type);
        this.cardNumber = cardNumber;
        this.cvv = cvv;
    }
}
