#include <stdio.h>
#include <string.h>
int main() {
  int n,i=0,sum=0;
  scanf("%d",&n);
  int temp;
	while (n != 0) 
    { 
      temp=sum;
     sum =n % 10; 
     n = n/10;
      i+=1;
    }  

  printf("%d",temp);
	return 0;
}