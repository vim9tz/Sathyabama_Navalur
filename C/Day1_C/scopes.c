#include <stdio.h>

// global scope
int energy = 100;

int main()
{
    // Main Scope
    int speed = 50;
        printf("--- Main Block ---\n");
        printf("Global Energy is: %d\n", energy);
        printf("Main Speed is: %d\n", speed);
    {
        // Block Scope
        int boost = 25;
        printf("--- Inside Block ---\n");
        printf("Can see Global Energy %d\n", energy);
        printf("Can see Main Speed %d\n", speed);
        printf("Can see Local boost %d\n", boost);
    }

    printf("--- Back in Main Block ---\n");
    printf("Main speed is still: %d\n", speed);
    return 0;
}
