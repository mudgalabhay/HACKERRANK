#include <stdio.h>
#include <string.h>

void counter(char *s);

int main() {
  int q, i;
  char s[1000002];
  //printf("enter queries:");
  scanf("%d", &q);
  for (i = 0; i < q; i++) {
    scanf("%s", s);
    counter(s);
  }
}

void counter(char *s) {
  int count = 0, i;
  for (i = 0; i < strlen(s); i++) {
    if (s[i] == s[i + 1]) {
      count++;
    }
  }
  printf("%d\n", count);
}
