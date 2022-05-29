package flyweightMe;

import java.awt.*;

public class TipPeste {
    private String name;
    private Color color;
    private String anotherDataPeste;

    public TipPeste(String name, Color color, String anotherDataPeste) {
        this.name = name;
        this.color = color;
        this.anotherDataPeste = anotherDataPeste;
    }

    public void draw(Graphics g, int x, int y) {
        g.setColor(Color.BLACK);
        g.fillRect(x - 1, y, 3, 5);
        g.setColor(color);
        g.fillOval(x - 5, y - 10, 10, 10);
    }
}
