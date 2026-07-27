#include <stdio.h>
#include <string.h>

int main()
{
    char username[200];
    char password[6];

    printf("Enter username: ");
    scanf("%s", username);

    if (strcmp(username, "sathybama@gmail.com") == 0)
    {
        printf("Enter password: ");
        scanf("%s", password);

        if (strcmp(password, "123123") == 0)
        {
            printf("Login Successful\n");
        }
        else
        {
            printf("Incorrect Password\n");
        }
    }
    else
    {
        printf("Invalide User\n");
    }
    return 0;
}