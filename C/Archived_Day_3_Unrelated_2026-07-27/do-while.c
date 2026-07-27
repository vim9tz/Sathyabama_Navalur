// The Guessing Game

// Write a C program that hides a secret number (e.g., 7). Prompt the user to guess the number. Keep asking for a guess until they get it right.

#include <stdio.h>
int main() {
    int secretNumber = 7; // The secret number to guess
    int userGuess; // Variable to store the user's guess
    printf("Welcome to the Guessing Game!\n");
    printf("I have a secret number between 1 and 10. Can you guess it?\n");
    do {
        printf("Enter your guess: ");
        scanf("%d", &userGuess);
        if (userGuess < secretNumber) {
            printf("Too low! Try again.\n");
        } else if (userGuess > secretNumber) {
            printf("Too high! Try again.\n");
        } else {
            printf("Congratulations! You've guessed the secret number %d!\n", secretNumber);
        }
    } while (userGuess != secretNumber);
    return 0;
}
