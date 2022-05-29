package builderMe.components;

import builderMe.cars.Masina;

public class TripComputer {
    private Masina masina;

    public void setCar(Masina masina) {
        this.masina = masina;
    }

    public void showStatus() {
        if (this.masina.getEngine().isaPornit()) {
            System.out.println("Masina a pornit");
        } else {
            System.out.println("Masina n-a pornit");
        }
    }
}
