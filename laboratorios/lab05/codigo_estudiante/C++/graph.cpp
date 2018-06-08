#include <cstdio>
#include <vector>
#include <set>
#include <cstring>
using namespace std;

const int N = 100;
const int inf = 100000000;

vector<vector<pair<int, int> > > adjList;
bool was[N];
int d[N];

void addSimpleEdge(int a, int b){

}
void addWeightedEdge(int a, int b, int w){

}
int getSize(){

}

void dfs(int v){
  was[v] = false;
  printf("Los vertices encontrados al hacer DFS de %d son: ", v);
  for(size_t i = 0; i < adjList[v].size(); ++i){
    int to = adjList[v][i].first;
    if(!was[to]){
      printf(" ,%d", to);
      dfs(to);
    }
  }
}

void dijkstra(int source){
  memset(d, inf, sizeof d);
  d[source] = 0;
  int u;
  set<pair<int, int> > s;
  s.insert(make_pair(d[source], source));
  while(!s.empty()){
    u = s.begin()->second;
    s.erase(s.begin());
    for(auto p: adjList[u]){
      if(d[p.first] > d[u] + p.second){
        s.erase(make_pair(d[p.first], p.first));
        d[p.first] = d[u] + p.second;
        s.insert(make_pair(d[p.first], p.first));
      }
    }    
  }
}

int main(int argc, char **args){
  int vertices, edges;
  scanf("%d %d", &vertices, &edges);
  adjList.resize(vertices);
  for(int i = 0; i < edges; ++i){
    int a, b, w;
    scanf("%d %d %d", &a, &b, &w);
    addWeightedEdge(a, b, w);
  }
  dijkstra(1);
}
