

// Pointers Basic Example
#include <stdio.h>
int main()
{
    int a = 10;
    int *ptr1 = &a; // Pointer to integer
    int **ptr2 = &ptr1;
    int ***ptr3 = &ptr2;
    int ****ptr4 = &ptr3;

    printf("Value of a = %d\n", a);                  // Value of a = 10
    printf("Address of a = %p\n", &a);               // Address of a = 0x16bb7df08
    printf("Value of ptr = %p\n", ptr1);             // Value of ptr = 0x16bb7df08
    printf("Value of ptr = %p\n", ptr2);             // Value of ptr = 0x16bb7df08
    printf("Value of ptr = %p\n", ptr3);             // Value of ptr = 0x16bb7df08
    printf("Value pointed by ptr = %d\n", *ptr1);    // Value pointed by ptr = 10
    printf("Value pointed by ptr2 = %d\n", **ptr2);  // Value pointed by ptr = 10
    printf("Value pointed by ptr3 = %d\n", ***ptr3); // Value pointed by ptr = 10
    return 0;
}