import java.util.Arrays;
import java.util.LinkedList;
import java.util.ArrayList;
 class Node{
   public int data;
   public Node next;
   public Node(int d){
    data = d; next = null;
   }
 }

class Parcial120202{


static void floodFillUtil(int screen[][], int x, int y, int prevC, int newC) { 
 if (x < 0 || x >= screen[0].length || y < 0 || y >= screen.length) 
       return; 
 if (screen[x][y] != prevC) 
       return; 
  
 screen[x][y] = newC; 
 
 floodFillUtil(screen, x+1, y+1, prevC, newC); 
 floodFillUtil(screen, x-1, y-1, prevC, newC); 
 floodFillUtil(screen, x-1, y+1, prevC, newC); 
 floodFillUtil(screen, x+1, y-1, prevC, newC); 
 floodFillUtil(screen, x+1, y, prevC, newC); 
 floodFillUtil(screen, x-1, y, prevC, newC); 
 floodFillUtil(screen, x, y+1, prevC, newC); 
 floodFillUtil(screen, x, y-1, prevC, newC); } 

static void floodFill(int screen[][], int x, int y, int newC) { 
 int prevC = screen[x][y]; 
 floodFillUtil(screen, x, y, prevC, newC); } 



static int numberOfPaths(int m, int n) { 
 int count[][] = new int[m][n]; 
 
 for (int i = 0; i < m; i++) 
      count[i][0] = 1; 

 for (int j = 0; j < n; j++) 
      count[0][j] = 1; 
  
 for (int i = 1; i < m; i++) { 
  for (int j = 1; j < n; j++)   
   count[i][j]=count[i-1][j]+count[i][j-1]; 
 } 
 return count[m - 1][n - 1]; 
} 




private static int i, j = 0;
static int aux(LinkedList<Integer> ar1, LinkedList<Integer> ar2, int n, int m){
 int m1 = 0;
 if(i != n && j != m)   
  m1 = (ar1.get(i) < ar2.get(j)) ? ar2.get(j++) : ar1.get(i++);  
 else if(i < n) 
  m1 = ar1.get(i++);  
 else
  m1 = ar2.get(j++);  
 return m1;
}

static float med(LinkedList<Integer> ar1, LinkedList<Integer> ar2){     
 int count;  
 i = 0; j = 0;
 int m1 = -1, m2 = -1, n = ar1.size(), m = ar2.size();  
 
 if((m + n) % 2 == 1)  {
  for (count = 0; count <= (n + m)/2; count++) 
    m1 = aux(ar1, ar2, n, m);
  return m1;  
 }
 else {
  for(count = 0; count <= (n + m)/2; count++){  
    m2 = m1;  
    m1 = aux(ar1, ar2, n, m);
  }  
  return (m1 + m2)/2f;  
 }  
}  



static int convertir(ArrayList<Character> str){ 
 int res = 0; 
 for (int i = 0; i < str.size(); ++i) 
  res = res * 2 + str.get(i) - '0'; 
 return res; 
}  


static Node sortedMerge(Node A, Node B) {       
  if(A == null) return B; 
  if(B == null) return A;           
  if(A.data < B.data) { 
    A.next = sortedMerge(A.next, B); 
    return A; 
  } 
  else { 
    B.next = sortedMerge(A, B.next); 
    return B; 
  }         
} 


public static void main(String[] args){

//Punto 1
int[][] screen = {{1, 1, 1, 1, 1, 1, 1, 1},
                      {1, 1, 1, 1, 1, 1, 0, 0},
                      {1, 0, 0, 1, 1, 0, 1, 1},
                      {1, 2, 2, 2, 2, 0, 1, 0},
                      {1, 1, 1, 2, 2, 0, 1, 0},
                      {1, 1, 1, 2, 2, 2, 2, 0},
                      {1, 1, 1, 1, 1, 2, 1, 1},
                      {1, 1, 1, 1, 1, 2, 2, 1},
                      };

floodFill(screen, 4, 4, 3);
System.out.println("screen");
for (int i = 0; i < screen.length; i++){
  for (int j = 0; j < screen.length; j++)
	System.out.print(screen[i][j] + " ");
  System.out.println();
}	
System.out.println();

//Punto 2
System.out.println("paths " + numberOfPaths(2,3) );
System.out.println();

//Punto 3
System.out.println("median " + med(new LinkedList<Integer>(Arrays.asList(15,10,5)), 
                                   new LinkedList<Integer>(Arrays.asList(20,3,2))));
System.out.println();

//Punto 4
System.out.println("convertir " + convertir(new ArrayList<Character>(Arrays.asList('1','0','1','1'))));
System.out.println();

//Punto 5
Node a = new Node(5);
a.next = new Node(10);
a.next.next = new Node(15);

Node b = new Node(2);
b.next = new Node(3);
b.next.next = new Node(20);

Node c = sortedMerge(a,b);

System.out.println(c.data + " " + c.next.data + " " + c.next.next.data + " " + c.next.next.next.data + " " +  c.next.next.next.next.data + " " + c.next.next.next.next.next.data);
System.out.println();
}

}
