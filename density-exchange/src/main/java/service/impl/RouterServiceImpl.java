package service.impl;

import enums.Bank;
import service.RouterService;

import java.util.HashMap;
import java.util.Map;

public class RouterServiceImpl implements RouterService {

    Map<Bank, Integer> successCounter;
    Map<Bank, Integer> failureCounter;

    public RouterServiceImpl() {
        successCounter = new HashMap<>();
        failureCounter = new HashMap<>();
    }

    @Override
    public void paymentSuccessIngest(Bank bank, boolean success) {
        if (success) {
            if (successCounter.containsKey(bank)) {
                successCounter.put(bank, successCounter.get(bank)+1);
            } else {
                successCounter.put(bank, 1);
            }
        } else {
            if (failureCounter.containsKey(bank)) {
                failureCounter.put(bank, failureCounter.get(bank)+1);
            } else {
                failureCounter.put(bank, 1);
            }
        }
    }

    @Override
    public Bank getSuccessRate() {
        Bank bank = null;
        int highestRate = Integer.MIN_VALUE;
        for (Bank bankE: Bank.values()) {
            Integer successRate = successCounter.get(bankE);
            Integer failureRate = failureCounter.get(bankE);
            int rate = (successRate/(successRate+failureRate))*100;
            if (rate > highestRate) {
                highestRate = rate;
                bank = bankE;
            }
        }

        return bank;
    }
}
