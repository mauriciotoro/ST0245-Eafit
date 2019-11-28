#include <iostream>
#include "DigraphAM.hpp"
#include <vector>
using namespace std;

void DigraphAM::addArc(int source, int destination, int weigth){    
    n++;
    matrix[source][destination] = weigth;
}


vector<int> DigraphAM::getSuccessors(int v){

    vector<int> s;
    
    for(int i = 0; i < size; i++) 
        if(matrix[v][i] != 0) s.push_back(i);

    return s; 
}


int DigraphAM::getWeigth(int source, int destination){

    return matrix[source][destination];

}


bool DigraphAM::DFS(vector<int> *v, int x, int color){
    ...
}

bool DigraphAM::DFS_helper(int x){
    vector<int> v(size, 0);
    

    return  DFS(&v, x, 1);

}


void DigraphAM::BFS(int x){

    ...

}


int main(){

    int x;


    while(true){

        cin >> x;
        if(x == 0) break;
        int y;
        DigraphAM d(x);
        cin >> y;


         y +=1;
        while(--y){
            int a;
            int b;
            cin >> a >> b;
            d.addArc(a,b,1);

        }


     if(d.DFS_helper(0)) cout << "BICOLORABLE" << endl;

    else cout << "NOT BICOLORABLE" << endl;

    }


}


