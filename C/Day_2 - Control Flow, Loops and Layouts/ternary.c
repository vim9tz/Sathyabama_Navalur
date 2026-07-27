#include <stdio.h>

int main()
{
    int n1, n2, max;

    printf("Enter two numbers");
    scanf("%d %d", &n1, &n2);

    max = (n1 > n2) ? n1 : n2;

    printf("The larger number is: %d\n", max);
}