#include<stdio.h>
int main()
{
  int a;
  scanf("%d",&a);
  int f=(a/10)%10;
  int s=a%10;
  int sum=f+s;
  printf("%d",sum);
  return 0;
}