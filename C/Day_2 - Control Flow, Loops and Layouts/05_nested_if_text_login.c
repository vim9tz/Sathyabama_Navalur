#include <stdio.h>
#include <string.h>

int main()
{
    char username[200];
    char password[20];

    printf("Enter username: ");
    scanf("%199s", username);

    if (strcmp(username, "sathybama@gmail.com") == 0)
    {
        printf("Enter password: ");
        scanf("%19s", password);

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
        printf("Invalid User\n");
    }
    return 0;
}
