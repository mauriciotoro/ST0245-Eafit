/**
 * 
 * @author anietog1, ditrefftzr
 */
public class Recursion1 {
    public int triangle(int rows) {
        if (rows == 0) return 0; //C
        return rows + triangle(rows - 1); //C + T(n-1)
        //MODELO: T(n) =   |C, n=0
        //                 |C + T(n-1), n>0
        //ECUACION DE RECURRENCIA: 
        //          T(n) = C*n + C1
        //CÁLCULO DE COMPLEJIDAD:
        //          O(C*n + C1)
        //          O(C*n)      -> Por regla de la suma
        //          O(n)        -> Por regla de la multiplicación
    }
    
    public boolean nestParen(String str) {
        ...   
    }
    
    public int count11(String str) {
        ...
    }
    
    public String endX(String str) {
        ...
    }
    
    private String endXAux(String str, int start) {
        ...
    }
    
    public String changePi(String str) {
        ...
    }
}
