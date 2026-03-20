package Task05;
abstract class Appliance{
    abstract void start();
}

interface RemoteControl{
    void controlRemotely();
}

class SmartWashingMachine extends Appliance implements RemoteControl{
    @Override
    void start() {
        System.out.println("Washing Machine is started.");
    }

    @Override
    public void controlRemotely() {
        System.out.println("Washing Machine is controlled by remote.");
    }
}

class SmartRefrigerator extends Appliance{
    @Override
    void start() {
        System.out.println("Refrigerator is started.");
    }
}
public class SystemDesigner {
    public static void main(String[] args) {
        Appliance machine = new SmartWashingMachine();
        Appliance refrigerator = new SmartRefrigerator();

        machine.start();
        refrigerator.start();
        ((RemoteControl) machine).controlRemotely();
    }
}