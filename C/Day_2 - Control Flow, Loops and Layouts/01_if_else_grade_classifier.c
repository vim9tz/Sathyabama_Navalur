#include <stdio.h>

int main() {
    int username;
    int password;

    printf("Enter username: ");
    if (scanf("%d", &username) != 1) return 1;

    printf("Enter password: ");
    if (scanf("%d", &password) != 1) return 1;

    // Check credentials using nested if-else
    if (username == 1) { 
        if (password == 1) { 
            printf("Login Successful\n"); 
        } else { 
            printf("Incorrect Password\n"); 
        } 
    } else { 
        printf("Invalid User\n"); 
    }

    return 0; 
}
