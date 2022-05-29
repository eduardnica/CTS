package builderMe.cars;

import builderMe.components.Motor;
import builderMe.components.GPSNavigator;
import builderMe.components.Transmisie;
import builderMe.components.TripComputer;

public class Manual {
    private final TipMasina tipMasina;
    private final int seats;
    private final Motor motor;
    private final Transmisie transmisie;
    private final TripComputer tripComputer;
    private final GPSNavigator gpsNavigator;

    public Manual(TipMasina tipMasina, int seats, Motor motor, Transmisie transmisie,
                  TripComputer tripComputer, GPSNavigator gpsNavigator) {
        this.tipMasina = tipMasina;
        this.seats = seats;
        this.motor = motor;
        this.transmisie = transmisie;
        this.tripComputer = tripComputer;
        this.gpsNavigator = gpsNavigator;
    }

    public String print() {
        String info = "";
        info += "Tipul masinii este: " + tipMasina + "\n";
        info += "Numarul de locuri: " + seats + "\n";
        info += "Motor: volum - " + motor.getVolum() + "; kilometraj - " + motor.getKilometraj() + "\n";
        info += "Transmisie: " + transmisie + "\n";
        if (this.tripComputer != null) {
            info += "Trip Computer: Functional" + "\n";
        } else {
            info += "Trip Computer: N/A" + "\n";
        }
        if (this.gpsNavigator != null) {
            info += "GPS Navigator: Functional" + "\n";
        } else {
            info += "GPS Navigator: N/A" + "\n";
        }
        return info;
    }
}
