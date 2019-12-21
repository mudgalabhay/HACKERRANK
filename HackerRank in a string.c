#include<stdio.h>
#include<string.h>

void finder(char *arr);

int main(){
    int q,i;
    char arr[100002];
    //printf("enter q");
    scanf("%d",&q);
    for(i=0;i<q;i++){
       //printf("enter string");
       scanf("%s",arr);
       finder(arr);
    }
    return 0;
}

void finder(char *arr){
    char s[13] = "hackerrank";
    int i,j=0;
    if(strlen(arr)<strlen(s)){
        printf("NO");
    }
    for(i=0;i<strlen(arr);i++){
         if(j<strlen(s) && arr[i] == s[j]){
             j++;
         }
    }
    if(j == strlen(s)){
       printf("YES\n");
    }
    else{
       printf("NO\n");
    }
}
