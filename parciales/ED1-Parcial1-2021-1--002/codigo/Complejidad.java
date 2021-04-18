class Complejidad
{
public static void doSomething(int n){
  int sum = 0;
  for(int i = 1; i <= n; ++i){
    for(int j = i + 1; j <= n; j = j * 2){
      sum ++;
    }
  }
}

public static void main(String[] args){
	doSomething(10);
}

}
