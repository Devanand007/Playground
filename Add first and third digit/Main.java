#include<stdio.h>
int main()
{
  int a;
  scanf("%d",&a);
  int t=a%10;
  int f=(a/100)%10;
  int s=f+t;
  printf("%d",s);
  return 0;
}