package builderMe.components;

public class GPSNavigator {
    private String ruta;

    public GPSNavigator() {
        this.ruta = "street of sun Paddington nr.130";
    }

    public GPSNavigator(String manualRoute) {
        this.ruta = manualRoute;
    }

    public String getRuta() {
        return ruta;
    }
}
