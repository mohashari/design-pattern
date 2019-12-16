package designpattern.prototype;

public class Store implements Cloneable {

    private String name;
    private String city;
    private String region;
    private String category;
    private Bank bank;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Store(String name, String city, String region, String category) {
        this.name = name;
        this.city = city;
        this.region = region;
        this.category = category;
    }

    public Store() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    @Override
    public String toString() {
        return "name: " + this.name +
                " \n city " + this.city +
                "\n bank: " + this.bank.getName();
    }

    public Store(Store store) {
        this.name = store.name;
    }
}
