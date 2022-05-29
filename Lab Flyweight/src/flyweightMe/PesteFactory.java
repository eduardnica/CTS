package flyweightMe;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class PesteFactory {
    static Map<String, TipPeste> pestiTypes = new HashMap<>();

    public static TipPeste getPestiTypes(String name, Color color, String anotherDataPeste) {
        TipPeste result = pestiTypes.get(name);
        if (result == null) {
            result = new TipPeste(name, color, anotherDataPeste);
            pestiTypes.put(name, result);
        }
        return result;
    }
}
