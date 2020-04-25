package OOP;

import java.util.Date;

public class Manager extends Employee {
    public String department; // отдел

    public Manager(Date employmentDate, int salary, Boolean presence) {
        super(String.valueOf(employmentDate), salary, presence);
    }

    public static void advises() {
        System.out.println("Менеджер Консультирует");
    }

    public static void discounts() {
        System.out.println("Скидки");
    }

    public static void advice() {
        System.out.println("Менеджер Советует");
    }

    @Override
    public void working() {
        System.out.println("Менеджер");
        super.working();
        System.out.println("Пинает шишки");
    }
}
