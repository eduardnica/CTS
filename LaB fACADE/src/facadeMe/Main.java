package facadeMe;

public class Main {
    public static void main(String[] args) {
        CookFacade cookFacade = new CookFacade();

        cookFacade.cookGyros();
        cookFacade.cookPasta();
        cookFacade.cookPizza();
    }
}
