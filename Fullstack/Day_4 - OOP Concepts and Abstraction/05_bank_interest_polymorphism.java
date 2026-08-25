/**
 * 05_bank_interest_polymorphism.java
 * Demonstrates Dynamic Method Dispatch (Runtime Polymorphism) using superclass reference arrays.
 */
class CentralBank {
    public double getInterestRate() {
        return 0.0;
    }
}

class SBIBank extends CentralBank {
    @Override
    public double getInterestRate() {
        return 7.2;
    }
}

class HDFCBank extends CentralBank {
    @Override
    public double getInterestRate() {
        return 8.1;
    }
}

class ICICIBank extends CentralBank {
    @Override
    public double getInterestRate() {
        return 7.9;
    }
}

class _05_bank_interest_polymorphism {
    public static void main(String[] args) {
        // Superclass reference array pointing to various subclass instances
        CentralBank[] banks = { new SBIBank(), new HDFCBank(), new ICICIBank() };

        System.out.println("--- Dynamic Method Dispatch (Bank Interest Rates) ---");
        for (CentralBank b : banks) {
            System.out.println(b.getClass().getSimpleName() + " Fixed Deposit Rate: " + b.getInterestRate() + "%");
        }
    }
}
