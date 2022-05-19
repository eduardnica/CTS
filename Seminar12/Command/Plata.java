package Command;

public class Plata {
    double suma;
    String contDestinatie;

    public Plata(double suma, String contDestinatie) {
        this.suma = suma;
        this.contDestinatie = contDestinatie;
    }

    @Override
    public void efectuareOperatiune(){
        System.out.println("Operatiune efectuata");
    }
}
