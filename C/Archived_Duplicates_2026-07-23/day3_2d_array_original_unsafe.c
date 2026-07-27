#include <stdio.h>

int main()
{
    int r, c;
    int matrix[r][c];
    int sum = 0;
    printf("Enter row and col length: ");
    scanf("%d %d", &r, &c);
    for (int i = 0; i < r; i++)
    {
        for (int j = 0; j < c; j++)
        {
            printf("Enter value for matrix [%d][%d]: ", i, j);
            scanf("%d", &matrix[i][j]);
        }
    }
    for (int i = 0; i < r; i++)
    {
        for (int j = 0; j < c; j++)
        {
            printf("%d\t", matrix[i][j]);
            sum += matrix[i][j];
        }
        printf("\n");
    }
    printf("Sum of matrix elements is %d.\n", sum);
}