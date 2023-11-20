package models.mode;

import models.PaymentMode;
import models.input.Upi;

public class UpiPaymentMode extends PaymentMode<Upi> {
    @Override
    public boolean verify(Upi input) {
        return true;
    }
}
