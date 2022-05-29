package flyweightMe;

import java.awt.*;

public class Peste {
    private int x;
    private int y;
    private TipPeste type;

    public Peste(int x, int y, TipPeste type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }

    public void draw(Graphics g) {
        type.draw(g, x, y);
    }
}
