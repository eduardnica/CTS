package adapterMe;

public class BarcapescuitAdapter implements BarcaVasle {

    private final BarcaPescuit barcaPescuit;

    public BarcapescuitAdapter() {
        barcaPescuit = new BarcaPescuit();
    }

    @Override
    public void vasleste() {
        barcaPescuit.navigheaza();
    }
}
