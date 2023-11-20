package service.impl;

import models.Order;
import models.PaymentInput;
import service.PaymentGatewayService;
import service.factory.PaymentModeFactory;

public class PaymentGatewayServiceImpl implements PaymentGatewayService {

    private PaymentModeFactory paymentFactory;

    public PaymentGatewayServiceImpl(PaymentModeFactory paymentModeFactory) {
        this.paymentFactory = paymentModeFactory;
    }

    @Override
    public boolean pay(PaymentInput paymentInput, Order order) {
        boolean success;
        try {
            success = paymentFactory.service(paymentInput).makePayment(paymentInput, order);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return success;
    }
}
