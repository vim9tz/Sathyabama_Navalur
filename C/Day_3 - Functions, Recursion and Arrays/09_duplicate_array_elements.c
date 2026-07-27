// Find and print the indices of duplicate product IDs inside a single-row numeric array using nested loops.

// 0   1   2   3   4   5   6
// 12  10  12  10  8   7   2

// index 0 and 2 have same Element 12.
// index 1 and 3 have same Element 10.

#include <stdio.h>
int main(void)
{
    int size;
    printf("Enter the size of the array: ");
    if (scanf("%d", &size) != 1 || size < 1 || size > 100)
    {
        printf("Invalid array size.\n");
        return 1;
    }

    int productIDs[size];
    int duplicateCount = 0;
    printf("Enter the product IDs:\n");
    for (int i = 0; i < size; i++)
    {
        if (scanf("%d", &productIDs[i]) != 1)
            return 1;
    }
    for (int i = 0; i < size; i++)
    {
        for (int j = i + 1; j < size; j++)
        {
            if (productIDs[i] == productIDs[j])
            {
                printf("Duplicate found: Element %d at indices %d and %d\n", productIDs[i], i, j);
                duplicateCount++;
            }
        }
    }
    printf("Total Scanned size: %d\n", size);
    printf("Total duplicates found: %d\n", duplicateCount);
    return 0;
}
