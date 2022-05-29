package flyweightMe;

import java.awt.*;

public class Main {
    static int CANVAS_SIZE = 500;
    static int FISH_TO_PUT = 1000000;
    static int TIPURI_PESTE = 2;

    public static void main(String[] args) {
        Acvariu acvariu = new Acvariu();
        for (int i = 0; i < Math.floor(FISH_TO_PUT / TIPURI_PESTE); i++) {
            acvariu.punePeste(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE),
                    "Betta", Color.GREEN, "nu trebuie filtru");
            acvariu.punePeste(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE),
                    "Pestisor de aur", Color.ORANGE, "Foarte greu de intretinut");
        }
        acvariu.setSize(CANVAS_SIZE, CANVAS_SIZE);
        acvariu.setVisible(true);

        System.out.println(FISH_TO_PUT + " PESTI PUSI");
        System.out.println("---------------------");
        System.out.println("Memory usage:");
        System.out.println("fISH size (8 bytes) * " + FISH_TO_PUT);
        System.out.println("+ fISH TYPES size (~30 bytes) * " + TIPURI_PESTE + "");
        System.out.println("---------------------");
        System.out.println("Total: " + ((FISH_TO_PUT * 8 + TIPURI_PESTE * 30) / 1024 / 1024) +
                "MB (instead of " + ((FISH_TO_PUT * 38) / 1024 / 1024) + "MB)");
    }

    private static int random(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }
}
