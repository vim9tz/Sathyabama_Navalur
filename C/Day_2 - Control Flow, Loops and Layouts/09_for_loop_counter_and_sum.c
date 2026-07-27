#include <stdio.h>

int main(void) {
    int limit;
    int sum = 0;

    printf("Enter a positive limit: ");
    if (scanf("%d", &limit) != 1 || limit < 1) {
        printf("Invalid limit\n");
        return 1;
    }

    for (int counter = 1; counter <= limit; counter++) {
        printf("%d ", counter);
        sum += counter;
    }

    printf("\nSum: %d\n", sum);
    return 0;
}
