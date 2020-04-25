package OOP;

import java.util.Date;

/**
 * Охранник
 */
public class SecurityGuard extends Employee {
    public SecurityGuard(Date employmentDate, int salary, Boolean presence) {
        super(String.valueOf(employmentDate), salary, presence);
    }

    public static void walkieTalkie() {
        System.out.println("Охранник Говорит по рации");
    }

    @Override
    public void working() {
        System.out.println("Охранник");
        super.working();
        System.out.println("Пристаёт к кассирше");
    }
}
