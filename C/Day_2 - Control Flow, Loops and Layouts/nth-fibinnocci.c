#include <stdio.h>
int fibonacci(int n)
{
    // Base Cases
    if (n == 0)
        return 0;
    if (n == 1)
        return 1;
    // Recursive Case: Sum of the two previous terms
    return fibonacci(n - 1) + fibonacci(n - 2);
}
int main()
{
    int index = 3;
    printf("Fibonacci value at index %d is: %d\n", index, fibonacci(index));
    return 0;
}