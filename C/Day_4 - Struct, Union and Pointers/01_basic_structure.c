#include <stdio.h>
#include <string.h>

struct Employee {
    int emp_id;
    char name[30];
    float lpa;
};

int main(void) {
    struct Employee emp;

    emp.emp_id = 101;
    strcpy(emp.name, "Vimal");
    emp.lpa = 6.50;

    printf("ID: %d, Name: %s, LPA: %.2f\n", emp.emp_id, emp.name, emp.lpa);
    return 0;
}
