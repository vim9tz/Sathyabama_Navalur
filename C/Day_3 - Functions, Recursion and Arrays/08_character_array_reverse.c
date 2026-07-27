#include <stdio.h>
#include <string.h>
void reverse(char str[])
{
    int start = 0;
    int end = (int)strlen(str) - 1;
    char tmp;
    while (start < end)
    {
        tmp = str[start];
        str[start] = str[end];
        str[end] = tmp;
        start++;
        end--;
    }
}
int main(void)
{
    char message[] = "matrix";
    reverse(message);
    printf("Altered in RAM: %s\n", message);
    return 0;
}
