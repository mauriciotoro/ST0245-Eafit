#pragma once

#include <list>
#include <utility>
#include <iostream>

using namespace std;

class TablaHash {
  private:
    list<pair<string,int>> tabla[10];
  public:
    TablaHash(){}
    ~TablaHash(){}
    int funcionHash(string k);
    int get(string k);
    void put(string k, int v);
};
