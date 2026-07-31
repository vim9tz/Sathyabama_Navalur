#include <stdio.h>
#include <stdlib.h>

int main(void) {
    int n = 5;
    int *arr;

    arr = calloc(n, sizeof(int));

    if(arr == NULL) return 1;

    for(int i = 0; i < n; i++){
        printf("arr[%d] = %d\n", i, arr[i]);
    }

    free(arr);
    arr = NULL;
    return 0;
}
