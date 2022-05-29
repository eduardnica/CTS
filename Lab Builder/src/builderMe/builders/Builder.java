package builderMe.builders;

import builderMe.cars.TipMasina;
import builderMe.components.Motor;
import builderMe.components.GPSNavigator;
import builderMe.components.Transmisie;
import builderMe.components.TripComputer;

public interface Builder {
    void setTipMasina(TipMasina type);
    void setLocuri(int seats);
    void setMotor(Motor motor);
    void setTransmisie(Transmisie transmisie);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}

