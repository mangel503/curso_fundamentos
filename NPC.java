public class NPC extends Humano
{
    String oficio;
    public NPC(String nombre,int vidas,String oficio){
        super(nombre,vidas);
        this.oficio=oficio;
    }
     public void presentarse(){
        System.out.println("Hola querido viajero estoy aqui para ayudarte en tu mision");
    }                            
}
