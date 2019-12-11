package designpattern.adapater;

public class BookCatalogAdapter implements CatalogAdapter {

    private Book book;

    public BookCatalogAdapter(Book book) {
        this.book = book;
    }

    @Override
    public String getCatalog() {
        return "Catalog: " + book.getTitle() + " by " + book.getAuthor();
    }
}
