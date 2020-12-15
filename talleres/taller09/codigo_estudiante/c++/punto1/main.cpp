#include "TablaHash.h"

#include <iostream>

using namespace std;

int main(){
  TablaHash *tabla = new TablaHash();
  tabla->put("kevin",1);
  tabla->put("kely",2);
  tabla->put("pepe",3);
  int num1 = tabla->get("kevin");
  int num2 = tabla->get("kely");
  int num3 = tabla->get("pepe");
  cout << num1 << endl;
  cout << num2 << endl;
  cout << num3 << endl;

  return 0;
}
