package pl.sda.tdd;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;


@RunWith(MockitoJUnitRunner.class)
public class NotificationServiceTest {

    @Mock
    private EmailService emailService;
    @Mock
    private PigeonService pigeonService;

    @InjectMocks
    private NotificationService notificationService; // dzięki temu powyższe mocki będą wstrzyknięte do NotificationService
                                                    // i jednocześnie mock dla NotificationsSrvice


//1. Jeśli EmailService.isAvailable -> sendEmail
    @Test
    public void shouldSendEmailTest() {
        //Given
        when(emailService.isAvailable()).thenReturn(true);
        //When
        notificationService.sendNotification(); //wywołuję metodę, którą chcę testować
        //Then
        verify(emailService).sendEmail("Otrzymałes wiadomość mailem");
    }

// 2. W przeciwnym razie jeśli PigeonService.isAvailable -> sendMessage
   @Test
    public void shouldSendPigeonTest() {
       //Given
       when(emailService.isAvailable()).thenReturn(false);
       when(pigeonService.isAvailable()).thenReturn(true);
       //When
       notificationService.sendNotification(); //wywołuję metodę, którą chcę testować
       //Then
       verify(pigeonService).sendMessage("Otrzymałeś wiadomość gołębiem");
   }

// 3. W przeciwnym razie nie rób nic.
    @Test (expected = IllegalStateException.class)
    public void shouldDoNothingTest(){
        //Given
        when(emailService.isAvailable()).thenReturn(false);
        when(pigeonService.isAvailable()).thenReturn(false);
        //When
        notificationService.sendNotification();
    }



}