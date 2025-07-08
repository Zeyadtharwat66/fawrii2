import java.util.HashMap;

public class PaperBook extends Book {
    private int quantity;
    private HashMap<String,Book> inventory=new HashMap<>();
    public PaperBook(){}
    public PaperBook(String title, String isbn, int year, double price,String publishDate,int quantity) {
        super(isbn,title,price,year,publishDate,quantity);
        this.quantity=quantity;
    }

    }
