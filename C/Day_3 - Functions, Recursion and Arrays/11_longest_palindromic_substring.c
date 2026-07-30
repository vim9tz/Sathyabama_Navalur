#include <stdio.h>
#include <string.h>
#include <ctype.h>
#include <stdlib.h>

void printSubstring(const char *str, int start, int length) {
    printf("\"");
    for (int i = start; i < start + length; i++) {
        putchar(str[i]);
    }
    printf("\"");
}

int expandAroundCenter(const char *str, int left, int right, int len) {
    while (left >= 0 && right < len && str[left] == str[right]) {
        left--;
        right++;
    }
    return right - left - 1;
}

int main(void) {
    char input[2048];

    if (fgets(input, sizeof(input), stdin) == NULL) {
        return 0;
    }

    int rawLen = strlen(input);
    char cleanStr[2048];
    int cleanLen = 0;

    for (int i = 0; i < rawLen; i++) {
        if (isalnum((unsigned char)input[i])) {
            cleanStr[cleanLen++] = tolower((unsigned char)input[i]);
        }
    }
    cleanStr[cleanLen] = '\0';

    if (cleanLen == 0) {
        printf("No alphanumeric characters found.\n");
        return 0;
    }

    int start = 0;
    int maxLen = 0;

    for (int i = 0; i < cleanLen; i++) {
        int len1 = expandAroundCenter(cleanStr, i, i, cleanLen);
        int len2 = expandAroundCenter(cleanStr, i, i + 1, cleanLen);
        int currentMax = (len1 > len2) ? len1 : len2;

        if (currentMax > maxLen) {
            maxLen = currentMax;
            start = i - (currentMax - 1) / 2;
        }
    }

    printf("Cleaned String: %s\n", cleanStr);
    printf("Longest Palindromic Substring: ");
    printSubstring(cleanStr, start, maxLen);
    printf("\nStart Index: %d, Length: %d\n", start, maxLen);

    return 0;
}
