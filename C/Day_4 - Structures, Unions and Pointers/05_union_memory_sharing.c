#include <stdio.h>
#include <string.h>

union Data {
    int i;
    float f;
    char str[20];
};

struct DataStruct {
    int i;
    float f;
    char str[20];
};

int main(void) {
    union Data u;
    struct DataStruct s;

    printf("Size of union Data: %zu bytes\n", sizeof(u));
    printf("Size of struct DataStruct: %zu bytes\n", sizeof(s));

    printf("\n--- Setting Union Fields One by One ---\n");
    u.i = 10;
    printf("u.i = %d\n", u.i);

    u.f = 220.5f;
    printf("u.f = %.2f\n", u.f);

    strcpy(u.str, "C Programming");
    printf("u.str = %s\n", u.str);

    printf("\nOnly the most recently written union member is active.\n");
    printf("Active member u.str = %s\n", u.str);

    return 0;
}
