#include <iostream>
#include <list>
#include <stack>
#include <vector>


using namespace std;

void returnAbove(stack<int> *v, int x, int *pos){
	
	...

}

int main(){

	int n;
	int a;
	int b;
	string command;
	string option;
	cin >> n;
	int pos[n];
	stack<int> v [n];

		for(int i = 0; i < n; i++){
			stack<int> s;
			s.push(i);
			v[i] = s;
			pos[i] = i;
		}


	while(cin >> command){

		int temp;

		if(command == "quit") break;

		cin >> a >> option >> b;

		if(a==b || pos[a] == pos[b]){

		} else if (command == "move" && option == "onto"){
		...


}
