#include <stdio.h>

void printArray(int *, int);
void quicksort(int *, int, int);
int partition(int *, int, int);
void swap(int *, int *);

int main(void) {
  int n, i;
  int arr[100];
  int left, right;
  scanf("%d", &n);
  for (i = 0; i < n; i++) {
    scanf("%d", &arr[i]);
  }
  left = 0;
  right = n - 1;
  quicksort(arr, left, right);
  printArray(arr, n);
  return 0;
}
void quicksort(int *arr, int left, int right) {
  int p;
  if (left < right) {
    p = partition(arr, left, right);
    quicksort(arr, left, p - 1);
    quicksort(arr, p + 1, right);
  }
}

int partition(int *arr, int left, int right) {
  int pivot = arr[right];
  int i = left - 1;
  int j;
  for (j = left; j < right; j++) {
    if (arr[j] <= pivot) {
      i++;
      swap(&arr[i], &arr[j]);
    }
  }
  swap(&arr[i + 1], &arr[right]);
  return (i + 1);
}

void printArray(int *arr, int n) {
  int i;
  for (i = 0; i < n; i++) {
    printf("%d", arr[i]);
    printf(" ");
  }
}
void swap(int *p, int *q) {
  int temp;
  temp = *p;
  *p = *q;
  *q = temp;
}
