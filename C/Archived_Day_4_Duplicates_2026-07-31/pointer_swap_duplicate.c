#include <stdio.h>

void normalSwap(int a, int b)
{
    int temp = a;
    a = b;
    b = temp;
    printf("x = %d, y = %d\n", a, b);
}

void swapWithPointer(int *a, int *b)
{
    int temp = *a; // Read the value stored at address 'a'
    *a = *b;       // Put the value at address 'b' into address 'a'
    *b = temp;     // Put the saved value into address 'b'
}

int main()
{
    int x = 10;
    int y = 20;
    normalSwap(x, y);
    swapWithPointer(&x, &y);
    printf("x = %d, y = %d\n", x, y);
    return 0;
}
