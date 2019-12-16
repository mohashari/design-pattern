package designpattern.adapater;

import java.math.BigDecimal;

public class Book {

    private String author;
    private String title;
    private BigDecimal price;
    private int longPage;


    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getLongPage() {
        return longPage;
    }

    public void setLongPage(int longPage) {
        this.longPage = longPage;
    }

    public Book(String author, String title, BigDecimal price, int longPage) {
        this.author = author;
        this.title = title;
        this.price = price;
        this.longPage = longPage;
    }

    public Book() {
    }
}
