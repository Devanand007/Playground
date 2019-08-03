#include<stdio.h>
int main()
{
  	int n,i,f1=-1,f2=-1;
  scanf("%d",&n);
  int a[n];
  for(i=0;i<n;i++)
    scanf("%d",&a[i]);
  int k1,k2;
  scanf("%d%d",&k1,&k2);
    for(i=0;i<n;i++)
    {
      if(a[i]==k1&&f1==-1)
      {
        f1=i;
      }
       if(a[i]==k2&&f2==-1)
      {
        f2=i;
      }
    }
    printf("Element 1 index = %d\n",f1);
    printf("Element 2 index = %d",f2);
  
}