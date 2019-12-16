package designpattern.prototype;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Store store1 = new Store("toko a ","jakarta","indonesia","mainan");
        Store store2 = new Store("toko b ","jakarta","indonesia","mainan");
        Store store3 = new Store("toko c ","bandung","indonesia","fashion pria");
        Store store4 = new Store("toko e ","bandung","indonesia","fashion wanita");

        store1.setBank(new Bank("aa","123"));


        Store store5 =  new Store(store1);
        store5.setBank(new Bank("bb","456"));
        store5.setName("toko x");


        System.out.println("store 1 "+ store1.toString());

        System.out.println("store 5 "+ store5.toString());


    }
}
