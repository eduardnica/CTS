package builderMe;

import builderMe.builders.MasinaBuilder;
import builderMe.builders.ManualMasinaBuilder;
import builderMe.cars.Masina;
import builderMe.cars.Manual;
import builderMe.director.Director;

public class Main {
    public static void main(String[] args) {

        Director director = new Director();


        MasinaBuilder builder = new MasinaBuilder();
        director.construireMasinaSport(builder);


        Masina masina = builder.getMasinaRezultata();
        System.out.println("Masina construita:\n" + masina.getCarType());


        ManualMasinaBuilder manualBuilder = new ManualMasinaBuilder();


        director.construireMasinaSport(manualBuilder);
        Manual carManual = manualBuilder.getManualRezultat();
        System.out.println("\nManualulo masinii construite:\n" + carManual.print());

    }
}
