package service.impl.bank;

import models.BankPaymentDto;
import service.BankService;

public class IciciBankService implements BankService {
    @Override
    public boolean makePayment(BankPaymentDto paymentDetails) {
        return false;
    }
}
