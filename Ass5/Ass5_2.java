
class Book{

   private String title, author, publisher,isbn;
   private int year,quantity;
   private double price;

   Book()
   {
       title= "Java"; 
       author="James Gosling";
       publisher="O'Reilly Media, Inc";
       isbn="3";
       year=1995;
       quantity=20;
       price=750;

   }
   public String getTitle() {
    return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getPublisher() {
        return publisher;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    void increaseQuantity(int additionalquantity)
    {
        if (quantity>0)
        this.quantity+=additionalquantity;
        System.out.println("By Increasing quantity: "+quantity);

    }
    void decreaseQuantity(int additionalquantity)
    {
        if (quantity>additionalquantity)
        this.quantity+=additionalquantity;
        System.out.println("By decreasing quantity: "+quantity);
    }
    void getInventoryValue()
    {
        double inventoryBook=this.quantity*this.price;
        System.out.println("Inventory books: "+inventoryBook);
    }



}

public class Ass5_2 {
    public static void main(String[] args) {
        
        Book b = new Book();
        b.increaseQuantity(3);
        b.decreaseQuantity(6);
        b.getInventoryValue();
    }
}
