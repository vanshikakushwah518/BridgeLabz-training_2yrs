package level1;

public class ques_3 {
	 int itemCode;
	    String itemName;
	    double price;

	    // Constructor
	    Item(int itemCode, String itemName, double price) {
	        this.itemCode = itemCode;
	        this.itemName = itemName;
	        this.price = price;
	    }

	    // Method to display item details
	    void displayDetails() {
	        System.out.println("Item Code: " + itemCode);
	        System.out.println("Item Name: " + itemName);
	        System.out.println("Price per Unit: ₹" + price);
	    }

	    // Method to calculate total cost
	    double totalCost(int quantity) {
	        return price * quantity;
	    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Item item1 = new Item(1001, "Notebook", 50);
	        item1.displayDetails();
	        int qty = 10;
	        System.out.println("Total Cost for " + qty + " items: ₹" + item1.totalCost(qty));
	}

}
