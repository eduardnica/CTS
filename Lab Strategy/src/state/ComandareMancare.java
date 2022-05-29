package state;

public class ComandareMancare {
    State s;
    int comanda;

    public ComandareMancare(State s, int comanda) {
        this.s = s;
        this.comanda = comanda;
    }

    public ComandareMancare(State nothing) {
    }

    public State getS() {
        return s;
    }

    public void setS(State s) {
        this.s = s;
    }

    public void nextState() {
        s.updateState(this);
    }

}
