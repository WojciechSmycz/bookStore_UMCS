public class Book {
    public String title;
    public String author;
    public String tags;
    public float price;
    public boolean is_available;
    public int quantity;

    public Book(String title, String author, float price, String tags, int quantity) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.tags = tags;
        this.quantity = quantity;
        this.is_available = quantity > 0;
    }

    @Override
    public String toString() {
        return "'" + title + "' - " + author + " (" + price + " zł)";
    }
}