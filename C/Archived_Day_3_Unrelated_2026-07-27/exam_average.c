#include <stdio.h>

int main()
{
    int classes, students, subjects, mark;

    printf("How many classes? ");
    scanf("%d", &classes);
    printf("How many subjects? ");
    scanf("%d", &subjects);

    // Loop 1 is for number of classes
    for (int c = 1; c <= classes; c++)
    {
        printf("How many Students in Class %d ", c, " ?");
        scanf("%d", &students);
        // Loop 2 is for number of students
        for (int s = 1; s <= students; s++)
        {
            int total_marks = 0;
            printf("Enter %d subject exam marks for student %d", subjects, s);

            // Loop 3 to calculate total marks
            for (int m = 1; m <= subjects; m++)
            {
                scanf("%d", &mark);
                total_marks += mark;
            }

            float average = (float)total_marks / subjects;
            printf("-> Student %d Average: %.2f\n", s, average);
        }
    }

    return 0;
}