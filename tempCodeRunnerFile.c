#include <stdio.h>
#include <string.h> // Required for strcpy

struct Employee { 
    int emp_id; 
    char name[30]; 
    float lpa; 
};

int main() {
    struct Employee emp;
    emp.emp_id = 101;
    
    // Copy the string into the character array
    strcpy(emp.name, "Vimal"); 
    
    emp.lpa = 6.5;
    
    printf("ID: %d, Name: %s, LPA: %.2f\n", emp.emp_id, emp.name, emp.lpa);
    return 0;
}
