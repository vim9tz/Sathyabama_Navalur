#include <stdio.h>
int main(void)
{
    FILE *file = fopen("student_report.txt", "w");
    if (file == NULL)
    {
        printf("Unable to open student_report.txt\n");
        return 1;
    }
    fprintf(file, "Student: Anu\n");
    fprintf(file, "C Programming Mark: %d\n", 92);
    if (fclose(file) != 0)
    {
        printf("Unable to close student_report.txt\n");
        return 1;
    }
    printf("Report written to student_report.txt\n");
    return 0;
}
