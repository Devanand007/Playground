#include<stdio.h>
int main()
{
  	int n,i,temp=0;
  scanf("%d",&n);
  int a[n];
  for(i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }
  temp=a[0];
   for(i=1;i<n;i++)
  {
    if(a[i]>temp)
      temp=a[i];
  }
   printf("%d",temp);
}