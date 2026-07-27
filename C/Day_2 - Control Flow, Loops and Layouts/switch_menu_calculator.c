#include <stdio.h>

int main()
{
    int choice;
    double first, second;

    printf("1. Add\n2. Subtract\n3. Multiply\n4. Divide\n");
    printf("Enter Choice: ");
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
            printf("Error: Cannot divide by 0.");
        }
        else
        {
            printf("Result: %.2f\n", first / second);
        }
        break;
    default:
        printf("Invalid choice\n");
    }

    return 0;
}