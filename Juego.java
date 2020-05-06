import java . util . ArrayList ;
public class Juego {
    ArrayList <Monstruo> arr ; 
    ArrayList <Humano> arr2 ; 
    ArrayList <Arma> arr3;
    public Juego () { 
        arr = new ArrayList <>();
        arr2 = new ArrayList <>();
        arr . add(new Orco("Garnag" , 10, "garr") ) ;
        arr . add(new Dragon("Brenton" , 20, "metal") ) ;
        arr . add(new Orco("Rogthun" , 5, "purr") ) ;
        arr . add(new Dragon("Draco" , 40, "cuero" ) ) ; 
        arr2.add(new JugadorNormal("Auron",3,"vision nocturna"));
        arr2.add(new NPC("Frederick",8,"Herrero"));
        arr2.add(new JugadorNormal("Horacio",3,"punteria perfecta"));
        arr2.add(new NPC("Gustavo",3,"Panadero"));
        
    }

    public void agregarMonstruo (Monstruo m) {
        arr . add(m) ; 
    } 

    public void moverMonstruos () {
        for (Monstruo m: arr ) {
            m. moverse () ; 
        }
    } 
    public void PresentarPersonajes () {
        for (Humano h: arr2 ) {
            h. presentarse () ; 
        }
    } 
   
}