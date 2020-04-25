package OOP;

import java.util.Date;

/**
 * Кассир
 */
public class Cashier extends Employee {
    public int deskNumber;//номер кассы

    public Cashier(Date employmentDate, int salary, Boolean presence, int deskNumber) {
        super(String.valueOf(employmentDate), salary, presence);
        this.deskNumber = deskNumber;
    }

    {
        deskNumber = 3;
    }

    public static void countsMoney() {
        System.out.println("Кассирша Считает деньги");
    }

    @Override
    public void working() {
        System.out.println("Кассирша");
        super.working();
        System.out.println("Пиздит пакеты");
    }
}
