#include <stdio.h>

int main()
{
    int size;
    printf("Enter the size of the array: ");
    scanf("%d", &size);
    int numArray[size];
    // loop 1: to collect elements from the user
    for (int i = 0; i < size; i++)
    {
        printf("Enter element %d: ", i + 1);
        scanf("%d", &numArray[i]);
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