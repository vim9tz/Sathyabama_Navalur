#include <stdio.h>

void print_generic_value(void *ptr, char type) {
    if (ptr == NULL) {
        printf("Error: NULL pointer passed!\n");
        return;
    }

    switch (type) {
        case 'i':
            printf("Integer Value: %d\n", *(int *)ptr);
            break;
        case 'f':
            printf("Float Value: %.2f\n", *(float *)ptr);
            break;
        case 'c':
            printf("Character Value: %c\n", *(char *)ptr);
            break;
        default:
            printf("Unknown type specifier!\n");
            break;
    }
}

int main(void) {
    int num = 123;
    float pi = 3.14159f;
    char letter = 'A';
    int *null_ptr = NULL;

    printf("--- Demonstrating Generic void* Pointers ---\n");
    print_generic_value(&num, 'i');
    print_generic_value(&pi, 'f');
    print_generic_value(&letter, 'c');

    printf("\n--- Demonstrating NULL Pointer Guard ---\n");
    print_generic_value(null_ptr, 'i');

    return 0;
}
