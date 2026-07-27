#include <stdio.h>

int main()
{
    int count = 0, sum = 0, ch;

    printf("Enter a non-negative integer: ");

    while (1)
    {
        ch = getchar();
        if (ch == '\n' || ch == EOF)
            break; // Stop when Enter is pressed

        if (ch >= '0' && ch <= '9')
        {
            sum += (ch - '0'); // Convert character digit to math integer
            count++;
        }
        else
        {
            printf("\nError: Input contains non-numeric characters.\n");
            return 1;
        }
    }

    // Default to 1 digit if input was completely empty
    if (count == 0)
        count = 1;

    printf("Digits: %d\nDigit sum: %d\n", count, sum);
    return 0;
}
