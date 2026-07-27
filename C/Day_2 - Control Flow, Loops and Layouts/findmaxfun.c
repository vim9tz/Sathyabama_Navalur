#include <stdio.h>
int findMax(int v1, int v2)
{
    int max = (v1 > v2) ? v1 : v2;
    return max;
}
int main()
{
    int a, b;
    printf("Enter two values to find max: ");
    scanf("%d %d", &a, &b);
    printf("Maximum value is %d.\n", findMax(a, b));
    return 0;
}