#include <bits/stdc++.h>

#define D(x) cout << #x << ": " << x << endl;
#define forn(i,n) for(int i=0; i< (int)n; i++)
#define for1(i,n) for(int i=1; i<= (int)n; i++)
#define all(v) v.begin(),v.end()

using namespace std;

typedef long long ll;

void bfs(int x, int y, vector<vector<int>> &g, vector<bool> &visited){
  
}

int main(){
    ios::sync_with_stdio(0);
    cin.tie(NULL); cout.tie(NULL);
    cout<< setprecision(20)<< fixed;
    #ifdef LOCAL
        freopen("input.txt", "r", stdin);
    #else
        #define endl '\n'
    #endif

    int v,e,x,y;
    cout << "Numero de vertices y aristas?" << endl;
    cin >> v >> e;
    vector<vector<int>> g(v);
    vector<bool> visited(v);
    forn(i,e){
        cout << "Ingrese arista" << endl;
        cin >> x >> y;
        g[x].push_back(y);
    }
    cout << "Que camino desea comprobar?: " << endl;
    cin >> x >> y;
    bfs(x,y,g,visited);
    if (visited[y]){
        cout << "De " << x << " a " << y << " si hay camino" << endl;
    }else{
        cout << "De " << x << " a " << y << " no hay camino" << endl;
    }
    return 0;
}