/**
 * 04_employee_salary_overriding.java
 * Demonstrates runtime polymorphism through method overriding across employee categories.
 */
class GenericEmployee {
    String name;
    int id;

    GenericEmployee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public double calculateSalary() {
        return 0.0;
    }

    public void displayDetails() {
        System.out.println("ID: " + id + " | Name: " + name + " | Computed Salary: ₹" + calculateSalary());
    }
}

class FullTimeEmployee extends GenericEmployee {
    double monthlyBaseSalary;

    FullTimeEmployee(String name, int id, double monthlyBaseSalary) {
        super(name, id);
        this.monthlyBaseSalary = monthlyBaseSalary;
    }

    @Override
    public double calculateSalary() {
        return monthlyBaseSalary; // Fixed monthly salary
    }
}

class PartTimeEmployee extends GenericEmployee {
    int hoursWorked;
    double hourlyRate;

    PartTimeEmployee(String name, int id, int hoursWorked, double hourlyRate) {
        super(name, id);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return hoursWorked * hourlyRate; // Calculated hourly salary
    }
}

class _04_employee_salary_overriding {
    public static void main(String[] args) {
        GenericEmployee emp1 = new FullTimeEmployee("Suresh Kumar", 101, 45000.00);
        GenericEmployee emp2 = new PartTimeEmployee("Meera Sen", 102, 80, 350.00);

        System.out.println("--- Salary Calculation (Method Overriding) ---");
        emp1.displayDetails();
        emp2.displayDetails();
    }
}
