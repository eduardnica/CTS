package flyweightMe;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Acvariu extends JFrame {
    private List<Peste> pesti = new ArrayList<>();

    public void punePeste(int x, int y, String name, Color color, String otherTreeData) {
        TipPeste type = PesteFactory.getPestiTypes(name, color, otherTreeData);
        Peste peste = new Peste(x, y, type);
        pesti.add(peste);
    }

    @Override
    public void paint(Graphics graphics) {
        for (Peste peste : pesti) {
            peste.draw(graphics);
        }
    }
}
