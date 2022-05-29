import java.util.Objects;

public abstract class FormaGeometrica {
    public int x;
    public int y;
    public String color;

    public FormaGeometrica() {
    }

    public FormaGeometrica(FormaGeometrica target) {
        if (target != null) {
            this.x = target.x;
            this.y = target.y;
            this.color = target.color;
        }
    }

    public abstract FormaGeometrica clone();

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof FormaGeometrica)) return false;
        FormaGeometrica formaGeometrica2 = (FormaGeometrica) object2;
        return formaGeometrica2.x == x && formaGeometrica2.y == y && Objects.equals(formaGeometrica2.color, color);
    }
}
