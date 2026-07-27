#include <stdio.h>

int main(void) {
    int rows;

    printf("Enter number of rows: ");
    if (scanf("%d", &rows) != 1 || rows < 1) {
        printf("Invalid row count\n");
        return 1;
    }

    for (int row = 1; row <= rows; row++) {
        for (int column = 1; column <= row; column++) {
            printf("* ");
        }
        printf("\n");
    }

    return 0;
}
