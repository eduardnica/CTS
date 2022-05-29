package strategy;

public class MotorCriptare {
    ModCriptare modCriptare;

    public void getModCriptare(String s) {
        System.out.println(modCriptare.plateste(s));
    }

    public void setModCriptare(ModCriptare modCriptare) {
        this.modCriptare = modCriptare;
    }
}
