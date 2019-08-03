#include<stdio.h>
int main()
{
 int a=0,b=1,sum=0,n,i;
  scanf("%d",&n);
  for(i=1;i<=n;i++)
  {
    if(i==1)
      printf("%d ",a);
      else if(i==2)
        printf("%d ",b);
        else
        {
          sum=a+b;
          a=b;
          b=sum;      
        printf("%d ",sum);
        }
          
  }
  
  return 0;
}