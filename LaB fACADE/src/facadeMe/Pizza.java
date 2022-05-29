package facadeMe;

public class Pizza implements Cook{
    @Override
    public void cook() {
        System.out.println("Pizza::cook()");
    }
}
