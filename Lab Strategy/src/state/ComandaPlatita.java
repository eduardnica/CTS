package state;

public class ComandaPlatita implements State{
    @Override
    public void updateState(ComandareMancare comanda) {
        comanda.setS( (State) new ComandaLivrata());
        System.out.println("Plata a fost efectuata si comanda se livreaza");
    }
}
