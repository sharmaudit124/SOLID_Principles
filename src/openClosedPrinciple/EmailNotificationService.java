package openClosedPrinciple;

public class EmailNotificationService implements NotificationService {
    @Override
    public void sendOTP(String medium) {
        //logic for email api
    }

    @Override
    public void sendTransactionReport(String medium) {
        //logic to integrate with email api
    }
}
