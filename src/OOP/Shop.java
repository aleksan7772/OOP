package OOP;

import java.util.Date;

public class Shop {
    private static Date date;
    private String nameShop;
    private String address;
    {
        nameShop = "В Три Дорого";
        address = "Бульвар инвальдов 16";
    }


    public static void open() {
        Manager manager = new Manager(date, 8000, false);
        Cashier cashier = new Cashier(date,8000,false,3);
        SecurityGuard securityGuard = new SecurityGuard(date,7000,false);
        Customer customer = new Customer("516616161651",50000);

        System.out.println("открыто");
        switch (1) {
            case 1:
                Employee.cameToWork();
            case 2:
                Shop.sell();
            case 3:
                manager.working();
            case 4:
                cashier.working();
            case 5:
                securityGuard.working();
            case 6:
                Customer.learnAboutTheProduct();
            case 7:
                Manager.advises();
                Manager.advice();
            case 8:
                Customer.buy();
                Cashier.countsMoney();
            case 9:
                SecurityGuard.walkieTalkie();
                return;
        }
    }


    public static void sell() {
        System.out.println("продаются товары");
    }
}
