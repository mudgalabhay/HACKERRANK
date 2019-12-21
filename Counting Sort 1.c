#include <stdio.h>


int main() {
  int i, n;
  int arr[1000000];
  int counter[100];
  scanf("%d", &n);
  for (i = 0; i < n; i++) {
    scanf("%d", &arr[i]);
    counter[arr[i]]++;
  }
  for(i =0;i<100;i++){
      printf("%d",counter[i]);
      printf(" ");
  }
  return 0;
}
