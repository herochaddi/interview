package service.payment;

import models.Order;
import service.PaymentService;

public class CreditCardPaymentService implements PaymentService {



    @Override
    public boolean makePayment(Order order) {
        return false;
    }
}
