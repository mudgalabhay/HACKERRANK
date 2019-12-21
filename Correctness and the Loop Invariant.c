#include <stdio.h>

void insertion(int *, int); // function definition
int main() {
  int n, i;
  int arr[1502];
  scanf("%d", &n);
  for (i = 0; i < n; i++) {
    scanf("%d", &arr[i]);
  }
  insertion(arr, n);
  return 0;
}
void insertion(int *arr, int n) {
  int i, j, temp;
  for (i = 1; i < n; i++) {
    for (j = i; j > 0; j--) {
      if (arr[j - 1] > arr[j]) {
        temp = arr[j - 1];
        arr[j - 1] = arr[j];
        arr[j] = temp;
      }
    }
  }
  for (i = 0; i < n; i++) {
    printf("%d", arr[i]);
    printf(" ");
  }
}
