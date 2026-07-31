#include <stdio.h>

int main(void)
{
    char line[128];
    FILE *file = fopen("student_report.txt", "r");

    if (file == NULL)
    {
        printf("student_report.txt not found. Run lesson 09 first.\n");
        return 1;
    }

    printf("--- Student Report ---\n");
    while (fgets(line, sizeof(line), file) != NULL)
    {
        fputs(line, stdout);
    }

    fclose(file);
    return 0;
}
