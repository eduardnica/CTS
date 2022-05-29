import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<FormaGeometrica> formaGeometricas = new ArrayList<>();
        List<FormaGeometrica> shapesCopy = new ArrayList<>();

        Cerc cerc = new Cerc();
        cerc.x = 10;
        cerc.y = 20;
        cerc.radius = 15;
        cerc.color = "red";
        formaGeometricas.add(cerc);

        Cerc anotherCerc = (Cerc) cerc.clone();
        formaGeometricas.add(anotherCerc);

        Dreptunghi dreptunghi = new Dreptunghi();
        dreptunghi.width = 10;
        dreptunghi.height = 20;
        dreptunghi.color = "blue";
        formaGeometricas.add(dreptunghi);

        cloneAndCompare(formaGeometricas, shapesCopy);
    }

    private static void cloneAndCompare(List<FormaGeometrica> formaGeometricas, List<FormaGeometrica> shapesCopy) {
        for (FormaGeometrica formaGeometrica : formaGeometricas) {
            shapesCopy.add(formaGeometrica.clone());
        }

        for (int i = 0; i < formaGeometricas.size(); i++) {
            if (formaGeometricas.get(i) != shapesCopy.get(i)) {
                System.out.println(i + ": Formele sunt obiecte diferite");
                if (formaGeometricas.get(i).equals(shapesCopy.get(i))) {
                    System.out.println(i + ": si ele sunt identice");
                } else {
                    System.out.println(i + ": Dar nu sunt identice");
                }
            } else {
                System.out.println(i + ": Obiectele forma geometrica sunt aceleasi");
            }
        }
    }
}
