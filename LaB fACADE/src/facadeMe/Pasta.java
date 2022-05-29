package facadeMe;

public class Pasta implements Cook{
    @Override
    public void cook() {
        System.out.println("Pasta::cook()");
    }
}
