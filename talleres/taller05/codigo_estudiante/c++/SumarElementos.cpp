#include <bits/stdc++.h>

#define D(x) cout << #x << ": " << x << endl;
#define len(x) sizeof(x)/sizeof(x[0])
#define forn(i,n) for(long long i=0; i< (long long)n; i++)
#define for1(i,n) for(int i=1; i<= (int)n; i++)
#define all(v) v.begin(),v.end()

using namespace std;

typedef long long ll;

int main(){
    ios::sync_with_stdio(0);
    cin.tie(NULL); cout.tie(NULL);
    cout<< setprecision(20)<< fixed;
    #ifdef LOCAL
        freopen("input.txt", "r", stdin);
    #else
        #define endl '\n'
    #endif
    
    ll start,end,sum,n = 100000000;
    forn(j,20){
        sum = 0;
        vector<ll> arr(n,n);
        start = time(0);
        //Sumar elementos con un ciclo es O(n)
        forn(i,n){
          ...
        }
        end = time(0);
        cout << "Con ciclo " <<n << " -> "  << end-start << endl;
        n += 1000000;
    }

    return 0;
}