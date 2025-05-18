#include <iostream>
using namespace std;
void bubble_sort(int a[], int n) {
 for(int i = 0; i < n - 1; i++) {
 int flag = 0;
 for(int j = 0; j < n - i - 1; j++) {
 if(a[j] > a[j + 1]) {
 swap(a[j], a[j + 1]);
 flag = 1;
 }
 }
 if(flag == 0) {
 break;
 }
 }
}
int main() {
 int n, i;
 cout << "Number of element: ";
 cin >> n;
 int a[n];
 cout << "Input Array: ";
 for(i = 0; i < n; i++) {
 cin >> a[i];
 }
 cout << "Before sorting: ";
 for(i = 0; i < n; i++) { 
 cout << a[i] << " ";
 }
 cout << endl;
 bubble_sort(a, n);
 cout << "After Sorting: ";
 for(i = 0; i < n; i++) {
 cout << a[i] << " ";
 }
 cout << endl;
 return 0;
}