#include <stdio.h>

int main()
{
    int coord_a, coord_b;
    int backup_a, backup_b;

    printf("Enter coord a:");
    scanf("%d", &coord_a);
    printf("Enter coord b:");
    scanf("%d", &coord_b);

    backup_a = coord_a;
    backup_b = coord_b;

    int tmp = coord_a;
    coord_a = coord_b;
    coord_b = tmp;

    printf("Coord A = %d and Coord B = %d is Swapped using temp", coord_a, coord_b);

    coord_a = backup_a;
    coord_b = backup_b;

    coord_a = coord_a + coord_b;
    coord_b = coord_a - coord_b;
    coord_a = coord_a - coord_b;

    printf("Coord A = %d and Coord B = %d is Swapped using arithmetic", coord_a, coord_b);
}