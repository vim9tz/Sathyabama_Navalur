

#include <stdio.h>
#include <string.h>

struct Student
{
    int id;
    char name[100];
    float marks;
};

union Data
{
    int i;
    float f;
    char str[20];
};

int main()
{

    struct Student student1;
    student1.id = 1;
    strcpy(student1.name, "John Doe");
    student1.marks = 85.5;

    union Data data;
    data.i = 10;
    data.f = 3.14;
    strcpy(data.str, "Hello, World!");

    printf("Size of struct Student = %zu\n", sizeof(struct Student));
    printf("Size of union Data = %zu\n", sizeof(union Data));

    return 0;
}