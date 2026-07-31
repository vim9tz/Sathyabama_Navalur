#include <stdio.h>

int main(void)
{
    FILE *file = fopen("student_report.txt", "a");
    if (file == NULL)
    {
        printf("Unable to open student_report.txt\n");
        return 1;
    }

    fputs("Status: Passed\n", file);
    fclose(file);

    printf("Status appended to student_report.txt\n");
    return 0;
}
