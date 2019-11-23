#include<stdio.h> 
#include<math.h>


int main(){
    long int p,q,s;
    long int i;
    int flag =0;
    //printf("enter value of p and q: ");
    scanf("%ld",&p);
    scanf("%ld",&q);
    for(i=p;i<=q;i++){
        long int sum;
        long int count =0;
        long int k = i;
        while(k>0){
            k = k/10;
            count++;
        }
        long int sq = i * i;
        long int g = pow(10,count);
        sum = sq%g +sq/g;
        if(i == sum){
            printf("%d\t",i);
            flag++;
        }
    }
    if(flag == 0){
        printf("INVALID RANGE");
    }
    return 0;
}
