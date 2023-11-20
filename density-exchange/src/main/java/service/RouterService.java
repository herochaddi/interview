package service;

import enums.Bank;

import java.util.Map;

public interface RouterService {
    void paymentSuccessIngest(Bank bank, boolean success);
    Bank getSuccessRate();
}
