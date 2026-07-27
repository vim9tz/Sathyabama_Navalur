#include <stdio.h>
#include <limits.h>

int main()
{
    int t1, t2, t3, t4, t5;
    int highest = INT_MIN;
    int lowest = INT_MAX;
    // -15 -28 -5 -32 -10
    scanf("%d %d %d %d %d", &t1, &t2, &t3, &t4, &t5);
    if (t1 > highest)
        highest = t1; // -15 > INT_MIN, so highest = -15
    if (t1 < lowest)
        lowest = t1; // -15 < INT_MAX, so lowest = -15
    if (t2 > highest)
        highest = t2; // -28 > -15, so highest remains -15
    if (t2 < lowest)
        lowest = t2; // -28 < -15, so lowest = -28
    if (t3 > highest)
        highest = t3; // -5 > -15, so highest = -5
    if (t3 < lowest)
        lowest = t3; // -5 < -28, so lowest remains -28
    if (t4 > highest)
        highest = t4; // -32 > -5, so highest remains -5
    if (t4 < lowest)
        lowest = t4; // -32 < -28, so lowest = -32
    if (t5 > highest)
        highest = t5; // -10 > -5, so highest remains -5
    if (t5 < lowest)
        lowest = t5; // -10 < -32, so lowest = -32

    printf("--- Weather Station Report ---\n");
    printf("Warmest Temperature: %d\n", highest);
    printf("Coldest Temperature: %d\n", lowest);

    return 0;
}