#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main(void) {
    int n = 5;
    int *src = (int *) malloc(n * sizeof(int));
    int *dest = (int *) malloc(n * sizeof(int));
    if (src == NULL || dest == NULL) {
        free(src);
        free(dest);
        return 1;
    }
    // Populate source array
    for (int i = 0; i < n; i++) {
        src[i] = (i + 1) * 10; // 10, 20, 30, 40, 50
    }
    // Copy entire 'src' array memory block into 'dest'
    memcpy(dest, src, n * sizeof(int));
    for (int i = 0; i < n; i++) {
        printf("dest[%d] = %d\n", i, dest[i]);
    }
    free(src);
    free(dest);
    src = NULL;
    dest = NULL;
    return 0;
}
