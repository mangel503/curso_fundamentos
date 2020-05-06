public class Arco extends Arma
{
    int cantidadFlechas;
    public Arco( String nombre , int danyo , int cantidadFlechas ) { 
        super(nombre , danyo ) ;
        this.cantidadFlechas= cantidadFlechas ;
    }
    public void atacar(){
        System.out.println("su ataque con el arco ha causado una daño de: "+danyo);
    }
}
