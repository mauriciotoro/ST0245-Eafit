//para c++
 
#include <iostream>
#include <ctime>
 
using namespace std;
 
int main() {
 unsigned inicio,fin;
 double total;
 inicio = clock();
 //codigo a calcular
 fin = clock();
 total = (double(fin-inicio)/CLOCKS_PER_SEC);
 cout << total << endl;
}
