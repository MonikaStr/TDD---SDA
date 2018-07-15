package pl.sda.tdd.pl.sda.tdd.notificationservice;

public interface EmailService {
    public boolean isAvailable();
    public void sendEmail(String message);
}
