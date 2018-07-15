package pl.sda.tdd.pl.sda.tdd.notificationservice;

/*
Stwórz atrapę powyższych serwisów implementując testy dla klasy NotificationService.
Stwórz metodę notify która:
1. Jeśli EmailService.isAvailable -> sendEmail
2. W przeciwnym razie jeśli PigeonService.isAvailable -> sendMessage
3. W przeciwnym razie nie rób nic.
Zweryfikuj powyższe funkcjonalności używając biblioteki mockito
*/
public class NotificationService {

    private EmailService emailService;
    private PigeonService pigeonService;


    public void sendNotification() {
        if (emailService.isAvailable() == true) {
            emailService.sendEmail("Otrzymałes wiadomość mailem");
        }
        else if (pigeonService.isAvailable() == true) {
            pigeonService.sendMessage("Otrzymałeś wiadomość gołębiem");
        }

        else if (emailService.isAvailable() == false && pigeonService.isAvailable() == false) {
            throw new IllegalStateException("Musi być dostępny jeden z serwisów: mail lub gołąb");
        }
    }

}
