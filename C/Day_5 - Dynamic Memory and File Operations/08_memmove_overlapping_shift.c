#include <stdio.h>
#include <stdlib.h>
#include <string.h>
int main(void) {
    int n = 6;
    int *arr = (int *) malloc(n * sizeof(int));
    if (arr == NULL) return 1;
    // Initialize array: {10, 20, 30, 40, 50, 60}
    for (int i = 0; i < n; i++) {
        arr[i] = (i + 1) * 10;
    }
    printf("Original Array:\n");
    for (int i = 0; i < n; i++) {
        printf("%d ", arr[i]);
    }
    printf("\n\n");
    // Scenario: Shift the sub-array {10, 20, 30} two slots to the right
    // Source: arr[0] (address of 10, size 3 elements)
    // Destination: arr[2] (address of 30)
    // Here, destination and source overlap!
    memmove(arr + 2, arr, 3 * sizeof(int));
    // 1. Copy 3rd element: Moves arr[0 + 2] (30) to arr[2 + 2] (arr[4]).
    //      ⚬ Array state: {10, 20, 30, 40, 30, 60}
    // 2. Copy 2nd element: Moves arr[0 + 1] (20) to arr[2 + 1] (arr[3]).
    //      ⚬ Array state: {10, 20, 30, 20, 30, 60}
    // 3. Copy 1st element: Moves arr[0 + 0] (10) to arr[2 + 0] (arr[2]).
    //      ⚬ Array state: {10, 20, 10, 20, 30, 60}
    printf("Array after shifting 3 elements right by 2 positions:\n");
    for (int i = 0; i < n; i++) {
        printf("%d ", arr[i]); // Output: 10 20 10 20 30 60
    }
    printf("\n");
    free(arr);
    arr = NULL;
    return 0;
}
