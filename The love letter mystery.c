#include <stdio.h>
#include <stdlib.h>
#include <string.h>

void solver(char *arr);

int main() {
  int i, q;
  //printf("enter q: ");
  scanf("%d", &q);
  char arr[100002];
  for (i = 0; i < q; i++) {
    scanf("%s", arr);
    solver(arr);
  }
  return 0;
}
void solver(char *arr) {
  int count = 0;
  int i = 0, j = strlen(arr) - 1;
  while (i < j) {
    count += abs(arr[i] - arr[j]);
    i++;
    j--;
  }
  printf("%d\n", count);
}