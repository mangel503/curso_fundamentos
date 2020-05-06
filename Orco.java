public class Orco extends Monstruo {
    String grunyido ;
    public Orco( String nombre , int sangre , String grunyido ) { 
        super(nombre , sangre ) ;
        this.grunyido= grunyido ;
    }
    public void moverse(){
        System.out.println ("Soy un orco , estoy corriendo") ; 
    }
}
