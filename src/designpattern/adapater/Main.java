package designpattern.adapater;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Book book = new Book();
        Video video = new Video();

        List<Object> catalogues = new LinkedList<>();
        catalogues.add(new Book("author one", "book one", new BigDecimal(30000), 200));
        catalogues.add(new Book("author two", "book two", new BigDecimal(40000), 200));
        catalogues.add(new Book("author three", "book three", new BigDecimal(50000), 200));
        catalogues.add(new Book("author fourth", "book fourth", new BigDecimal(60000), 200));

        catalogues.add(new Video("title 1", "vlogger 1", 30));
        catalogues.add(new Video("title 2", "vlogger 2", 35));
        catalogues.add(new Video("title 3", "vlogger 3", 50));
        catalogues.add(new Video("title 4", "vlogger 4", 40));


        // TODO: 10/12/19 problem code bad for readable and scalable

        for (Object catalog : catalogues) {
            if (catalog instanceof Book) {
                System.out.println("Catalog:  author" + ((Book) catalog).getAuthor() + " title " + ((Book) catalog).getTitle());
            } else if (catalog instanceof Video) {
                System.out.println("Catalog:  author" + ((Video) catalog).getVlogger() + " title " + ((Video) catalog).getTitle());
            }
        }

    }
}
