import java.util.HashMap;

public class Ebook extends Book {
    private String fileType;
    public Ebook() {}
    public Ebook(String title, String isbn, int year, double price,String publishDate,int quantity) {
        super(isbn,title,price,year,publishDate,quantity);
        this.fileType = fileType;
    }

}
