package service;

import models.Order;
import models.PaymentInput;

public interface PaymentService {
    public boolean makePayment(PaymentInput input, Order order);
}
