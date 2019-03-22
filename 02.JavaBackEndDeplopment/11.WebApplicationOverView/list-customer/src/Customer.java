import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Customer {
    private static final List<Information> customer = new ArrayList<Information>();
    static{
        initData();
    }
    // create database
    private static void initData() {
        Information listCustomer0 = new Information("long","hue","11.02.1995");
        Information listCustomer1 = new Information("abc","hue","11.12.1998");
        Information listCustomer2 = new Information("xyz","hue","02.11.1999");
        Information listCustomer3 = new Information("nmx","hue","11.11.1998");
        customer.add(listCustomer0);
        customer.add(listCustomer1);
        customer.add(listCustomer2);
        customer.add(listCustomer3);
    }
    public static List<Information> queryCustomer() {
        return customer;
    }

}
