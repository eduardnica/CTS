public class ObiectScumpProxy implements ObiectScump{

    public static ObiectScump obiectScump;

    @Override
    public void proceseaza() {
        if(obiectScump == null) {
            obiectScump = new ObiectScumpImplementation();
        }
        obiectScump.proceseaza();
    }
}
