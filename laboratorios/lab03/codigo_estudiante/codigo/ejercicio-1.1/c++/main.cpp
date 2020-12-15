#include <iostream>
#include <sstream>
#include <fstream>
#include <string>
#include "Lista.h"
#include "Nodo.h"

using namespace std;

int main(){
    Lista *arcos = new Lista();
    Lista *vertices = new Lista();

    ifstream arco;
    arco.open("Arcos.csv",ios::in);
    int id,x,y,line=0;
    string nombre;
    for (string linea; getline(arco, linea); ) {
        if (line == 0){
            line ++;
            continue;
        }
        stringstream s(linea);
        string dato;
        for (int i = 0; getline(s, dato, ','); i++){
            if (i == 0){
                id = stoi(dato);
            }else if (i == 1) {
                x = stoi(dato);
            }else if (i == 2) {
                y = stoi(dato);
            }else {
                nombre = dato;
            }
        }
        cout << id << " " << x << " " << y << " " << nombre << endl;
        arcos->insertar(id,x,y,nombre);
    }

    cout << endl;

    ifstream vertice;
    vertice.open("Vertices.csv",ios::in);
    line=0;
    for (string linea; getline(vertice, linea); ) {
        if (line == 0){
            line ++;
            continue;
        }
        stringstream s(linea);
        string dato;
        for (int i = 0; getline(s, dato, ','); i++){
            if (i == 0){
                id = stoi(dato);
            }else if (i == 1) {
                x = stoi(dato);
            }else if (i == 2) {
                y = stoi(dato);
            }else {
                nombre = dato;
            }
        }
        cout << id << " " << x << " " << y << " " << nombre << endl;
        vertices->insertar(id,x,y,nombre);
    }
    return 0;
}