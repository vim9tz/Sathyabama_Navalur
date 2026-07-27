#include <limits.h>
#include <stdio.h>

int main(void) {
    int temperature;
    int count = 0;
    int warmest = INT_MIN;
    int coldest = INT_MAX;
    long long sum = 0;

    printf("Enter temperatures (999 to stop): ");

    while (scanf("%d", &temperature) == 1 && temperature != 999) {
        if (temperature > warmest) warmest = temperature;
        if (temperature < coldest) coldest = temperature;
        sum += temperature;
        count++;
    }

    if (count == 0) {
        printf("No readings\n");
    } else {
        printf("Readings: %d\n", count);
        printf("Warmest: %d\n", warmest);
        printf("Coldest: %d\n", coldest);
        printf("Average: %.2f\n", (double)sum / count);
    }

    return 0;
}
