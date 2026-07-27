#include <stdio.h>

int sumOfDigits(int n)
{
    if (n == 0) // Base case
    {
        return 0;
    }
    return (n % 10) + sumOfDigits(n / 10); // Recursive Call
}

int main(void)
{
    int number = 1432;
    printf("Sum of digits of %d is: %d\n", number, sumOfDigits(number)); // Function Call
    return 0;
}
