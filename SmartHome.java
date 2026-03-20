package Task02;
interface SmartDevice{
    void turnOn();
    void turnOff();
}
class SmartLight implements SmartDevice {
    @Override
    public void turnOn() {
        System.out.println("Smart Light is turned ON.");
    }

    @Override
    public void turnOff() {
        System.out.println("Smart Light is turned OFF.");
    }
}

class SmartFan implements SmartDevice {
    @Override
    public void turnOn() {
        System.out.println("Smart Fan is turned ON.");
    }

    @Override
    public void turnOff() {
        System.out.println("Smart Fan is turned OFF.");
    }
}

public class SmartHome{
    public static void main(String[] args) {
        SmartDevice light = new SmartLight();
        SmartDevice fan = new SmartFan();

        light.turnOn();
        light.turnOff();

        fan.turnOn();
        fan.turnOff();
    }
}