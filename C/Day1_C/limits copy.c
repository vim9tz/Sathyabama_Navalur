#include <stdio.h>
#include <limits.h>

int main()
{
    printf("-- Hard limit --");
    printf("Signed INT range: %d to %d\n", INT_MIN, INT_MAX);
    printf("Unsigned INT max: %u\n", UINT_MAX);

    int user_age;
    unsigned int user_id;

    printf("Enter your age:");
    scanf("%d", &user_age);

    printf("Enter your student id: ");
    scanf("%u", &user_id);

    printf("Age : %d years old\n", user_age);
    printf("Student ID: %u\n", user_id);

    return 0;
}

