#include <stdio.h>

int add_numbers(int a, int b); // Function Declaration

// driver function or main function
int main(void) {
    int result = add_numbers(5, 3); // Function call // Arguments
    printf("Result: %d\n", result);
    return 0;
}

// Function Definition
// (int) Return type
int add_numbers(int a, int b) { // Parameters
    return a + b;
}
