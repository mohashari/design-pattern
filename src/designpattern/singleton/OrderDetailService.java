package designpattern.singleton;

public class OrderDetailService {

    public void save(String orderId, String productName) {

        // TODO: 02/12/19 solving for many connection
        DbHelper.getConnection().query("INSERT INTO ORDER DETAIL ......");
    }
}
