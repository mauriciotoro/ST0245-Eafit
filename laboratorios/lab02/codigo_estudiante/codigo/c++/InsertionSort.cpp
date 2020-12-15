#include <bits/stdc++.h>

#define D(x) cout << #x << ": " << x << endl;
#define len(x) sizeof(x)/sizeof(x[0])
#define forn(i,n) for(int i=0; i< (int)n; i++)
#define for1(i,n) for(int i=1; i<= (int)n; i++)
#define all(v) v.begin(),v.end()

using namespace std;

typedef long long ll;


void Sort(int arr[], int n){  
    int i, aux, j;  
    for (i = 1; i < n; i++) {  
        aux = arr[i];  
        j = i - 1;  

        while (j >= 0 && arr[j] > aux) {  
            arr[j + 1] = arr[j];  
            j = j - 1;  
        }  
        arr[j + 1] = aux;  
    }  
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
    
    int start,end,n = 30000;
    forn(j,20){
        
        forn(i,n){
           
        }
        
    }
    return 0;
}