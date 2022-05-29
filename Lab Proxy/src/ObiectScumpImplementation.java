public class ObiectScumpImplementation implements ObiectScump{


   public ObiectScumpImplementation() {
       initialConfiguration();
   }


    @Override
    public void proceseaza() {
        System.out.println("procesare completa");
    }

    private void initialConfiguration() {
        System.out.println("Incarcare configuratie initiala..");
    }

}
