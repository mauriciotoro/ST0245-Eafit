#include <iostream>
#include <vector>

using namespace std;

int ArraySum(vector<int> A){
  int sum = 0;
  for(int i = 0; i < A.size(); ++i){
    sum += A[i];
  }
  return sum;
}

int ArrayMax(vector<int> A){
  int max = A[0];
  for(int i = 0; i < A.size(); ++i){
    if(A[i] > max){
      max = A[i];
    }
  }

  return max;
}

void InsertionSort(vector<int> A){
  int temp, j;
  for(int i = 0; i < A.size(); ++i){
    j = i;
    while (j > 0 && A[j-1] > A[j]) {
      temp = A[j];
      A[j] = A[j-1];
      A[j-1] = temp;
      j -= 1;
    }
  }

  for(int i=0; i<A.size(); ++i){
    cout << A[i] << ", ";
  }
  cout << endl;
}

void merge(vector<int> *a, vector<int> *tmp, int left, int right, int rightEnd){
  int leftEnd = right - 1;
  int k = left;
  int num = rightEnd - left + 1;

  while(left <= leftEnd && right <= rightEnd){
    if((*a)[left] <= (*a)[right])
      (*tmp)[k++] = (*a)[left++];
    else
      (*tmp)[k++] = (*a)[right++];
  }
  while(left <= leftEnd)
    (*tmp)[k++] = (*a)[left++];
  while(right <= rightEnd)
    (*tmp)[k++] = (*a)[right++];

  for(int i = 0; i < num; ++i, --rightEnd)
    (*a)[rightEnd] = (*tmp)[rightEnd];
}

void MergeSort(vector<int> *a, vector<int> *tmp, int left, int right){
  if(left < right){
    int center = (left + right) / 2;
    MergeSort(a, tmp, left, center);
    MergeSort(a, tmp, center+1, right);
    merge(a, tmp, left, center+1, right);
  }
}

void mergeSort(vector<int> *a){
  vector<int> tmp(a->size());
  MergeSort(a, &tmp, 0, a->size() - 1);
}

int main(){
  vector<int> arregloPrueba(5);
  arregloPrueba[0] = 4;
  arregloPrueba[1] = 2;
  arregloPrueba[2] = 5;
  arregloPrueba[3] = 1;
  arregloPrueba[4] = 3;

  cout << ArraySum(arregloPrueba) << endl;
  cout << ArrayMax(arregloPrueba) << endl;

  InsertionSort(arregloPrueba);
  mergeSort(&arregloPrueba);

  for(int i = 0; i < arregloPrueba.size(); ++i){
    cout << arregloPrueba[i] << ", ";
  }
  cout << endl;

  return 0;
}
