/**
 * 03_login_authentication_overloading.java
 * Overloaded authentication login methods for email/password vs mobile/password.
 */
class AuthenticationService {

    // Login via Email & Password
    public void login(String email, String password) {
        System.out.println("Authenticating via Email [" + email + "]...");
        if (email.endsWith("@company.com") && password.length() >= 6) {
            System.out.println("Status: Email authentication successful.");
        } else {
            System.out.println("Status: Invalid credentials or domain.");
        }
    }

    // Login via Mobile Number & Password
    public void login(long mobileNumber, String password) {
        System.out.println("Authenticating via Mobile Number [+91-" + mobileNumber + "]...");
        if (String.valueOf(mobileNumber).length() == 10 && password.length() >= 6) {
            System.out.println("Status: Mobile authentication successful.");
        } else {
            System.out.println("Status: Invalid mobile number or password.");
        }
    }
}

class _03_login_authentication_overloading {
    public static void main(String[] args) {
        AuthenticationService auth = new AuthenticationService();

        System.out.println("--- Multi-Channel Login ---");
        auth.login("admin@company.com", "pass1234");
        System.out.println();
        auth.login(9876543210L, "securePass");
    }
}
