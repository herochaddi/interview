package models.mode;

import models.PaymentMode;
import models.input.Credit;

public class CreditCardPaymentMode extends PaymentMode<Credit> {
    @Override
    public boolean verify(Credit input) {
        return true;
    }
}
