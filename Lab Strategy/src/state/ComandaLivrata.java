package state;

public class ComandaLivrata implements State{
    @Override
    public void updateState(ComandareMancare comanda) {
        System.out.println("Ciclu incheiat");
    }
}
