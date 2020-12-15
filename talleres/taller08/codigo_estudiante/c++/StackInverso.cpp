#include <bits/stdc++.h>

#define D(x) cout << #x << ": " << x << endl;
#define forn(i,n) for(int i=0; i< (int)n; i++)
#define for1(i,n) for(int i=1; i<= (int)n; i++)
#define all(v) v.begin(),v.end()

using namespace std;

typedef long long ll;

void print(stack<int> &s){
    if(s.empty()){
      cout << endl;
      return;
    }
    int x = s.top();
    s.pop();
    print(s);
    s.push(x);
    cout << x << " ";
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

    stack<int> s;
    stack<int> aux;
    s.push(3);
    s.push(2);
    s.push(1);
    
    print(s);
    while (!s.empty()){
      ...
    }
    s = aux;
    print(s);

    return 0;
}
