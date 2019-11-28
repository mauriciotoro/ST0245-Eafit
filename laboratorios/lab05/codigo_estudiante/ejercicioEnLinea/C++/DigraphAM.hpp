#include "Digraph.hpp"
#include <vector>
using namespace std;

class DigraphAM: public Digraph{
    public:
        int** matrix;
        int n;
    
        DigraphAM(int s){ 
            n = 0;
            size = s;
            matrix = new int*[size];

            for(int i = 0; i < size; i++){
                 matrix[i] = new int[size];
                for(int j = 0; j < size; j++) matrix[i][j] = 0;
            }

        }
        bool DFS(vector<int>*, int, int);
        bool DFS_helper(int);
        void BFS(int);
        int getWeigth(int, int);
        void addArc(int,int,int);
        vector<int> getSuccessors(int);
};
