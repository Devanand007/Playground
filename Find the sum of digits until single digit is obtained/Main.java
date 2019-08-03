#include<stdio.h>
int main()
  {
    int a,sum=0;
    scanf("%d",&a);
  int count=2;
  while(a>0||sum>9)
  {
    if(a == 0) 
        { 
            a= sum; 
            sum = 0; 
        } 
        sum += a % 10; 
        a /= 10; 
  }
  printf("%d",sum);
    
  }