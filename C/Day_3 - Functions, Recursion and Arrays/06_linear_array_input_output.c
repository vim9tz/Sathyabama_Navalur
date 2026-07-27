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

    int numArray[size];
    // loop 1: to collect elements from the user
    for (int i = 0; i < size; i++)
    {
        printf("Enter element %d: ", i + 1);
        if (scanf("%d", &numArray[i]) != 1)
            return 1;
    }
    // loop 2: to display the elements of the array
    printf("The elements of the array are:\n");
    for (int i = 0; i < size; i++)
    {
        printf("%d ", numArray[i]);
    }
    printf("\n");
    return 0;
}
