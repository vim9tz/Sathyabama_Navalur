#include <stdio.h>
#include <limits.h>

int main()
{
    int user_input;
    int num;

    printf("System Int Max Limit: %d\n\n", INT_MAX);

    printf("Enter a positive whole number to process: ");
    scanf("%d", &user_input);

    if (user_input > INT_MAX || user_input < 0)
    {
        printf("\nInput violates limits! Must be between 0 and %d.\n", INT_MAX);
        return -1;
    }

    num = user_input;

    while (num >= 10)
    {
        short intermediate_sum = 0;
        // Inner loop: Strip and accumulate digits from right to left
        while (num > 0)
        {
            int last_digit = num % 10;      // Extract the last digit
            intermediate_sum += last_digit; // Add it to our running sum
            num = num / 10;                 // Remove the last digit from the number
        }

        // Feed the new sum back into 'num' to check it in the next loop pass
        num = intermediate_sum;
    }

    printf("\nOriginal Input: %d\n", user_input);
    printf("The final single-digit result is: %d\n", num);

    return 0;
}
