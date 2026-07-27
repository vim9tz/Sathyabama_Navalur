#include <stdio.h>

int main()
{
    int username, password;
    printf("Enter username: ");
    scanf("%d", &username);

    if (username == 1234)
    {
        printf("Enter password: ");
        scanf("%d", &password);

        if (password == 5678)
        {
            printf("Login successful\n");
        }
        else
        {
            printf("Incorrect password\n");
        }
    }
    else
    {
        printf("Incorrect username\n");
    }

    return 0;
}