package adapterMe;

public class Main {
    public static void main(String[] args) {
        var capitan = new Capitan(new BarcapescuitAdapter());
        capitan.vasleste();
        System.out.println("Capitanul este salvat de pirati, acum poate naviga!");
    }
}
