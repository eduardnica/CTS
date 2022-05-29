public class Dreptunghi extends FormaGeometrica {
    public int width;
    public int height;

    public Dreptunghi() {
    }

    public Dreptunghi(Dreptunghi target) {
        super(target);
        if (target != null) {
            this.width = target.width;
            this.height = target.height;
        }
    }

    @Override
    public FormaGeometrica clone() {
        return new Dreptunghi(this);
    }

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Dreptunghi) || !super.equals(object2)) return false;
        Dreptunghi shape2 = (Dreptunghi) object2;
        return shape2.width == width && shape2.height == height;
    }
}