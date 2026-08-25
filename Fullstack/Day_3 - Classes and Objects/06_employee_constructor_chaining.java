/**
 * 06_employee_constructor_chaining.java
 * Demonstrates explicit constructor chaining within the same class using this(...).
 */
class EmployeeMember {
    int empId;
    String name;
    String department;
    double salary;

    // 1-arg constructor calls 2-arg constructor
    EmployeeMember(int empId) {
        this(empId, "Unassigned");
    }

    // 2-arg constructor calls 3-arg constructor
    EmployeeMember(int empId, String name) {
        this(empId, name, "General");
    }

    // 3-arg constructor calls 4-arg master constructor
    EmployeeMember(int empId, String name, String department) {
        this(empId, name, department, 35000.00);
    }

    // Master Constructor (4 args)
    EmployeeMember(int empId, String name, String department, double salary) {
        this.empId = empId;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    void displayInfo() {
        System.out.println("ID: " + empId + " | Name: " + name + " | Dept: " + department + " | Salary: ₹" + salary);
    }
}

class _06_employee_constructor_chaining {
    public static void main(String[] args) {
        EmployeeMember e1 = new EmployeeMember(1001);
        EmployeeMember e2 = new EmployeeMember(1002, "Kavya S");
        EmployeeMember e3 = new EmployeeMember(1003, "Rahul Nair", "DevOps", 75000.00);

        System.out.println("--- Employee Records (Constructor Chaining) ---");
        e1.displayInfo();
        e2.displayInfo();
        e3.displayInfo();
    }
}
