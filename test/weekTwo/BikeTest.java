package weekTwo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BikeTest {

    @Test
    @DisplayName("test bike can be turned on")
    public void bikeCanBeTurnedOn() {
        Bike bike = new Bike();
        bike.turnBikeOn();
        assertTrue(bike.isOn());
    }

    @Test
    @DisplayName("test bike can be turned off")
    public void bikeCanBeTurnedOff() {
        Bike bike = new Bike();
        bike.turnBikeOn();
        bike.turnBikeOff();
        assertFalse(bike.isOn());
    }

    @Test
    @DisplayName("test bike can accelerate in gear one")
    public void bikeCanAccelerateInGearOne() {
        Bike bike = new Bike();
        bike.turnBikeOn();
        bike.accelerate();
        assertEquals(1, bike.getSpeed());
    }

    @Test
    @DisplayName("test bike can accelerate in gear two")
    public void bikeCanAccelerateInGearTwo() {
        Bike bike = new Bike();
        bike.turnBikeOn();

        for (int count = 0; count < 22; count++) {
            bike.accelerate();
        }

        assertEquals(23, bike.getSpeed());
    }

    @Test
    @DisplayName("test bike can accelerate in gear three")
    public void bikeCanAccelerateInGearThree() {
        Bike bike = new Bike();
        bike.turnBikeOn();

        for ( int count = 0; count < 27; count++){
            bike.accelerate();
        }

        assertEquals(34, bike.getSpeed());
    }

    @Test
    @DisplayName("test bike can accelerate in gear four")
    public void bikeCanAccelerateInGearFour() {
        Bike bike = new Bike();
        bike.turnBikeOn();

        for ( int count = 0; count < 31; count++){
            bike.accelerate();
        }

        assertEquals(47, bike.getSpeed());
    }

    @Test
    @DisplayName("test bike can decelerate in gear one")
    public void bikeCanDecelerateInGearOne() {
        Bike bike = new Bike();
        bike.turnBikeOn();
        bike.accelerate(); // 1
        bike.decelerate();
        assertEquals(0, bike.getSpeed());
    }

    @Test
    @DisplayName("test bike can decelerate in gear two")
    public void bikeCanDecelerateInGearTwo() {
        Bike bike = new Bike();
        bike.turnBikeOn();

        for (int count = 0; count < 21; count++) {
            bike.accelerate();
        }

        bike.decelerate();
        assertEquals(19, bike.getSpeed());
    }
}