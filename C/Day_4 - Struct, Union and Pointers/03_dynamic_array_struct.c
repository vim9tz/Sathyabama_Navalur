#include <stdio.h>
#include <string.h>

typedef struct Payslip {
    char month[10];
    float salary;
} pay;

typedef struct Employee {
    int emp_id;
    char name[30];
    float lpa;
    pay Payslip[12];
} emp;

int main(void) {
    emp employees[3];
    // Clear memory to avoid garbage characters during display
    memset(employees, 0, sizeof(employees));

    // Collect the details
    for (int i = 0; i < 3; i++) {
        printf("\n === Enter Details for Employee %d ===\n", i + 1);
        printf("Enter Employee ID: ");
        scanf("%d", &employees[i].emp_id);
        printf("Enter name: ");
        scanf(" %[^\n]s", employees[i].name);
        printf("Enter LPA (Lakhs per annum): ");
        scanf("%f", &employees[i].lpa);

        char choice;
        for (int j = 0; j < 12; j++) {
            printf("Do you want to enter a payslip for month %d? (y/n): ", j + 1);
            scanf(" %c", &choice);
            if (choice == 'n' || choice == 'N') {
                break; // Stop collecting months for this employee
            }
            printf("  Enter Month Name (e.g., January): ");
            scanf("%s", employees[i].Payslip[j].month);
            printf("  Enter Salary for %s: ", employees[i].Payslip[j].month);
            scanf("%f", &employees[i].Payslip[j].salary);
        }
    }

    // Display the details
    printf("\n=== EMPLOYEE PAYSLIP RECORDS ===\n");
    for (int i = 0; i < 3; i++) {
        printf("--- Employee: %s ID: %d ---\n", employees[i].name, employees[i].emp_id);
        for (int j = 0; j < 12; j++) {
            if (employees[i].Payslip[j].month[0] != '\0') {
                printf(" Month: %-10s | Salary: %.2f\n", employees[i].Payslip[j].month, employees[i].Payslip[j].salary);
            }
        }
        printf("\n");
    }

    return 0;
}
