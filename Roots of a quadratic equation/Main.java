
#include <stdio.h>
#include <math.h>
int main()
{
    float a, b, c, discriminant, root1, root2, real, imag;
    scanf("%f %f %f",&a, &b, &c);
    discriminant = b*b-4*a*c;
    if (discriminant > 0)
    {
        root1 = (-b+sqrt(discriminant))/(2*a);
        root2 = (-b-sqrt(discriminant))/(2*a);
        printf("root1 = %.2f  root2 = %.2f",root1 , root2);
    }
    else if (discriminant == 0)
    {
        root1 = root2 = -b/(2*a);
         printf("root1 = %.2f  root2 = %.2f",root1 , root2);
    }
    else
    {
        real = -b/(2*a);
        imag = sqrt(-discriminant)/(2*a);
        printf("root1 = %0.2f + %0.2fi  root2 = %0.2f - %0.2fi",real,imag,real,imag);
    }
    return 0;
}   
  