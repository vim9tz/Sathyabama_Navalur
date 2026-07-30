#include <stdio.h>

struct Student {
    int roll_no;
    char name[50];
    float gpa;
};

void update_gpa(struct Student *s, float new_gpa) {
    s->gpa = new_gpa;
}

void print_student(const struct Student *s) {
    printf("Roll No: %d, Name: %s, GPA: %.2f\n", s->roll_no, s->name, s->gpa);
}

int main(void) {
    struct Student s1 = {101, "Ananya", 3.75f};
    struct Student *ptr = &s1;

    printf("Original Details:\n");
    print_student(ptr);

    update_gpa(ptr, 3.95f);

    printf("Updated Details (after pass-by-reference update):\n");
    print_student(&s1);

    return 0;
}
