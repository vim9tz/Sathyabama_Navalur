#include <stdio.h>

int main()
{
    int int1, int2;
    float float1, float2;

    int int_sum, int_diff;
    float float_sum, float_diff;

    scanf("%d %d", &int1, &int2);

    scanf("%f %f", &float1, &float2);

    int_sum = int1 + int2;
    int_diff = int1 - int2;

    float_sum = float1 + float2;
    float_diff = float1 - float2;

    printf("%d %d\n", int_sum, int_diff);

    printf("%.1f %.1f\n", float_sum, float_diff);

    return 0;
}
