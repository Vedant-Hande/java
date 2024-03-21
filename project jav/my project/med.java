// public import java.applet.Applet;
// import java.awt.*;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;
// import java.util.ArrayList;
// import java.util.Scanner;

// class Medicine {
//     private String name;
//     private double price;
//     private double taxPercent;
//     private double discountPercent;

//     public Medicine(String name, double price, double taxPercent, double discountPercent) {
//         this.name = name;
//         this.price = price;
//         this.taxPercent = taxPercent;
//         this.discountPercent = discountPercent;
//     }

//     public double calculateTotalPrice() {
//         double totalPrice = price + (price * taxPercent / 100);
//         totalPrice -= totalPrice * discountPercent / 100;
//         return totalPrice;
//     }

//     @Override
//     public String toString() {
//         return name + " - Price: $" + price + " (Tax: " + taxPercent + "%, Discount: " + discountPercent + "%)";
//     }
// }

// class MedicalStore {
//     private String name;
//     private ArrayList<Medicine> medicines;

//     public MedicalStore(String name) {
//         this.name = name;
//         this.medicines = new ArrayList<>();
//     }

//     public void addMedicine(Medicine medicine) {
//         medicines.add(medicine);
//     }

//     public ArrayList<Medicine> getMedicines() {
//         return medicines;
//     }
// }

// public class MedicalStoreApplet extends Applet implements ActionListener {
//     private TextField inputField;
//     private Button displayButton;
//     private Button addButton;
//     private Button calculateButton;
//     private TextArea outputArea;
//     private MedicalStore store;
//     private Scanner scanner;

//     public void init() {
//         setLayout(new BorderLayout());
        
//         Panel topPanel = new Panel();
//         topPanel.setLayout(new FlowLayout());
//         inputField = new TextField(30);
//         displayButton = new Button("Display Medicines");
//         addButton = new Button("Add Medicine");
//         calculateButton = new Button("Calculate Bill");
//         topPanel.add(new Label("Enter your choice:"));
//         topPanel.add(inputField);
//         topPanel.add(displayButton);
//         topPanel.add(addButton);
//         topPanel.add(calculateButton);
//         add(topPanel, BorderLayout.NORTH);

//         outputArea = new TextArea(20, 60);
//         add(outputArea, BorderLayout.CENTER);

//         displayButton.addActionListener(this);
//         addButton.addActionListener(this);
//         calculateButton.addActionListener(this);

//         scanner = new Scanner(System.in);
//         store = new MedicalStore("Your Help");
//         // Add initial medicines to the store as in the main method
//         store.addMedicine(new Medicine("1- Paracetamol", 10.50, 5, 12)); // Name, Price, Tax (%), Discount (%)
//         store.addMedicine(new Medicine("2- Aspirin", 15.75, 7, 10));
//         store.addMedicine(new Medicine("3- Abridone Tablets", 12.40, 6, 14)); // Name, Price, Tax (%), Discount (%)
//         store.addMedicine(new Medicine("4- oletsIP 250mg", 15.75, 10, 10));
//         store.addMedicine(new Medicine("5- Breathein", 48.50, 4, 8)); // Name, Price, Tax (%), Discount (%)
//         store.addMedicine(new Medicine("6- Vitamin B", 34.75, 7, 10));
//         store.addMedicine(new Medicine("7- Vitamin C", 38.75, 14, 14));
//         store.addMedicine(new Medicine("8- Vitamin D3", 23.88, 14, 14));
//         store.addMedicine(new Medicine("9- Omee Alke", 38.75, 12, 13));
//     }

//     public void actionPerformed(ActionEvent e) {
//         String choiceStr = inputField.getText();
//         int choice = Integer.parseInt(choiceStr);

//         switch (choice) {
//             case 1:
//                 displayMedicines();
//                 break;
//             case 2:
//                 addMedicineFromInput();
//                 break;
//             case 3:
//                 calculateBill();
//                 break;
//             default:
//                 outputArea.append("Invalid choice. Please try again.\n");
//         }
//     }

//     private void displayMedicines() {
//         outputArea.setText("");
//         outputArea.append("\n===== Available Medicines =====\n");
//         for (Medicine med : store.getMedicines()) {
//             outputArea.append(med.toString() + "\n");
//         }
//     }

//     private void addMedicineFromInput() {
//         outputArea.setText("");
//         outputArea.append("Enter medicine name: (with index e.g., '4 Medicine')\n");
//         String name = scanner.next();
//         outputArea.append("Enter price: $\n");
//         double price = scanner.nextDouble();
//         outputArea.append("Enter tax percentage:\n");
//         double tax = scanner.nextDouble();
//         outputArea.append("Enter discount percentage:\n");
//         double discount = scanner.nextDouble();

//         Medicine medicine = new Medicine(name, price, tax, discount);
//         store.addMedicine(medicine);
//         outputArea.append("Medicine added successfully.\n");
//     }

//     private void calculateBill() {
//         outputArea.setText("");
//         displayMedicines();
//         outputArea.append("Enter medicine index to purchase:\n");
//         int index = scanner.nextInt();

//         if (index >= 0 && index < store.getMedicines().size()) {
//             Medicine selectedMedicine = store.getMedicines().get(index);
//             outputArea.append("Enter quantity:\n");
//             int quantity = scanner.nextInt();

//             double totalBill = selectedMedicine.calculateTotalPrice() * quantity;
//             outputArea.append("Total Bill: in $ " + totalBill + "\n");
//             outputArea.append("Total Bill: in RS " + (totalBill - 82 / 2.3) + "\n");
//         } else {
//             outputArea.append("Invalid medicine index.\n");
//         }
//     }

//     public void destroy() {
//         scanner.close();
//     }
// }

// /*<applet code = MedicalStoreApplet.class height = 800 width = 800>
// </applet>*/
//  {
    
// }
