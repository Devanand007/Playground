#include<stdio.h>

int main()
{
  float radius ,angle,arc;
  scanf("%f %f",&radius,&angle);
  arc=(angle/360)*2*3.14*radius;
  printf("%.2f",arc);
}
