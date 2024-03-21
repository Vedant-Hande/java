
import java.util.ArrayList;
import java.util.Scanner;

class Product {
    private String name;
    private double price;
    private int quantity;
    private double taxRate; // Tax rate in percent
    private double gstRate; // GST rate in percent
    private double discountRate; // Discount rate in percent

    public Product(String name, double price, int quantity, double taxRate, double gstRate, double discountRate) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.taxRate = taxRate;
        this.gstRate = gstRate;
        this.discountRate = discountRate;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getTaxRate() {
        return taxRate;
    }

    public double getGstRate() {
        return gstRate;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double calculateTax() {
        return price * (taxRate / 100);
    }

    public double calculateGst() {
        return (price + calculateTax()) * (gstRate / 100);
    }

    public double calculateTotalPrice() {
        double totalPrice = price + calculateTax() + calculateGst();
        return totalPrice - (totalPrice * (discountRate / 100));
    }

    @Override
    public String toString() {
        return "Product: " + name + ", Price: $" + price + ", Quantity: " + quantity +
                ", Tax Rate: " + taxRate + "%, GST Rate: " + gstRate + "%, Discount Rate: " + discountRate + "%";
    }
}

public class productseles {
    private static ArrayList<Product> products = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        products.add(new Product("Laptop", 1000, 10, 5, 10, 0));
        products.add(new Product("Phone", 500, 20, 5, 10, 0));

        boolean exit = false;

        while (!exit) {
            System.out.println("\nProduct Sales Management System");
            System.out.println("1. Add Product");
            System.out.println("2. Display Products");
            System.out.println("3. Manage Sales");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    displayProducts();
                    break;
                case 3:
                    manageSales();
                    break;
                case 4:
                    exit = true;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }

    private static void addProduct() {
        System.out.print("Enter product name: ");
        String name = scanner.nextLine();
        System.out.print("Enter price: $");
        double price = scanner.nextDouble();
        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();
        System.out.print("Enter tax rate (%): ");
        double taxRate = scanner.nextDouble();
        System.out.print("Enter GST rate (%): ");
        double gstRate = scanner.nextDouble();
        System.out.print("Enter discount rate (%): ");
        double discountRate = scanner.nextDouble();

        Product product = new Product(name, price, quantity, taxRate, gstRate, discountRate);
        products.add(product);
        System.out.println("Product added successfully.");
    }

    private static void displayProducts() {
        System.out.println("\nProducts List:");
        // Display pre-existing products
        System.out.println("Pre-existing products:");
        System.out.println("1. Chocolate, Price: $5.00, Quantity: 50, Tax Rate: 5%, GST Rate: 10%, Discount Rate: 0%");
        System.out.println("2. Cake, Price: $20.00, Quantity: 20, Tax Rate: 5%, GST Rate: 10%, Discount Rate: 0%");
        System.out.println("Shop Products:");
        for (Product product : products) {
            System.out.println(product);
        }
    }

    private static void manageSales() {
        displayProducts();
        System.out.print("Enter the index of the product to manage sales: ");
        int index = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        if (index >= 0 && index < products.size()) {
            Product product = products.get(index);
            System.out.println("Product details:");
            System.out.println(product);

            System.out.print("Enter quantity sold: ");
            int quantitySold = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            if (product.getQuantity() >= quantitySold) {
                product.setQuantity(product.getQuantity() - quantitySold);
                double totalPrice = product.calculateTotalPrice() * quantitySold;
                System.out.println("Total price (after tax, GST, and discount) for " + quantitySold +
                        " units: $" + totalPrice);
            } else {
                System.out.println("Insufficient quantity available.");
            }
        } else {
            System.out.println("Invalid product index.");
        }
    }
}
