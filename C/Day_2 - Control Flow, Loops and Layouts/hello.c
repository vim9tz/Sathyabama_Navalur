#include <stdio.h>
// global scope variable
int energy = 100;
int main()
{
    // local scope variable
    int speed = 50;
    printf("Global Energy is %d, Local Speed is %d.\n", energy, speed);
    {
        // block scope variable
        int power = 75;
        printf("Global Energy is %d, Local Speed is %d, Block Power is %d.\n", energy, speed, power);
    }
    printf("Global Energy is %d, Local Speed is %d.\n", energy, speed);
    return 0;
}

// A. Primitive Data Types
//    - char   : Character representation
//    - int    : Integer data
//    - float  : Single-precision floating point
//    - double : Double-precision floating point
//    - bool   : Boolean values (Requires <stdbool.h>)
//    - void   : Empty or dynamic type specifier
