#include<stdio.h>
int main()
{
  //Type your code here
  int n,i,flag=0;
  scanf("%d",&n);
  int a[n];
  for(i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }
  int k;
  scanf("%d",&k);
  for(i=0;i<n;i++)
  {
    if(k==a[i])
    {
      flag=1;
      printf("%d",i+1);
      break;
    }
  }
  if(flag==0)
    printf("%d isn't present in the array.",k);

  
  return 0;
}