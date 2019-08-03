#include <stdio.h>
int main() {
	int n ,sum;
  scanf("%d",&n);
  int last=n%10;
 while (n != 0) 
    { 
     sum = n % 10; 
     n = n/10; 
    }  
  sum=last+sum;
  printf("%d",sum);
	return 0;
}