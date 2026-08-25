/**
 * 10_super_keyword_field_method.java
 * Demonstrates accessing parent fields and invoking parent methods via 'super'.
 */
class ParentGreeting {
    String message = "Parent Class Message";

    void showInfo() {
        System.out.println("Executing ParentGreeting.showInfo()");
    }
}

class ChildGreeting extends ParentGreeting {
    String message = "Child Class Message"; // Field Shadowing

    @Override
    void showInfo() {
        System.out.println("Executing ChildGreeting.showInfo()");
    }

    void displayBoth() {
        // Access child & parent overridden methods
        showInfo();        // Calls Child showInfo
        super.showInfo();  // Calls Parent showInfo

        // Access child & parent shadowed fields
        System.out.println("Child Field: " + message);
        System.out.println("Parent Field (super.message): " + super.message);
    }
}

class _10_super_keyword_field_method {
    public static void main(String[] args) {
        ChildGreeting cg = new ChildGreeting();
        cg.displayBoth();
    }
}
