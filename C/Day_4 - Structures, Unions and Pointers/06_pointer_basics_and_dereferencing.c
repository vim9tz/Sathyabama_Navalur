#include <stdio.h>

int main(void) {
    int num = 42;
    int *ptr = &num;

    printf("Value of num: %d\n", num);
    printf("Address of num (&num): %p\n", (void *)&num);
    printf("Value stored in ptr (ptr): %p\n", (void *)ptr);
    printf("Value pointed to by ptr (*ptr): %d\n", *ptr);
    printf("Address of pointer variable (&ptr): %p\n", (void *)&ptr);

    // Modify num using dereference operator
    *ptr = 100;
    printf("\nAfter modifying *ptr = 100:\n");
    printf("New value of num: %d\n", num);
    printf("New value of *ptr: %d\n", *ptr);

    return 0;
}
