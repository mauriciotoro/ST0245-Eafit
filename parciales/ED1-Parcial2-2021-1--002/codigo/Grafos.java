class Grafos {
  public static int colorear(boolean[][] grafo) {
    int n = grafo.length;
    int[] color = new int[n + 1];
    for(int i = 0; i < n; ++i) 
      color[i] = -1;
    color[0] = 0;
    boolean[] colordisponible = new boolean[n + 1];
    for(int i = 0; i < n; ++i) 
      colordisponible[i] = true;
    for(int u = 1; u < n; ++u) {
      for(int i = 0; i < n; ++i)
        if(grafo[u][i])
          if(color[i] != -1)
            colordisponible[color[i]] = false;
      int aval;
      for(aval = 0; aval < n; ++aval)
       if(colordisponible[aval])
         break;
      color[u] = aval; 
    }
    for(int i = 0; i < n; ++i) 
      colordisponible[i] = true;
    boolean[] usado = new boolean[n + 1];
    int res = 0;
    for(int i = 0; i < n; ++i) 
      if(!usado[color[i]]){
        usado[color[i]] = true; 
        res++;
      }
    return res+1;
  }

  public static void main(String[] args){
   boolean[][] g = { {false, true, false}, {false, false, true}, {true, false, false}};
    System.out.println(colorear(g));
  }
}
