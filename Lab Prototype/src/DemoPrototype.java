public class DemoPrototype {
    public static void main(String[] args) {
        PrototypeFactory cache = new PrototypeFactory();

        FormaGeometrica shape1 = cache.get("Cerc mov");
        FormaGeometrica shape2 = cache.get("Dreptunghi Rosu");


        if (shape1 != shape2 && !shape1.equals(shape2)) {
            System.out.println("Cerc mov != Dreptunghi Rosu");
        } else {
            System.out.println("Cerc mov == Dreptunghi Rosu");
        }


    }
}
