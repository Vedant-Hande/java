import java.util.*;
import java.util.ArrayList;

class Medicine {
    private String name;
    private double price;
    private double taxPercent;
    private double discountPercent;

    public Medicine(String name, double price, double taxPercent, double discountPercent) {
        this.name = name;
        this.price = price;
        this.taxPercent = taxPercent;
        this.discountPercent = discountPercent;
    }

    public double calculateTotalPrice() {
        double totalPrice = price + (price * taxPercent / 100);
        totalPrice -= totalPrice * discountPercent / 100;
        return totalPrice;
    }

    @Override
    public String toString() {
        return name + " - Price: $" + price + " (Tax: " + taxPercent + "%, Discount: " + discountPercent + "%)";
    }
}

class MedicalStore extends MedicalStoreManagementSystem {
    private String name;
    private ArrayList<Medicine> medicines;

    public MedicalStore(String name) {
        this.name = name;
        this.medicines = new ArrayList<>();
    }

    public void addMedicine(Medicine medicine) {
        medicines.add(medicine);
    }

    public void displayMedicines() {
        System.out.println("\n===== Available Medicines in " + name + " =====");
        for (Medicine med : medicines) {
            System.out.println(med);
        }
    }

    public void addMedicineFromInput(Scanner scanner) {
        System.out.print("Enter medicine name:(with index EX 4 Medicine) ");
        String name = scanner.next();
        System.out.print("Enter price: $");
        double price = scanner.nextDouble();
        System.out.print("Enter tax percentage: ");
        double tax = scanner.nextDouble();
        System.out.print("Enter discount percentage: ");
        double discount = scanner.nextDouble();

        Medicine medicine = new Medicine(name, price, tax, discount);
        addMedicine(medicine);
        System.out.println("Medicine added successfully.");

    }

    public void calculateBill(Scanner scanner) {
        displayMedicines();
        System.out.print("Enter medicine index to purchase: ");
        int index = scanner.nextInt();

        if (index >= 0 && index < medicines.size()) {
            Medicine selectedMedicine = medicines.get(index);
            System.out.print("Enter quantity: ");
            int quantity = scanner.nextInt();

            double totalBill = selectedMedicine.calculateTotalPrice() * quantity;
            System.out.println("Total Bill:in $  " + totalBill);
            System.out.println("Total Bill:in RS  " + (totalBill - 82 / 2.3));
        } else {
            System.out.println("Invalid medicine index.");
        }
    }
}

public class MedicalStoreManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MedicalStore store = new MedicalStore("your_help");

        // Add some initial medicines to the store
        store.addMedicine(new Medicine("1- Paracetamol", 10.50, 5, 12)); // Name, Price, Tax (%), Discount (%)
        store.addMedicine(new Medicine("2- Aspirin", 15.75, 7, 10));
        store.addMedicine(new Medicine("3- Abridone Tablets", 12.40, 6, 14)); // Name, Price, Tax (%), Discount (%)
        store.addMedicine(new Medicine("4- oletsIP 250mg", 15.75, 10, 10));
        store.addMedicine(new Medicine("5- Breathein", 48.50, 4, 8)); // Name, Price, Tax (%), Discount (%)
        store.addMedicine(new Medicine("6- Vitamin B", 34.75, 7, 10));
        store.addMedicine(new Medicine("7- Vitamin C", 38.75, 14, 14));
        store.addMedicine(new Medicine("8- Vitamin D3", 23.88, 14, 14));
        store.addMedicine(new Medicine("9- Omee Alke", 38.75, 12, 13));

        int choice;
        do {
            System.out.println("\n===== Medical Store Management System =====");
            System.out.println("1. Display Medicines");
            System.out.println("2. Add Medicine");
            System.out.println("3. Calculate Bill");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    store.displayMedicines();
                    break;
                case 2:
                    store.addMedicineFromInput(scanner);
                    break;
                case 3:
                    store.calculateBill(scanner);
                    break;
                case 4:
                    System.out.println("Exiting... Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }
}
