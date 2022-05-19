package ro.ase.cts.g1088;
import java.io.BufferedReader;
import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Scrie ceva:");
        String textulMeu = keyboard.nextLine();

        try{
            if(textulMeu.toLowerCase() == textulMeu)
                throw new ExceptieAllLower();
            else if(textulMeu.toUpperCase() == textulMeu)
                throw new ExceptieAllUpper();

        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println("Ai introdus: " + textulMeu);


    }
}
