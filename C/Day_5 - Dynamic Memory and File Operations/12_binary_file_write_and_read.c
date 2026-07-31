#include <stdio.h>

typedef struct
{
    int rollNumber;
    float mark;
} StudentRecord;

int main(void)
{
    const StudentRecord output = {101, 88.5f};
    StudentRecord input;

    FILE *file = fopen("student_record.bin", "wb");
    if (file == NULL)
        return 1;

    if (fwrite(&output, sizeof(output), 1, file) != 1)
    {
        fclose(file);
        return 1;
    }
    fclose(file);

    file = fopen("student_record.bin", "rb");
    if (file == NULL)
        return 1;

    if (fread(&input, sizeof(input), 1, file) != 1)
    {
        fclose(file);
        return 1;
    }
    fclose(file);

    printf("Roll Number: %d\n", input.rollNumber);
    printf("Mark: %.1f\n", input.mark);
    return 0;
}
