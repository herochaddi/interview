package service.payment;

import enums.Bank;
import models.BankPaymentDto;
import models.Order;
import models.PaymentInput;
import service.PaymentService;
import service.RouterService;
import service.factory.BankServiceFactory;

public class UpiPaymentService implements PaymentService {

    private final RouterService routerService;
    private final BankServiceFactory bankServiceFactory;

    public UpiPaymentService(RouterService routerService, BankServiceFactory bankServiceFactory) {
        this.routerService = routerService;
        this.bankServiceFactory = bankServiceFactory;
    }

    @Override
    public boolean makePayment(PaymentInput input, Order order) {
        boolean success;
        Bank performingBank = routerService.getSuccessRate();
        BankPaymentDto dto = new BankPaymentDto(order, input);
        try {
            success = bankServiceFactory.bankRedirect(performingBank).makePayment(dto);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return success;
    }
}
