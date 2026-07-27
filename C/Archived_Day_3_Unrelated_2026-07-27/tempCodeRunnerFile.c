#include <stdio.h>

int main() {
    int choice;

    do {
        // 1. Display the menu options
        printf("\n--- ATM MENU ---\n");
        printf("1. Check Balance\n");
        printf("2. Deposit Money\n");
        printf("3. Withdraw Money\n");
        printf("4. Exit\n");
        
        // 2. Ask the user for their choice
        printf("Enter your choice: ");
        scanf("%d", &choice);

        // 4. Perform actions based on the user's choice
        switch(choice) {
            case 1: 
                printf("Your balance is $1,000.\n"); 
                break;
            case 2: 
                printf("Money deposited successfully.\n"); 
                break;
            case 3: 
                printf("Money withdrawn successfully.\n"); 
                break;
            case 4: 
                printf("Thank you for using our ATM. Goodbye!\n"); 
                break;
            default: 
                printf("Invalid choice! Please select 1, 2, 3, or 4.\n");
        }

    // 5. Keep looping as long as the user did NOT choose 4 (Exit)
    } while (choice != 4); 

    return 0;
}
