#include <stdio.h>

int main()
{
    int number;
    int count = 0;
    int sum = 0;

    printf("Enter a non-negative integer: ");
    if (scanf("%d", &number) != 1 || number < 0)
    {
        printf("Invalid input.\n");
        return 1;
    }

    // Backup the original number for processing
    int temp = number;

    // Use a do-while loop to ensure 0 is processed as 1 digit
    do
    {
        int remainder = temp % 10;
        sum += remainder;
        count++;
        temp /= 10;
    } while (temp > 0);

    printf("Digits: %d\n", count);
    printf("Digit sum: %d\n", sum);

    return 0;
}
