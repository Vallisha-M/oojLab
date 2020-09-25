#include <stdio.h>

void input(float* a, float* b);

void input(float* a, float* b)
{
    printf("\nEnter first number : ");
    scanf("%f", a);
    printf("Enter second number : ");
    scanf("%f", b);
}

int main()
{
    float a, b, res = 0;
    int c = 0, x, y, r;

    while(c!=-1)
    {
        printf("Enter 1 for addition\n");
        printf("Enter 2 for subtraction\n");
        printf("Enter 3 for multiplication\n");
        printf("Enter 4 for division\n");

        printf("Enter 5 for check if greater than\n");
        printf("Enter 6 for check if lesser than\n");
        printf("Enter 7 for check if equal\n");
        printf("Enter 8 for greater than or equal\n");

        printf("Enter 9 for remainder\n");
        printf("Enter 10 for sum of squares\n");

        printf("Enter -1 to exit\n");

        printf("Enter your choice : ");
        scanf("%d", &c);
        if(c == -1)
            break;
        if(c != 9)
            input(&a, &b);
        switch(c)
        {
            case 1:
                res = a+b;
                printf("\n %f + %f = %f\n\n",a,b,res);
                break;
            case 2:
                res = a-b;
                printf("\n%f + %f = %f\n\n",a,b,res);
                break;
            case 3:
                res = a*b;
                printf("\n%f * %f = %f\n\n",a,b,res);
                break;
            case 4:
                res = a/b;
                printf("\n%f / %f = %f\n\n",a,b,res);
                break;
            case 5:
                if(a>b)
                    printf("\n%f > %f\n\n", a, b);
                else
                    printf("%f < %f\n\n", a, b);
                break;
            case 6:
                if(a<b)
                    printf("\n%f < %f\n\n", a, b);
                else
                    printf("%f > %f\n\n", a, b);
                break;
            case 7:
                if(a==b)
                    printf("\nThe entered numbers are equal\n\n");
                else
                    printf("The entered numbers are not equal");
                break;
            case 8:
                if(a>=b)
                    printf("\n%f is greater than or equal to %f\n\n", a, b);
                else
                    printf("%f is not greater than or equal to %f\n\n", a, b);
                break;
            case 9:
                printf("\nEnter first number : ");
                scanf("%d", &x);
                printf("Enter second number : ");
                scanf("%d", &y);
                r = x%y;
                printf("\n\n%d %% %d = %d\n\n",x,y,r);
                break;
            case 10:
                res = a*a+b*b;
                printf("\n%f^2 + %f^2 = %f\n\n",a,b,res);
                break;
            default:
                printf("\n\nInvalid Choice\n\n");
                break;
        }
    }
    return 0;
}
