// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
// Main function
int main()
{
  int a,f=0,i;
  scanf("%d",&a);
  if(a==1||a==0)
    printf("neither");
  for(i=2;i<a;i++)
  {
    if(a%i==0)
    {
      f=1;
      break;
    }
  }
  if(f==0&&a!=0) 
    printf("prime");
  if(f==1)
    printf("composite");
   return 0;
}