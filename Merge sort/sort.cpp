#include <iostream>
using namespace std; 
void merge(int a[], int l, int r)
{
 int mid = (l + r) / 2;
 int n = mid - l + 1;
 int m = r - mid;
 int A[n], B[m];
 int i = 0, j = l, k = 0;
 for (int i = 0; i < n; i++, j++)
 {
 A[i] = a[j];
 }
 j = mid + 1;
 for (int i = 0; i < m; i++, j++)
 {
 B[i] = a[j];
 }
 i = 0;
 j = 0;
 k = l;
 while (i < n && j < m)
 {
 if (A[i] < B[j])
 {
 a[k] = A[i];
 i++;
 }
 else
 {
 a[k] = B[j];
 j++;
 }
 k++;
 }
 while (i < n)
 {
 a[k] = A[i]; 
 i++;
 k++;
 }
 while (j < m)
 {
 a[k] = B[j];
 j++;
 k++;
 }
}
void mergeSort(int a[], int l, int r)
{
 if (l >= r)
 return;
 int mid = (l + r) / 2;
 mergeSort(a, l, mid);
 mergeSort(a, mid + 1, r);
 merge(a, l, r);
}
int main()
{
 int n;
 cout << "Number of element: ";
 cin >> n;
 int a[n];
 cout << "Input Array: ";
 for (int i = 0; i < n; i++)
 {
 cin >> a[i];
 }
 cout << "Before sorting: ";
 for (int i = 0; i < n; i++)
 {
 cout << a[i] << " "; 
 }
 cout << endl;
 mergeSort(a, 0, n - 1);
 cout << "After Sorting: ";
 for (int i = 0; i < n; i++)
 {
 cout << a[i] << " ";
 }
 cout << endl;
 return 0;
} 