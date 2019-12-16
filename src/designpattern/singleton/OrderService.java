package designpattern.singleton;

public class OrderService {

    public void save(String orderId) {

        // TODO: 02/12/19 solving for many connection
        DbHelper.getConnection().query("INSERT INTO ORDER ........");
    }
}
