#include <stdio.h>

int main(void) {
    int arr[5] = {10, 20, 30, 40, 50};
    int *ptr = arr;
    int sum = 0;

    printf("Traversing array using *(ptr + i) pointer arithmetic:\n");
    for (int i = 0; i < 5; i++) {
        printf("Address of arr[%d]: %p | Value: %d\n", i, (void *)(ptr + i), *(ptr + i));
        sum += *(ptr + i);
    }
    printf("Sum of array elements using pointer arithmetic: %d\n", sum);

    printf("\nTraversing array using pointer increment (ptr++):\n");
    int *p = arr;
    for (int i = 0; i < 5; i++) {
        printf("Current p: %p | Value: %d\n", (void *)p, *p);
        p++;
    }

    printf("\nPointer subtraction / distance calculation:\n");
    int *start = &arr[0];
    int *end = &arr[4];
    printf("Elements between end and start: %ld elements\n", end - start);

    return 0;
}
