// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
// Main function
int main()
{
  // Enter your code here 
  int a,b,n,temp=0,i;
  scanf("%d%d",&a,&b);
  if(a>b)
    n=a;
  else
    n=b;
  for(i=1;i<=n;i++)
  {
    if(a%i==0&&b%i==0)
      temp=i;
  }
  printf("%d",temp);
  
   return 0;
}