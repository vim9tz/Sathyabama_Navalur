#include <stdio.h>

int main()
{
    int mark;

    printf("Enter mark (0-100): ");
    scanf("%d", &mark);

    if (mark < 0 || mark > 100)
    {
        printf("Invalid Mark\n");
    }
    else if (mark >= 90)
    {
        printf("Grade A\n");
    }
    else if (mark >= 75)
    {
        printf("Grade B\n");
    }
    else if (mark >= 60)
    {
        printf("Grade C\n");
    }
    else if (mark >= 50)
    {
        printf("Grade D\n");
    }
    else
    {
        printf("Grade F\n");
    }
    return 0;
}