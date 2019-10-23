/**
 * @file lcs
 * @version 1.1
 * @date 18/08/2019
 * @author Miguel Ángel Correa Manrique
 * @title Largest Common Subsequence
 */


#include <bits/stdc++.h> 
#include <string>


using namespace std;


/**
 *@brief Indicates the largest common subsequence given two sequences.
 *@param[A] First given subsequence.
 *@param[B] Second given subsequence.
 *@param[i] Initializator, must start in 0.
 *@param[j] Initializator, must start in 0.
 *@return Returns the largest common subsequence of A and B (does not have to be contiguos).
 */
int lcs(string A, string  B, int i, int j){
	
 	...
}




int main(){
	
	string str1;
	string str2;

	cout << "Enter your first sequence: ";
	cin >> str1;

	cout << "Enter your second sequence: ";
	cin >> str2;
	
	str1 = str1 + ".";
	str2 = str2 + ".";

	int i = str1.length();
	int j = str2.length();
	
	cout << "Length str1 : " << i << endl;
	cout << "Length str2 : " << j << endl;
		
	
	cout << "Size of your Largest Common Sequence: " << lcs(str1, str2, 0, 0) << endl;


	return 0;
	

}









		




		





















	


















