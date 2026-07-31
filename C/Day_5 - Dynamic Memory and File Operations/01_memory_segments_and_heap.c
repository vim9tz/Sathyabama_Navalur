#include <stdio.h>
#include <stdlib.h>

// 1. DATA SEGMENT: Initialized global variable
int global_init = 100;

// 2. BSS SEGMENT: Uninitialized global variable
int global_uninit;

int main(void)
{
    // 3. STACK: Local variable & Local pointer
    int a = 10;
    int *p = NULL;

    // 4. HEAP: Requesting memory dynamically
    p = malloc(sizeof(int));

    if (p == NULL)
    {
        printf("Memory allocation failed!\n");
        return 1;
    }

    // Using the heap memory
    *p = 42;
    printf("Value on heap: %d\n", *p);

    // 5. HEAP CLEANUP: Returning the key
    free(p);
    p = NULL; // Good practice: avoid dangling pointers

    return 0;
}
