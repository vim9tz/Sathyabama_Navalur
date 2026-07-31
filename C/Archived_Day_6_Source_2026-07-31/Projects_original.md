---
title: "C Language Capstone Projects (CLI Applications)"
description: "A curated collection of 10 CLI Capstone Projects designed for students covering C fundamentals, structs, arrays, pointers, dynamic memory allocation, and data management."
category: "Computer Science Curriculum"
level: "Beginner to Intermediate C Programming"
---
# C Language Capstone Projects: CLI Applications

This repository contains **10 CLI Capstone Projects** designed to test students' mastery of core C programming concepts.

---

## 📋 Strict Scope & Prerequisites

To ensure students consolidate fundamental concepts before moving to advanced computer science topics, these projects **do not require advanced Data Structures** (such as Linked Lists, Trees, or Graphs).

Students must build these applications strictly using:

- **C Fundamentals & Control Flow** (`if-else`, `switch-case`, loops)
- **Functions & Variable Scope**
- **Structures (`struct`) & Unions**
- **Arrays & Pointers**
- **Dynamic Memory Allocation** (`malloc`, `calloc`, `realloc`, `free`)
- **Data Persistence & Management** (Student-designed storage architecture)

---

## 🛠️ General Implementation Guidelines

1. **Data Persistence Requirement:** Applications must ensure zero data loss. Students are responsible for planning and implementing their own persistence architecture so that records persist across program restarts.
2. **Memory Hygiene:** Every dynamic allocation using `malloc`/`realloc` must have a corresponding `free()`. All opened resource handles must be safely closed before exiting.
3. **Robust Input Handling:** Programs must handle invalid user inputs (e.g., entering letters in numeric fields) gracefully without crashing or running into infinite loops.
4. **Modular Architecture:** Code should be structured across separate header (`.h`) and source (`.c`) files.

---

## 🚀 Capstone Project Matrix

| #  | Project Name                                     | Target Domain      | Persistence Challenge       | Primary Memory Focus           |
| -- | ------------------------------------------------ | ------------------ | --------------------------- | ------------------------------ |
| 1  | **Learning Management System (LMS)**       | Education          | Multi-entity Data Storage   | Dynamic Array Resizing         |
| 2  | **Mini ERP & Inventory System**            | Warehouse / Retail | Audit Logging & Sync        | In-Memory Stock Lookup         |
| 3  | **Customer Relationship Management (CRM)** | Sales & Leads      | State Export & Reloading    | String Buffer Operations       |
| 4  | **Point of Sale (POS) & Billing System**   | Retail Checkout    | Receipt & Ledger Generation | Nested Struct Arrays           |
| 5  | **Personal Finance & Expense Tracker**     | Personal Finance   | Formatted Record Parsing    | Geometric Growth (`realloc`) |
| 6  | **Console Library Management System**      | Academic Library   | Struct Serialization        | Struct Serialization           |
| 7  | **Employee Payroll & Attendance System**   | Human Resources    | Master Records & Payslips   | Pointer Arithmetic             |
| 8  | **Bus / Train Ticket Reservation System**  | Transport          | Direct Grid/State Storage   | Grid Allocation Maps           |
| 9  | **Medical Clinic & Appointment Scheduler** | Healthcare         | Safe Record Updates         | Memory Cleanup Safety          |
| 10 | **Fitness & Gym Membership System**        | Fitness & Sports   | Append-Only Access Logs     | Dynamic Buffer Cleanup         |

---

## 📁 Detailed Project Specifications

<details>
<summary><strong>Project 1: Command-Line Learning Management System (LMS)</strong></summary>

### Overview

A lightweight educational management system for tracking courses, student enrollments, and assignment grades.

### Technical Requirements

- **Data Entities (`struct`):**
  - `Course` (ID, Name, Instructor, Credits)
  - `Student` (ID, Name, Enrolled Course IDs)
  - `Submission` (Student ID, Course ID, Assignment Name, Grade)
- **Core Capabilities:**
  - **Admin Panel:** Create new courses, view enrolled students, and assign grades.
  - **Student Panel:** View available courses, enroll in a course, and check current grades.
- **Student Planning Directives:**
  - **Dynamic Memory (`malloc`/`realloc`):** Dynamically grow student and course lists as new items are added.
  - **Persistence Strategy:** Plan how multi-entity relationships (students, courses, submissions) will be saved to disk and reloaded into memory at startup.
  - **CLI Menu:** Multi-level menu driven by `switch-case` loops.

</details>

<details>
<summary><strong>Project 2: Mini Enterprise Resource Planning (ERP) & Inventory System</strong></summary>

### Overview

A retail store or warehouse inventory tool to manage stock levels, track suppliers, and process stock movements.

### Technical Requirements

- **Data Entities (`struct`):**
  - `Item` (SKU Code, Item Name, Quantity in Stock, Unit Price, Reorder Level)
  - `Transaction` (Transaction ID, SKU Code, Type [`IN`/`OUT`], Quantity, Timestamp/Date)
- **Core Capabilities:**
  - **Stock Management:** Add new inventory items, update quantities (stock-in / stock-out).
  - **Low Stock Alerts:** Filter and display items where `quantity < reorder_level`.
  - **Audit Log:** Log every stock change chronologically for record-keeping.
- **Student Planning Directives:**
  - **Pointers & Memory:** Pass array pointers into functions to search items by SKU or update stock in-memory.
  - **Persistence Strategy:** Design a dual-storage plan—one structure to save the full master inventory, and an append-only log strategy for historical stock movements.

</details>

<details>
<summary><strong>Project 3: Customer Relationship Management (CRM) Tool</strong></summary>

### Overview

A CLI sales pipeline tracker that helps business representatives manage customer leads, contact details, and deal statuses.

### Technical Requirements

- **Data Entities (`struct`):**
  - `Customer` (ID, Full Name, Email, Phone Number, Company)
  - `Deal` (Deal ID, Customer ID, Value in USD, Status [`LEAD`, `CONTACTED`, `CLOSED_WON`, `CLOSED_LOST`])
- **Core Capabilities:**
  - **Lead Management:** Create, search (by name or company), and update customer profiles.
  - **Pipeline Analytics:** Calculate total value of closed deals ($) and view success rates.
  - **Export Reports:** Generate plain-text summary reports for management.
- **Student Planning Directives:**
  - **String Manipulation (`<string.h>`):** Use `strstr()` or `strcmp()` for searching leads by name or email.
  - **Persistence Strategy:** Decide how search results and pipeline reports are formatted and stored on disk.
  - **Memory Management:** Clean up allocated dynamic buffers using `free()` before program termination.

</details>

<details>
<summary><strong>Project 4: Point of Sale (POS) & Billing System</strong></summary>

### Overview

A retail checkout counter application that generates customer invoices, updates inventory stock, and tracks daily sales.

### Technical Requirements

- **Data Entities (`struct`):**
  - `Product` (ID, Name, Price, Tax Rate %)
  - `InvoiceItem` (Product ID, Name, Quantity, Line Total)
  - `Invoice` (Invoice Number, Date, Total Amount, Items Array)
- **Core Capabilities:**
  - **Interactive Cart:** Add items to a billing cart by Product ID and quantity.
  - **Receipt Generation:** Print a formatted ASCII receipt to the screen and write it to persistent storage for customer records.
  - **Daily Sales Summary:** Maintain a ledger of sales transactions for daily bookkeeping.
- **Student Planning Directives:**
  - **Nested Structs & Arrays:** Manage arrays of `InvoiceItem` inside an `Invoice` struct.
  - **Formatting Output:** Precise string and number formatting using print controls (`%-20s`, `%.2f`).
  - **Persistence Strategy:** Plan how to store individual receipts vs. cumulative sales data.

</details>

<details>
<summary><strong>Project 5: Personal Finance & Expense Tracker</strong></summary>

### Overview

A tool designed for users to log daily income and expenses, organize spending by category, and track monthly budgets.

### Technical Requirements

- **Data Entities (`struct`):**
  - `Record` (ID, Type [`INCOME`/`EXPENSE`], Category [`Food`, `Rent`, `Salary`], Amount, Date string)
- **Core Capabilities:**
  - **Record Entry:** Add income/expense entries.
  - **Budget Checks:** Set a monthly threshold and trigger warnings if expenses exceed the budget limit.
  - **Category Breakdown:** Calculate total spent per category using basic array loops.
- **Student Planning Directives:**
  - **Dynamic Array Growth:** Automatically double the size of the record array using `realloc()` when new transactions exceed capacity.
  - **Persistence Strategy:** Implement a custom record parsing and saving format to reload transactions cleanly when the app launches.

</details>

<details>
<summary><strong>Project 6: Console Library Management System</strong></summary>

### Overview

An automated bookshelf manager for a public or university library to track book availability and member borrowings.

### Technical Requirements

- **Data Entities (`struct`):**
  - `Book` (ISBN, Title, Author, IsIssued [`0` or `1`], MemberID)
  - `Member` (Member ID, Name, Books Borrowed Count)
- **Core Capabilities:**
  - **Catalog Search:** Search books by ISBN, Title, or Author.
  - **Checkout / Return Logic:** Issue a book to a member (`IsIssued = 1`) and return a book (`IsIssued = 0`).
  - **Persistent Storage:** Preserve the entire catalog state so changes remain available across sessions.
- **Student Planning Directives:**
  - **Struct Serialization:** Plan how complex struct arrays will be serialized to disk and deserialized back into active memory.
  - **Pointer Passing:** Pass pointers to `Book` structs into functions to modify records directly in memory.

</details>

<details>
<summary><strong>Project 7: Employee Payroll & Attendance System</strong></summary>

### Overview

An administrative tool for small businesses to track employee working days, calculate tax deductions, and generate monthly pay stubs.

### Technical Requirements

- **Data Entities (`struct`):**
  - `Employee` (ID, Name, Designation, Base Hourly Rate)
  - `Attendance` (Employee ID, Days Worked, Overtime Hours)
  - `PayStub` (Employee ID, Month, Gross Pay, Tax Deductions, Net Pay)
- **Core Capabilities:**
  - **Employee Management:** Add, update, or remove employee records.
  - **Payroll Calculator:** Calculate `Gross Pay = (Days Worked * 8 * Rate) + (Overtime * Rate * 1.5)` and apply standard tax deductions.
  - **Paystub Generator:** Export individual formatted paystubs for employees.
- **Student Planning Directives:**
  - **Struct Arrays & Pointers:** Pass `Employee*` arrays to calculation functions to update metrics in memory.
  - **Persistence Strategy:** Design storage for both permanent master employee data and recurring monthly payroll records.

</details>

<details>
<summary><strong>Project 8: Automated Bus / Train Ticket Reservation System</strong></summary>

### Overview

A ticketing system for a transport agency to manage trip routes, seat bookings, passenger manifests, and cancellation refunds.

### Technical Requirements

- **Data Entities (`struct`):**
  - `Route` (Route ID, Origin, Destination, Departure Time, Ticket Price)
  - `Bus` (Bus ID, Route ID, Total Seats, Seat Matrix Array)
  - `Ticket` (Ticket ID, Bus ID, Seat Number, Passenger Name, Status [`BOOKED`, `CANCELLED`])
- **Core Capabilities:**
  - **Interactive Seat Map:** Display an ASCII grid showing available vs. booked seats (e.g., `[X]` for booked, `[12]` for available).
  - **Booking & Refund Logic:** Assign available seats, collect passenger details, and calculate an 80% refund upon cancellation.
  - **Passenger Manifest:** Export a passenger manifest list for any given Bus ID.
- **Student Planning Directives:**
  - **Multi-dimensional Arrays / Fixed Bitmaps:** Map seat availability using integer or character arrays inside structs.
  - **Persistence Strategy:** Plan how seat reservation states and ticket numbers will be saved and accessed directly.

</details>

<details>
<summary><strong>Project 9: Console Medical Clinic & Appointment Scheduler</strong></summary>

### Overview

A healthcare receptionist system designed to register patients, book doctor appointment slots, and generate medical billing history.

### Technical Requirements

- **Data Entities (`struct`):**
  - `Doctor` (ID, Name, Specialization, Consultation Fee)
  - `Patient` (ID, Name, Age, Phone)
  - `Appointment` (Appointment ID, Patient ID, Doctor ID, Date, Time Slot, Status [`SCHEDULED`, `COMPLETED`])
- **Core Capabilities:**
  - **Doctor Directory:** View doctors filtered by specialization.
  - **Slot Booking:** Check doctor availability for a given date/time slot before confirming an appointment.
  - **Patient History Search:** Look up past appointments and total fees paid by Patient ID.
- **Student Planning Directives:**
  - **String Search (`<string.h>`):** Match specializations or search patient names using `strcmp()` or `strstr()`.
  - **Dynamic Resizing (`realloc`):** Dynamically grow appointment records as new consultations are scheduled.
  - **Persistence Strategy:** Design a safe update mechanism to ensure existing patient records are never overwritten accidentally.

</details>

<details>
<summary><strong>Project 10: CLI Fitness & Gym Membership Management System</strong></summary>

### Overview

A gym management tool that handles member subscriptions, tracks daily check-ins, and identifies expiring memberships.

### Technical Requirements

- **Data Entities (`struct`):**
  - `Member` (Member ID, Name, Plan Type [`Monthly`, `Annual`], Join Date, Expiry Date)
  - `CheckIn` (CheckIn ID, Member ID, Date, Time String)
- **Core Capabilities:**
  - **Membership Registration:** Register members with automatic expiry date calculation based on plan duration.
  - **Daily Attendance Tracker:** Log member entry by ID and flag expired memberships at check-in.
  - **Renewal System:** Extend membership expiry dates upon receiving payment.
- **Student Planning Directives:**
  - **Persistence Strategy:** Plan an efficient logging scheme for frequent daily check-ins vs. static member records.
  - **Memory Allocation & Cleanup:** Manage active member profiles in dynamic memory and release memory with `free()` on exit.

</details>

---

## 🛠️ Minimal Build & Execution Boilerplate

To build and test these CLI projects on any POSIX system (Linux/macOS) or Windows terminal, use the standard GNU C Compiler toolchain:

```bash
# Compile multi-file modular C project
gcc -Wall -Wextra -std=c11 main.c modules/*.c -o app_bin

# Execute the application binary
./app_bin
```
