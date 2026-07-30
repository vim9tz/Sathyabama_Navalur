#include <stdio.h>
#include <stdlib.h>

int main(void) {
    int initial_capacity = 3;
    int *arr = (int *)malloc(initial_capacity * sizeof(int));

    if (arr == NULL) {
        printf("Memory allocation failed!\n");
        return 1;
    }

    printf("Dynamically allocated array of size %d:\n", initial_capacity);
    for (int i = 0; i < initial_capacity; i++) {
        arr[i] = (i + 1) * 100;
        printf("arr[%d] = %d\n", i, arr[i]);
    }

    // Expand array using realloc
    int new_capacity = 5;
    int *temp = (int *)realloc(arr, new_capacity * sizeof(int));

    if (temp == NULL) {
        printf("Memory reallocation failed!\n");
        free(arr);
        return 1;
    }
    arr = temp;

    printf("\nResized array dynamically to size %d:\n", new_capacity);
    arr[3] = 400;
    arr[4] = 500;

    for (int i = 0; i < new_capacity; i++) {
        printf("arr[%d] = %d\n", i, arr[i]);
    }

    // Free memory
    free(arr);
    arr = NULL;
    printf("\nMemory successfully freed.\n");

    return 0;
}
