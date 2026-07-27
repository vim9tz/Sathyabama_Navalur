#include <stdio.h>

int main() {
    int choice;
    double first, second;

    // 1. Display options and get user choice
    printf("1.Add 2.Subtract 3.Multiply 4.Divide\n");
    printf("Enter choice: ");
    scanf("%d", &choice);

    // 2. Get the two numbers
    printf("Enter two numbers: ");
    scanf("%lf %lf", &first, &second);

    // 3. Perform calculation based on choice
    switch (choice) {
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
            if (second == 0) {
                printf("Error: Cannot divide by zero\n");
            } else {
                printf("Result: %.2f\n", first / second);
            } 
            break;
        default: 
            printf("Invalid choice\n"); 
    }

    return 0;
}
