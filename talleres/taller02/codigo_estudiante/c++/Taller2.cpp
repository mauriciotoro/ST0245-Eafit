#include <iostream>
#include <vector>

using namespace std;

int gcd(int p,int q){
    
}
bool SumaGrupo(int start, vector<int> nums, int target){
    
}

void combinationsAux(string prefix, string s){
  
}

static void combinations (string s){
    combinationsAux("", s);
    cout << "\n";
}

bool SumaGrupo(vector<int> nums, int target){
    return SumaGrupo(0, nums, target);
}

int subSequence(int i, int len, string s1, string s2){
   
}

void sub(string s1, string s2){
    int max_len = 0;
    for (int i  = 0; i < s1.length(); i++){
        int max = subSequence(i, 0, s1, s2);
        if (max > max_len){
            max_len = max;
        }
    }
    cout << "Mayor largo del subString: " << max_len << "\n";
}


int main(){
    //Ejercicio 1
    int a1, b1, c1, d1;
    a1 = gcd(12,36);
    b1 = gcd(8, 12);
    c1 = gcd(72, 108);
    d1 = gcd(162, 270);
    if(a1==12 && b1==4 && c1==36 && d1==54){
        cout << "Ejercicio 1 Correcto\n";
    }else {
        cout << "Ejercicio 1 Incorrecto\n";
    }

    //Ejercicio 2
    bool a2, b2, c2, d2;
    a2 = SumaGrupo({2,4, 8}, 9);
    b2 = SumaGrupo({2, 4, 8}, 8);
	c2 = SumaGrupo({10, 2, 2, 5}, 9);
    d2 = SumaGrupo({10, 2, 2, 5}, 17);
    if(!a2 && b2 && c2 && d2){
        cout << "Ejercicio 2 Correcto\n";
    }else {
        cout << "Ejercicio 2 Incorrecto\n";
    }

    //Ejercicio 3
    cout << "Ejercicio 3\n\n";
    cout << "Para la cadena 'abc' el resultado debe ser similar a:\n";
    cout << "a, ab, abc, ac, b, bc, c\n";
    combinations("abc");

    cout << "\nPara la cadena 'Eafit' el resultado debe ser similar a:\n";
    cout << "E, Ea, Eaf, Eafi, Eafit, Eaft, Eai, Eait, Eat, Ef, Efi, Efit, Eft, Ei, Eit, Et, a, af, afi, afit, aft, ai, ait, at, f, fi, fit, ft, i, it, t\n";
    combinations("Eafit");

    cout << "\nPara la cadena 'Hola' el resultado debe ser similar a:\n";
    cout << "H, Ho, Hol, Hola, Hoa, Hl, Hla, Ha, o, ol, ola, oa, l, la, a\n";
    combinations("Hola");

    cout << "\nPara la cadena 'Hi' el resultado debe ser similar a:\n";
    cout << "H, i, Hi\n";
    combinations("Hi");

    //Ejercicio 4;
    cout << "\nEjercicio 4\n";
    sub("ABCDGH", "AEDGHR");
    return 0;
}