public class Main {
    public static void main(String[] args) {

        // Food Items
        FoodItem item1 = new FoodItem(101, "Burger", 120, 2);
        FoodItem item2 = new FoodItem(102, "Pizza", 300, 1);
        FoodItem item3 = new FoodItem(103, "Pasta", 180, 2);
        FoodItem item4 = new FoodItem(104, "Cold Drink", 50, 3);

        // Customers
        Customer customer1 = new Customer(1, "Rahul Sharma", "9876543210");
        Customer customer2 = new Customer(2, "Amit Kumar", "9876501234");

        // Display Customer Details
        customer1.displayCustomerDetails();

        // Display Item Details
        item1.displayItemDetails();
        item2.displayItemDetails();
        item3.displayItemDetails();
        item4.displayItemDetails();

        // Total Bill
        double totalBill = item1.calculateAmount()
                + item2.calculateAmount()
                + item3.calculateAmount()
                + item4.calculateAmount();

        System.out.println("-----------------------");
        System.out.println("Total Bill : " + totalBill);
        System.out.println("-----------------------");

        System.out.println("\nOrder Summary Generated Successfully!");
    }
}