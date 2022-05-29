package state;

public class Main {
    public static void main(String[] args) {
        ComandareMancare comanda = new ComandareMancare(new State() {
            @Override
            public void updateState(ComandareMancare comanda) {

            }
        }, 1);

        comanda.setS(new ComandaPlasata());
        comanda.nextState();
        comanda.nextState();
        comanda.nextState();
    }


}
