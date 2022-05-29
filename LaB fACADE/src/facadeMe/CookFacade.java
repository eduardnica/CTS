package facadeMe;

public class CookFacade {
    public Cook gyros;
    public Cook pizza;
    public Cook pasta;

    public CookFacade() {
        gyros = new Gyros();
        pizza = new Pizza();
        pasta = new Pasta();
    }

    public void cookGyros() {
        gyros.cook();
    }

    public void cookPizza() {
        pizza.cook();
    }

    public void cookPasta() {
        pasta.cook();
    }
}
