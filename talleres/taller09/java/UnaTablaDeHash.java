//Una tabla de hash donde la llave es un String y el valor un int.
public class UnaTablaDeHash
{
   // Ojo, esta tabla definida así no permite manejar las colisiones
   private int[] tabla;

   public UnaTablaDeHash(){
      tabla = new int[10];
   }

   // Ojo, esta función hash es muy ingenua
   private int funcionHash(String k){
       return ((int) k.charAt(0)) % 10;
   }

   // Ojo con las colisiones
   public int get(String k){

   }

   // Ojo con las colisiones
   public void put(String k, int v){

   }
}