#include <iostream>
#include <map>

using namespace std;

void agregar(map<string,string> *empresas,string key, string value){
 
}

bool buscar(map<string,string> *empresas,string key){
  
}

bool contieneValue(map<string,string> *empresas, string value){
  
}

int main(){
  //pedrito 1
  map<string,string> empresas;
  agregar(&empresas,"Google","Estados Unidos");
  agregar(&empresas,"La locura","Colombia");
  agregar(&empresas,"Nokia","Finlandia");
  agregar(&empresas,"Sony","Japon");

  //pedrito 2
  cout << "Existe Google: " << buscar(&empresas,"Google") << endl;
  cout << "Existe Apple: " << buscar(&empresas,"Apple") << endl;
  
  //pedrito 3
  cout << "Hay empresa en india: " << contieneValue(&empresas,"india") << endl;
  cout << "Hay empresa en Colombia: " << contieneValue(&empresas, "Colombia") << endl;
  return 0;
}
