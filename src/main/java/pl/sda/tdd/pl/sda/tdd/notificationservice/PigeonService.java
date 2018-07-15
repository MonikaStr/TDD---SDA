package pl.sda.tdd.pl.sda.tdd.notificationservice;

public interface PigeonService {
    public boolean isAvailable();
    public void sendMessage(String message);
}
