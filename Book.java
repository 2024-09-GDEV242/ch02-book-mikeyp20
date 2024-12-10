/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Michael Patterson.)
 * @version (Insert today's date here.)
 */
class Book
{
    // The fields.
    private String author;
    private String title;
    private String isbn;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle,String bookIbsn)
    {
        author = bookAuthor;
        title = bookTitle;
        isbn = bookIbsn;
    }

    // Add the methods here ...
    
    //author
    public String getAuthor () {
        return author;
    }
    // title
    public String getTitle () {
        return title; 
    }
    //ISBN
    public String getIsbn () {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public void printAuthor() {
        System.out.println("Author: " + author);
    }
    public void printTitle() {
        System.out.println("Title: " + title);
    }
    public void printIsbn() {
        System.out.println("ISBN: " + isbn);
    }
    // printing the details
    public void printDetails() {
        System.out.println("Book Details:");
        System.out.println("Author:" + author);
        System.out.println("Title:" + title);
        System.out.println("ISBN:" + isbn);
        System.out.println("Publisher:" + publisher);
        System.out.println("Publication Year:" + publicationYear);
        System.out.println("Price: $" + price);
    }
    private String publisher;
    
    public String getPublisher() {
        return publisher;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    public int publicationYear;
    
    public int getPublicationYear() {
        return publicationYear;
    }
    
    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }
    
    // price
    private double price;
    
    public double getPrice() {
        return price;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }
}
