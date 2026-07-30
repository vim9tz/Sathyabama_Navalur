#include <stdio.h>
#include <string.h>
#include <ctype.h>
#include <stdlib.h>

// Helper function to print a substring given start and length
void printSubstring(const char *str, int start, int length)
{
    printf("\"");
    for (int i = start; i < start + length; i++)
    {
        putchar(str[i]);
    }
    printf("\"");
}

// Helper function to expand around a center and return length
int expandAroundCenter(const char *str, int left, int right, int len)
{
    printf("  [EXPAND] Starting expansion: left = %d, right = %d\n", left, right);

    while (left >= 0 && right < len && str[left] == str[right])
    {
        printf("    -> MATCH: str[%d] ('%c') == str[%d] ('%c')\n", left, str[left], right, str[right]);
        left--;
        right++;
        printf("    -> Pointers updated: left = %d, right = %d\n", left, right);
    }

    if (left >= 0 && right < len)
    {
        printf("    -> MISMATCH: str[%d] ('%c') != str[%d] ('%c')\n", left, str[left], right, str[right]);
    }
    else
    {
        printf("    -> BOUNDS: Reached boundary limit (left = %d, right = %d)\n", left, right);
    }

    int foundLen = right - left - 1;
    printf("  [EXPAND RESULT] Palindrome Length = %d (String: ", foundLen);
    printSubstring(str, left + 1, foundLen);
    printf(")\n");

    return foundLen;
}

int main()
{
    char input[2048];

    // Read the full line of input
    if (fgets(input, sizeof(input), stdin) == NULL)
    {
        return 0;
    }

    int rawLen = strlen(input);

    // Step 1: Filter out non-alphanumeric characters & convert to lowercase
    char cleanStr[2048];
    int cleanLen = 0;

    for (int i = 0; i < rawLen; i++)
    {
        // Keep only alphanumeric characters (letters and digits)
        if (isalnum((unsigned char)input[i]))
        {
            cleanStr[cleanLen++] = tolower((unsigned char)input[i]);
        }
    }

    cleanStr[cleanLen] = '\0';

    if (cleanLen == 0)
    {
        printf("\n");
        return 0;
    }

    printf("==================================================\n");
    printf("INPUT PROCESSING COMPLETE\n");
    printf("Cleaned String : \"%s\"\n", cleanStr);
    printf("Cleaned Length : %d\n", cleanLen);
    printf("==================================================\n\n");

    // Step 2: Expand around center to find longest palindromic substring
    int start = 0;
    int maxLen = 0;

    for (int i = 0; i < cleanLen; i++)
    {
        printf("--------------------------------------------------\n");
        printf("LOOP ITERATION i = %d | Character = '%c'\n", i, cleanStr[i]);
        printf("Current Longest Record : ");
        if (maxLen > 0)
        {
            printSubstring(cleanStr, start, maxLen);
            printf(" (Start = %d, Length = %d)\n", start, maxLen);
        }
        else
        {
            printf("None\n");
        }
        printf("--------------------------------------------------\n");

        // Odd length palindromes
        printf("\n-- Checking Odd-Length Center (i = %d) --\n", i);
        int len1 = expandAroundCenter(cleanStr, i, i, cleanLen);

        // Even length palindromes
        printf("\n-- Checking Even-Length Center (i = %d, i+1 = %d) --\n", i, i + 1);
        int len2 = expandAroundCenter(cleanStr, i, i + 1, cleanLen);

        int currentMax = (len1 > len2) ? len1 : len2;
        printf("\n[SUMMARY i = %d] Max palindrome at center '%c' = %d\n", i, cleanStr[i], currentMax);

        if (currentMax > maxLen)
        {
            maxLen = currentMax;
            start = i - (currentMax - 1) / 2;
            printf("*** NEW RECORD FOUND *** -> Updated Record: ");
            printSubstring(cleanStr, start, maxLen);
            printf(" (Start = %d, Length = %d)\n", start, maxLen);
        }
        printf("\n");
    }

    printf("==================================================\n");
    printf("SEARCH COMPLETE\n");
    printf("Final Longest Palindrome Characters : ");
    printSubstring(cleanStr, start, maxLen);
    printf("\nStart Index                         : %d\n", start);
    printf("Length                              : %d\n", maxLen);
    printf("==================================================\n");

    return 0;
}
