#include <bits/stdc++.h>

using namespace std;

    int subSequence(int i, int len, string s1, string s2){
        
    }

    void sub(string s1, string s2){
        
    }

int main(){
    #ifdef LOCAL
        freopen("input", "r", stdin);
    #else
        #define endl '\n'
    #endif
    ios::sync_with_stdio(0);
    cin.tie(0);

    string s1,s2;
    for (int i = 0;i < 20 ;i++){
        cin >> s1; 
        cin >> s2;
        int end,start;
        cout << s1.length() << endl;
        cout << s2.length() << endl;
        start = time(0);
        sub(s1,s2);
        end = time(0);
        cout << end-start << endl;
    }
    return 0;
}