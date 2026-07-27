#include <stdio.h>

int main() {
    short int small_box = 30000;
    unsigned int positive_only = 4000000000U; 

    printf("Small Box Value: %hd\n", small_box);
    printf("Positive Only Value: %u\n", positive_only);
    
    return 0;
}
