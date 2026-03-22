package methods;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BackToSenderTest {

    @Test
    @DisplayName("Should calculate payment for collection rate less than 50%")
    public void calculatePayment_lessThan50Percent() {
        int result = BackToSender.calculateRiderPayment(25);
        assertEquals(9000, result);
    }

    @Test
    @DisplayName("Should calculate payment for collection rate between 50% and 59%")
    public void calculatePayment_50To59Percent() {
        int result = BackToSender.calculateRiderPayment(55);
        assertEquals(16000, result);
    }

    @Test
    @DisplayName("Should calculate payment for collection rate between 60% and 69%")
    public void calculatePayment_60To69Percent() {
        int result = BackToSender.calculateRiderPayment(65);
        assertEquals(21250, result);
    }

    @Test
    @DisplayName("Should calculate payment for collection rate 70% and above")
    public void calculatePayment_70AndAbove() {
        int result = BackToSender.calculateRiderPayment(80);
        assertEquals(45000, result);
    }
}
