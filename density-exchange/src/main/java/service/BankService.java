package service;

import models.BankPaymentDto;

public interface BankService {
    boolean makePayment(BankPaymentDto paymentDetails);
}
