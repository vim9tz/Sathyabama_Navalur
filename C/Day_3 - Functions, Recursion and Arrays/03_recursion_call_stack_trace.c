#include <stdio.h>
void tracePhases(int n) // Recursive Function
{
    if (n > 3) // Base Case
    {
        printf("Base case detected %d is > 3: Stopping...\n", n);
        return;
    }
    printf("Calling Phase : n = %d\n", n);   // Calling Phase
    tracePhases(n + 1);                      // Recursive Call
    printf("Returning Phase : n = %d\n", n); // Returning Phase
}
int main(void)
{
    tracePhases(1); // function call
    printf("Back in main(). Program finished.\n");
    return 0;
}
