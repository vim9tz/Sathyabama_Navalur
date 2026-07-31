#include <stdio.h>
#include <stdlib.h>
int main(void)
{
    int n = 3;
    int new_size = 6;
    int *arr = malloc(n * sizeof(int));
    if (arr == NULL)
        return 1;
    arr[0] = 10;
    arr[1] = 20;
    arr[2] = 30;
    int *temp = realloc(arr, new_size * sizeof(int));
    if (temp == NULL)
    {
        free(arr);
        return 1;
    }
    arr = temp;
    arr[3] = 40;
    arr[4] = 50;
    arr[5] = 60;
    // Print using for loop
    for (int i = 0; i < new_size; i++)
    {
        printf("arr[%d] = %d\n", i, arr[i]);
    }
    free(arr);
    arr = NULL;
    return 0;
}
