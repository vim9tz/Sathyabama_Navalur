#include <stdio.h>
#include <stdlib.h>

int main(void) {
    int *ptr = malloc(sizeof(int));

    if(ptr == NULL) return 1;

    *ptr = 999;
    printf("Value before free: %d (Address: %p)\n", *ptr, (void *)ptr);

    free(ptr);
    ptr = NULL;
    printf("Memory Cleared\n");

    if(ptr == NULL){
        printf("Pointer safely set to NULL. No accidental memory corruption possible!\n");
    }

    return 0;
}
