import java.time.*;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;


public class Book {
    private String isbn;
    private String title;
    private double price;
    private int year;
    private String publishDate;
    private int quantity;
    public Book(){}
    public Book(String isbn, String title, double price, int year, String publishDate,int quantity) {
        this.isbn = isbn;
        this.title = title;
        this.price = price;
        this.year = year;
        this.publishDate = publishDate;
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        if(isbn.isEmpty()){
            isbn = null;
        }
        else{
            this.isbn = isbn;
        }
    }
    public String getPublishDate() {
        return publishDate;
    }
    public void setPublishDate(String publishDate) {
        if(publishDate.matches("^\\d{4}-\\d{2}-\\d{2}$")){
            this.publishDate = publishDate;
        }
        else{
            this.publishDate = "0000-00-00";
        }
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;

    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        if(price < 0){
            price = 0;
        }
        this.price = price;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        if(title.isEmpty()){
            title = null;
        }
        this.title = title;
    }

}