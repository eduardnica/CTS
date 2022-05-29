import java.util.HashMap;
import java.util.Map;

public class PrototypeFactory {
    private Map<String, FormaGeometrica> cache = new HashMap<>();

    public PrototypeFactory() {
        Cerc circle = new Cerc();
        circle.x = 5;
        circle.y = 7;
        circle.radius = 45;
        circle.color = "Green";

        Dreptunghi rectangle = new Dreptunghi();
        rectangle.x = 6;
        rectangle.y = 9;
        rectangle.width = 8;
        rectangle.height = 10;
        rectangle.color = "Blue";

        cache.put("Cerc mov", circle);
        cache.put("Dreptunghi Rosu", rectangle);
    }

    public FormaGeometrica put(String key, FormaGeometrica shape) {
        cache.put(key, shape);
        return shape;
    }

    public FormaGeometrica get(String key) {
        return cache.get(key).clone();
    }
}
