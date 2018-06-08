#include "laboratory2.h"
#include <vector>
#include <list>
#include <iostream>
#include <cstdlib>
using namespace std;

#define SP " "
#define ND endl

Laboratory2::Laboratory2(){
  //Initialize your code
}

int Laboratory2::multiply(vector<int> &v){
  //put your code here
}

int Laboratory2::multiply(list<int> &l){
  //put your code here
}

int main(int argc, char **args, char** nev){
  Laboratory2 *l2 = new Laboratory2();
  vector <int> v;
  for(int i = 0; i < 10; ++i){
    v.push_back(rand());
  }
  list<int> l;
  for(int i = 0; i < 10; ++i){
    l.push_front(rand());
    l.push_back(rand());
  }
  int res1 = l2->multiply(v);
  int res2 = l2->multiply(l);

  cout << res1 << SP << res2 << ND;
  return 0;
}