package designpattern.composite;

import java.util.List;

public class CategoryComposite extends Category{


    private List<Category> categories;

    public CategoryComposite(String name, List<Category> categories) {
        super(name);
        this.categories = categories;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }
}
