#pragma once
#include <iostream>
#include "Nodo.h"

using namespace std;

typedef Nodo *apNodo;

class Lista{
  public:
    Lista(){
      primero = NULL;
    }
    ~Lista();

    void insertarCola(int id, int x, int y, string nombre = "");
    void insertarCola(apNodo nodo);
    void insertar(int id, int x, int y, string nombre = "");
    void insertar(apNodo nodo);

  private:
    apNodo primero;
};
