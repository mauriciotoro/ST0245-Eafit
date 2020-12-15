#pragma once
#include <iostream>

using namespace std;

class Nodo{
    private:
        Nodo *next;
        int id;
        int x;
        int y;
        string nombre;

        friend class Lista;
    public:
    Nodo (int id, int x, int y, string nombre = ""){
        this->id = id;
        this->x = x;
        this->y = y;
        this->nombre = nombre;
    }
};