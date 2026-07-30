# 📘 C Programming Workbook

> A comprehensive, learner-focused workbook featuring **69 solved programming problems** across 8 core domain sections, complete with clean C source code, LeetCode-style mathematical formulas, step-by-step dry runs, and asymptotic complexity analysis.

[![C11 Standard](https://img.shields.io/badge/Language-C11-blue.svg)](https://en.wikipedia.org/wiki/C11_(C_standard_revision))
[![Problems Solved](https://img.shields.io/badge/Problems_Solved-69-success.svg)](#-workbook-navigation)
[![Accuracy](https://img.shields.io/badge/Accuracy-100%25_Verified-brightgreen.svg)](#-features--quality-highlights)
[![Formulas](https://img.shields.io/badge/Formulas-LeetCode_Style_LaTeX-purple.svg)](#-features--quality-highlights)
[![Format](https://img.shields.io/badge/Format-GitHub_Flavored_Markdown-orange.svg)](#)

---

## 📌 Quick Navigation

- [Overview](#-overview)
- [Features & Quality Highlights](#-features--quality-highlights)
- [Repository Structure](#-repository-structure)
- [How to Build and Run](#-how-to-build-and-run)
- [Workbook Navigation](#-workbook-navigation)

---

## 🎯 Overview

This repository hosts a curated collection of foundational to advanced C programming problems designed for computer science students, competitive programmers, and software engineering interview candidates.

Each problem in the master workbook ([`C_Programming_Workbook_GitHub.md`](./C_Programming_Workbook_GitHub.md)) features a 6-part textbook breakdown:
1. **Clear Problem Statement** with sanitized raw sample inputs and exact expected outputs
2. **Conceptual Explanation** explaining algorithm mechanics
3. **LeetCode-Style Mathematical Formula** using LaTeX math equations ($$ ... $$) and recurrence relations
4. **Formatted C Solution** (`C11` standard with Google C style conventions)
5. **Step-by-Step Walkthrough** with structured execution trace tables tracking memory states
6. **Asymptotic Complexity Analysis** ($O(1)$, $O(N)$, $O(N^2)$, $O(N!)$ Time & Space complexity)

---

## 🌟 Features & Quality Highlights

- **100% Verified Accuracy**: Every solution compiled and tested with `gcc -std=c11` (69/69 pass rate) with 0 compiler errors or warnings.
- **LeetCode-Style Formulas**: Explicit mathematical equations for digit extractions, slab utility billing, array accumulators, struct time carries, and sliding window boundaries.
- **Visual Callouts**: Rich GitHub Markdown alerts (`> [!TIP]`, `> [!NOTE]`) highlighting key logic insights and edge cases.
- **In-Depth Execution Traces**: Tabular dry runs detailing variable mutations for every loop iteration and pointer operation.

---

## 📂 Repository Structure

```text
Sathyabama_Navalur/
├── README.md                           # Repository homepage & guide
├── C_Programming_Workbook_GitHub.md    # Master workbook with all 69 solved problems
└── C/                                  # Topic modules & C source code
    ├── Day_1 - C Fundamentals/         # Basic syntax, variables, data types
    ├── Day_2 - Control Flow.../        # Conditionals, loops, control structures
    ├── Day_3 - Functions.../           # Functions, recursion, arrays
    └── Day_4 - Struct, Union and Pointers/ # Structs, unions, pointers, dynamic memory
```

---

## 🚀 How to Build and Run

### Prerequisites
Install a C compiler such as `gcc` or `clang`.

```bash
# Compile any solution from the master workbook
gcc -std=c11 -Wall -O2 solution.c -o solution

# Run executable with sample input
./solution < input.txt
```

---

## 🤝 Workbook Navigation

Click on any section or problem to navigate directly to its full solution in [`C_Programming_Workbook_GitHub.md`](./C_Programming_Workbook_GitHub.md):

### [1. Variables, Data Types and Operators](./C_Programming_Workbook_GitHub.md#section-1-variables-data-types-and-operators)

- [1.1 Reverse Three-Digit Number](./C_Programming_Workbook_GitHub.md#problem-11-reverse-three-digit-number)
- [1.2 Electricity Bill Calculator](./C_Programming_Workbook_GitHub.md#problem-12-electricity-bill-calculator)
- [1.3 Time Conversion](./C_Programming_Workbook_GitHub.md#problem-13-time-conversion)
- [1.4 Salary Calculation](./C_Programming_Workbook_GitHub.md#problem-14-salary-calculation)
- [1.5 Swap Without Temporary Variable](./C_Programming_Workbook_GitHub.md#problem-15-swap-without-temporary-variable)
- [1.6 Find Largest Without Relational Operators](./C_Programming_Workbook_GitHub.md#problem-16-find-largest-without-relational-operators)
- [1.7 Digital Lock Code](./C_Programming_Workbook_GitHub.md#problem-17-digital-lock-code)
- [1.8 Currency Note Calculator](./C_Programming_Workbook_GitHub.md#problem-18-currency-note-calculator)

### [2. Conditional Statements and Looping Statements](./C_Programming_Workbook_GitHub.md#section-2-conditional-statements-and-looping-statements)

- [2.1 Equality Check](./C_Programming_Workbook_GitHub.md#problem-21-equality-check)
- [2.2 Even or Odd Check](./C_Programming_Workbook_GitHub.md#problem-22-even-or-odd-check)
- [2.3 Positive or Negative Check](./C_Programming_Workbook_GitHub.md#problem-23-positive-or-negative-check)
- [2.4 Leap Year Determination](./C_Programming_Workbook_GitHub.md#problem-24-leap-year-determination)
- [2.5 Voting Eligibility](./C_Programming_Workbook_GitHub.md#problem-25-voting-eligibility)
- [2.6 Signum Function Implementation](./C_Programming_Workbook_GitHub.md#problem-26-signum-function-implementation)
- [2.7 Height Categorization](./C_Programming_Workbook_GitHub.md#problem-27-height-categorization)
- [2.8 Largest of Three Numbers](./C_Programming_Workbook_GitHub.md#problem-28-largest-of-three-numbers)
- [2.9 Coordinate Quadrant Identification](./C_Programming_Workbook_GitHub.md#problem-29-coordinate-quadrant-identification)
- [2.10 Vowel or Consonant Check](./C_Programming_Workbook_GitHub.md#problem-210-vowel-or-consonant-check)

### [3. Arrays](./C_Programming_Workbook_GitHub.md#section-3-arrays)

- [3.1 Array Store & Print](./C_Programming_Workbook_GitHub.md#problem-31-array-store-print)
- [3.2 Array Reverse Display](./C_Programming_Workbook_GitHub.md#problem-32-array-reverse-display)
- [3.3 Array Sum Calculation](./C_Programming_Workbook_GitHub.md#problem-33-array-sum-calculation)
- [3.4 Array Copy](./C_Programming_Workbook_GitHub.md#problem-34-array-copy)
- [3.5 Count Duplicate Elements](./C_Programming_Workbook_GitHub.md#problem-35-count-duplicate-elements)
- [3.6 Print Unique Elements](./C_Programming_Workbook_GitHub.md#problem-37-print-unique-elements)
- [3.7 Merge Two Sorted Arrays (Descending)](./C_Programming_Workbook_GitHub.md#problem-37-merge-two-sorted-arrays-descending)
- [3.8 Frequency of Array Elements](./C_Programming_Workbook_GitHub.md#problem-38-frequency-of-array-elements)
- [3.9 Find Maximum & Minimum](./C_Programming_Workbook_GitHub.md#problem-39-find-maximum-minimum)
- [3.10 Separate Odd & Even Arrays](./C_Programming_Workbook_GitHub.md#problem-310-separate-odd-even-arrays)

### [4. Strings](./C_Programming_Workbook_GitHub.md#section-4-strings)

- [4.1 String Input Print](./C_Programming_Workbook_GitHub.md#problem-41-string-input-print)
- [4.2 String Length Without Library](./C_Programming_Workbook_GitHub.md#problem-42-string-length-without-library)
- [4.3 Separate String Characters](./C_Programming_Workbook_GitHub.md#problem-43-separate-string-characters)
- [4.4 Reverse String Characters](./C_Programming_Workbook_GitHub.md#problem-44-reverse-string-characters)
- [4.5 Count Words in String](./C_Programming_Workbook_GitHub.md#problem-45-count-words-in-string)
- [4.6 Compare Strings Without Library](./C_Programming_Workbook_GitHub.md#problem-46-compare-strings-without-library)
- [4.7 Count Alphabets, Digits, Specials](./C_Programming_Workbook_GitHub.md#problem-47-count-alphabets-digits-specials)
- [4.8 Copy String](./C_Programming_Workbook_GitHub.md#problem-48-copy-string)
- [4.9 Count Vowels and Consonants](./C_Programming_Workbook_GitHub.md#problem-49-count-vowels-and-consonants)
- [4.10 Maximum Frequency Character](./C_Programming_Workbook_GitHub.md#problem-410-maximum-frequency-character)

### [5. Structures & Union](./C_Programming_Workbook_GitHub.md#section-5-structures-union)

- [5.1 Student Structure Operations](./C_Programming_Workbook_GitHub.md#problem-51-student-structure-operations)
- [5.2 Time Structure Calculations](./C_Programming_Workbook_GitHub.md#problem-52-time-structure-calculations)
- [5.3 Book Structure Management](./C_Programming_Workbook_GitHub.md#problem-53-book-structure-management)
- [5.4 Circle Structure Calculations](./C_Programming_Workbook_GitHub.md#problem-54-circle-structure-calculations)
- [5.5 Employee Structure Processing](./C_Programming_Workbook_GitHub.md#problem-55-employee-structure-processing)
- [5.6 Date Structure Operations](./C_Programming_Workbook_GitHub.md#problem-56-date-structure-operations)
- [5.7 Queue Implementation with Structures](./C_Programming_Workbook_GitHub.md#problem-57-queue-implementation-with-structures)
- [5.8 Complex Number Operations](./C_Programming_Workbook_GitHub.md#problem-58-complex-number-operations)
- [5.9 Car Structure Management](./C_Programming_Workbook_GitHub.md#problem-59-car-structure-management)

### [6. Pointers](./C_Programming_Workbook_GitHub.md#section-6-pointers)

- [6.1 Basic Pointer Declaration](./C_Programming_Workbook_GitHub.md#problem-61-basic-pointer-declaration)
- [6.2 Pointer Handling Demonstration](./C_Programming_Workbook_GitHub.md#problem-62-pointer-handling-demonstration)
- [6.3 Use of & and * Operators](./C_Programming_Workbook_GitHub.md#problem-63-use-of-and-operators)
- [6.4 Add Two Numbers with Pointers](./C_Programming_Workbook_GitHub.md#problem-64-add-two-numbers-with-pointers)
- [6.5 Add Numbers Using Call by Reference](./C_Programming_Workbook_GitHub.md#problem-65-add-numbers-using-call-by-reference)
- [6.6 Maximum of Two Using Pointer](./C_Programming_Workbook_GitHub.md#problem-66-maximum-of-two-using-pointer)
- [6.7 Print Array Using Pointer](./C_Programming_Workbook_GitHub.md#problem-67-print-array-using-pointer)
- [6.8 Permutations of a String Using Pointers](./C_Programming_Workbook_GitHub.md#problem-68-permutations-of-a-string-using-pointers)
- [6.9 Largest Element Using Dynamic Memory Allocation](./C_Programming_Workbook_GitHub.md#problem-69-largest-element-using-dynamic-memory-allocation)
- [6.10 String Length Using Pointer](./C_Programming_Workbook_GitHub.md#problem-610-string-length-using-pointer)

### [7. Dynamic Memory Allocation](./C_Programming_Workbook_GitHub.md#section-7-dynamic-memory-allocation)

- [7.1 Store N Integers](./C_Programming_Workbook_GitHub.md#problem-71-store-n-integers)
- [7.2 Find Sum of Array](./C_Programming_Workbook_GitHub.md#problem-72-find-sum-of-array)
- [7.3 Find Maximum Element](./C_Programming_Workbook_GitHub.md#problem-73-find-maximum-element)
- [7.4 Reverse an Array](./C_Programming_Workbook_GitHub.md#problem-74-reverse-an-array)
- [7.5 Average of Numbers](./C_Programming_Workbook_GitHub.md#problem-75-average-of-numbers)
- [7.6 Resize an Array](./C_Programming_Workbook_GitHub.md#problem-76-resize-an-array)
- [7.7 Insert an Element](./C_Programming_Workbook_GitHub.md#problem-77-insert-an-element)
- [7.8 Delete an Element](./C_Programming_Workbook_GitHub.md#problem-78-delete-an-element)
- [7.9 Matrix Addition](./C_Programming_Workbook_GitHub.md#problem-79-matrix-addition)
- [7.10 String Copy](./C_Programming_Workbook_GitHub.md#problem-710-string-copy)

### [8. Company Specific Questions](./C_Programming_Workbook_GitHub.md#section-8-company-specific-questions)

- [8.1 Maximum Sum Subarray with Equal First and Last Element](./C_Programming_Workbook_GitHub.md#problem-81-maximum-sum-subarray-with-equal-first-and-last-element)
- [8.2 Longest Substring Without Repeating Characters](./C_Programming_Workbook_GitHub.md#problem-82-longest-substring-without-repeating-characters)

---

## 📜 License

Educational & Open Learning Resource.
