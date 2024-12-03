public class Book {
    String title;
    String author;
    Double price;

    // Default Constructor
    public Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
    }

    // Parameterized Constructor
    public Book(String title, String author, Double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Display Details Method
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

    // Update Price Method
    public void updatePrice(double newPrice) {
        if (newPrice >= 0) {
            this.price = newPrice;
        } else {
            System.out.println("Invalid price");
        }
    }

    // Apply Discount Method
    public void applyDiscount(double discountPercentage) {
        if (discountPercentage > 0.00 && discountPercentage < 100.00) {
            double discountAmount = price * (discountPercentage / 100.0);
            this.price -= discountAmount;
            System.out.printf("Discount of %.2f%% applied. New price: %.2f\n", discountPercentage, this.price);
        } else {
            System.out.println("Invalid discount percentage. It must be greater than 0.00 and less than 100.00.");
        }
    }

    public static void main(String[] args) {
        // Default book
        Book unknownBook = new Book();
        unknownBook.displayDetails();

        // Book with details
        Book hp1Book = new Book("Harry Potter and the Philosopher's Stone", "J.K. Rowling", 350.00);
        hp1Book.displayDetails();

        // Update price example
        hp1Book.updatePrice(-32000.00);
        hp1Book.displayDetails();

        // Applying discounts
        hp1Book.applyDiscount(99);  // Invalid discount
        hp1Book.displayDetails();
    }
}
