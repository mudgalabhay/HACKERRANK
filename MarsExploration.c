#include <stdio.h>
#include <string.h>

void marsExp(char *s);

int main() {
  char s[101];
  //printf("enter string:");
  scanf("%s", &s);
  marsExp(s);
  return 0;
}

void marsExp(char *s) {
  int i, count = 0;
  int n = strlen(s);
  for (i = 0; i < n; i += 3) {
    if (s[i] != 'S') {
      count++;
    }
    if (s[i + 1] != 'O') {
      count++;
    }
    if (s[i + 2] != 'S') {
      count++;
    }
  }
  printf("%d", count);
}