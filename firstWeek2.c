#include <stdio.h>>

float sumaver(int a, int b);
void printeven(int a, int b);

void printeven(int a, int b)
{
    int i;
    printf("Even numbers from %d to %d\n",a,b);
    if(a%2!=0)   a++;
    for(i = a; i<=b;i+=2)
        printf("%d ", i);

}
float sumaver(int a, int b)
{
    return (float)(a+b)/2.0;
}

int main()
{
    int x, y, z, a, b;
    float avg;
    printf("Enter first number : ");
    scanf("%d", &x);
    printf("Enter second number : ");
    scanf("%d", &y);
    printf("Enter third number : ");
    scanf("%d", &z);

    if(x<y&&x<z)
    {
        a = y;
        b = z;
    }
    else if(y<x&&y<z)
    {
        a = x;
        b = z;
    }
    else if(z<y&&z<x)
    {
        a = x;
        b = y;
    }
    avg = sumaver(a, b);
    printf("Average of %d and %d is %f\n\n", a, b, avg);
        printeven(a,b);
    return 0;
}
