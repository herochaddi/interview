package service.factory;

import models.PaymentInput;
import service.PaymentService;
import service.payment.CreditCardPaymentService;
import service.payment.UpiPaymentService;

public class PaymentModeFactory {
    public PaymentService service(PaymentInput input) throws Exception {

        switch (input.getPaymentType()) {
            case UPI -> {
                return new UpiPaymentService();
            }
            case CREDIT_CARD -> {
                return new CreditCardPaymentService();
            }
        }
        throw new Exception("input not recognized...");
    }
}
