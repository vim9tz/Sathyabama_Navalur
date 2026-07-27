#include <stdio.h>

int main()
{
    int option;

    do
    {
        printf("\n--- ATM MENU ---\n");
        printf("1. Check Balance\n");
        printf("2. Deposit Money\n");
        printf("3. Withdraw Money\n");
        printf("4. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &option);

        switch (option)
        {
        case 1:
            printf("Your balance is $500.\n");
            break;
        case 2:
            printf("Money deposited successfully.\n");
            break;
        case 3:
            printf("Money withdrawn successfully.\n");
            break;
        case 4:
            printf("Thank you for using the ATM. Goodbye!\n");
            break;
        default:
            printf("Invalid selection! Please try again.\n");
        }

    } while (option != 4); // Keep looping until the user chooses option 4 (Exit)

    return 0;
}
