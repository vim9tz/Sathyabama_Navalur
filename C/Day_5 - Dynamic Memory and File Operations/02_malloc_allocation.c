#include <stdio.h>
#include <stdlib.h>

int main()
{
    int n = 5;
    int *arr;

    printf("Size of int is %zu.\n", sizeof(int));
    arr = malloc(n * sizeof(int));

    if (arr == NULL)
        return 1;

    printf("Allocated memory address: %p\n", arr);

    free(arr);
    arr = NULL;

    return 0;
}
