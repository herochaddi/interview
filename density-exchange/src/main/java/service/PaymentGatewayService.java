package service;

import models.Order;
import models.PaymentInput;

public interface PaymentGatewayService {
    boolean pay(PaymentInput paymentInput, Order order);
}
