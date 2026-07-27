#include <stdio.h>

int main()
{
    const float PI = 3.14159f;

    float radius, area;

    printf("Enter the radius of the circle: ");
    scanf("%f", &radius);

    area = PI * (radius * radius);

    printf("The total geometric surface area is: %.2f\n", area);

    return 0;
}
