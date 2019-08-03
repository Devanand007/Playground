#include <stdio.h>
int main() {
	int number, sum = 0, rem = 0, cube = 0, temp,fact=1,i;
    scanf("%d", &number);
    temp = number;
    while (number != 0)
    {
        rem = number % 10;
        fact=1;
       for(i=1;i<=rem;i++)
       {
    fact=fact*i;
       }
    
      sum=sum+fact;    
        number = number / 10;
    }
  if(sum==temp)
    printf("Yes");
  else
    printf("No");
	return 0;
}