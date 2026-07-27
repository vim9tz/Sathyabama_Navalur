#include <stdio.h>

int main()
{
    int num1, num2, num3;

    printf("Enter three numbers: ");
    scanf("%d %d %d", &num1, &num2, &num3);

    if (num1 >= num2)
    {
        // Nested inside the first block
        if (num1 >= num3)
        {
            printf("Maximum number is %d\n", num1);
        }
        else
        {
            printf("Maximum number is %d\n", num3);
        }
    }
    else
    {
        // Nested inside the else block
        if (num2 >= num3)
        {
            printf("Maximum number is %d\n", num2);
        }
        else
        {
            printf("Maximum number is %d\n", num3);
        }
    }
    return 0;
}
