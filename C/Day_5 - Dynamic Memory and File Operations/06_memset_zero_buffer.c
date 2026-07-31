#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main(void) {
    int n = 5;
    int *arr = malloc(n * sizeof(int));
    if(arr == NULL) return 1;
    memset(arr, 0, n * sizeof(int));
    for (int i = 0; i < n; i++) {
        printf("arr[%d] = %d\n", i, arr[i]);
    }
    free(arr);
    arr = NULL;
    return 0;
}

