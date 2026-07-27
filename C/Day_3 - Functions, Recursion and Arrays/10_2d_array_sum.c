#include <stdio.h>

int main(void)
{
    int r, c;
    printf("Enter row and col length: ");
    if (scanf("%d %d", &r, &c) != 2 ||
        r < 1 || r > 20 || c < 1 || c > 20)
    {
        printf("Invalid matrix dimensions.\n");
        return 1;
    }

    int matrix[r][c];
    int sum = 0;

    for (int i = 0; i < r; i++)
    {
        for (int j = 0; j < c; j++)
        {
            printf("Enter value for matrix [%d][%d]: ", i, j);
            if (scanf("%d", &matrix[i][j]) != 1)
                return 1;
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
    return 0;
}
