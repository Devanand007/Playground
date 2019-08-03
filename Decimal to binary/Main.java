#include<stdio.h>
int main()
{
  int n,a[100],i;
  scanf("%d",&n);
  for(i=0;n>0;i++)
  {
    a[i]=n%2;
    n=n/2;
  }
  n=i-1;
  for(i=n;i>=0;i--)
  {
    printf("%d",a[i]);
  }

    return 0;

}