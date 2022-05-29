package adapterMe;

public class Capitan {

    private final BarcaVasle barcaVasle;

    public Capitan(BarcaVasle barcaVasle) {
        this.barcaVasle = barcaVasle;
    }

    public void vasleste() {
        barcaVasle.vasleste();
    }
}
