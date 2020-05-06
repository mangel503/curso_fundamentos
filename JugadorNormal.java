import java . util . ArrayList ;
public class JugadorNormal extends Humano
{      
    String habilidad;
    ArrayList <Arma> arr; 
    public JugadorNormal(String nombre,int vidas,String habilidad){
        super(nombre,vidas);
        this.habilidad=habilidad;
        arr = new ArrayList <>();
        arr . add(new Espada("Excalibur" , 50, "Acero en aleacion con diamante") ) ;
        arr . add(new Arco("Hawkeye" , 20, 30) ) ;
    }
    public void atacarArmas(){
        for (Arma a: arr ) {
            a. atacar () ; 
        }
    }

    public void presentarse(){
        System.out.println("Hola, he viajado hasta aqui con el deseo de salvar este pueblo y rescatar a la princesa");
    }                          

}
