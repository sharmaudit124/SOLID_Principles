package openClosedPrinciple;

public interface NotificationService {

    //    OCP states that Open for extension and closed for modifications similar to abstraction

    public void sendOTP(String medium);

    public void sendTransactionReport(String medium);

}
