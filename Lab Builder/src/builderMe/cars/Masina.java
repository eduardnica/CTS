package builderMe.cars;

import builderMe.components.Motor;
import builderMe.components.GPSNavigator;
import builderMe.components.Transmisie;
import builderMe.components.TripComputer;

public class Masina {
    private final TipMasina tipMasina;
    private final int locuri;
    private final Motor motor;
    private final Transmisie transmisie;
    private final TripComputer tripComputer;
    private final GPSNavigator gpsNavigator;
    private double combustibil = 0;

    public Masina(TipMasina tipMasina, int locuri, Motor motor, Transmisie transmisie,
                  TripComputer tripComputer, GPSNavigator gpsNavigator) {
        this.tipMasina = tipMasina;
        this.locuri = locuri;
        this.motor = motor;
        this.transmisie = transmisie;
        this.tripComputer = tripComputer;
        if (this.tripComputer != null) {
            this.tripComputer.setCar(this);
        }
        this.gpsNavigator = gpsNavigator;
    }

    public TipMasina getCarType() {
        return tipMasina;
    }

    public double getCombustibil() {
        return combustibil;
    }

    public void setCombustibil(double combustibil) {
        this.combustibil = combustibil;
    }

    public int getLocuri() {
        return locuri;
    }

    public Motor getEngine() {
        return motor;
    }

    public Transmisie getTransmission() {
        return transmisie;
    }

    public TripComputer getTripComputer() {
        return tripComputer;
    }

    public GPSNavigator getGpsNavigator() {
        return gpsNavigator;
    }

}
