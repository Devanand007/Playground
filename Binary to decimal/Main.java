#include<stdio.h>
#include<math.h>
int main()
{
 int n,sum=0,c=0,rem;
  scanf("%d",&n);
  while(n!=0)
  {
    rem=n%10;
    sum=sum+rem*pow(2,c);
    n=n/10  ;  
    c++;
  }
  printf("%d",sum);
  return 0;
}