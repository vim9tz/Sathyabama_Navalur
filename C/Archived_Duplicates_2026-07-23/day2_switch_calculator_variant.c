#include <stdio.h>

int main()
{
    int choice;
    double first, second;

    printf("1. Add\n2. Subtract\n3. Multiply\n4. Division\n");
    scanf("%d", &choice);

    printf("Enter two numbers: ");
    scanf("%lf %lf", &first, &second);

    switch (choice)
    {
    case 1:
        printf("Result: %.2f\n", first + second);
        break;
    case 2:
        printf("Result: %.2f\n", first - second);
        break;
    case 3:
        printf("Result: %.2f\n", first * second);
        break;
    case 4:
        if (second == 0)
        {
            printf("Error: Cannot divide by zero");
        }
        else
        {
            printf("Result: %.2f\n", first / second);
        }
        break;
    default:
        printf("Invalid Choice\n");
    }

    return 0;
}