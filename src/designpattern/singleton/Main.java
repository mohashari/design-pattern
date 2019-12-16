package designpattern.singleton;

import com.sun.xml.internal.bind.v2.TODO;

public class Main {
    public static void main(String[] args) {

        OrderService orderService = new OrderService();
        orderService.save("001");


        // TODO: 02/12/19 problem solving menggunakan singleton pattern untuk connection nya
        /**
         * {@link OrderDetailService} see change for solving problem to many connection database
         */
        OrderDetailService orderDetailService = new OrderDetailService();
        orderDetailService.save("001", "sarimi");
        orderDetailService.save("001", "indomie");
        orderDetailService.save("001", "mie sedap");
    }
}
