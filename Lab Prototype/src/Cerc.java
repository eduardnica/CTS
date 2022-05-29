public class Cerc extends FormaGeometrica {
    public int radius;

    public Cerc() {
    }

    public Cerc(Cerc target) {
        super(target);
        if (target != null) {
            this.radius = target.radius;
        }
    }

    @Override
    public FormaGeometrica clone() {
        return new Cerc(this);
    }

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Cerc) || !super.equals(object2)) return false;
        Cerc shape2 = (Cerc) object2;
        return shape2.radius == radius;
    }
}
