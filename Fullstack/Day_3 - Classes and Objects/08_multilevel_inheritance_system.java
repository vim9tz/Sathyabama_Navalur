/**
 * 08_multilevel_inheritance_system.java
 * Demonstrates multilevel inheritance: Person -> Staff -> ManagerStaff.
 */
class BasePerson {
    String name;
    int age;

    void setPersonDetails(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Staff extends BasePerson {
    int staffId;
    double baseSalary;

    void setStaffDetails(int staffId, double baseSalary) {
        this.staffId = staffId;
        this.baseSalary = baseSalary;
    }
}

class ManagerStaff extends Staff {
    double allowance;

    void setManagerDetails(double allowance) {
        this.allowance = allowance;
    }

    void displayTotalCompensation() {
        double total = baseSalary + allowance;
        System.out.println("Manager Name: " + name + " (ID: " + staffId + ", Age: " + age + ")");
        System.out.println("Base Salary: ₹" + baseSalary + " | Allowance: ₹" + allowance + " | Total: ₹" + total);
    }
}

class _08_multilevel_inheritance_system {
    public static void main(String[] args) {
        ManagerStaff mgr = new ManagerStaff();
        mgr.setPersonDetails("Vikramaditya", 42);
        mgr.setStaffDetails(5001, 85000.00);
        mgr.setManagerDetails(15000.00);

        System.out.println("--- Multilevel Inheritance Hierarchy ---");
        mgr.displayTotalCompensation();
    }
}
