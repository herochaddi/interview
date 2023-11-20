package models;

public abstract class PaymentMode<P extends PaymentInput> {
    public abstract boolean verify(P input);
}
