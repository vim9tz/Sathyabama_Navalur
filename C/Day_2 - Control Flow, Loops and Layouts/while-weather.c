#include <stdio.h>
#include <limits.h>

int main()
{
    int temp, warmest, coldest;
    int count = 0, sum = 0;

    printf("Enter the temperatures :\n");
    scanf("%d", &temp);

    if (temp == 999)
    {
        printf("No readings\n");
    }

    warmest = INT_MIN;
    coldest = INT_MAX;

    while (temp != 999)
    {
        count++;
        sum += temp;

        if (temp > warmest)
        {
            warmest = temp;
        }
        if (temp < coldest)
        {
            coldest = temp;
        }

        scanf("%d", &temp);
    }

    printf("Readings: %d\n", count);
    printf("Warmest: %d\n", warmest);
    printf("Coldest: %d\n", coldest);
    printf("Average: %.2f\n", (double)sum / count);
    return 0;
}