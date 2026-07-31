#include <stdio.h>
#include <stdlib.h>

int main(void) {
    int n = 5;
    int *arr;

    printf("Size of int is %zu.\n", sizeof(int));
    arr = malloc(n * sizeof(int));

    if(arr == NULL) return 1;

    printf("Allocated memory address: %p\n", (void *)arr);

    free(arr);
    arr = NULL;

    return 0;
}
