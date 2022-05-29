package strategy;

public class StrategyMain {
    public static void main(String[] args) {
        MotorCriptare motorCriptare = new MotorCriptare();
        motorCriptare.setModCriptare(new Algo1());
        motorCriptare.getModCriptare(" parola");

        motorCriptare.setModCriptare(new Algo2());


        motorCriptare.getModCriptare(" parola2");
        motorCriptare.setModCriptare(new Algo3());
        motorCriptare.getModCriptare(" parola3");
    }
}
