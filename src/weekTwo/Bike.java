package weekTwo;

public class Bike {
    private boolean isOn;
    private int speed;

    public void turnBikeOn() {
        isOn = true;
    }

    public void turnBikeOff() {
        isOn = false;
    }

    public boolean isOn() {
        return isOn;
    }

    public int getSpeed() {
        return speed;
    }

    public int getGear() {
        if (speed >= 0 && speed <= 20) return 1;
        if (speed >= 21 && speed <= 30) return 2;
        if (speed >= 31 && speed <= 40) return 3;

        return 4;
    }

    public void accelerate() {
        if (!isOn) return;

        if (getGear() == 1) {
            speed += 1;
        } else if (getGear() == 2) {
            speed += 2;
        } else if (getGear() == 3) {
            speed += 3;
        } else {
            speed += 4;
        }
    }

    public void decelerate() {
        if (!isOn) return;

        if (getGear() == 1) {
            speed -= 1;
        } else if (getGear() == 2) {
            speed -= 2;
        } else if (getGear() == 3) {
            speed -= 3;
        } else {
            speed -= 4;
        }

        if (speed < 0) {
            speed = 0;
        }
    }
}