package service.factory;

import enums.Bank;
import service.BankService;
import service.impl.bank.HdfcBankService;
import service.impl.bank.IciciBankService;

public class BankServiceFactory {
    public BankService bankRedirect(Bank bank) throws Exception {
        switch (bank) {
            case HDFC -> {
                return new HdfcBankService();
            }
            case ICICI -> {
                return new IciciBankService();
            }
        }
        throw new Exception("bank not found");
    }
}
