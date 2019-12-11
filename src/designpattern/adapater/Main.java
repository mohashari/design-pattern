package designpattern.adapater;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<CatalogAdapter> catalogs = new LinkedList<>();
        catalogs.add(new BookCatalogAdapter(new Book("author one", "book one", new BigDecimal(30000), 200)));
        catalogs.add(new BookCatalogAdapter(new Book("author two", "book two", new BigDecimal(40000), 200)));
        catalogs.add(new BookCatalogAdapter(new Book("author three", "book three", new BigDecimal(50000), 200)));
        catalogs.add(new BookCatalogAdapter(new Book("author fourth", "book fourth", new BigDecimal(60000), 200)));

        catalogs.add(new VideoCatalogAdapter(new Video("title 1", "vlogger 1", 30)));
        catalogs.add(new VideoCatalogAdapter(new Video("title 2", "vlogger 2", 35)));
        catalogs.add(new VideoCatalogAdapter(new Video("title 3", "vlogger 3", 50)));
        catalogs.add(new VideoCatalogAdapter(new Video("title 4", "vlogger 4", 40)));

        catalogs.parallelStream().forEach(catalog -> System.out.println(catalog.getCatalog()));
    }
}
