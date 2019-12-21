#include <stdio.h>
#include <string.h>

int main() {
  int i, n, count = 0;
  //printf("enter n: ");
  scanf("%d", &n);
  char arr[102];
  //printf("enter string: ");
  scanf("%s", arr);
  for (i = 0; i < strlen(arr); i++) {
    if (arr[i] == '0' && arr[i + 1] == '1' && arr[i + 2] == '0') {
      count++;
      i += 2;
    }
  }
  printf("%d", count);
  return 0;
}
