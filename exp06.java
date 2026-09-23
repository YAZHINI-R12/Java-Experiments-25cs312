interface RemoteControl {
    void turnOn();
    void turnOff();
}

abstract class Appliance {
    abstract void displayAppliance();
}

class SmartTV extends Appliance implements RemoteControl {
    @Override
    void displayAppliance() {
        System.out.println("Appliance : Smart TV");
        System.out.println("Brand     : Samsung");
        System.out.println("Type      : Smart Television");
    }

    @Override
    public void turnOn() {
        System.out.println("Status    : Smart TV is ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Status    : Smart TV is OFF");
    }
}

public class exp06 {
    public static void main(String[] args) {
        Appliance appliance = new SmartTV();
        appliance.displayAppliance();

        RemoteControl remote = new SmartTV();
        remote.turnOn();
        remote.turnOff();
    }
}
