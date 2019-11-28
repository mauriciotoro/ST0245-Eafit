#include<bits/stdc++.h>

using namespace std;


typedef long long ll;
typedef pair<int, int> ii;
typedef vector<int> vi;
typedef vector<ii> vii;

template <class T> string toStr(const T &x){stringstream s;s<<x;return s.str();}

template <class T> int toInt(const T &x){stringstream s;s<<x;int r;s>>r;return r;}


struct Node{

	int data;
	Node *right;
	Node *left;

};


class BinaryTree{
	public:
		Node *root;
	
		BinaryTree(){

			root = NULL;

		}

	void add(int x){
		...	
    }

};



void postorder(Node *n){

	...
}

void preorder(Node *n){

	...


}


int main(){


	BinaryTree t;

	int x;

	while(cin >> x) t.add(x);		

	postorder(t.root);

}


