package interfaceSegregationPrinciple;

// This principle states that Interfaces should not be very large we should not force our client to
// implement those methods also which are not required for them so make diff interface instead of a simple big one.
public interface UpiPayment {
    public void payMoney();

    public void getScratchCard();
}
