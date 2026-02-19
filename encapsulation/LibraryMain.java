abstract class LibraryItem {
    private int itemId;
    private String title;
    private String author;

    public LibraryItem(int itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    public String getItemDetails() {
        return "ID: " + itemId + ", Title: " + title + ", Author: " + author;
    }

    public abstract int getLoanDuration();
}

interface Reservable {
    void reserveItem();
    boolean checkAvailability();
}

class Book extends LibraryItem implements Reservable {
    private boolean available = true;

    public Book(int id, String title, String author) {
        super(id, title, author);
    }

    public int getLoanDuration() {
        return 14; // 14 days
    }

    public void reserveItem() {
        if (available) {
            available = false;
            System.out.println("Book Reserved");
        }
    }

    public boolean checkAvailability() {
        return available;
    }
}

class Magazine extends LibraryItem {
    public Magazine(int id, String title, String author) {
        super(id, title, author);
    }

    public int getLoanDuration() {
        return 7;
    }
}

public class LibraryMain {
    public static void main(String[] args) {
        LibraryItem item = new Book(1, "Java Basics", "James");
        System.out.println(item.getItemDetails());
        System.out.println("Loan Duration: " + item.getLoanDuration() + " days");
    }
}
