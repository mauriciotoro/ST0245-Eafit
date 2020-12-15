#include <bits/stdc++.h>

#define D(x) cout << #x << ": " << x << endl;
#define len(x) sizeof(x)/sizeof(x[0])
#define forn(i,n) for(int i=0; i< (int)n; i++)
#define for1(i,n) for(int i=1; i<= (int)n; i++)
#define all(v) v.begin(),v.end()

using namespace std;

typedef long long ll;

void merge(int nums[], int l, int m, int r) { 
    int i, j, k;
    int n1 = m - l + 1;
    int n2 = r - m;

    int L[n1], R[n2]; 

    forn(i,n1){
        L[i] = nums[l + i];
    }
    forn(j,n2){
        R[j] = nums[m + 1 + j];
    }

    i = 0;
    j = 0;
    k = l;
    while (i < n1 && j < n2) { 
        if (L[i] <= R[j]) { 
            nums[k] = L[i]; 
            i++; 
        } 
        else { 
            nums[k] = R[j]; 
            j++; 
        } 
        k++; 
    } 

    while (i < n1) { 
        nums[k] = L[i]; 
        i++; 
        k++; 
    } 

    while (j < n2) { 
        nums[k] = R[j]; 
        j++; 
        k++; 
    } 
}

void mergeSort(int nums[], int l, int r) { 
    if (l < r) {
        int m = l + (r - l) / 2; 
        mergeSort(nums, l, m);
        mergeSort(nums, m + 1, r);  
        merge(nums, l, m, r);
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
    
   
    return 0; 
}