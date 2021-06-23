
class Trees{

 static double promMax = 0.0;

 static double solve(Node root) {
   solveTemp(root);
   return promMax;
 }

 static Pair solveTemp(Node root) {
   if (root == null)
     return new Pair(0, 0);
   Pair l = solveTemp(root.left);
   Pair r = solveTemp(root.right);
   int sum = l.sum + r.sum + root.val; //......................;
   int sz = 1 + l.size + r.size;
   double comp = sum * 1.0 / sz;//.......................;
   promMax = Math.max(promMax, comp);
   return new Pair(sum, sz);
  }
 public static void main(String[] args){
       //////\node[vertex] (G) at (0,0)  {1};
    //\node[vertex] (I) at (3,-1)  {7};
    //\node[vertex] (H) at (2,-2)  {4};
    //\node[vertex] (J) at (4,-2)  {5};
    //\node[vertex] (D) at (-1, -1) {3};
    //\node[vertex] (E) at (0, -2) {2};
    //\node[vertex] (F) at (1, -3) {6};
    //\node[vertex] (B) at (-2, -2) {8};
    //\node[vertex] (C) at (-1, -3) {9};
    //\node[vertex] (A) at (-3, -3) {1}; 
    Node G = new Node(1);
    Node I = new Node(7);
    Node H = new Node(4);
    Node J = new Node(5);
    Node D = new Node(3);
    Node E = new Node(2);
    Node F = new Node(6);
    Node B = new Node(8);
    Node C = new Node(9);
    Node A = new Node(1);
    //%edges
    //\draw[edge] (G) to (D);
    //\draw[edge] (D) to (B);
    //\draw[edge] (D) to (E);
    //\draw[edge] (E) to (F);
    //\draw[edge] (B) to (A);
    //\draw[edge] (B) to (C);
    //\draw[edge] (G) to (I);
    //\draw[edge] (I) to (H);
    //\draw[edge] (I) to (J);
    G.left = D;
    G.right = I;
    D.left = B;
    D.right = E;
    E.right = F;
    B.left = A;
    B.right = C;
    I.left = H;
    I.right = J;
    System.out.println(solve(G));
 } 
}
