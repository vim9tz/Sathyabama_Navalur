/**
 * 11_multiple_interface_implementation.java
 * Demonstrates multiple inheritance of type using multiple interface implementation in Java.
 */
interface Printable {
    void printDocument(String content);
}

interface Scannable {
    void scanDocument(String fileName);
}

interface Faxable {
    void sendFax(String recipientNumber, String content);
}

// MultiFunctionPrinter implements 3 interfaces simultaneously
class MultiFunctionPrinter implements Printable, Scannable, Faxable {
    private String modelName;

    MultiFunctionPrinter(String modelName) {
        this.modelName = modelName;
    }

    @Override
    public void printDocument(String content) {
        System.out.println("[" + modelName + "] Printing: \"" + content + "\"");
    }

    @Override
    public void scanDocument(String fileName) {
        System.out.println("[" + modelName + "] Scanning physical document to PDF: " + fileName);
    }

    @Override
    public void sendFax(String recipientNumber, String content) {
        System.out.println("[" + modelName + "] Sending Fax to " + recipientNumber + ": \"" + content + "\"");
    }
}

class _11_multiple_interface_implementation {
    public static void main(String[] args) {
        MultiFunctionPrinter mfp = new MultiFunctionPrinter("HP OfficeJet Pro 9015");

        System.out.println("--- Multiple Interface Implementation ---");
        mfp.printDocument("Q3 Financial Performance Report");
        mfp.scanDocument("Signed_Contract_2024.pdf");
        mfp.sendFax("+1-800-555-0199", "Urgent Invoice Confirmation");
    }
}
