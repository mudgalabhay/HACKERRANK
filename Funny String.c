#include<stdio.h>
#include<string.h>

int main() {
int T;
char in[10000];
int output[10];
scanf("%d",&T);
for(int j=0;j<T;j++)
{
    scanf("%s",in);
    int len=strlen(in)-1;
    int x=1;
    for(int i=0;i<len;i++)
    {
        if(abs(in[i]-in[i+1]) != abs(in[len-i]-in[len-1-i]))
        {
            x=0;
            printf("Not Funny\n");
            break;
        }
    }
    if(x==1) 
        printf("Funny\n") ;
}
return 0;
}
