#include <stdio.h>

void swap_by_value(int a, int b) {
    int temp = a;
    a = b;
    b = temp;
}

void swap_by_reference(int *a, int *b) {
    int temp = *a;
    *a = *b;
    *b = temp;
}

int main(void) {
    int x = 10, y = 20;

    printf("Original Values: x = %d, y = %d\n", x, y);

    swap_by_value(x, y);
    printf("After swap_by_value: x = %d, y = %d (No change)\n", x, y);

    swap_by_reference(&x, &y);
    printf("After swap_by_reference: x = %d, y = %d (Successfully swapped)\n", x, y);

    return 0;
}
