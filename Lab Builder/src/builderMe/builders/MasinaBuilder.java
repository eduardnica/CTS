package builderMe.builders;

import builderMe.cars.Masina;
import builderMe.cars.TipMasina;
import builderMe.components.Motor;
import builderMe.components.GPSNavigator;
import builderMe.components.Transmisie;
import builderMe.components.TripComputer;

public class MasinaBuilder implements Builder {

    private TipMasina type;
    private int locuri;
    private Motor motor;
    private Transmisie transmisie;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;



    @Override
    public void setTipMasina(TipMasina type) {
        this.type = type;
    }

    @Override
    public void setLocuri(int seats) {
        this.locuri = seats;
    }

    @Override
    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    @Override
    public void setTransmisie(Transmisie transmisie) {
        this.transmisie = transmisie;
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    @Override
    public void setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }

    public Masina getMasinaRezultata() {
        return new Masina(type, locuri, motor, transmisie, tripComputer, gpsNavigator);
    }


}
