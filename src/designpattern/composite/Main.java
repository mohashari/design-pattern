package designpattern.composite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Category> categories = new ArrayList<>();
        categories.add(new CategoryComposite("electronic", Arrays.asList(new Category("Handphone")
                , new Category("Computer"))));
        categories.add(new Category("fashion pria"));
        categories.add(new Category("fashion wanita"));


        categories.forEach(Main::printCategory);

    }


    static void printCategory(Category category) {
        System.out.println(category.getName());

        if (category instanceof CategoryComposite) {
            CategoryComposite categoryComposite = (CategoryComposite) category;
            categoryComposite.getCategories().forEach(value -> printCategory(value));
        }
    }
}
