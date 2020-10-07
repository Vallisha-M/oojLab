#include <stdio.h>
#define MAX 100
int main()
{
    int n=0, i=0, c=0, c1=0, c2=0, c3=0;
    int f1=1,f2=1,f3=1;
    char iot[MAX][20], j2ee[MAX][20], aj[MAX][20];
    printf("Enter number of students (Less than 101) : ");
    scanf("%d", &n);
    for(i = 0;i < n ; i++)
    {
        if(f1)
            printf("Enter 1 for IOT\n");
        if(f2)
            printf("Enter 2 for Advanced Java\n");
        if(f3)
            printf("Enter 3 for J2EE\n");
        printf("Enter -1 to exit\n");
        printf("Enter your choice : ");
        scanf("%d", &c);
        if(c==-1)
            break;
        switch(c)
        {
            case 1:
                printf("Enter your name : ");
                gets(iot[c1++]);
                break;
            case 2:
                printf("Enter your name : ");
                gets(aj[c2++]);
                break;
            case 3:
                printf("Enter your name : ");
                gets(j2ee[c3++]);
                break;
            default:
                printf("\n\nInvalid input\n\n");
                break;
        }
        if(i==n)
        {
            i=-1;
            n=0;
            if(c1<30)
            {
                f1=0;
                n = n+c1;
                c1=0;
            }
            if(c2<30)
            {
                f2=0;
                n = n+c2;
                c2=0;
            }
            if(c3<30)
            {
                f3=0;
                n = n+c3;
                c3=0;
            }
        }
    }
    printf("Number of students in each course;\n");
    printf("IOT = %d\n", c1);
    printf("Advanced Java = %d\n", c2);
    printf("J2EE = %d\n", c3);



        printf("Students enrolled in courses;\n\n");
        if(f1){
        printf("From IOT;\n\n");
        for(i=0;i<c1;i++)
        {
                puts(iot[i]);
                printf("\n");
        }}
        if(f2){
        printf("From Advanced Java;\n\n");
        for(i=0;i<c2;i++)
        {
                puts(aj[i]);
                printf("\n");
        }}
        if(f3){
        printf("From J2EE;\n\n");
        for(i=0;i<c3;i++)
        {
            puts(j2ee[i]);
            printf("\n");
        }}


return 0;
}
