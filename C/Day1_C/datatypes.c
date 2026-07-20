#include <stdio.h>

int main()
{
    char letter = 'A';
    int number = 100;
    float decimal = 5.75f;
    double precise_decimal = 99.9999;

    printf("--- Memory Size of Data Types ---\n");
    // sizeof() returns the size of a variable or type in bytes
    printf("char size:   %lu byte(s)  | Value: %c\n", sizeof(letter), letter);
    printf("int size:    %lu byte(s)  | Value: %d\n", sizeof(number), number);
    printf("float size:  %lu byte(s)  | Value: %f\n", sizeof(decimal), decimal);
    printf("double size: %lu byte(s)  | Value: %lf\n", sizeof(precise_decimal), precise_decimal);

    return 0;
}
