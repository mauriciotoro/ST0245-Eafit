import java.util.*;
import java.io.*;

public class BrazoRobotico
{
    public static Stack<Integer>[] blocks;
    public static void createBlocks(int n){
        ...
    }
    
    public static int locate(int a){
        ...
    }

    public static void moveAontoB(int a, int b){
       ...
    }
    
    public static void moveAoverB(int a, int b){
        ...
    }
    
    public static void pileAontoB(int a, int b){
        ...
    }
    
    public static void pileAoverB(int a, int b){
        ...
    }
    
    static void PrintStack(Stack<Integer> s)  
    {  
        if (s.isEmpty())  
            return;   
        int x = s.peek();
        s.pop();
        PrintStack(s); 
        System.out.print(x + " ");  
        s.push(x);  
    }  
    
    public static void main() throws FileNotFoundException {
        Scanner scn = new Scanner(new File("instrucciones.txt"));
        int n = Integer.parseInt(scn.nextLine());
        createBlocks(n);
        while(scn.hasNextLine()){
            String line = scn.nextLine();
            if(line.equals("quit")){
                break;
            }
            String[] dividedLine = line.split(" ");
            int a = Integer.parseInt(dividedLine[1]);
            int b = Integer.parseInt(dividedLine[3]);
            if(dividedLine[0].equals("move")){
                if (dividedLine[2].equals("onto")){
                    moveAontoB(a,b);
                } else if (dividedLine[2].equals("over")){
                    moveAoverB(a,b);
                }
            } else if (dividedLine[0].equals("pile")){
                if (dividedLine[2].equals("onto")){
                    pileAontoB(a,b);
                } else if (dividedLine[2].equals("over")){
                    pileAoverB(a,b);
                }
            }
        }
        
        for(int i=0;i<blocks.length;i++){
            System.out.print(i+": ");
            PrintStack(blocks[i]);
            System.out.println();
        }
    }
}
