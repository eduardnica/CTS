package state;

public class ComandaPlasata implements State{
    @Override
    public void updateState(ComandareMancare comanda) {
        comanda.setS( (State) new ComandaPlatita());
        System.out.println("Plata va fi in curand efectuata");
    }
}
