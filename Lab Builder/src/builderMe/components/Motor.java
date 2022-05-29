package builderMe.components;

public class Motor {
    private final double volum;
    private double kilometraj;
    private boolean aPornit;

    public Motor(double volum, double kilometraj) {
        this.volum = volum;
        this.kilometraj = kilometraj;
    }

    public void on() {
        aPornit = true;
    }

    public void off() {
        aPornit = false;
    }

    public boolean isaPornit() {
        return aPornit;
    }

    public void go(double mileage) {
        if (aPornit) {
            this.kilometraj += mileage;
        } else {
            System.err.println("Cannot go(), you must start engine first!");
        }
    }

    public double getVolum() {
        return volum;
    }

    public double getKilometraj() {
        return kilometraj;
    }
}
