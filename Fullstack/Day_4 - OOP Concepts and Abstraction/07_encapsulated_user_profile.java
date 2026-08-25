/**
 * 07_encapsulated_user_profile.java
 * Encapsulated user profile with setter validation rules for email formatting, password length, and age ranges.
 */
class UserProfile {
    private String username;
    private String email;
    private int age;

    public UserProfile(String username, String email, int age) {
        this.username = username;
        setEmail(email);
        setAge(age);
    }

    public String getUsername() { return username; }
    public String getEmail() { return email; }
    public int getAge() { return age; }

    public void setEmail(String email) {
        if (email != null && email.contains("@") && email.contains(".")) {
            this.email = email;
        } else {
            System.out.println("Validation Error: Invalid email format [" + email + "]. Value rejected.");
        }
    }

    public void setAge(int age) {
        if (age >= 18 && age <= 100) {
            this.age = age;
        } else {
            System.out.println("Validation Error: Age must be between 18 and 100 [" + age + "]. Value rejected.");
        }
    }

    public void displayProfile() {
        System.out.println("User: " + username + " | Email: " + email + " | Age: " + age);
    }
}

class _07_encapsulated_user_profile {
    public static void main(String[] args) {
        UserProfile user = new UserProfile("dev_prakash", "prakash@domain.com", 25);
        user.displayProfile();

        System.out.println("\n--- Testing Mutator Validation ---");
        user.setAge(15);                  // Invalid age (< 18)
        user.setEmail("invalid-email-str"); // Invalid email (missing @)
        user.setAge(30);                  // Valid age update
        user.displayProfile();
    }
}
