#include <stdio.h>

int main()
{
    int n;
    int sum = 0;

    printf("Enter a positive number: ");
    scanf("%d", &n);

    if (n <= 0)
    {
        printf("Invalid Number");
        return 0;
    }

    for (int i = 1; i <= n; i++)
    {
        printf("%d", i);
        sum += i;
    }

    printf("\nSum: %d\n", sum);

    return 0;
}