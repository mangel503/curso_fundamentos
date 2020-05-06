public class Dragon extends Monstruo {
    String escamas ;
    public Dragon( String nombre , int sangre , String grunyido ) { 
        super(nombre , sangre ) ;
        this.escamas= escamas ;
    }
    public void moverse(){
        System.out.println ("El dragon vuela") ; 
    }
}
