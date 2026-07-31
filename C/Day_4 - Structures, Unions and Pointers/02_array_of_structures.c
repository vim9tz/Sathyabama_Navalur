#include <stdio.h>

typedef struct Payslip {
    char month[30];
    float salary;
} pay;

typedef struct Employee {
    int emp_id;
    char name[30];
    float salary;
    pay payslip;
} emp;

int main(void) {
    emp specialEmployee = {100, "John Doe", 70000.0f, {"January", 70000.0f}};
    emp employees[3] = {
        {101, "Alice", 50000.0f, {"January", 50000.0f}},
        {102, "Bob", 60000.0f, {"January", 60000.0f}},
        {103, "Charlie", 55000.0f, {"January", 55000.0f}}
    };

    printf("January salary for Alice: %.2f\n", employees[0].payslip.salary);
    printf("January salary for Bob: %.2f\n", employees[1].payslip.salary);
    printf("January salary for Charlie: %.2f\n", employees[2].payslip.salary);
    printf("January salary for Special Employee (John Doe): %.2f\n", specialEmployee.payslip.salary);

    printf("\nEmployee Details:\n");
    for (int i = 0; i < 3; i++) {
        printf("\n--- Employee %d ---\n", i + 1);
        printf("Employee ID: %d\n", employees[i].emp_id);
        printf("Name: %s\n", employees[i].name);
        printf("Salary: %.2f\n", employees[i].salary);
        printf("Payslip - Month: %s, Salary: %.2f\n", employees[i].payslip.month, employees[i].payslip.salary);
    }
    printf("\nTotal memory allocated for Employee structure: %zu bytes\n", sizeof(emp));
    return 0;
}
