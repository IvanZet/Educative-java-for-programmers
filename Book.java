abstract class PrintedMatter {

    protected String title;
    protected String author;
    protected String price;

    public PrintedMatter(String title, String author, String price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public abstract String getDetails();

}

interface InLibrary {

    String location = "library";
    
    String borrowBook();
    
    String returnBook();

    default String repairMedia() {
        return "Media is in repairs";
    }
    
}

class Book extends PrintedMatter implements InLibrary {
    
    private String genre;
    private boolean isBorrowed;
    
    public Book(String title, String author, String price, String genre) {
        super(title, author, price);
        this.genre = genre;
        this.isBorrowed = false;
    }

    public String getGenre() {
        return this.genre;
    }

    public boolean isBorrowed() {
        return this.isBorrowed;
    }

    public void setBorrowed(boolean isBorrowed) {
        this.isBorrowed = isBorrowed;
    }

    @Override
    public String getDetails() {
        String details = "Book's details: " + this.title + ", " + this.author +
            ", " + this.price + ", " + this.genre + ".\r\n";
        String status = "";
        if (this.isBorrowed == true) {
            status = "borrowed";
        } else {
            status = "available";
        }
        details += "It is in the " + InLibrary.location + " and is " + status;
        
        return details;
    }

    @Override
    public String borrowBook() {
        setBorrowed(true);
        return "The book is borrowed!";
    }

    @Override
    public String returnBook() {
        setBorrowed(false);
        return "The book is returned";
    }

    @Override
    public String repairMedia() {
        return "Book is in repairs";
    }
    
}

class BookDemo {

    public static void main(String[] args) {

        Book harryPotter = new Book("Harry Potter", "Rowling", "100", "fantasy");

        System.out.println(harryPotter.getDetails());
        System.out.println();

        harryPotter.borrowBook();
        System.out.println(harryPotter.getDetails());
        System.out.println();

        harryPotter.returnBook();
        System.out.println(harryPotter.getDetails());
        System.out.println();

        System.out.println(harryPotter.repairMedia());
        
    }
    
}