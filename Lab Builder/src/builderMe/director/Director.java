package builderMe.director;

import builderMe.builders.Builder;
import builderMe.cars.TipMasina;
import builderMe.components.Motor;
import builderMe.components.GPSNavigator;
import builderMe.components.Transmisie;
import builderMe.components.TripComputer;

public class Director {
    public void construireMasinaSport(Builder builder) {
        builder.setTipMasina(TipMasina.MASINA_SPORT);
        builder.setLocuri(2);
        builder.setMotor(new Motor(3.0, 0));
        builder.setTransmisie(Transmisie.SEMI_AUTOMATA);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
    }

    public void construireMasinaOras(Builder builder) {
        builder.setTipMasina(TipMasina.MASINA_ORAS);
        builder.setLocuri(2);
        builder.setMotor(new Motor(1.2, 0));
        builder.setTransmisie(Transmisie.AUTOMATA);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
    }

    public void construireSUV(Builder builder) {
        builder.setTipMasina(TipMasina.SUV);
        builder.setLocuri(4);
        builder.setMotor(new Motor(2.5, 0));
        builder.setTransmisie(Transmisie.MANUALA);
        builder.setGPSNavigator(new GPSNavigator());
    }
}
