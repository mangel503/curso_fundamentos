public class Espada extends Arma
{
    String material;
    public Espada( String nombre , int danyo , String material ) { 
        super(nombre , danyo ) ;
        this.material= material ;
    }
    public void atacar(){
        System.out.println("su ataque con la espada ha causado una daño de: "+danyo);
    }
}
