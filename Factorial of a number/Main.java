#include <stdio.h>
int main() {
	int a,fact=1,i;
  scanf("%d",&a);
  for(i=1;i<=a;i++)
    fact=fact*i;
  printf("%d",fact);
	return 0;
}