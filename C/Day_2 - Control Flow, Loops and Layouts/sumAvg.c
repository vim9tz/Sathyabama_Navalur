#include <stdio.h>

int main()
{
    int length;
    printf("Enter the number of subjects: ");
    scanf("%d", &length);
    int scores[length];
    int sum = 0;
    float avg;

    if (length > 10 || length <= 0)
    {
        printf("Invalid Size. Program Terminated.\n");
        return 1;
    }
    for (int i = 0; i < length; i++)
    {
        printf("Enter score for subject %d: ", i + 1);
        scanf("%d", &scores[i]);
    }
    for (int i = 0; i < length; i++)
    {
        printf("Element at the index %d : %d\n", i, scores[i]);
        sum += scores[i];
    }
    printf("Sum of total elements is : %d\n", sum);
    avg = (float)sum / length;
    printf("Calculated Average: %.2f\n", avg);
    return 0;
}