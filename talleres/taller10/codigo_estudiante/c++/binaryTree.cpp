#include <iostream>
#include <string>

using namespace std;
class Node{
  public:
    Node* left;
    Node* rigth;
    string nombre;
    string telefono;
    Node(string nombre, string telefono){
      this->nombre = nombre;
      this->telefono = telefono;
      this->left = NULL;
      this->rigth = NULL;
    }
};

class BinaryTree{
  public:
    Node* root;
    BinaryTree(){
      this->root = NULL;
    }
    ~BinaryTree(){}
    void insertar(string s,string telefono){
      
    }
    void imprimir(){
      cout << "digraph G {" << endl;
      imprimirAux(root);
      cout << "}" << endl;
    }
    void imprimirAux(Node *root){
       
      
      }

    
    void buscar(string s){
     
      }
 
    
};

int main(){
  BinaryTree *tree = new BinaryTree();
  tree->insertar("d","1");
  tree->insertar("a","2");
  tree->insertar("e","3");
  tree->insertar("b","4");
  tree->imprimir();
  tree->buscar("d");
  tree->buscar("a");
  tree->buscar("e");
  tree->buscar("b");
  tree->buscar("c");
  return 0;
}
