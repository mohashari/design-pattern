package designpattern.singleton;

public class OrderDetailService {

    public void save(String orderId, String productName) {
        Connection connection = new Connection("localhost", "root", "root");
        connection.sql("INSERT INTO ORDER DETAIL ......");
    }
}
