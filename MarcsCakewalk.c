#include<stdio.h>
#include<math.h>

int main(){
    int n;
    unsigned long long int miles=0;
    int temp,i,j,k;
   // printf("enter n: ");
    scanf("%d",&n);
    int arr[n];
    //printf("enter array: ");
    for(int i=0;i<n;i++){
        scanf("%d",&arr[i]);
    }
    //sort
    for(i=0;i<n-1;i++){
      for(j=0;j<n-1;j++){
         k=j+1;
         if(arr[j]<arr[k]){
            temp = arr[j];
            arr[j] = arr[k];
            arr[k] = temp;
          }
       }
     }
 

    for(int i =0;i<n;i++){
        miles = miles + ((pow(2,i))*arr[i]);
    }
    printf("%llu\n",miles);
    
}
